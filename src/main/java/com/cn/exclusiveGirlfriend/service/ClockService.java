package com.cn.exclusiveGirlfriend.service;

import com.cn.exclusiveGirlfriend.common.ResultData;
import com.cn.exclusiveGirlfriend.dataBean.ClockDatabean;

/**
 * @program: exclusiveGirlfriend
 * @description: 记录时间接口
 * @author: Yang Fang Hong
 * @create: 2020-09-25 17:11
 */
public interface ClockService {
    /**
     *@Description: 新增记录时间
     *@Param: [clockDatabean]
     *@return: com.cn.exclusiveGirlfriend.common.ResultData
     *@Author: Yang Fang Hong
     *@date: 2020/9/25
     */
    ResultData addClock(ClockDatabean clockDatabean);
    /**
     *@Description: 修改记录时间
     *@Param: [clockDatabean]
     *@return: com.cn.exclusiveGirlfriend.common.ResultData
     *@Author: Yang Fang Hong
     *@date: 2020/9/25
     */
    ResultData updateClock(ClockDatabean clockDatabean);
    /**
     *@Description: 查询记录时间详情
     *@Param: [clockDatabean]
     *@return: com.cn.exclusiveGirlfriend.common.ResultData
     *@Author: Yang Fang Hong
     *@date: 2020/9/25
     */
    ResultData selectClockId(ClockDatabean clockDatabean);
    /**
     *@Description: 分页查询记录时间数据
     *@Param: [clockDatabean]
     *@return: com.cn.exclusiveGirlfriend.common.ResultData
     *@Author: Yang Fang Hong
     *@date: 2020/9/25
     */
    ResultData selectClockAll(ClockDatabean clockDatabean);
}
