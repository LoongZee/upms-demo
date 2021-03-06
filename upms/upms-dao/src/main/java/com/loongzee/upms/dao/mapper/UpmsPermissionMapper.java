package com.loongzee.upms.dao.mapper;

import com.loongzee.upms.dao.model.UpmsPermission;
import com.loongzee.upms.dao.model.UpmsPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpmsPermissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_permission
     *
     * @mbg.generated
     */
    long countByExample(UpmsPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_permission
     *
     * @mbg.generated
     */
    int deleteByExample(UpmsPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_permission
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer permissionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_permission
     *
     * @mbg.generated
     */
    int insert(UpmsPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_permission
     *
     * @mbg.generated
     */
    int insertSelective(UpmsPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_permission
     *
     * @mbg.generated
     */
    List<UpmsPermission> selectByExample(UpmsPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_permission
     *
     * @mbg.generated
     */
    UpmsPermission selectByPrimaryKey(Integer permissionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_permission
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") UpmsPermission record, @Param("example") UpmsPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_permission
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") UpmsPermission record, @Param("example") UpmsPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_permission
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(UpmsPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_permission
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(UpmsPermission record);
}