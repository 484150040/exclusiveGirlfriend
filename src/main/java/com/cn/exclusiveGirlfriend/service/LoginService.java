package com.cn.exclusiveGirlfriend.service;/**
 * @ClassName UserService
 * @Author ASUS
 * @Description TODO;
 * @Date 2020/8/16 13:39
 * @Hodified By:
 **/

import com.cn.exclusiveGirlfriend.common.ResultData;
import com.cn.exclusiveGirlfriend.pojo.Login;
import com.cn.exclusiveGirlfriend.pojo.User;

/**
 * @ClassName UserService
 * @Author ASUS
 * @Description TODO;
 * @Date 2020/8/16 13:39
 * @Hodified By:
 **/
public interface LoginService {
    /**
     * @Author HONG
     * @Description //TODO  登录
     * @Date 23:27 2020/9/3
     * @Param [userName]
     * @return com.cn.exclusiveGirlfriend.pojo.Login
     **/
    public Login getPwdByUserName(String userName);

    /**\
     * 注册用户
     * @param login
     * @return
     */
    ResultData insertLogin(Login login);
    /**
     * @Author HONG
     * @Description //TODO  修改密码
     * @Date 9:25 2020/9/6
     * @Param [login]
     * @return boolean
     **/
    ResultData updatePassword(Login login);
    /**
    　　* @description: TODO
    　　* @Param 修改登录时间以及登录编号
    　　* @return
    　　* @throws
    　　* @author YangFangHong
    　　* @date 2020/11/17 10:23
    　　*/
    boolean updateLoginIp(Login login);
}
