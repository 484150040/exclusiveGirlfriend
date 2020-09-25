package com.cn.exclusiveGirlfriend.controller;

import com.cn.exclusiveGirlfriend.common.ResultData;
import com.cn.exclusiveGirlfriend.dataBean.LegalDatabean;
import com.cn.exclusiveGirlfriend.service.LegalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * @program: exclusiveGirlfriend
 * @description: 女生例假
 * @author: Yang Fang Hong
 * @create: 2020-09-25 16:41
 */
@RestController
@RequestMapping("/legal.all")
@CrossOrigin
@Scope("singleton")
public class LegalController {
    @Autowired
    private LegalService legalService;
    /**
     *@Description: 新增女生例假数据
     *@Param: [legalDatabean]
     *@return: com.cn.exclusiveGirlfriend.common.ResultData
     *@Author: Yang Fang Hong
     *@date: 2020/9/25
     */
    @PostMapping("/addLegal.do")
    public ResultData addLegal(@RequestBody LegalDatabean legalDatabean){
        if (Optional.ofNullable(legalDatabean).isPresent()){
            return legalService.addLegal(legalDatabean);
        }
        return new ResultData().error("传输数据有误");
    }
    /**
     *@Description: 修改女生例假数据
     *@Param: [legalDatabean]
     *@return: com.cn.exclusiveGirlfriend.common.ResultData
     *@Author: Yang Fang Hong
     *@date: 2020/9/25
     */
    @PostMapping("/updateLegal.do")
    public ResultData updateLegal(@RequestBody LegalDatabean legalDatabean){
        if (Optional.ofNullable(legalDatabean).isPresent()){
            return legalService.updateLegal(legalDatabean);
        }
        return new ResultData().error("传输数据有误");
    }

    /**
     *@Description: 分页模糊查询女生例假数据
     *@Param: [legalDatabean]
     *@return: com.cn.exclusiveGirlfriend.common.ResultData
     *@Author: Yang Fang Hong
     *@date: 2020/9/25
     */
    @PostMapping("/selectLegalall.do")
    public ResultData selectLegalall(@RequestBody LegalDatabean legalDatabean){
        if (Optional.ofNullable(legalDatabean).isPresent()){
            return legalService.selectLegalall(legalDatabean);
        }
        return new ResultData().error("传输数据有误");
    }
    /**
     *@Description: 根据边号查询女生例假数据详情信息
     *@Param: [legalDatabean]
     *@return: com.cn.exclusiveGirlfriend.common.ResultData
     *@Author: Yang Fang Hong
     *@date: 2020/9/25
     */
    @PostMapping("/selectLegalId.do")
    public ResultData selectLegalId(@RequestBody LegalDatabean legalDatabean){
        if (Optional.ofNullable(legalDatabean).isPresent()){
            return legalService.selectLegalId(legalDatabean);
        }
        return new ResultData().error("传输数据有误");
    }
}
