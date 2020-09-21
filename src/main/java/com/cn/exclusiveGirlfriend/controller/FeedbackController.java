package com.cn.exclusiveGirlfriend.controller;

import com.cn.exclusiveGirlfriend.common.ResultData;
import com.cn.exclusiveGirlfriend.dataBean.FeedbackDataBean;
import com.cn.exclusiveGirlfriend.dataBean.UserDataBean;
import com.cn.exclusiveGirlfriend.service.FeedbackServe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * @ClassName FeedbackController
 * @Author ASUS
 * @Description TODO;女朋友反馈管理
 * @Date 2020/9/20 16:56
 * @Hodified By:
 **/
@RestController
@RequestMapping("/feedback.all")
@CrossOrigin
@Scope("singleton")
public class FeedbackController {
    @Autowired
    private FeedbackServe feedbackServe;
    /**
    *@Description: 新增女朋友反馈数据
    *@Param: [feedbackDataBean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/21
    */
    @PostMapping("/addFeedback.do")
    public ResultData addFeedback(@RequestBody FeedbackDataBean feedbackDataBean){
        if (Optional.ofNullable(feedbackDataBean).isPresent()){
            return feedbackServe.addFeedback(feedbackDataBean);
        }
        return new ResultData().error("传输数据有误");
    }

    /**
    *@Description: 修改反馈管理数据
    *@Param: [feedbackDataBean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/21
    */
    @PostMapping("/updateFeedback.do")
    public ResultData updateFeedback(@RequestBody FeedbackDataBean feedbackDataBean){
        if (Optional.ofNullable(feedbackDataBean).isPresent()){
            return feedbackServe.updateFeedback(feedbackDataBean);
        }
        return new ResultData().error("传输数据有误");
    }



    /**
     *@Description: 反馈管理数据模糊查询
     *@Param: [feedbackDataBean]
     *@return: com.cn.exclusiveGirlfriend.common.ResultData
     *@Author: Yang Fang Hong
     *@date: 2020/9/21
     */
    @PostMapping("/selectFeedbackAll.do")
    public ResultData selectFeedbackAll(@RequestBody FeedbackDataBean feedbackDataBean){
        if (Optional.ofNullable(feedbackDataBean).isPresent()){
            return feedbackServe.selectFeedbackAll(feedbackDataBean);
        }
        return new ResultData().error("传输数据有误");
    }


    /**
    *@Description: 根据编号查询
    *@Param: [feedbackDataBean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/21
    */
    @PostMapping("/selectFeedbackId.do")
    public ResultData selectFeedbackId(@RequestBody FeedbackDataBean feedbackDataBean){
        if (Optional.ofNullable(feedbackDataBean).isPresent()){
            return feedbackServe.selectFeedbackId(feedbackDataBean);
        }
        return new ResultData().error("传输数据有误");
    }
}
