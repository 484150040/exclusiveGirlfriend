package com.cn.exclusiveGirlfriend.pojo;

import java.io.Serializable;
import java.util.Date;

public class Alongrecord implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column alongrecord.a_id
     *
     * @mbg.generated
     */
    private Integer aId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column alongrecord.a_place
     *
     * @mbg.generated
     */
    private String aPlace;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column alongrecord.a_time
     *
     * @mbg.generated
     */
    private Date aTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column alongrecord.createtime
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column alongrecord.a_sttime
     *
     * @mbg.generated
     */
    private Date aSttime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column alongrecord.a_img
     *
     * @mbg.generated
     */
    private String aImg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column alongrecord.a_meet
     *
     * @mbg.generated
     */
    private Date aMeet;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column alongrecord.a_meettime
     *
     * @mbg.generated
     */
    private Long aMeettime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table alongrecord
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column alongrecord.a_id
     *
     * @return the value of alongrecord.a_id
     *
     * @mbg.generated
     */
    public Integer getaId() {
        return aId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column alongrecord.a_id
     *
     * @param aId the value for alongrecord.a_id
     *
     * @mbg.generated
     */
    public void setaId(Integer aId) {
        this.aId = aId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column alongrecord.a_place
     *
     * @return the value of alongrecord.a_place
     *
     * @mbg.generated
     */
    public String getaPlace() {
        return aPlace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column alongrecord.a_place
     *
     * @param aPlace the value for alongrecord.a_place
     *
     * @mbg.generated
     */
    public void setaPlace(String aPlace) {
        this.aPlace = aPlace == null ? null : aPlace.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column alongrecord.a_time
     *
     * @return the value of alongrecord.a_time
     *
     * @mbg.generated
     */
    public Date getaTime() {
        return aTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column alongrecord.a_time
     *
     * @param aTime the value for alongrecord.a_time
     *
     * @mbg.generated
     */
    public void setaTime(Date aTime) {
        this.aTime = aTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column alongrecord.createtime
     *
     * @return the value of alongrecord.createtime
     *
     * @mbg.generated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column alongrecord.createtime
     *
     * @param createtime the value for alongrecord.createtime
     *
     * @mbg.generated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column alongrecord.a_sttime
     *
     * @return the value of alongrecord.a_sttime
     *
     * @mbg.generated
     */
    public Date getaSttime() {
        return aSttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column alongrecord.a_sttime
     *
     * @param aSttime the value for alongrecord.a_sttime
     *
     * @mbg.generated
     */
    public void setaSttime(Date aSttime) {
        this.aSttime = aSttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column alongrecord.a_img
     *
     * @return the value of alongrecord.a_img
     *
     * @mbg.generated
     */
    public String getaImg() {
        return aImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column alongrecord.a_img
     *
     * @param aImg the value for alongrecord.a_img
     *
     * @mbg.generated
     */
    public void setaImg(String aImg) {
        this.aImg = aImg == null ? null : aImg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column alongrecord.a_meet
     *
     * @return the value of alongrecord.a_meet
     *
     * @mbg.generated
     */
    public Date getaMeet() {
        return aMeet;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column alongrecord.a_meet
     *
     * @param aMeet the value for alongrecord.a_meet
     *
     * @mbg.generated
     */
    public void setaMeet(Date aMeet) {
        this.aMeet = aMeet;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column alongrecord.a_meettime
     *
     * @return the value of alongrecord.a_meettime
     *
     * @mbg.generated
     */
    public Long getaMeettime() {
        return aMeettime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column alongrecord.a_meettime
     *
     * @param aMeettime the value for alongrecord.a_meettime
     *
     * @mbg.generated
     */
    public void setaMeettime(Long aMeettime) {
        this.aMeettime = aMeettime;
    }
}