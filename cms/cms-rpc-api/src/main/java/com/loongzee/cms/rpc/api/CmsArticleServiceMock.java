package com.loongzee.cms.rpc.api;

import com.loongzee.common.base.BaseServiceMock;
import com.loongzee.cms.dao.mapper.CmsArticleMapper;
import com.loongzee.cms.dao.model.CmsArticle;
import com.loongzee.cms.dao.model.CmsArticleExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
* 降级实现CmsArticleService接口
* 2019/4/15
*/
public class CmsArticleServiceMock extends BaseServiceMock<CmsArticleMapper, CmsArticle, CmsArticleExample> implements CmsArticleService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CmsArticleServiceMock.class);

    @Override
    public List<CmsArticle> selectCmsArticlesByCategoryId(Integer categoryId, Integer offset, Integer limit) {
        LOGGER.info("CmsArticleServiceMock => getCmsArticlesByCategoryId");
        return null;
    }

    @Override
    public long countByCategoryId(Integer categoryId) {
        LOGGER.info("CmsArticleServiceMock => countByCategoryId");
        return 0;
    }

    @Override
    public List<CmsArticle> selectCmsArticlesByTagId(Integer tagId, Integer offset, Integer limit) {
        LOGGER.info("CmsArticleServiceMock => getCmsArticlesByCategoryId");
        return null;
    }

    @Override
    public long countByTagId(Integer tagId) {
        LOGGER.info("CmsArticleServiceMock => countByTagId");
        return 0;
    }
}
