package com.cn.exclusiveGirlfriend.service;

import com.cn.exclusiveGirlfriend.common.ResultData;
import com.cn.exclusiveGirlfriend.dataBean.TransportTypeDataBean;

/**
 * @ClassName TransportTypeService
 * @Author ASUS
 * @Description TODO; 传输类型数据
 * @Date 2020/9/27 11:37
 * @Hodified By:
 **/
public interface TransportTypeService {
    /**
     * @Author HONG
     * @Description //TODO 模糊分页查询传输类型
     * @Date 11:17 2020/9/27
     * @Param [dressDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    ResultData selectTransportTypeAll(TransportTypeDataBean transportTypeDataBean);
    /**
     * @Author HONG
     * @Description //TODO 新增传输类型（系统管理员的操作）
     * @Date 11:44 2020/9/27
     * @Param [transportTypeDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    ResultData insertTransportType(TransportTypeDataBean transportTypeDataBean);
    /**
     * @Author HONG
     * @Description //TODO 修改传输类型（系统管理员的操作）
     * @Date 11:44 2020/9/27
     * @Param [transportTypeDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    ResultData updateTransportType(TransportTypeDataBean transportTypeDataBean);
    /**
     * @Author HONG
     * @Description //TODO 查询传输类型详情
     * @Date 11:48 2020/9/27
     * @Param [transportTypeDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    ResultData selectTransportTypeId(TransportTypeDataBean transportTypeDataBean);
    /**
     * @Author HONG
     * @Description //TODO 查询所有传输类型
     * @Date 11:48 2020/9/27
     * @Param [transportTypeDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    ResultData selectAllTransportType(TransportTypeDataBean transportTypeDataBean);
}
