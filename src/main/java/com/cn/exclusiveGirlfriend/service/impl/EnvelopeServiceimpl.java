package com.cn.exclusiveGirlfriend.service.impl;

import com.cn.exclusiveGirlfriend.common.ResultData;
import com.cn.exclusiveGirlfriend.dataBean.EnvelopeDataBean;
import com.cn.exclusiveGirlfriend.mapper.EnvelopeMapper;
import com.cn.exclusiveGirlfriend.service.EnvelopeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName EnvelopeServiceimpl
 * @Author ASUS
 * @Description TODO;信封传输数据接口实现
 * @Date 2020/9/27 10:52
 * @Hodified By:
 **/
@Service
@Transactional
public class EnvelopeServiceimpl implements EnvelopeService {
    @Autowired(required = false)
    private EnvelopeMapper envelopeMapper;
    /**
     * @Author HONG
     * @Description //TODO 分页模糊查询信封传输数据
     * @Date 11:32 2020/9/27
     * @Param [envelopeDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    @Override
    public ResultData selectEnvelopeAll(EnvelopeDataBean envelopeDataBean) {
        return null;
    }
    /**
     * @Author HONG
     * @Description //TODO 发送信封数据（利用消息队列发送）
     * @Date 11:33 2020/9/27
     * @Param [envelopeDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    @Override
    public ResultData insertEnvelope(EnvelopeDataBean envelopeDataBean) {
        return null;
    }
    /**
     * @Author HONG
     * @Description //TODO 修改信封数据
     * @Date 11:34 2020/9/27
     * @Param [envelopeDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    @Override
    public ResultData updateEnvelope(EnvelopeDataBean envelopeDataBean) {
        return null;
    }
    /**
     * @Author HONG
     * @Description //TODO 查询信封数据详情（修改的时候进行回显数据）
     * @Date 11:34 2020/9/27
     * @Param [envelopeDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    @Override
    public ResultData selectEnvelopeId(EnvelopeDataBean envelopeDataBean) {
        return null;
    }
}
