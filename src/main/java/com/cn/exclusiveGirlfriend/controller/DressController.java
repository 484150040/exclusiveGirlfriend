package com.cn.exclusiveGirlfriend.controller;

import com.cn.exclusiveGirlfriend.common.ResultData;
import com.cn.exclusiveGirlfriend.dataBean.DressDataBean;
import com.cn.exclusiveGirlfriend.service.DressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * @ClassName DressController
 * @Author ASUS
 * @Description TODO;   用户（女朋友）服饰管理
 * @Date 2020/9/24 1:33
 * @Hodified By:
 **/
@RestController
@RequestMapping("/dress.all")
@CrossOrigin
@Scope("singleton")
public class DressController {
    @Autowired
    private DressService dressService;
    /**
     * @Author HONG
     * @Description //TODO 分页模糊查询用户（女朋友）服饰管理
     * @Date 1:38 2020/9/24
     * @Param [dressDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    @PostMapping("/selectDressAll.do")
    public ResultData selectDressAll(@RequestBody DressDataBean dressDataBean){
        if (Optional.ofNullable(dressDataBean).isPresent()){
            return dressService.selectDressAll(dressDataBean);
        }
        return new ResultData().error("传输数据有误");
    }
    /**
     * @Author HONG
     * @Description //TODO 新增用户（女朋友）服饰管理
     * @Date 1:39 2020/9/24
     * @Param [dressDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    @PostMapping("/insertDress.do")
    public ResultData insertDress(@RequestBody DressDataBean dressDataBean){
        if (Optional.ofNullable(dressDataBean).isPresent()){
            return dressService.insertDress(dressDataBean);
        }
        return new ResultData().error("传输数据有误");
    }

    /**
     * @Author HONG
     * @Description //TODO  修改用户（女朋友）服饰管理
     * @Date 1:40 2020/9/24
     * @Param [dressDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    @PostMapping("/updateDress.do")
    public ResultData updateDress(@RequestBody DressDataBean dressDataBean){
        if (Optional.ofNullable(dressDataBean).isPresent()){
            return dressService.updateDress(dressDataBean);
        }
        return new ResultData().error("传输数据有误");
    }
    /**
     * @Author HONG
     * @Description //TODO 通过编号查询详情数据用户（女朋友）服饰管理
     * @Date 1:41 2020/9/24
     * @Param [dressDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    @PostMapping("/selectDressId.do")
    public ResultData selectDressId(@RequestBody DressDataBean dressDataBean){
        if (Optional.ofNullable(dressDataBean).isPresent()){
            return dressService.selectDressId(dressDataBean);
        }
        return new ResultData().error("传输数据有误");
    }
}
