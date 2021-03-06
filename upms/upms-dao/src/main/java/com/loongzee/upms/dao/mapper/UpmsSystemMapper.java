package com.loongzee.upms.dao.mapper;

import com.loongzee.upms.dao.model.UpmsSystem;
import com.loongzee.upms.dao.model.UpmsSystemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpmsSystemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_system
     *
     * @mbg.generated
     */
    long countByExample(UpmsSystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_system
     *
     * @mbg.generated
     */
    int deleteByExample(UpmsSystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_system
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer systemId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_system
     *
     * @mbg.generated
     */
    int insert(UpmsSystem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_system
     *
     * @mbg.generated
     */
    int insertSelective(UpmsSystem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_system
     *
     * @mbg.generated
     */
    List<UpmsSystem> selectByExample(UpmsSystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_system
     *
     * @mbg.generated
     */
    UpmsSystem selectByPrimaryKey(Integer systemId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_system
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") UpmsSystem record, @Param("example") UpmsSystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_system
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") UpmsSystem record, @Param("example") UpmsSystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_system
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(UpmsSystem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_system
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(UpmsSystem record);
}