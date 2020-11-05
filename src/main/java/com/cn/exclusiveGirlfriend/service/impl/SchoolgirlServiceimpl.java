package com.cn.exclusiveGirlfriend.service.impl;

import com.cn.exclusiveGirlfriend.common.ResultData;
import com.cn.exclusiveGirlfriend.dataBean.SchoolgirlDataBean;
import com.cn.exclusiveGirlfriend.mapper.SchoolgirlMapper;
import com.cn.exclusiveGirlfriend.pojo.Schoolgirl;
import com.cn.exclusiveGirlfriend.pojo.SchoolgirlExample;
import com.cn.exclusiveGirlfriend.service.SchoolgirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @program: exclusiveGirlfriend
 * @description: 女生详情接口实现
 * @author: Yang Fang Hong
 * @create: 2020-09-24 14:43
 */
@Service
@Transactional
public class SchoolgirlServiceimpl implements SchoolgirlService {
    @Autowired(required = false)
    private SchoolgirlMapper schoolgirlMapper;
    /**
     *@Description: 模糊分页查询女生详情
     *@Param: [schoolgirlDataBean]
     *@return: com.cn.exclusiveGirlfriend.common.ResultData
     *@Author: Yang Fang Hong
     *@date: 2020/9/24
     */
    @Override
    public ResultData selectSchoolgirlall(SchoolgirlDataBean schoolgirlDataBean) {
        if (Optional.ofNullable(schoolgirlDataBean).isPresent()) {
            SchoolgirlExample periodExample = new SchoolgirlExample();
            SchoolgirlExample.Criteria criteria = periodExample.createCriteria();
            if (Optional.ofNullable(schoolgirlDataBean.getSchoolgirl()).isPresent()){
                if (schoolgirlDataBean.getSchoolgirl().getsPadcleaning()!=null){
                    criteria.andSPadcleaningEqualTo(schoolgirlDataBean.getSchoolgirl().getsPadcleaning());
                }
                if (schoolgirlDataBean.getSchoolgirl().getsPadsize()!=null){
                    criteria.andSPadsizeEqualTo(schoolgirlDataBean.getSchoolgirl().getsPadsize());
                }
                if (schoolgirlDataBean.getSchoolgirl().getsPadaging()!=null){
                    criteria.andSPadagingEqualTo(schoolgirlDataBean.getSchoolgirl().getsPadaging());
                }

            }
            long count = schoolgirlMapper.countByExample(periodExample);
            schoolgirlDataBean.setPage((schoolgirlDataBean.getPage() - 1) * schoolgirlDataBean.getLimit());
            List<Schoolgirl> list = schoolgirlMapper.selectSchoolgirlAll(schoolgirlDataBean);
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
     *@Description: 通过编号查询详情数据
     *@Param: [schoolgirlDataBean]
     *@return: com.cn.exclusiveGirlfriend.common.ResultData
     *@Author: Yang Fang Hong
     *@date: 2020/9/24
     */
    @Override
    public ResultData selectSchoolgirlId(SchoolgirlDataBean schoolgirlDataBean) {
        if (Optional.ofNullable(schoolgirlDataBean).isPresent()) {
            SchoolgirlExample periodExample = new SchoolgirlExample();
            SchoolgirlExample.Criteria criteria = periodExample.createCriteria();
            criteria.andSIdEqualTo(schoolgirlDataBean.getSchoolgirl().getsId());
            List<Schoolgirl> periods = schoolgirlMapper.selectByExample(periodExample);
            if (Optional.ofNullable(periods).isPresent()) {
                return new ResultData().ok("请查看数据", periods);
            }
        }
        return new ResultData().error();
    }
    /**
     *@Description: 修改女生详情数据
     *@Param: [schoolgirlDataBean]
     *@return: com.cn.exclusiveGirlfriend.common.ResultData
     *@Author: Yang Fang Hong
     *@date: 2020/9/24
     */
    @Override
    public ResultData updateSchoolgirl(SchoolgirlDataBean schoolgirlDataBean) {
        SchoolgirlExample periodExample = new SchoolgirlExample();
        SchoolgirlExample.Criteria criteria = periodExample.createCriteria();
        criteria.andSIdEqualTo(schoolgirlDataBean.getSchoolgirl().getsId());
        Optional<SchoolgirlExample> optionalUser = Optional.ofNullable(periodExample);
        if (optionalUser.isPresent()) {
            try {
                if (schoolgirlMapper.updateByExampleSelective(schoolgirlDataBean.getSchoolgirl(), periodExample) > 0 ? true : false) {
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
     *@Description: 新增女生详情数据
     *@Param: [schoolgirlDataBean]
     *@return: com.cn.exclusiveGirlfriend.common.ResultData
     *@Author: Yang Fang Hong
     *@date: 2020/9/24
     */
    @Override
    public ResultData insertSchoolgirl(SchoolgirlDataBean schoolgirlDataBean) {
        Optional<Schoolgirl> optionalUser = Optional.ofNullable(schoolgirlDataBean.getSchoolgirl());
        if (optionalUser.isPresent()) {
            try {
                if (schoolgirlMapper.insertSelective(schoolgirlDataBean.getSchoolgirl()) > 0) {
                    return new ResultData().ok(optionalUser);
                }
            } catch (Exception e) {
                e.printStackTrace();
                return new ResultData().error();
            }

        }
        return new ResultData().error();
    }
}
