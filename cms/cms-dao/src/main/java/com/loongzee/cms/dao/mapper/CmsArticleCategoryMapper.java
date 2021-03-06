package com.loongzee.cms.dao.mapper;

import com.loongzee.cms.dao.model.CmsArticleCategory;
import com.loongzee.cms.dao.model.CmsArticleCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsArticleCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article_category
     *
     * @mbg.generated
     */
    long countByExample(CmsArticleCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article_category
     *
     * @mbg.generated
     */
    int deleteByExample(CmsArticleCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article_category
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer articleCategoryId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article_category
     *
     * @mbg.generated
     */
    int insert(CmsArticleCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article_category
     *
     * @mbg.generated
     */
    int insertSelective(CmsArticleCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article_category
     *
     * @mbg.generated
     */
    List<CmsArticleCategory> selectByExample(CmsArticleCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article_category
     *
     * @mbg.generated
     */
    CmsArticleCategory selectByPrimaryKey(Integer articleCategoryId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article_category
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CmsArticleCategory record, @Param("example") CmsArticleCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article_category
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") CmsArticleCategory record, @Param("example") CmsArticleCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article_category
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CmsArticleCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_article_category
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CmsArticleCategory record);
}