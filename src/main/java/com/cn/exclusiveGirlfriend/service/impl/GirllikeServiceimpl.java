package com.cn.exclusiveGirlfriend.service.impl;

import com.cn.exclusiveGirlfriend.common.ResultData;
import com.cn.exclusiveGirlfriend.dataBean.GirllikeDataBean;
import com.cn.exclusiveGirlfriend.service.GirllikeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: exclusiveGirlfriend
 * @description: 女朋友喜欢的物品接口实现
 * @author: Yang Fang Hong
 * @create: 2020-09-23 16:32
 */
@Service
@Transactional
public class GirllikeServiceimpl implements GirllikeService {
    @Override
    public ResultData addGirllike(GirllikeDataBean girllikeDataBean) {
        return null;
    }

    @Override
    public ResultData updateGirllike(GirllikeDataBean girllikeDataBean) {
        return null;
    }

    @Override
    public ResultData selectGirllikeAll(GirllikeDataBean girllikeDataBean) {
        return null;
    }

    @Override
    public ResultData selectGirllikeId(GirllikeDataBean girllikeDataBean) {
        return null;
    }
}
