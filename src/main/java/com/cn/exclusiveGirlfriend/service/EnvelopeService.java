package com.cn.exclusiveGirlfriend.service;

import com.cn.exclusiveGirlfriend.common.ResultData;
import com.cn.exclusiveGirlfriend.dataBean.EnvelopeDataBean;

/**
 * @ClassName EnvelopeService
 * @Author ASUS
 * @Description TODO;信封传输接口
 * @Date 2020/9/27 10:48
 * @Hodified By:
 **/
public interface EnvelopeService {
    /**
     * @Author HONG
     * @Description //TODO 分页模糊查询信封传输数据
     * @Date 11:32 2020/9/27
     * @Param [envelopeDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    ResultData selectEnvelopeAll(EnvelopeDataBean envelopeDataBean);
    /**
     * @Author HONG
     * @Description //TODO 发送信封数据（利用消息队列发送）
     * @Date 11:33 2020/9/27
     * @Param [envelopeDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    ResultData insertEnvelope(EnvelopeDataBean envelopeDataBean);
    /**
     * @Author HONG
     * @Description //TODO 修改信封数据
     * @Date 11:34 2020/9/27
     * @Param [envelopeDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    ResultData updateEnvelope(EnvelopeDataBean envelopeDataBean);
    /**
     * @Author HONG
     * @Description //TODO 查询信封数据详情（修改的时候进行回显数据）
     * @Date 11:34 2020/9/27
     * @Param [envelopeDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    ResultData selectEnvelopeId(EnvelopeDataBean envelopeDataBean);
}
