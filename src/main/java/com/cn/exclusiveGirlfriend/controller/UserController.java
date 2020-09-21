package com.cn.exclusiveGirlfriend.controller;

import com.cn.exclusiveGirlfriend.common.ResultData;
import com.cn.exclusiveGirlfriend.dataBean.UserDataBean;
import com.cn.exclusiveGirlfriend.pojo.User;
import com.cn.exclusiveGirlfriend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * @ClassName UserController
 * @Author ASUS
 * @Description TODO;
 * @Date 2020/9/8 8:23
 * @Hodified By:
 **/
@RestController
@RequestMapping("/user.all")
@CrossOrigin
@Scope("singleton")
public class UserController {
    @Autowired
    private UserService userService;
    /**
     * @Author HONG
     * @Description //TODO 新增用户数据
     * @Date 8:29 2020/9/8
     * @Param []
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    @PostMapping("/addUser.do")
    public ResultData addUser(@RequestBody UserDataBean userDataBean){
        if (Optional.ofNullable(userDataBean).isPresent()){
            return userService.addUser(userDataBean);
        }
        return new ResultData().error("传输数据有误");
    }

    /**
     * @Author HONG
     * @Description //TODO 管理员）模糊分页查询
     * @Date 8:29 2020/9/8
     * @Param []
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    @PostMapping("/selectUserAll.do")
    public ResultData selectUserAll(@RequestBody UserDataBean userDataBean){
        if (Optional.ofNullable(userDataBean).isPresent()){
            return userService.selectUserAll(userDataBean);
        }
        return new ResultData().error();
    }  
    /**
    *@Description: 根据编号查询数据
    *@Param: [userDataBean]
    *@return: com.cn.exclusiveGirlfriend.common.ResultData
    *@Author: Yang Fang Hong
    *@date: 2020/9/19
    */
    @PostMapping("/selectUserId.do")
    public ResultData selectUserId(@RequestBody UserDataBean userDataBean){
        if (Optional.ofNullable(userDataBean).isPresent()){
            return userService.selectUserId(userDataBean);
        }
        return new ResultData().error();
    }

    /**
     * @Author HONG
     * @Description //TODO 6.	修改数据详情数据
     * @Date 8:38 2020/9/8
     * @Param []
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    @PostMapping("/updateUserAll.do")
    public ResultData updateUserAll(@RequestBody UserDataBean userDataBean){
        if (Optional.ofNullable(userDataBean).isPresent()){
            return userService.updateUserAll(userDataBean);
        }
        return new ResultData().error();
    }

    /**
     * @Author HONG
     * @Description //TODO7.	删除（自我注销）该用户数据
     * （清理掉该用户的所有数据）
     * 修改用户状态（弹窗让用户确定是否注销
     * @Date 8:38 2020/9/8
     * @Param []
     * @return com.cn.exclusiveGirlfriend.common.ResultData
     **/
    @PostMapping("/deleteUserAll.do")
    public ResultData deleteUserAll(@RequestBody UserDataBean userDataBean){
        if (Optional.ofNullable(userDataBean).isPresent()){
            return userService.deleteUserAll(userDataBean);
        }
        return new ResultData().error();
    }
}
