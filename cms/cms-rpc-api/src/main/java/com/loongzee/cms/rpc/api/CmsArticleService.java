package com.loongzee.cms.rpc.api;

import com.loongzee.common.base.BaseService;
import com.loongzee.cms.dao.model.CmsArticle;
import com.loongzee.cms.dao.model.CmsArticleExample;

import java.util.List;

/**
* CmsArticleService接口
* 2019/4/15
*/
public interface CmsArticleService extends BaseService<CmsArticle, CmsArticleExample> {
    /**
     * 根据类目获取文章列表
     * @param categoryId
     * @param offset
     * @param limit
     * @return
     */
    List<CmsArticle> selectCmsArticlesByCategoryId(Integer categoryId, Integer offset, Integer limit);

    /**
     * 根据类目获取文章数量
     * @param categoryId
     * @return
     */
    long countByCategoryId(Integer categoryId);

    /**
     * 根据标签获取文章列表
     * @param tagId
     * @param offset
     * @param limit
     * @return
     */
    List<CmsArticle> selectCmsArticlesByTagId(Integer tagId, Integer offset, Integer limit);

    /**
     * 根据标签获取文章数量
     * @param tagId
     * @return
     */
    long countByTagId(Integer tagId);
}