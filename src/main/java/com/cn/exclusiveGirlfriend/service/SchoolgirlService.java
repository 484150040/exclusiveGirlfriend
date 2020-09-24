package com.cn.exclusiveGirlfriend.service;

import com.cn.exclusiveGirlfriend.common.ResultData;
import com.cn.exclusiveGirlfriend.dataBean.SchoolgirlDataBean;

/**
 * @program: exclusiveGirlfriend
 * @description: 女生详情接口
 * @author: Yang Fang Hong
 * @create: 2020-09-24 14:43
 */
public interface SchoolgirlService {
    /**
    *@Description: 模糊分页查询女生详情
    *@Param: [schoolgirlDataBean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/24
    */
    ResultData selectSchoolgirlall(SchoolgirlDataBean schoolgirlDataBean);
    /**
    *@Description: 通过编号查询详情数据
    *@Param: [schoolgirlDataBean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/24
    */
    ResultData selectSchoolgirlId(SchoolgirlDataBean schoolgirlDataBean);
    /**
    *@Description: 修改女生详情数据
    *@Param: [schoolgirlDataBean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/24
    */
    ResultData updateSchoolgirl(SchoolgirlDataBean schoolgirlDataBean);
    /**
    *@Description: 新增女生详情数据
    *@Param: [schoolgirlDataBean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/24
    */
    ResultData insertSchoolgirl(SchoolgirlDataBean schoolgirlDataBean);
}
