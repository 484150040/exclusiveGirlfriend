package com.cn.exclusiveGirlfriend.service;

import com.cn.exclusiveGirlfriend.common.ResultData;
import com.cn.exclusiveGirlfriend.dataBean.LegalDatabean;

/**
 * @program: exclusiveGirlfriend
 * @description: 女生例假接口数据
 * @author: Yang Fang Hong
 * @create: 2020-09-25 16:43
 */
public interface LegalService {
    /**
    *@Description: 新增女生例假数据
    *@Param: [legalDatabean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/25
    */
    ResultData addLegal(LegalDatabean legalDatabean);
    /**
    *@Description: 修改女生例假数据
    *@Param: [legalDatabean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/25
    */
    ResultData updateLegal(LegalDatabean legalDatabean);
    /**
    *@Description: 分页模糊查询女生例假数据
    *@Param: [legalDatabean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/25
    */
    ResultData selectLegalall(LegalDatabean legalDatabean);
    /**
    *@Description: 根据边号查询女生例假数据详情信息
    *@Param: [legalDatabean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/25
    */
    ResultData selectLegalId(LegalDatabean legalDatabean);
}
