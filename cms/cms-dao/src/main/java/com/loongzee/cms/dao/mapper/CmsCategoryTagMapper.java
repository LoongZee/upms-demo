package com.loongzee.cms.dao.mapper;

import com.loongzee.cms.dao.model.CmsCategoryTag;
import com.loongzee.cms.dao.model.CmsCategoryTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsCategoryTagMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_category_tag
     *
     * @mbg.generated
     */
    long countByExample(CmsCategoryTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_category_tag
     *
     * @mbg.generated
     */
    int deleteByExample(CmsCategoryTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_category_tag
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer categoryTagId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_category_tag
     *
     * @mbg.generated
     */
    int insert(CmsCategoryTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_category_tag
     *
     * @mbg.generated
     */
    int insertSelective(CmsCategoryTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_category_tag
     *
     * @mbg.generated
     */
    List<CmsCategoryTag> selectByExample(CmsCategoryTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_category_tag
     *
     * @mbg.generated
     */
    CmsCategoryTag selectByPrimaryKey(Integer categoryTagId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_category_tag
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CmsCategoryTag record, @Param("example") CmsCategoryTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_category_tag
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") CmsCategoryTag record, @Param("example") CmsCategoryTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_category_tag
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CmsCategoryTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_category_tag
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CmsCategoryTag record);
}