package com.loongzee.cms.rpc.api;

import com.loongzee.common.base.BaseServiceMock;
import com.loongzee.cms.dao.mapper.CmsCategoryMapper;
import com.loongzee.cms.dao.model.CmsCategory;
import com.loongzee.cms.dao.model.CmsCategoryExample;

/**
* 降级实现CmsCategoryService接口
* 2019/4/15
*/
public class CmsCategoryServiceMock extends BaseServiceMock<CmsCategoryMapper, CmsCategory, CmsCategoryExample> implements CmsCategoryService {

}
