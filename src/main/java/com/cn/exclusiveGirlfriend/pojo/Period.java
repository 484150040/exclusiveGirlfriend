package com.cn.exclusiveGirlfriend.pojo;

import java.io.Serializable;
import java.util.Date;

public class Period implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column period.p_id
     *
     * @mbg.generated
     */
    private Integer pId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column period.p_content
     *
     * @mbg.generated
     */
    private String pContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column period.creattime
     *
     * @mbg.generated
     */
    private Date creattime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column period.state
     *
     * @mbg.generated
     */
    private Integer state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column period.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table period
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column period.p_id
     *
     * @return the value of period.p_id
     *
     * @mbg.generated
     */
    public Integer getpId() {
        return pId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column period.p_id
     *
     * @param pId the value for period.p_id
     *
     * @mbg.generated
     */
    public void setpId(Integer pId) {
        this.pId = pId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column period.p_content
     *
     * @return the value of period.p_content
     *
     * @mbg.generated
     */
    public String getpContent() {
        return pContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column period.p_content
     *
     * @param pContent the value for period.p_content
     *
     * @mbg.generated
     */
    public void setpContent(String pContent) {
        this.pContent = pContent == null ? null : pContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column period.creattime
     *
     * @return the value of period.creattime
     *
     * @mbg.generated
     */
    public Date getCreattime() {
        return creattime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column period.creattime
     *
     * @param creattime the value for period.creattime
     *
     * @mbg.generated
     */
    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column period.state
     *
     * @return the value of period.state
     *
     * @mbg.generated
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column period.state
     *
     * @param state the value for period.state
     *
     * @mbg.generated
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column period.title
     *
     * @return the value of period.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column period.title
     *
     * @param title the value for period.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }
}