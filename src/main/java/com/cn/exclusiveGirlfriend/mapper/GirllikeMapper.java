package com.cn.exclusiveGirlfriend.mapper;

import com.cn.exclusiveGirlfriend.pojo.Girllike;
import com.cn.exclusiveGirlfriend.pojo.GirllikeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GirllikeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table girllike
     *
     * @mbg.generated
     */
    long countByExample(GirllikeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table girllike
     *
     * @mbg.generated
     */
    int deleteByExample(GirllikeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table girllike
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer glId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table girllike
     *
     * @mbg.generated
     */
    int insert(Girllike record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table girllike
     *
     * @mbg.generated
     */
    int insertSelective(Girllike record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table girllike
     *
     * @mbg.generated
     */
    List<Girllike> selectByExample(GirllikeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table girllike
     *
     * @mbg.generated
     */
    Girllike selectByPrimaryKey(Integer glId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table girllike
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Girllike record, @Param("example") GirllikeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table girllike
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Girllike record, @Param("example") GirllikeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table girllike
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Girllike record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table girllike
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Girllike record);
}