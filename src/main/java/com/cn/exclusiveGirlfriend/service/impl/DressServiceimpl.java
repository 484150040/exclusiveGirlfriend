package com.cn.exclusiveGirlfriend.service.impl;

import com.cn.exclusiveGirlfriend.common.ResultData;
import com.cn.exclusiveGirlfriend.dataBean.DressDataBean;
import com.cn.exclusiveGirlfriend.mapper.DressMapper;
import com.cn.exclusiveGirlfriend.pojo.Dress;
import com.cn.exclusiveGirlfriend.pojo.DressExample;
import com.cn.exclusiveGirlfriend.service.DressService;
import com.cn.exclusiveGirlfriend.utiles.DateUtiles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @ClassName DressServiceimpl
 * @Author ASUS
 * @Description TODO;用户（女朋友）服饰管理接口实现
 * @Date 2020/9/24 1:34
 * @Hodified By:
 **/
@Service
@Transactional
public class DressServiceimpl implements DressService {
    @Autowired(required = false)
    private DressMapper dressMapper;
    /**
     * @Author HONG
     * @Description //TODO 分页模糊查询用户（女朋友）服饰管理
     * @Date 1:38 2020/9/24
     * @Param [dressDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/

    @Override
    public ResultData selectDressAll(DressDataBean dressDataBean) {

        if (Optional.ofNullable(dressDataBean).isPresent()) {
            DressExample periodExample = new DressExample();
            DressExample.Criteria criteria = periodExample.createCriteria();
            if (dressDataBean.getDress().getUid()!=null){
                criteria.andUidEqualTo(dressDataBean.getDress().getUid());
            }
            if (dressDataBean.getDress().getShoeSize()!=null){
                criteria.andShoeSizeEqualTo(dressDataBean.getDress().getShoeSize());
            }
            if (dressDataBean.getDress().getSkirtSize()!=null){
                criteria.andSkirtSizeEqualTo(dressDataBean.getDress().getSkirtSize());
            }
            if (dressDataBean.getDress().getClothesSize()!=null){
                criteria.andSkirtSizeEqualTo(dressDataBean.getDress().getClothesSize());
            }
            if (dressDataBean.getDress().getTrousersSize()!=null){
                criteria.andSkirtSizeEqualTo(dressDataBean.getDress().getTrousersSize());
            }
            if (dressDataBean.getCreatetime()!=null){
                criteria.andCreatetimeGreaterThanOrEqualTo(DateUtiles.parseDefaultDate(dressDataBean.getCreatetime()));
            }
            if (dressDataBean.getEndtime()!=null){
                criteria.andCreatetimeLessThanOrEqualTo(DateUtiles.parseDefaultDate(dressDataBean.getEndtime()));
            }
            long count = dressMapper.countByExample(periodExample);
            dressDataBean.setPage(dressDataBean.getPage() - 1 * dressDataBean.getLimit());
            List<Dress> list = dressMapper.selectDressAll(dressDataBean);
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
     * @Description //TODO  新增用户（女朋友）服饰管理
     * @Date 1:39 2020/9/24
     * @Param [dressDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    @Override
    public ResultData insertDress(DressDataBean dressDataBean) {
        Optional<Dress> optionalUser = Optional.ofNullable(dressDataBean.getDress());
        if (optionalUser.isPresent()) {
            try {
                if (dressMapper.insertSelective(dressDataBean.getDress()) > 0) {
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
     * @Description //TODO  修改用户（女朋友）服饰管理
     * @Date 1:40 2020/9/24
     * @Param [dressDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    @Override
    public ResultData updateDress(DressDataBean dressDataBean) {
        DressExample periodExample = new DressExample();
        DressExample.Criteria criteria = periodExample.createCriteria();
        criteria.andDidEqualTo(dressDataBean.getDress().getDid());
        Optional<DressExample> optionalUser = Optional.ofNullable(periodExample);

        if (optionalUser.isPresent()) {
            try {
                if (dressMapper.updateByExampleSelective(dressDataBean.getDress(), periodExample) > 0) {
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
     * @Description //TODO 通过编号查询用户（女朋友）服饰管理详情数据
     * @Date 1:41 2020/9/24
     * @Param [dressDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    @Override
    public ResultData selectDressId(DressDataBean dressDataBean) {
            if (Optional.ofNullable(dressDataBean).isPresent()) {
                DressExample periodExample = new DressExample();
                DressExample.Criteria criteria = periodExample.createCriteria();
                criteria.andDidEqualTo(dressDataBean.getDress().getDid());
                List<Dress> periods = dressMapper.selectByExample(periodExample);
                if (Optional.ofNullable(periods).isPresent()) {
                    return new ResultData().ok("请查看数据", periods);
                }
            }
            return new ResultData().error();
    }
}
