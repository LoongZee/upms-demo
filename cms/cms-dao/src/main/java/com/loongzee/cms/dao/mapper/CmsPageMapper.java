package com.loongzee.cms.dao.mapper;

import com.loongzee.cms.dao.model.CmsPage;
import com.loongzee.cms.dao.model.CmsPageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsPageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_page
     *
     * @mbg.generated
     */
    long countByExample(CmsPageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_page
     *
     * @mbg.generated
     */
    int deleteByExample(CmsPageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_page
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer pageId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_page
     *
     * @mbg.generated
     */
    int insert(CmsPage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_page
     *
     * @mbg.generated
     */
    int insertSelective(CmsPage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_page
     *
     * @mbg.generated
     */
    List<CmsPage> selectByExampleWithBLOBs(CmsPageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_page
     *
     * @mbg.generated
     */
    List<CmsPage> selectByExample(CmsPageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_page
     *
     * @mbg.generated
     */
    CmsPage selectByPrimaryKey(Integer pageId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_page
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CmsPage record, @Param("example") CmsPageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_page
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") CmsPage record, @Param("example") CmsPageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_page
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") CmsPage record, @Param("example") CmsPageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_page
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CmsPage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_page
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(CmsPage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_page
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CmsPage record);
}