package com.cn.exclusiveGirlfriend.common;/**
 * @ClassName ExceptionHandle
 * @Author ASUS
 * @Description TODO;
 * @Date 2020/9/4 0:27
 * @Hodified By:
 **/

import org.apache.shiro.ShiroException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @ClassName ExceptionHandle
 * @Author ASUS
 * @Description TODO;
 * @Date 2020/9/4 0:27
 * @Hodified By:
 **/
@RestControllerAdvice
public class ExceptionHandle {
    @ExceptionHandler(ShiroException.class)
    public String doHandleShiroException(ShiroException se, Model model) {
        se.printStackTrace();
        if(se instanceof UnknownAccountException) return "账户不存在！";
        else if(se instanceof LockedAccountException){
            return "账户已锁定，请联系管理员";
        }
        else if(se instanceof IncorrectCredentialsException){
            return "密码错误，请重试";
        }
        else if(se instanceof AuthorizationException){
            return "没有相应权限，请联系管理员";
        }
        else {
            return "登录失败";
        }
    }
}
