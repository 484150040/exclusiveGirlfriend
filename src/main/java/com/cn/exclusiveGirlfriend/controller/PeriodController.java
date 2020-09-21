package com.cn.exclusiveGirlfriend.controller;

import com.cn.exclusiveGirlfriend.common.ResultData;
import com.cn.exclusiveGirlfriend.dataBean.PeriodDataBean;
import com.cn.exclusiveGirlfriend.pojo.Period;
import com.cn.exclusiveGirlfriend.service.PeriodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * @ClassName PeriodController
 * @Author ASUS
 * @Description TODO; 经期注意事项表
 * @Date 2020/9/20 10:40
 * @Hodified By:
 **/
@RestController
@RequestMapping("/period.all")
@CrossOrigin
@Scope("singleton")
public class PeriodController {
    @Autowired
    private PeriodService periodService;
    /**
     * @Author HONG
     * @Description //TODO  新增经期注意事项
     * @Date 11:04 2020/9/20
     * @Param [period]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    @PostMapping("/insertPeriod")
    public ResultData insertPeriod(@RequestBody PeriodDataBean periodDataBean){
        if (Optional.ofNullable(periodDataBean).isPresent()){
            return periodService.insertPeriod(periodDataBean);
        }
        return new ResultData().error();
    }
    /**
     * @Author HONG
     * @Description //TODO  修改经期注意事项
     * @Date 12:09 2020/9/20
     * @Param [period]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    @PostMapping("/updatePeriod")
    public ResultData updatePeriod(@RequestBody PeriodDataBean periodDataBean){
        if (Optional.ofNullable(periodDataBean).isPresent()){
            return periodService.updatePeriod(periodDataBean);
        }
        return new ResultData().error();
    }
    /**
     * @Author HONG
     * @Description //TODO 根据编号查询经期注意事项
     * @Date 12:10 2020/9/20
     * @Param [period]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    @PostMapping("/selectPeriodId")
    public ResultData selectPeriodId(@RequestBody PeriodDataBean periodDataBean){
        if (Optional.ofNullable(periodDataBean).isPresent()){
            return periodService.selectPeriodId(periodDataBean);
        }
        return new ResultData().error();
    }

    /**
     * @Author HONG
     * @Description //TODO  模糊查询
     * @Date 12:52 2020/9/20
     * @Param [period]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    @PostMapping("/selectPeriodAll.do")
    public ResultData selectPeriodAll(@RequestBody PeriodDataBean periodDataBean){
        if (Optional.ofNullable(periodDataBean).isPresent()){
            return periodService.selectPeriodAll(periodDataBean);
        }
        return new ResultData().error();
    }

}
