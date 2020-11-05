package com.cn.exclusiveGirlfriend.service.impl;

import com.cn.exclusiveGirlfriend.common.ResultData;
import com.cn.exclusiveGirlfriend.dataBean.TransportTypeDataBean;
import com.cn.exclusiveGirlfriend.mapper.TransporttypeMapper;
import com.cn.exclusiveGirlfriend.pojo.Transporttype;
import com.cn.exclusiveGirlfriend.pojo.TransporttypeExample;
import com.cn.exclusiveGirlfriend.service.TransportTypeService;
import com.cn.exclusiveGirlfriend.utiles.DateUtiles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @ClassName TransportTypeServiceimpl
 * @Author ASUS
 * @Description TODO;
 * @Date 2020/9/27 11:37
 * @Hodified By:
 **/
@Service
@Transactional
public class TransportTypeServiceimpl implements TransportTypeService {
    @Autowired(required = false)
    private TransporttypeMapper transporttypeMapper;
    /**
     * @Author HONG
     * @Description //TODO 模糊分页查询传输类型
     * @Date 11:17 2020/9/27
     * @Param [dressDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    @Override
    public ResultData selectTransportTypeAll(TransportTypeDataBean transportTypeDataBean) {
        if (Optional.ofNullable(transportTypeDataBean).isPresent()) {
            TransporttypeExample periodExample = new TransporttypeExample();
            TransporttypeExample.Criteria criteria = periodExample.createCriteria();
            if (Optional.ofNullable(transportTypeDataBean.getTransporttype()).isPresent()){
                if (transportTypeDataBean.getTransporttype().gettName()!=null){
                    criteria.andTNameEqualTo(transportTypeDataBean.getTransporttype().gettName());
                }
                if (transportTypeDataBean.getTransporttype().gettState()!=null){
                    criteria.andTStateEqualTo(transportTypeDataBean.getTransporttype().gettState());
                }
            }

            if (transportTypeDataBean.getCreatetime()!=null){
                criteria.andTCreattimeGreaterThanOrEqualTo(DateUtiles.parseDefaultDate(transportTypeDataBean.getCreatetime()));
            }
            if (transportTypeDataBean.getEndtime()!=null){
                criteria.andTCreattimeLessThanOrEqualTo(DateUtiles.parseDefaultDate(transportTypeDataBean.getEndtime()));
            }
            long count = transporttypeMapper.countByExample(periodExample);
            transportTypeDataBean.setPage((transportTypeDataBean.getPage() - 1) * transportTypeDataBean.getLimit());
            List<Transporttype> list = transporttypeMapper.selectTransporttypeAll(transportTypeDataBean);
            if (Optional.ofNullable(list).isPresent()) {
                Map<String, Object> map = new LinkedHashMap<>();
                map.put("list", list);
                map.put("count", count);
                return new ResultData().ok("请查看数据", map);
            }
        }
        return new ResultData().error();
    }
    /**
     * @Author HONG
     * @Description //TODO 新增传输类型（系统管理员的操作）
     * @Date 11:44 2020/9/27
     * @Param [transportTypeDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    @Override
    public ResultData insertTransportType(TransportTypeDataBean transportTypeDataBean) {
        Optional<Transporttype> optionalUser = Optional.ofNullable(transportTypeDataBean.getTransporttype());
        if (optionalUser.isPresent()) {
            try {
                if (transporttypeMapper.insertSelective(transportTypeDataBean.getTransporttype()) > 0) {
                    return new ResultData().ok(optionalUser);
                }
            } catch (Exception e) {
                e.printStackTrace();
                return new ResultData().error();
            }

        }
        return new ResultData().error();
    }
    /**
     * @Author HONG
     * @Description //TODO 修改传输类型（系统管理员的操作）
     * @Date 11:44 2020/9/27
     * @Param [transportTypeDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    @Override
    public ResultData updateTransportType(TransportTypeDataBean transportTypeDataBean) {
        TransporttypeExample periodExample = new TransporttypeExample();
        TransporttypeExample.Criteria criteria = periodExample.createCriteria();
        criteria.andTIdEqualTo(transportTypeDataBean.getTransporttype().gettId());
        Optional<TransporttypeExample> optionalUser = Optional.ofNullable(periodExample);
        if (optionalUser.isPresent()) {
            try {
                if (transporttypeMapper.updateByExampleSelective(transportTypeDataBean.getTransporttype(), periodExample) > 0 ? true : false) {
                    return new ResultData().ok(optionalUser);
                }
            } catch (Exception e) {
                e.printStackTrace();
                return new ResultData().error();
            }

        }
        return new ResultData().error();
    }
    /**
     * @Author HONG
     * @Description //TODO 查询传输类型详情
     * @Date 11:48 2020/9/27
     * @Param [transportTypeDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    @Override
    public ResultData selectTransportTypeId(TransportTypeDataBean transportTypeDataBean) {
        if (Optional.ofNullable(transportTypeDataBean).isPresent()) {
            TransporttypeExample periodExample = new TransporttypeExample();
            TransporttypeExample.Criteria criteria = periodExample.createCriteria();
            criteria.andTIdEqualTo(transportTypeDataBean.getTransporttype().gettId());
            List<Transporttype> periods = transporttypeMapper.selectByExample(periodExample);
            if (Optional.ofNullable(periods).isPresent()) {
                return new ResultData().ok("请查看数据", periods);
            }
        }
        return new ResultData().error();
    }
    /**
     * @Author HONG
     * @Description //TODO 查询所有传输类型
     * @Date 11:48 2020/9/27
     * @Param [transportTypeDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    @Override
    public ResultData selectAllTransportType(TransportTypeDataBean transportTypeDataBean) {
        TransporttypeExample periodExample = new TransporttypeExample();
        List<Transporttype> periods = transporttypeMapper.selectByExample(periodExample);
        if (Optional.ofNullable(periods).isPresent()) {
            return new ResultData().ok("请查看数据", periods);
        }
        return new ResultData().error();
    }
}
