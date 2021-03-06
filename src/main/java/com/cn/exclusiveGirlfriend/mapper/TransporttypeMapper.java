package com.cn.exclusiveGirlfriend.mapper;

import com.cn.exclusiveGirlfriend.dataBean.TransportTypeDataBean;
import com.cn.exclusiveGirlfriend.pojo.Transporttype;
import com.cn.exclusiveGirlfriend.pojo.TransporttypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransporttypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transporttype
     *
     * @mbg.generated
     */
    long countByExample(TransporttypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transporttype
     *
     * @mbg.generated
     */
    int deleteByExample(TransporttypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transporttype
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer tId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transporttype
     *
     * @mbg.generated
     */
    int insert(Transporttype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transporttype
     *
     * @mbg.generated
     */
    int insertSelective(Transporttype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transporttype
     *
     * @mbg.generated
     */
    List<Transporttype> selectByExample(TransporttypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transporttype
     *
     * @mbg.generated
     */
    Transporttype selectByPrimaryKey(Integer tId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transporttype
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Transporttype record, @Param("example") TransporttypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transporttype
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Transporttype record, @Param("example") TransporttypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transporttype
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Transporttype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transporttype
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Transporttype record);
    /**
     * @Author HONG
     * @Description //TODO 分页模糊查询传输类型
     * @Date 12:05 2020/9/27
     * @Param [transportTypeDataBean]
     * @return java.util.List<com.cn.exclusiveGirlfriend.pojo.Transporttype>
     **/
    List<Transporttype> selectTransporttypeAll(TransportTypeDataBean transportTypeDataBean);
}