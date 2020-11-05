package com.cn.exclusiveGirlfriend.service.impl;

import com.cn.exclusiveGirlfriend.common.ResultData;
import com.cn.exclusiveGirlfriend.dataBean.LegalDatabean;
import com.cn.exclusiveGirlfriend.mapper.LegalMapper;
import com.cn.exclusiveGirlfriend.pojo.Legal;
import com.cn.exclusiveGirlfriend.pojo.LegalExample;
import com.cn.exclusiveGirlfriend.service.LegalService;
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
 * @description: 女生例假接口实现
 * @author: Yang Fang Hong
 * @create: 2020-09-25 16:43
 */
@Service
@Transactional
public class LegalServiceimpl implements LegalService {
    @Autowired(required = false)
    private LegalMapper legalMapper;
    /**
     *@Description: 新增女生例假数据
     *@Param: [legalDatabean]
     *@return: com.cn.exclusiveGirlfriend.common.ResultData
     *@Author: Yang Fang Hong
     *@date: 2020/9/25
     */
    @Override
    public ResultData addLegal(LegalDatabean legalDatabean) {
        Optional<Legal> optionalUser = Optional.ofNullable(legalDatabean.getLegal());
        if (optionalUser.isPresent()) {
            try {
                if (legalMapper.insertSelective(legalDatabean.getLegal()) > 0) {
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
     *@Description: 修改女生例假数据
     *@Param: [legalDatabean]
     *@return: com.cn.exclusiveGirlfriend.common.ResultData
     *@Author: Yang Fang Hong
     *@date: 2020/9/25
     */
    @Override
    public ResultData updateLegal(LegalDatabean legalDatabean) {
        LegalExample LegalExample = new LegalExample();
        LegalExample.Criteria criteria = LegalExample.createCriteria();
        criteria.andLIdEqualTo(legalDatabean.getLegal().getlId());
        Optional<LegalExample> optionalUser = Optional.ofNullable(LegalExample);
        if (optionalUser.isPresent()) {
            try {
                if (legalMapper.updateByExampleSelective(legalDatabean.getLegal(), LegalExample) > 0 ? true : false) {
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
     *@Description: 分页模糊查询女生例假数据
     *@Param: [legalDatabean]
     *@return: com.cn.exclusiveGirlfriend.common.ResultData
     *@Author: Yang Fang Hong
     *@date: 2020/9/25
     */
    @Override
    public ResultData selectLegalall(LegalDatabean legalDatabean) {
        if (Optional.ofNullable(legalDatabean).isPresent()) {
            LegalExample periodExample = new LegalExample();
            LegalExample.Criteria criteria = periodExample.createCriteria();
            if(Optional.ofNullable(legalDatabean.getLegal()).isPresent()){
                if (legalDatabean.getLegal().getPain()!=null){
                    criteria.andPainEqualTo(legalDatabean.getLegal().getPain());
                }
                if (legalDatabean.getLegal().getFlow()!=null){
                    criteria.andFlowEqualTo(legalDatabean.getLegal().getFlow());
                }
                if (legalDatabean.getLegal().getDelay()!=null){
                    criteria.andDelayEqualTo(legalDatabean.getLegal().getDelay());
                }
            }

            if (legalDatabean.getCreatetime()!=null){
                criteria.andLTimeEqualTo(DateUtiles.parseDefaultDate(legalDatabean.getCreatetime()));
            }
            if (legalDatabean.getEndtime()!=null){
                criteria.andLTimeEqualTo(DateUtiles.parseDefaultDate(legalDatabean.getEndtime()));
            }
            if (legalDatabean.getLegal().getState()!=null){
                criteria.andStateEqualTo(legalDatabean.getLegal().getState());
            }
            long count = legalMapper.countByExample(periodExample);
            legalDatabean.setPage((legalDatabean.getPage() - 1) * legalDatabean.getLimit());
            List<Legal> list = legalMapper.selectLegalAll(legalDatabean);
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
     *@Description: 根据边号查询女生例假数据详情信息
     *@Param: [legalDatabean]
     *@return: com.cn.exclusiveGirlfriend.common.ResultData
     *@Author: Yang Fang Hong
     *@date: 2020/9/25
     */
    @Override
    public ResultData selectLegalId(LegalDatabean legalDatabean) {
        if (Optional.ofNullable(legalDatabean).isPresent()) {
            LegalExample LegalExample = new LegalExample();
            LegalExample.Criteria criteria = LegalExample.createCriteria();
            criteria.andLIdEqualTo(legalDatabean.getLegal().getlId());
            List<Legal> periods = legalMapper.selectByExample(LegalExample);
            if (Optional.ofNullable(periods).isPresent()) {
                return new ResultData().ok("请查看数据", periods);
            }
        }
        return new ResultData().error();
    }
}
