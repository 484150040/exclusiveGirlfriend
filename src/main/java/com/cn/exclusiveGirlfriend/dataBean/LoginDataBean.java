package com.cn.exclusiveGirlfriend.dataBean;

import com.cn.exclusiveGirlfriend.pojo.Login;

/**
 * @ClassName LoginDataBean
 * @Author ASUS
 * @Description TODO;
 * @Date 2020/9/8 8:06
 * @Hodified By:
 **/
public class LoginDataBean {
    //登录对象
    private Login login;

    //手机账号
    private String iphone;

    //邮箱
    private String email;

    //验证码
    private String verification;

    public String getVerification() {
        return verification;
    }

    public void setVerification(String verification) {
        this.verification = verification;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public String getIphone() {
        return iphone;
    }

    public void setIphone(String iphone) {
        this.iphone = iphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
