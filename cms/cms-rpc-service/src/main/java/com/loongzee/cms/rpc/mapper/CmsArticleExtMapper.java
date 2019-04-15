package com.loongzee.cms.rpc.mapper;

import com.loongzee.cms.dao.model.CmsArticle;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: upms-demo
 * @description: 文章VOMapper
 * @author: Loongzee
 * @create: 2019-04-15 16:28
 */
public interface CmsArticleExtMapper {
    int up(Integer articleId);

    int down(Integer articleId);

    List<CmsArticle> selectCmsArticlesByCategoryId(@Param("categoryId") Integer categoryId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    long countByCategoryId(@Param("categoryId") Integer categoryId);

    List<CmsArticle> selectCmsArticlesByTagId(@Param("tagId") Integer tagId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    long countByTagId(@Param("tagId") Integer tagId);
}
