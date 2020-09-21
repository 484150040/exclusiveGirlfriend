package com.cn.exclusiveGirlfriend.common;

/**
 * @program: up
 * @description: 返回消息接口
 * @author: Yang Fang Hong
 * @create: 2020-08-01 12:24
 */
public interface StatusCode {

    //成功
    public static final int OK = 200;

    //失败
    public static final int ERROR = 201;

    //用户名或密码错误
    public static final int LOGINERROR = 202;

    //权限不足
    public static final int ACCESSERROR = 203;

    //远程调用失败
    public static final int REMOTEERROR = 204;

    //重复操作
    public static final int REPERROR = 205;
}
