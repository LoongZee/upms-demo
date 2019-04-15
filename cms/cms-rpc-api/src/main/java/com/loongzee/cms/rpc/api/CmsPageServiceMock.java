package com.loongzee.cms.rpc.api;

import com.loongzee.common.base.BaseServiceMock;
import com.loongzee.cms.dao.mapper.CmsPageMapper;
import com.loongzee.cms.dao.model.CmsPage;
import com.loongzee.cms.dao.model.CmsPageExample;

/**
* 降级实现CmsPageService接口
* 2019/4/15
*/
public class CmsPageServiceMock extends BaseServiceMock<CmsPageMapper, CmsPage, CmsPageExample> implements CmsPageService {

}
