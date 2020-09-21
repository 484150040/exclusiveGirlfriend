package com.cn.exclusiveGirlfriend.service.impl;

import com.cn.exclusiveGirlfriend.common.ResultData;
import com.cn.exclusiveGirlfriend.dataBean.AlongrecordDataBean;
import com.cn.exclusiveGirlfriend.service.AlongrecordService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: exclusiveGirlfriend
 * @description: 相处记录接口实现
 * @author: Yang Fang Hong
 * @create: 2020-09-21 16:16
 */
@Service
@Transactional
public class AlongrecordServiceimpl implements AlongrecordService {
    /**
    *@Description: 模糊查询相处记录数据
    *@Param: [alongrecordDataBean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/21
    */
    @Override
    public ResultData selectAlongrecordAll(AlongrecordDataBean alongrecordDataBean) {
        return null;
    }
    /**
    *@Description: 新增相处记录数据
    *@Param: [alongrecordDataBean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/21
    */
    @Override
    public ResultData insertAlongrecord(AlongrecordDataBean alongrecordDataBean) {
        return null;
    }
    /**
    *@Description: 修改相处记录数据
    *@Param: [alongrecordDataBean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/21
    */
    @Override
    public ResultData updateAlongrecord(AlongrecordDataBean alongrecordDataBean) {
        return null;
    }
    /**
    *@Description: 查看相处记录详情
    *@Param: [alongrecordDataBean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/21
    */
    @Override
    public ResultData selectAlongrecordId(AlongrecordDataBean alongrecordDataBean) {
        return null;
    }
}
