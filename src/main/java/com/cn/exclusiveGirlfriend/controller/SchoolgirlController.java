package com.cn.exclusiveGirlfriend.controller;

import com.cn.exclusiveGirlfriend.common.ResultData;
import com.cn.exclusiveGirlfriend.dataBean.SchoolgirlDataBean;
import com.cn.exclusiveGirlfriend.service.SchoolgirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * @program: exclusiveGirlfriend
 * @description: 女生详情
 * @author: Yang Fang Hong
 * @create: 2020-09-24 11:09
 */
@RestController
@RequestMapping("/schoolgirl.all")
@CrossOrigin
@Scope("singleton")
public class SchoolgirlController {
    @Autowired
    private SchoolgirlService schoolgirlService;
    /**
    *@Description: 新增女生详情
    *@Param: [schoolgirlDataBean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/24
    */
    @PostMapping("/insertSchoolgirl.do")
    public ResultData insertSchoolgirl(@RequestBody SchoolgirlDataBean schoolgirlDataBean){
        if (Optional.ofNullable(schoolgirlDataBean).isPresent()){
            return schoolgirlService.insertSchoolgirl(schoolgirlDataBean);
        }
        return new ResultData().error();
    }
    /**
    *@Description: 修改女生详情
    *@Param: [schoolgirlDataBean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/24
    */
    @PostMapping("/updateSchoolgirl.do")
    public ResultData updateSchoolgirl(@RequestBody SchoolgirlDataBean schoolgirlDataBean){
        if (Optional.ofNullable(schoolgirlDataBean).isPresent()){
            return schoolgirlService.updateSchoolgirl(schoolgirlDataBean);
        }
        return new ResultData().error();
    }
    /**
    *@Description: 根据编号查询数据
    *@Param: [schoolgirlDataBean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/24
    */
    @PostMapping("/selectSchoolgirlId.do")
    public ResultData selectSchoolgirlId(@RequestBody SchoolgirlDataBean schoolgirlDataBean){
        if (Optional.ofNullable(schoolgirlDataBean).isPresent()){
            return schoolgirlService.selectSchoolgirlId(schoolgirlDataBean);
        }
        return new ResultData().error();
    }

    /**
    *@Description: 模糊查询(分页查询)女生详情数据
    *@Param: [schoolgirlDataBean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/24
    */
    @PostMapping("/selectSchoolgirlall.do")
    public ResultData selectSchoolgirlall(@RequestBody SchoolgirlDataBean schoolgirlDataBean){
        if (Optional.ofNullable(schoolgirlDataBean).isPresent()){
            return schoolgirlService.selectSchoolgirlall(schoolgirlDataBean);
        }
        return new ResultData().error();
    }
}
