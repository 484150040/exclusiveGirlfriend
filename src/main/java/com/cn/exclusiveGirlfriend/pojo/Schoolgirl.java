package com.cn.exclusiveGirlfriend.pojo;

import java.io.Serializable;
import java.util.Date;

public class Schoolgirl implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schoolgirl.s_id
     *
     * @mbg.generated
     */
    private Integer sId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schoolgirl.s_padcleaning
     *
     * @mbg.generated
     */
    private String sPadcleaning;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schoolgirl.s_padsize
     *
     * @mbg.generated
     */
    private String sPadsize;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schoolgirl.s_padservice
     *
     * @mbg.generated
     */
    private String sPadservice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schoolgirl.s_padaging
     *
     * @mbg.generated
     */
    private Integer sPadaging;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schoolgirl.createtime
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schoolgirl.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table schoolgirl
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schoolgirl.s_id
     *
     * @return the value of schoolgirl.s_id
     *
     * @mbg.generated
     */
    public Integer getsId() {
        return sId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schoolgirl.s_id
     *
     * @param sId the value for schoolgirl.s_id
     *
     * @mbg.generated
     */
    public void setsId(Integer sId) {
        this.sId = sId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schoolgirl.s_padcleaning
     *
     * @return the value of schoolgirl.s_padcleaning
     *
     * @mbg.generated
     */
    public String getsPadcleaning() {
        return sPadcleaning;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schoolgirl.s_padcleaning
     *
     * @param sPadcleaning the value for schoolgirl.s_padcleaning
     *
     * @mbg.generated
     */
    public void setsPadcleaning(String sPadcleaning) {
        this.sPadcleaning = sPadcleaning == null ? null : sPadcleaning.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schoolgirl.s_padsize
     *
     * @return the value of schoolgirl.s_padsize
     *
     * @mbg.generated
     */
    public String getsPadsize() {
        return sPadsize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schoolgirl.s_padsize
     *
     * @param sPadsize the value for schoolgirl.s_padsize
     *
     * @mbg.generated
     */
    public void setsPadsize(String sPadsize) {
        this.sPadsize = sPadsize == null ? null : sPadsize.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schoolgirl.s_padservice
     *
     * @return the value of schoolgirl.s_padservice
     *
     * @mbg.generated
     */
    public String getsPadservice() {
        return sPadservice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schoolgirl.s_padservice
     *
     * @param sPadservice the value for schoolgirl.s_padservice
     *
     * @mbg.generated
     */
    public void setsPadservice(String sPadservice) {
        this.sPadservice = sPadservice == null ? null : sPadservice.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schoolgirl.s_padaging
     *
     * @return the value of schoolgirl.s_padaging
     *
     * @mbg.generated
     */
    public Integer getsPadaging() {
        return sPadaging;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schoolgirl.s_padaging
     *
     * @param sPadaging the value for schoolgirl.s_padaging
     *
     * @mbg.generated
     */
    public void setsPadaging(Integer sPadaging) {
        this.sPadaging = sPadaging;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schoolgirl.createtime
     *
     * @return the value of schoolgirl.createtime
     *
     * @mbg.generated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schoolgirl.createtime
     *
     * @param createtime the value for schoolgirl.createtime
     *
     * @mbg.generated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schoolgirl.content
     *
     * @return the value of schoolgirl.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schoolgirl.content
     *
     * @param content the value for schoolgirl.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}