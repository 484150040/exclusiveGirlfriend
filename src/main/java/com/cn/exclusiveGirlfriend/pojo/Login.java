package com.cn.exclusiveGirlfriend.pojo;

import java.io.Serializable;
import java.util.Date;

public class Login implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login.lid
     *
     * @mbg.generated
     */
    private Integer lid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login.username
     *
     * @mbg.generated
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login.password
     *
     * @mbg.generated
     */
    private String password;
    private String loginIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login.creatime
     *
     * @mbg.generated
     */
    private Date creatime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login.logintime
     *
     * @mbg.generated
     */
    private Date logintime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table login
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login.lid
     *
     * @return the value of login.lid
     *
     * @mbg.generated
     */
    public Integer getLid() {
        return lid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login.lid
     *
     * @param lid the value for login.lid
     *
     * @mbg.generated
     */
    public void setLid(Integer lid) {
        this.lid = lid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login.username
     *
     * @return the value of login.username
     *
     * @mbg.generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login.username
     *
     * @param username the value for login.username
     *
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login.password
     *
     * @return the value of login.password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login.password
     *
     * @param password the value for login.password
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login.creatime
     *
     * @return the value of login.creatime
     *
     * @mbg.generated
     */
    public Date getCreatime() {
        return creatime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login.creatime
     *
     * @param creatime the value for login.creatime
     *
     * @mbg.generated
     */
    public void setCreatime(Date creatime) {
        this.creatime = creatime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login.logintime
     *
     * @return the value of login.logintime
     *
     * @mbg.generated
     */
    public Date getLogintime() {
        return logintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login.logintime
     *
     * @param logintime the value for login.logintime
     *
     * @mbg.generated
     */
    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Login{");
        sb.append("lid=").append(lid);
        sb.append(", username='").append(username).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", creatime=").append(creatime);
        sb.append(", logintime=").append(logintime);
        sb.append('}');
        return sb.toString();
    }
}