package com.cn.exclusiveGirlfriend.controller;

import com.cn.exclusiveGirlfriend.common.ResultData;
import com.cn.exclusiveGirlfriend.dataBean.EnvelopeDataBean;
import com.cn.exclusiveGirlfriend.service.EnvelopeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * @ClassName EnvelopeController
 * @Author ASUS
 * @Description TODO;信封传输
 * @Date 2020/9/27 10:46
 * @Hodified By:
 **/
@RestController
@RequestMapping("/envelope.all")
@CrossOrigin
@Scope("singleton")
public class EnvelopeController {
    @Autowired
    private EnvelopeService envelopeService;
    /**
     * @Author HONG
     * @Description //TODO 模糊分页查询传输类型
     * @Date 11:17 2020/9/27
     * @Param [dressDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    @PostMapping("/selectEnvelopeAll.do")
    public ResultData selectEnvelopeAll(@RequestBody EnvelopeDataBean envelopeDataBean){
        if (Optional.ofNullable(envelopeDataBean).isPresent()){
            return envelopeService.selectEnvelopeAll(envelopeDataBean);
        }
        return new ResultData().error("传输数据有误");
    }

    /**
     * @Author HONG
     * @Description //TODO  新增信封传输数据（利用消息队列发送）
     * @Date 11:20 2020/9/27
     * @Param [dressDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    @PostMapping("/insertEnvelope.do")
    public ResultData insertEnvelope(@RequestBody EnvelopeDataBean envelopeDataBean){
        if (Optional.ofNullable(envelopeDataBean).isPresent()){
            return envelopeService.insertEnvelope(envelopeDataBean);
        }
        return new ResultData().error("传输数据有误");
    }

    /**
     * @Author HONG
     * @Description //TODO 修改信封传输数据（一旦发送无法修改【在30分钟未发送之前可以修改】）
     * @Date 11:21 2020/9/27
     * @Param [envelopeDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    @PostMapping("/updateEnvelope.do")
    public ResultData updateEnvelope(@RequestBody EnvelopeDataBean envelopeDataBean){
        if (Optional.ofNullable(envelopeDataBean).isPresent()){
            return envelopeService.updateEnvelope(envelopeDataBean);
        }
        return new ResultData().error("传输数据有误");
    }
    /**
     * @Author HONG
     * @Description //TODO 查询该条信封数据的
     * @Date 11:26 2020/9/27
     * @Param [envelopeDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    @PostMapping("/selectEnvelopeId.do")
    public ResultData selectEnvelopeId(@RequestBody EnvelopeDataBean envelopeDataBean){
        if (Optional.ofNullable(envelopeDataBean).isPresent()){
            return envelopeService.selectEnvelopeId(envelopeDataBean);
        }
        return new ResultData().error("传输数据有误");
    }
}
