package com.cn.exclusiveGirlfriend.service.impl;

import com.cn.exclusiveGirlfriend.common.ResultData;
import com.cn.exclusiveGirlfriend.dataBean.PeriodDataBean;
import com.cn.exclusiveGirlfriend.mapper.PeriodMapper;
import com.cn.exclusiveGirlfriend.pojo.Period;
import com.cn.exclusiveGirlfriend.pojo.PeriodExample;
import com.cn.exclusiveGirlfriend.service.PeriodService;
import com.cn.exclusiveGirlfriend.utiles.DateUtiles;
import com.cn.exclusiveGirlfriend.utiles.EncryptUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.DateFormat;
import java.util.*;

/**
 * @ClassName PeriodService
 * @Author ASUS
 * @Description TODO; 经期注意事项
 * @Date 2020/9/20 10:45
 * @Hodified By:
 **/
@Service
@Transactional
public class PeriodServiceimpl implements PeriodService {
    @Autowired(required = false)
    private PeriodMapper periodMapper;

    /**
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     * @Author HONG
     * @Description //TODO 新增经期注意事项
     * @Date 10:53 2020/9/20
     * @Param [period]
     **/
    @Override
    public ResultData insertPeriod(PeriodDataBean periodDataBean) {
        Optional<Period> optionalUser = Optional.ofNullable(periodDataBean.getPeriod());
        if (optionalUser.isPresent()) {
            try {
                if (periodMapper.insertSelective(periodDataBean.getPeriod()) > 0) {
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
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     * @Author HONG
     * @Description //TODO  修改经期注意事项
     * @Date 13:56 2020/9/20
     * @Param [periodDataBean]
     **/
    @Override
    public ResultData updatePeriod(PeriodDataBean periodDataBean) {
        PeriodExample periodExample = new PeriodExample();
        PeriodExample.Criteria criteria = periodExample.createCriteria();
        criteria.andPIdEqualTo(periodDataBean.getPeriod().getpId());
        Optional<PeriodExample> optionalUser = Optional.ofNullable(periodExample);
        if (optionalUser.isPresent()) {
            try {
                if (periodMapper.updateByExampleSelective(periodDataBean.getPeriod(), periodExample) > 0 ? true : false) {
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
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     * @Author HONG
     * @Description //TODO 根据编号查询经期注意事项
     * @Date 13:58 2020/9/20
     * @Param [periodDataBean]
     **/
    @Override
    public ResultData selectPeriodId(PeriodDataBean periodDataBean) {
        if (Optional.ofNullable(periodDataBean).isPresent()) {
            PeriodExample periodExample = new PeriodExample();
            PeriodExample.Criteria criteria = periodExample.createCriteria();
            criteria.andPIdEqualTo(periodDataBean.getPeriod().getpId());
            List<Period> periods = periodMapper.selectByExample(periodExample);
            if (Optional.ofNullable(periods).isPresent()) {
                return new ResultData().ok("请查看数据", periods);
            }
        }
        return new ResultData().error();
    }

    /**
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     * @Author HONG
     * @Description //TODO 模糊查询
     * @Date 14:02 2020/9/20
     * @Param [periodDataBean]
     **/
    @Override
    public ResultData selectPeriodAll(PeriodDataBean periodDataBean) {
        if (Optional.ofNullable(periodDataBean).isPresent()) {
            PeriodExample periodExample = new PeriodExample();
            PeriodExample.Criteria criteria = periodExample.createCriteria();
            if(Optional.ofNullable(periodDataBean.getPeriod()).isPresent()){
                if (periodDataBean.getPeriod().getTitle()!=null){
                    criteria.andTitleEqualTo(periodDataBean.getPeriod().getTitle());
                }
                if (periodDataBean.getPeriod().getState()!=null){
                    criteria.andStateEqualTo(periodDataBean.getPeriod().getState());
                }
            }

            if (periodDataBean.getCreatetime()!=null){
                criteria.andCreattimeGreaterThanOrEqualTo(DateUtiles.parseDefaultDate(periodDataBean.getCreatetime()));
            }
            if (periodDataBean.getEndtime()!=null){
                criteria.andCreattimeLessThanOrEqualTo(DateUtiles.parseDefaultDate(periodDataBean.getEndtime()));
            }
            long count = periodMapper.countByExample(periodExample);
            periodDataBean.setPage((periodDataBean.getPage() - 1) * periodDataBean.getLimit());
            List<Period> list = periodMapper.selectPeriodAll(periodDataBean);
            if (Optional.ofNullable(list).isPresent()) {
                Map<String, Object> map = new LinkedHashMap<>();
                map.put("list", list);
                map.put("count", count);
                return new ResultData().ok("请查看数据", map);
            }
        }
        return new ResultData().error();
    }
}
