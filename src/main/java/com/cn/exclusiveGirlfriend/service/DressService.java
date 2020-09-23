package com.cn.exclusiveGirlfriend.service;

import com.cn.exclusiveGirlfriend.common.ResultData;
import com.cn.exclusiveGirlfriend.dataBean.DressDataBean;

/**
 * @ClassName DressService
 * @Author ASUS
 * @Description TODO;   用户（女朋友）服饰管理接口
 * @Date 2020/9/24 1:34
 * @Hodified By:
 **/
public interface DressService {
    /**
     * @Author HONG
     * @Description //TODO 分页模糊查询用户（女朋友）服饰管理
     * @Date 1:38 2020/9/24
     * @Param [dressDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    ResultData selectDressAll(DressDataBean dressDataBean);
    /**
     * @Author HONG
     * @Description //TODO  新增用户（女朋友）服饰管理
     * @Date 1:39 2020/9/24
     * @Param [dressDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    ResultData insertDress(DressDataBean dressDataBean);
    /**
     * @Author HONG
     * @Description //TODO  修改用户（女朋友）服饰管理
     * @Date 1:40 2020/9/24
     * @Param [dressDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    ResultData updateDress(DressDataBean dressDataBean);
    /**
     * @Author HONG
     * @Description //TODO 通过编号查询用户（女朋友）服饰管理详情数据
     * @Date 1:41 2020/9/24
     * @Param [dressDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    ResultData selectDressId(DressDataBean dressDataBean);
}
