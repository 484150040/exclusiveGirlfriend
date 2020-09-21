package com.cn.exclusiveGirlfriend.mapper;

import com.cn.exclusiveGirlfriend.pojo.Clock;
import com.cn.exclusiveGirlfriend.pojo.ClockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClockMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clock
     *
     * @mbg.generated
     */
    long countByExample(ClockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clock
     *
     * @mbg.generated
     */
    int deleteByExample(ClockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clock
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer clId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clock
     *
     * @mbg.generated
     */
    int insert(Clock record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clock
     *
     * @mbg.generated
     */
    int insertSelective(Clock record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clock
     *
     * @mbg.generated
     */
    List<Clock> selectByExample(ClockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clock
     *
     * @mbg.generated
     */
    Clock selectByPrimaryKey(Integer clId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clock
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Clock record, @Param("example") ClockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clock
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Clock record, @Param("example") ClockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clock
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Clock record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clock
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Clock record);
}