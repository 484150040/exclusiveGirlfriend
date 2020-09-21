package com.cn.exclusiveGirlfriend.service;

import com.cn.exclusiveGirlfriend.common.ResultData;
import com.cn.exclusiveGirlfriend.dataBean.AlongrecordDataBean;

/**
 * @program: exclusiveGirlfriend
 * @description: 相处记录管理接口
 * @author: Yang Fang Hong
 * @create: 2020-09-21 16:15
 */
public interface AlongrecordService {
    /**
    *@Description: 模糊查询
    *@Param: [alongrecordDataBean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/21
    */
    ResultData selectAlongrecordAll(AlongrecordDataBean alongrecordDataBean);
    /**
    *@Description: 新增相处记录数据
    *@Param: [alongrecordDataBean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/21
    */
    ResultData insertAlongrecord(AlongrecordDataBean alongrecordDataBean);
    /**
    *@Description: 修改相处记录数据
    *@Param: [alongrecordDataBean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/21
    */
    ResultData updateAlongrecord(AlongrecordDataBean alongrecordDataBean);
    /**
    *@Description: 根据编号查询相处记录数据
    *@Param: [alongrecordDataBean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/21
    */
    ResultData selectAlongrecordId(AlongrecordDataBean alongrecordDataBean);
}
