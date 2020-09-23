package com.cn.exclusiveGirlfriend.service;

import com.cn.exclusiveGirlfriend.common.ResultData;
import com.cn.exclusiveGirlfriend.dataBean.GirllikeDataBean;

/**
 * @program: exclusiveGirlfriend
 * @description: 女朋友喜欢的物品接口
 * @author: Yang Fang Hong
 * @create: 2020-09-23 16:29
 */
public interface GirllikeService {
    /**
    *@Description: 新增女朋友喜欢的物品数据
    *@Param: [girllikeDataBean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/23
    */
    ResultData addGirllike(GirllikeDataBean girllikeDataBean);
    /**
    *@Description: 修改女朋友喜欢的物品数据
    *@Param: [girllikeDataBean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/23
    */
    ResultData updateGirllike(GirllikeDataBean girllikeDataBean);
    /**
    *@Description: 模糊查询女朋友喜欢的物品数据
    *@Param: [girllikeDataBean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/23
    */
    ResultData selectGirllikeAll(GirllikeDataBean girllikeDataBean);
    /**
    *@Description: 根据编号查询女朋友喜欢的物品专属详情数据
    *@Param: [girllikeDataBean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/23
    */
    ResultData selectGirllikeId(GirllikeDataBean girllikeDataBean);
}
