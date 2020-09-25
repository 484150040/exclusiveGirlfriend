package com.cn.exclusiveGirlfriend.service.impl;

import com.cn.exclusiveGirlfriend.common.ResultData;
import com.cn.exclusiveGirlfriend.dataBean.ClockDatabean;
import com.cn.exclusiveGirlfriend.mapper.ClockMapper;
import com.cn.exclusiveGirlfriend.pojo.Clock;
import com.cn.exclusiveGirlfriend.pojo.ClockExample;
import com.cn.exclusiveGirlfriend.service.ClockService;
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
 * @description:    记录时间接口
 * @author: Yang Fang Hong
 * @create: 2020-09-25 17:11
 */
@Service
@Transactional
public class ClockServiceimpl implements ClockService {
    @Autowired(required = false)
    private ClockMapper clockMapper;
    @Override
    public ResultData addClock(ClockDatabean clockDatabean) {
        Optional<Clock> optionalUser = Optional.ofNullable(clockDatabean.getClock());
        if (optionalUser.isPresent()) {
            try {
                if (clockMapper.insertSelective(clockDatabean.getClock()) > 0) {
                    return new ResultData().ok(optionalUser);
                }
            } catch (Exception e) {
                e.printStackTrace();
                return new ResultData().error();
            }

        }
        return new ResultData().error();
    }

    @Override
    public ResultData updateClock(ClockDatabean clockDatabean) {
        ClockExample periodExample = new ClockExample();
        ClockExample.Criteria criteria = periodExample.createCriteria();
        criteria.andClIdEqualTo(clockDatabean.getClock().getClId());
        Optional<ClockExample> optionalUser = Optional.ofNullable(periodExample);
        if (optionalUser.isPresent()) {
            try {
                if (clockMapper.updateByExampleSelective(clockDatabean.getClock(), periodExample) > 0 ? true : false) {
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
    *@Description: 根据编号查询记录时间数据
    *@Param: [clockDatabean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/25
    */
    @Override
    public ResultData selectClockId(ClockDatabean clockDatabean) {
        if (Optional.ofNullable(clockDatabean).isPresent()) {
            ClockExample periodExample = new ClockExample();
            ClockExample.Criteria criteria = periodExample.createCriteria();
            criteria.andClIdEqualTo(clockDatabean.getClock().getClId());
            List<Clock> periods = clockMapper.selectByExample(periodExample);
            if (Optional.ofNullable(periods).isPresent()) {
                return new ResultData().ok("请查看数据", periods);
            }
        }
        return new ResultData().error();
    }

    @Override
    public ResultData selectClockAll(ClockDatabean clockDatabean) {
        if (Optional.ofNullable(clockDatabean).isPresent()) {
            ClockExample periodExample = new ClockExample();
            ClockExample.Criteria criteria = periodExample.createCriteria();
            if (clockDatabean.getClock().getGlName()!=null){
                criteria.andGlNameLike(clockDatabean.getClock().getGlName());
            }
            if (clockDatabean.getClock().getGlType()!=null){
                criteria.andGlTypeEqualTo(clockDatabean.getClock().getGlType());
            }
            if (clockDatabean.getClock().getGlState()!=null){
                criteria.andGlStateEqualTo(clockDatabean.getClock().getGlState());
            }
            if (clockDatabean.getClock().getGlLevel()!=null){
                criteria.andGlLevelEqualTo(clockDatabean.getClock().getGlLevel());
            }
            if (clockDatabean.getCreatetime()!=null){
                criteria.andCreatetimeGreaterThanOrEqualTo(DateUtiles.parseDefaultDate(clockDatabean.getCreatetime()));
            }
            if (clockDatabean.getEndtime()!=null){
                criteria.andCreatetimeLessThanOrEqualTo(DateUtiles.parseDefaultDate(clockDatabean.getEndtime()));
            }
            long count = clockMapper.countByExample(periodExample);
            clockDatabean.setPage(clockDatabean.getPage() - 1 * clockDatabean.getLimit());
            List<Clock> list = clockMapper.selectClockAll(clockDatabean);
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
