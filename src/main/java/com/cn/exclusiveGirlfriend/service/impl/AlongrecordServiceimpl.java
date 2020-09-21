package com.cn.exclusiveGirlfriend.service.impl;

import com.cn.exclusiveGirlfriend.common.ResultData;
import com.cn.exclusiveGirlfriend.dataBean.AlongrecordDataBean;
import com.cn.exclusiveGirlfriend.mapper.AlongrecordMapper;
import com.cn.exclusiveGirlfriend.pojo.Alongrecord;
import com.cn.exclusiveGirlfriend.pojo.AlongrecordExample;
import com.cn.exclusiveGirlfriend.service.AlongrecordService;
import com.cn.exclusiveGirlfriend.utiles.DateUtiles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @program: exclusiveGirlfriend
 * @description: 相处记录接口实现
 * @author: Yang Fang Hong
 * @create: 2020-09-21 16:16
 */
@Service
@Transactional
public class AlongrecordServiceimpl implements AlongrecordService {
    @Autowired(required = false)
    private AlongrecordMapper alongrecordMapper;
    /**
    *@Description: 模糊查询相处记录数据
    *@Param: [alongrecordDataBean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/21
    */
    @Override
    public ResultData selectAlongrecordAll(AlongrecordDataBean alongrecordDataBean) {
        if (Optional.ofNullable(alongrecordDataBean).isPresent()) {
            AlongrecordExample periodExample = new AlongrecordExample();
            AlongrecordExample.Criteria criteria = periodExample.createCriteria();
            if (alongrecordDataBean.getAlongrecord().getaPlace()!=null){
                criteria.andAPlaceEqualTo(alongrecordDataBean.getAlongrecord().getaPlace());
            }
            if (alongrecordDataBean.getATime()!=null){
                criteria.andATimeGreaterThanOrEqualTo(DateUtiles.parseDefaultDate(alongrecordDataBean.getATime()));
            }
            if (alongrecordDataBean.getATimeendtime()!=null){
                criteria.andATimeLessThanOrEqualTo(DateUtiles.parseDefaultDate(alongrecordDataBean.getATimeendtime()));
            }
            if (alongrecordDataBean.getCreatetime()!=null){
                criteria.andCreatetimeGreaterThanOrEqualTo(DateUtiles.parseDefaultDate(alongrecordDataBean.getCreatetime()));
            }
            if (alongrecordDataBean.getEndtime()!=null){
                criteria.andCreatetimeLessThanOrEqualTo(DateUtiles.parseDefaultDate(alongrecordDataBean.getEndtime()));
            }
            if (alongrecordDataBean.getAlongrecord().getaMeettime()!=null){
                criteria.andAMeettimeEqualTo(alongrecordDataBean.getAlongrecord().getaMeettime());
            }
            long count = alongrecordMapper.countByExample(periodExample);
            alongrecordDataBean.setPage(alongrecordDataBean.getPage() - 1 * alongrecordDataBean.getLimit());
            List<Alongrecord> list = alongrecordMapper.selectAlongrecordAll(alongrecordDataBean);
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
    *@Description: 新增相处记录数据
    *@Param: [alongrecordDataBean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/21
    */
    @Override
    public ResultData insertAlongrecord(AlongrecordDataBean alongrecordDataBean) {
        Optional<Alongrecord> optionalUser = Optional.ofNullable(alongrecordDataBean.getAlongrecord());
        if (optionalUser.isPresent()) {
            try {
                if (alongrecordMapper.insertSelective(alongrecordDataBean.getAlongrecord()) > 0) {
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
    *@Description: 修改相处记录数据
    *@Param: [alongrecordDataBean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/21
    */
    @Override
    public ResultData updateAlongrecord(AlongrecordDataBean alongrecordDataBean) {
        AlongrecordExample alongrecordExample = new AlongrecordExample();
        AlongrecordExample.Criteria criteria = alongrecordExample.createCriteria();
        criteria.andAIdEqualTo(alongrecordDataBean.getAlongrecord().getaId());
        Optional<AlongrecordExample> optionalUser = Optional.ofNullable(alongrecordExample);
        if (optionalUser.isPresent()) {
            try {
                if (alongrecordMapper.updateByExampleSelective(alongrecordDataBean.getAlongrecord(), alongrecordExample) > 0 ? true : false) {
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
    *@Description: 查看相处记录详情
    *@Param: [alongrecordDataBean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/21
    */
    @Override
    public ResultData selectAlongrecordId(AlongrecordDataBean alongrecordDataBean) {
        if (Optional.ofNullable(alongrecordDataBean).isPresent()) {
            AlongrecordExample alongrecordExample = new AlongrecordExample();
            AlongrecordExample.Criteria criteria = alongrecordExample.createCriteria();
            criteria.andAIdEqualTo(alongrecordDataBean.getAlongrecord().getaId());
            List<Alongrecord> periods = alongrecordMapper.selectByExample(alongrecordExample);
            if (Optional.ofNullable(periods).isPresent()) {
                return new ResultData().ok("请查看数据", periods);
            }
        }
        return new ResultData().error();
    }
}
