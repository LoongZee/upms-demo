package com.loongzee.cms.rpc.api;

import com.loongzee.common.base.BaseServiceMock;
import com.loongzee.cms.dao.mapper.CmsArticleCategoryMapper;
import com.loongzee.cms.dao.model.CmsArticleCategory;
import com.loongzee.cms.dao.model.CmsArticleCategoryExample;

/**
* 降级实现CmsArticleCategoryService接口
* 2019/4/15
*/
public class CmsArticleCategoryServiceMock extends BaseServiceMock<CmsArticleCategoryMapper, CmsArticleCategory, CmsArticleCategoryExample> implements CmsArticleCategoryService {

}
