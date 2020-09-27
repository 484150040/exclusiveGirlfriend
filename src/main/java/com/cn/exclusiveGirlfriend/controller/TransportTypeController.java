package com.cn.exclusiveGirlfriend.controller;

import com.cn.exclusiveGirlfriend.common.ResultData;
import com.cn.exclusiveGirlfriend.dataBean.TransportTypeDataBean;
import com.cn.exclusiveGirlfriend.service.TransportTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * @ClassName TransportType
 * @Author ASUS
 * @Description TODO;
 * @Date 2020/9/27 11:36
 * @Hodified By:
 **/
@RestController
@RequestMapping("/transportType.all")
@CrossOrigin
@Scope("singleton")
public class TransportTypeController {
    @Autowired
    private TransportTypeService transportTypeService;

    /**
     * @Author HONG
     * @Description //TODO 分页模糊查询传输类型
     * @Date 11:42 2020/9/27
     * @Param [transportTypeDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    @PostMapping("/selectTransportTypeAll.do")
    public ResultData selectTransportTypeAll(@RequestBody TransportTypeDataBean transportTypeDataBean){
        if (Optional.ofNullable(transportTypeDataBean).isPresent()){
            return transportTypeService.selectTransportTypeAll(transportTypeDataBean);
        }
        return new ResultData().error("传输数据有误");
    }
    /**
     * @Author HONG
     * @Description //TODO 新增传输类型（系统管理员的操作）
     * @Date 11:44 2020/9/27
     * @Param [transportTypeDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    @PostMapping("/insertTransportType.do")
    public ResultData insertTransportType(@RequestBody TransportTypeDataBean transportTypeDataBean){
        if (Optional.ofNullable(transportTypeDataBean).isPresent()){
            return transportTypeService.insertTransportType(transportTypeDataBean);
        }
        return new ResultData().error("传输数据有误");
    }
    /**
     * @Author HONG
     * @Description //TODO 修改传输类型（系统管理员的操作）
     * @Date 11:44 2020/9/27
     * @Param [transportTypeDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    @PostMapping("/updateTransportType.do")
    public ResultData updateTransportType(@RequestBody TransportTypeDataBean transportTypeDataBean){
        if (Optional.ofNullable(transportTypeDataBean).isPresent()){
            return transportTypeService.updateTransportType(transportTypeDataBean);
        }
        return new ResultData().error("传输数据有误");
    }

    /**
     * @Author HONG
     * @Description //TODO 查询传输类型详情
     * @Date 11:48 2020/9/27
     * @Param [transportTypeDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    @PostMapping("/selectTransportTypeId.do")
    public ResultData selectTransportTypeId(@RequestBody TransportTypeDataBean transportTypeDataBean){
        if (Optional.ofNullable(transportTypeDataBean).isPresent()){
            return transportTypeService.selectTransportTypeId(transportTypeDataBean);
        }
        return new ResultData().error("传输数据有误");
    }
    /**
     * @Author HONG
     * @Description //TODO 查询所有传输类型
     * @Date 11:48 2020/9/27
     * @Param [transportTypeDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    @PostMapping("/selectAllTransportType.do")
    public ResultData selectAllTransportType(@RequestBody TransportTypeDataBean transportTypeDataBean){
        if (Optional.ofNullable(transportTypeDataBean).isPresent()){
            return transportTypeService.selectAllTransportType(transportTypeDataBean);
        }
        return new ResultData().error("传输数据有误");
    }
}
