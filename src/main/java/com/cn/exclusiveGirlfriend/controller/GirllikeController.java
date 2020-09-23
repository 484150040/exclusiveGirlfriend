package com.cn.exclusiveGirlfriend.controller;

import com.cn.exclusiveGirlfriend.common.ResultData;
import com.cn.exclusiveGirlfriend.dataBean.GirllikeDataBean;
import com.cn.exclusiveGirlfriend.service.GirllikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * @program: exclusiveGirlfriend
 * @description: 女朋友喜欢的物品
 * @author: Yang Fang Hong
 * @create: 2020-09-23 16:10
 */
@RestController
@RequestMapping("/girllike.all")
@CrossOrigin
@Scope("singleton")
public class GirllikeController {
    @Autowired
    private GirllikeService girllikeService;
    /**
    *@Description: 新增女朋友喜欢的物品数据
    *@Param: [feedbackDataBean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/23
    */
    @PostMapping("/addGirllike.do")
    public ResultData addGirllike(@RequestBody GirllikeDataBean girllikeDataBean){
        if (Optional.ofNullable(girllikeDataBean).isPresent()){
            return girllikeService.addGirllike(girllikeDataBean);
        }
        return new ResultData().error("传输数据有误");
    }
    /**
    *@Description: 修改女朋友喜欢的物品数据
    *@Param: [girllikeDataBean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/23
    */
    @PostMapping("/updateGirllike.do")
    public ResultData updateGirllike(@RequestBody GirllikeDataBean girllikeDataBean){
        if (Optional.ofNullable(girllikeDataBean).isPresent()){
            return girllikeService.updateGirllike(girllikeDataBean);
        }
        return new ResultData().error("传输数据有误");
    }
    /**
    *@Description: 模糊查询女朋友喜欢的物品分页数据
    *@Param: [girllikeDataBean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/23
    */
    @PostMapping("/selectGirllikeAll.do")
    public ResultData selectGirllikeAll(@RequestBody GirllikeDataBean girllikeDataBean){
        if (Optional.ofNullable(girllikeDataBean).isPresent()){
            return girllikeService.selectGirllikeAll(girllikeDataBean);
        }
        return new ResultData().error("传输数据有误");
    }

    /**
    *@Description: 根据编号查询女朋友喜欢的物品专属详情数据
    *@Param: [girllikeDataBean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/23
    */
    @PostMapping("/selectGirllikeId.do")
    public ResultData selectGirllikeId(@RequestBody GirllikeDataBean girllikeDataBean){
        if (Optional.ofNullable(girllikeDataBean).isPresent()){
            return girllikeService.selectGirllikeId(girllikeDataBean);
        }
        return new ResultData().error("传输数据有误");
    }
}
