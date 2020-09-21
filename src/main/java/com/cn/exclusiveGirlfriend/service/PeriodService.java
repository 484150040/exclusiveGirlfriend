package com.cn.exclusiveGirlfriend.service;

import com.cn.exclusiveGirlfriend.common.ResultData;
import com.cn.exclusiveGirlfriend.dataBean.PeriodDataBean;
import com.cn.exclusiveGirlfriend.pojo.Period;

/**
 * @ClassName PeriodService
 * @Author ASUS
 * @Description TODO;   经期注意事项
 * @Date 2020/9/20 10:43
 * @Hodified By:
 **/
public interface PeriodService {
    /**
     * @Author HONG
     * @Description //TODO 新增经期注意事项
     * @Date 10:52 2020/9/20
     * @Param [period]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    ResultData insertPeriod(PeriodDataBean periodDataBean);
    /**
     * @Author HONG
     * @Description //TODO  修改经期注意事项
     * @Date 13:56 2020/9/20
     * @Param [periodDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    ResultData updatePeriod(PeriodDataBean periodDataBean);
    /**
     * @Author HONG
     * @Description //TODO 根据编号查询经期注意事项
     * @Date 13:58 2020/9/20
     * @Param [periodDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    ResultData selectPeriodId(PeriodDataBean periodDataBean);
    /**
     * @Author HONG
     * @Description //TODO 模糊查询
     * @Date 14:02 2020/9/20
     * @Param [periodDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    ResultData selectPeriodAll(PeriodDataBean periodDataBean);
}
