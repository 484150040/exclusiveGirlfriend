package com.cn.exclusiveGirlfriend.service.impl;

import com.cn.exclusiveGirlfriend.common.ResultData;
import com.cn.exclusiveGirlfriend.dataBean.GirllikeDataBean;
import com.cn.exclusiveGirlfriend.mapper.GirllikeMapper;
import com.cn.exclusiveGirlfriend.pojo.Girllike;
import com.cn.exclusiveGirlfriend.pojo.GirllikeExample;
import com.cn.exclusiveGirlfriend.service.GirllikeService;
import com.cn.exclusiveGirlfriend.utiles.DateUtiles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @program: exclusiveGirlfriend
 * @description: 女朋友喜欢的物品接口实现
 * @author: Yang Fang Hong
 * @create: 2020-09-23 16:32
 */
@Service
@Transactional
public class GirllikeServiceimpl implements GirllikeService {
    @Autowired(required = false)
    private GirllikeMapper girllikeMapper;
    @Override
    public ResultData addGirllike(GirllikeDataBean girllikeDataBean) {
        Optional<Girllike> optionalUser = Optional.ofNullable(girllikeDataBean.getGirllike());
        if (optionalUser.isPresent()) {
            try {
                if (girllikeMapper.insertSelective(girllikeDataBean.getGirllike()) > 0) {
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
     * @Description //TODO 新增女朋友喜欢的物品数据
     * @Date 1:19 2020/9/24
     * @Param [girllikeDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    @Override
    public ResultData updateGirllike(GirllikeDataBean girllikeDataBean) {
        GirllikeExample periodExample = new GirllikeExample();
        GirllikeExample.Criteria criteria = periodExample.createCriteria();
        criteria.andGlIdEqualTo(girllikeDataBean.getGirllike().getGlId());
        Optional<GirllikeExample> optionalUser = Optional.ofNullable(periodExample);
        if (optionalUser.isPresent()) {
            try {
                if (girllikeMapper.updateByExampleSelective(girllikeDataBean.getGirllike(), periodExample) > 0 ? true : false) {
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
     * @Description //TODO 模糊查询分页女朋友喜欢的数据
     * @Date 1:20 2020/9/24
     * @Param [girllikeDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    @Override
    public ResultData selectGirllikeAll(GirllikeDataBean girllikeDataBean) {
        if (Optional.ofNullable(girllikeDataBean).isPresent()) {
            GirllikeExample periodExample = new GirllikeExample();
            GirllikeExample.Criteria criteria = periodExample.createCriteria();
            if (girllikeDataBean.getGirllike().getGlName()!=null){
                criteria.andGlNameLike(girllikeDataBean.getGirllike().getGlName());
            }
            if (girllikeDataBean.getGirllike().getGlType()!=null){
                criteria.andGlTypeEqualTo(girllikeDataBean.getGirllike().getGlType());
            }
            if (girllikeDataBean.getGirllike().getGlState()!=null){
                criteria.andGlStateEqualTo(girllikeDataBean.getGirllike().getGlState());
            }
            if (girllikeDataBean.getGirllike().getGlLevel()!=null){
                criteria.andGlLevelEqualTo(girllikeDataBean.getGirllike().getGlLevel());
            }
            if (girllikeDataBean.getCreatetime()!=null){
                criteria.andCreatetimeGreaterThanOrEqualTo(DateUtiles.parseDefaultDate(girllikeDataBean.getCreatetime()));
            }
            if (girllikeDataBean.getEndtime()!=null){
                criteria.andCreatetimeLessThanOrEqualTo(DateUtiles.parseDefaultDate(girllikeDataBean.getEndtime()));
            }
            long count = girllikeMapper.countByExample(periodExample);
            girllikeDataBean.setPage(girllikeDataBean.getPage() - 1 * girllikeDataBean.getLimit());
            List<Girllike> list = girllikeMapper.selectGirllikeAll(girllikeDataBean);
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
     * @Description //TODO 根据编号查询女朋友喜欢的物品专属详情数据
     * @Date 1:20 2020/9/24
     * @Param [girllikeDataBean]
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    @Override
    public ResultData selectGirllikeId(GirllikeDataBean girllikeDataBean) {
        if (Optional.ofNullable(girllikeDataBean).isPresent()) {
            GirllikeExample periodExample = new GirllikeExample();
            GirllikeExample.Criteria criteria = periodExample.createCriteria();
            criteria.andGlIdEqualTo(girllikeDataBean.getGirllike().getGlId());
            List<Girllike> periods = girllikeMapper.selectByExample(periodExample);
            if (Optional.ofNullable(periods).isPresent()) {
                return new ResultData().ok("请查看数据", periods);
            }
        }
        return new ResultData().error();
    }
}
