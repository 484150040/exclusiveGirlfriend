package com.cn.exclusiveGirlfriend.controller;

import com.cn.exclusiveGirlfriend.common.ResultData;
import com.cn.exclusiveGirlfriend.dataBean.AlongrecordDataBean;
import com.cn.exclusiveGirlfriend.service.AlongrecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * @program: exclusiveGirlfriend
 * @description: 相处记录管理数据
 * @author: Yang Fang Hong
 * @create: 2020-09-21 15:36
 */
@RestController
@RequestMapping("/alongrecord.all")
@CrossOrigin
@Scope("singleton")
public class AlongrecordController {
    @Autowired
    private AlongrecordService alongrecordService;
    /**
    *@Description: 模糊查询相处记录数据
    *@Param: [alongrecordDataBean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/21
    */
    @PostMapping("/selectAlongrecordAll.do")
    public ResultData selectAlongrecordAll(@RequestBody AlongrecordDataBean alongrecordDataBean){
        if (Optional.ofNullable(alongrecordDataBean).isPresent()){
            return alongrecordService.selectAlongrecordAll(alongrecordDataBean);
        }
        return new ResultData().error("传输数据有误");
    }
    /**
    *@Description: 新增相处记录数据
    *@Param: [alongrecordDataBean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/21
    */
    @PostMapping("/insertAlongrecord.do")
    public ResultData insertAlongrecord(@RequestBody AlongrecordDataBean alongrecordDataBean){
        if (Optional.ofNullable(alongrecordDataBean).isPresent()){
            return alongrecordService.insertAlongrecord(alongrecordDataBean);
        }
        return new ResultData().error("传输数据有误");
    }
    /**
    *@Description: 修改相处记录数据
    *@Param: [alongrecordDataBean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/21
    */
    @PostMapping("/updateAlongrecord.do")
    public ResultData updateAlongrecord(@RequestBody AlongrecordDataBean alongrecordDataBean){
        if (Optional.ofNullable(alongrecordDataBean).isPresent()){
            return alongrecordService.updateAlongrecord(alongrecordDataBean);
        }
        return new ResultData().error("传输数据有误");
    }
    /**
    *@Description: 通过编号查询详情相处记录数据
    *@Param: [alongrecordDataBean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/21
    */
    @PostMapping("/selectAlongrecordId.do")
    public ResultData selectAlongrecordId(@RequestBody AlongrecordDataBean alongrecordDataBean){
        if (Optional.ofNullable(alongrecordDataBean).isPresent()){
            return alongrecordService.selectAlongrecordId(alongrecordDataBean);
        }
        return new ResultData().error("传输数据有误");
    }
}
