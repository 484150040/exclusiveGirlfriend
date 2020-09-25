package com.cn.exclusiveGirlfriend.controller;

import com.cn.exclusiveGirlfriend.common.ResultData;
import com.cn.exclusiveGirlfriend.dataBean.ClockDatabean;
import com.cn.exclusiveGirlfriend.service.ClockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * @program: exclusiveGirlfriend
 * @description: 记录时间操作
 * @author: Yang Fang Hong
 * @create: 2020-09-25 17:10
 */
@RestController
@RequestMapping("/clock.all")
@CrossOrigin
@Scope("singleton")
public class ClockController {
    @Autowired
    private ClockService clockService;
    /**
    *@Description: 新增记录时间
    *@Param: [clockDatabean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/25
    */
    @PostMapping("/addClock.do")
    public ResultData addClock(@RequestBody ClockDatabean clockDatabean){
        if (Optional.ofNullable(clockDatabean).isPresent()){
            return clockService.addClock(clockDatabean);
        }
        return new ResultData().error("传输数据有误");
    }

    /**
    *@Description: 修改记录时间
    *@Param: [clockDatabean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/25
    */
    @PostMapping("/updateClock.do")
    public ResultData updateClock(@RequestBody ClockDatabean clockDatabean){
        if (Optional.ofNullable(clockDatabean).isPresent()){
            return clockService.updateClock(clockDatabean);
        }
        return new ResultData().error("传输数据有误");
    }
    /**
    *@Description: 查询记录时间详情
    *@Param: [clockDatabean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/25
    */
    @PostMapping("/selectClockId.do")
    public ResultData selectClockId(@RequestBody ClockDatabean clockDatabean){
        if (Optional.ofNullable(clockDatabean).isPresent()){
            return clockService.selectClockId(clockDatabean);
        }
        return new ResultData().error("传输数据有误");
    }
    /**
    *@Description: 分页查询记录时间数据
    *@Param: [clockDatabean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/25
    */
    @PostMapping("/selectClockAll.do")
    public ResultData selectClockAll(@RequestBody ClockDatabean clockDatabean){
        if (Optional.ofNullable(clockDatabean).isPresent()){
            return clockService.selectClockAll(clockDatabean);
        }
        return new ResultData().error("传输数据有误");
    }
}
