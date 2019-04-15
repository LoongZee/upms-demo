package com.loongzee.cms.rpc.api;

import com.loongzee.common.base.BaseServiceMock;
import com.loongzee.cms.dao.mapper.CmsTagMapper;
import com.loongzee.cms.dao.model.CmsTag;
import com.loongzee.cms.dao.model.CmsTagExample;

/**
* 降级实现CmsTagService接口
* 2019/4/15
*/
public class CmsTagServiceMock extends BaseServiceMock<CmsTagMapper, CmsTag, CmsTagExample> implements CmsTagService {

}
