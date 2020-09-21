package com.cn.exclusiveGirlfriend.mapper;

import com.cn.exclusiveGirlfriend.dataBean.PeriodDataBean;
import com.cn.exclusiveGirlfriend.pojo.Period;
import com.cn.exclusiveGirlfriend.pojo.PeriodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PeriodMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table period
     *
     * @mbg.generated
     */
    long countByExample(PeriodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table period
     *
     * @mbg.generated
     */
    int deleteByExample(PeriodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table period
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer pId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table period
     *
     * @mbg.generated
     */
    int insert(Period record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table period
     *
     * @mbg.generated
     */
    int insertSelective(Period record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table period
     *
     * @mbg.generated
     */
    List<Period> selectByExample(PeriodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table period
     *
     * @mbg.generated
     */
    Period selectByPrimaryKey(Integer pId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table period
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Period record, @Param("example") PeriodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table period
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Period record, @Param("example") PeriodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table period
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Period record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table period
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Period record);
    /**
     * @Author HONG
     * @Description //TODO 模糊查询
     * @Date 15:29 2020/9/20
     * @Param [periodDataBean]
     * @return java.util.List<com.cn.exclusiveGirlfriend.pojo.Period>
     **/
    List<Period> selectPeriodAll(PeriodDataBean periodDataBean);
}