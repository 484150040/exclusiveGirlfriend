package com.cn.exclusiveGirlfriend.service.impl;

import com.cn.exclusiveGirlfriend.common.ResultData;
import com.cn.exclusiveGirlfriend.dataBean.FeedbackDataBean;
import com.cn.exclusiveGirlfriend.mapper.FeedbackMapper;
import com.cn.exclusiveGirlfriend.pojo.Feedback;
import com.cn.exclusiveGirlfriend.pojo.FeedbackExample;
import com.cn.exclusiveGirlfriend.service.FeedbackServe;
import com.cn.exclusiveGirlfriend.utiles.DateUtiles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @ClassName FeedbackServeimpl
 * @Author ASUS
 * @Description TODO;女朋友反馈管理接口实现
 * @Date 2020/9/20 16:57
 * @Hodified By:
 **/
@Service
@Transactional
public class FeedbackServeimpl implements FeedbackServe {
    @Autowired(required = false)
    private FeedbackMapper feedbackMapper;
    /**
    *@Description: 新增女朋友反馈
    *@Param: [feedbackDataBean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/21
    */
    @Override
    public ResultData addFeedback(FeedbackDataBean feedbackDataBean) {
        Optional<Feedback> optionalUser = Optional.ofNullable(feedbackDataBean.getFeedback());
        if (optionalUser.isPresent()) {
            try {
                if (feedbackMapper.insertSelective(feedbackDataBean.getFeedback()) > 0) {
                    return new ResultData().ok(optionalUser);
                }
            } catch (Exception e) {
                e.printStackTrace();
                return new ResultData().error();
            }

        }
        return new ResultData().error();
    }
    /**
     *@Description: 修改反馈管理数据
     *@Param: [feedbackDataBean]
     *@return: com.cn.exclusiveGirlfriend.common.ResultData
     *@Author: Yang Fang Hong
     *@date: 2020/9/21
     */
    @Override
    public ResultData updateFeedback(FeedbackDataBean feedbackDataBean) {
        FeedbackExample periodExample = new FeedbackExample();
        FeedbackExample.Criteria criteria = periodExample.createCriteria();
        criteria.andFIdEqualTo(feedbackDataBean.getFeedback().getfId());
        Optional<FeedbackExample> optionalUser = Optional.ofNullable(periodExample);
        if (optionalUser.isPresent()) {
            try {
                if (feedbackMapper.updateByExampleSelective(feedbackDataBean.getFeedback(), periodExample) > 0 ? true : false) {
                    return new ResultData().ok(optionalUser);
                }
            } catch (Exception e) {
                e.printStackTrace();
                return new ResultData().error();
            }

        }
        return new ResultData().error();
    }
    /**
     *@Description: 模糊查询反馈管理数据
     *@Param: [feedbackDataBean]
     *@return: com.cn.exclusiveGirlfriend.common.ResultData
     *@Author: Yang Fang Hong
     *@date: 2020/9/21
     */
    @Override
    public ResultData selectFeedbackAll(FeedbackDataBean feedbackDataBean) {
        if (Optional.ofNullable(feedbackDataBean).isPresent()) {
            FeedbackExample periodExample = new FeedbackExample();
            FeedbackExample.Criteria criteria = periodExample.createCriteria();
            if (Optional.ofNullable(feedbackDataBean.getFeedback()).isPresent()){
                if (feedbackDataBean.getFeedback().getfState()!=null){
                    criteria.andFStateEqualTo(feedbackDataBean.getFeedback().getfState());
                }
                if (feedbackDataBean.getFeedback().getfTitle()!=null){
                    criteria.andFTitleEqualTo(feedbackDataBean.getFeedback().getfTitle());
                }
                if (feedbackDataBean.getCreatetime()!=null){
                    criteria.andCreatetimeGreaterThanOrEqualTo(DateUtiles.parseDefaultDate(feedbackDataBean.getCreatetime()));
                }
                if (feedbackDataBean.getEndtime()!=null){
                    criteria.andCreatetimeLessThanOrEqualTo(DateUtiles.parseDefaultDate(feedbackDataBean.getEndtime()));
                }
            }

            long count = feedbackMapper.countByExample(periodExample);
            feedbackDataBean.setPage((feedbackDataBean.getPage() - 1) * feedbackDataBean.getLimit());
            List<Feedback> list = feedbackMapper.selectFeedbackAll(feedbackDataBean);
            if (Optional.ofNullable(list).isPresent()) {
                Map<String, Object> map = new LinkedHashMap<>();
                map.put("list", list);
                map.put("count", count);
                return new ResultData().ok("请查看数据", map);
            }
        }
        return new ResultData().error();
    }
    /**
     *@Description: 根据反馈编号查询反馈详情数据
     *@Param: [feedbackDataBean]
     *@return: com.cn.exclusiveGirlfriend.common.ResultData
     *@Author: Yang Fang Hong
     *@date: 2020/9/21
     */
    @Override
    public ResultData selectFeedbackId(FeedbackDataBean feedbackDataBean) {
        if (Optional.ofNullable(feedbackDataBean).isPresent()) {
            FeedbackExample periodExample = new FeedbackExample();
            FeedbackExample.Criteria criteria = periodExample.createCriteria();
            if (Optional.ofNullable(feedbackDataBean.getFeedback()).isPresent()){
                criteria.andFIdEqualTo(feedbackDataBean.getFeedback().getfId());
            }
            List<Feedback> periods = feedbackMapper.selectByExample(periodExample);
            if (Optional.ofNullable(periods).isPresent()) {
                return new ResultData().ok("请查看数据", periods);
            }
        }
        return new ResultData().error();
    }
}
