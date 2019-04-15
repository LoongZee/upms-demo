package com.loongzee.cms.rpc.service.impl;

import com.loongzee.cms.rpc.mapper.CmsArticleExtMapper;
import com.loongzee.common.annotation.BaseService;
import com.loongzee.common.base.BaseServiceImpl;
import com.loongzee.cms.dao.mapper.CmsArticleMapper;
import com.loongzee.cms.dao.model.CmsArticle;
import com.loongzee.cms.dao.model.CmsArticleExample;
import com.loongzee.cms.rpc.api.CmsArticleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
* CmsArticleService实现
* 2019/4/15
*/
@Service
@Transactional
@BaseService
public class CmsArticleServiceImpl extends BaseServiceImpl<CmsArticleMapper, CmsArticle, CmsArticleExample> implements CmsArticleService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CmsArticleServiceImpl.class);

    @Autowired
    CmsArticleMapper cmsArticleMapper;

    @Autowired
    CmsArticleExtMapper cmsArticleExtMapper;

    @Override
    public List<CmsArticle> selectCmsArticlesByCategoryId(Integer categoryId, Integer offset, Integer limit) {
        return cmsArticleExtMapper.selectCmsArticlesByCategoryId(categoryId, offset, limit);
    }

    @Override
    public long countByCategoryId(Integer categoryId) {
        return cmsArticleExtMapper.countByCategoryId(categoryId);
    }

    @Override
    public List<CmsArticle> selectCmsArticlesByTagId(Integer tagId, Integer offset, Integer limit) {
        return cmsArticleExtMapper.selectCmsArticlesByTagId(tagId, offset, limit);
    }

    @Override
    public long countByTagId(Integer tagId) {
        return cmsArticleExtMapper.countByTagId(tagId);
    }

}