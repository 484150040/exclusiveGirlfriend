package com.cn.exclusiveGirlfriend.service;

import com.cn.exclusiveGirlfriend.common.ResultData;
import com.cn.exclusiveGirlfriend.dataBean.FeedbackDataBean;

/**
 * @ClassName FeedbackServe
 * @Author ASUS
 * @Description TODO;女朋友反馈管理接口的实现
 * @Date 2020/9/20 16:57
 * @Hodified By:
 **/
public interface FeedbackServe {
    /**
    *@Description: 新增反馈管理数据
    *@Param: [feedbackDataBean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/21
    */
    ResultData addFeedback(FeedbackDataBean feedbackDataBean);
    /**
    *@Description: 修改反馈管理数据
    *@Param: [feedbackDataBean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/21
    */
    ResultData updateFeedback(FeedbackDataBean feedbackDataBean);
    /**
    *@Description: 模糊查询反馈管理数据
    *@Param: [feedbackDataBean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/21
    */
    ResultData selectFeedbackAll(FeedbackDataBean feedbackDataBean);
    /**
    *@Description: 根据反馈编号查询反馈详情数据
    *@Param: [feedbackDataBean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/21
    */
    ResultData selectFeedbackId(FeedbackDataBean feedbackDataBean);
}
