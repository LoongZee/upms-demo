package com.loongzee.cms.rpc.api;

import com.loongzee.common.base.BaseServiceMock;
import com.loongzee.cms.dao.mapper.CmsArticleTagMapper;
import com.loongzee.cms.dao.model.CmsArticleTag;
import com.loongzee.cms.dao.model.CmsArticleTagExample;

/**
* 降级实现CmsArticleTagService接口
* 2019/4/15
*/
public class CmsArticleTagServiceMock extends BaseServiceMock<CmsArticleTagMapper, CmsArticleTag, CmsArticleTagExample> implements CmsArticleTagService {

}
