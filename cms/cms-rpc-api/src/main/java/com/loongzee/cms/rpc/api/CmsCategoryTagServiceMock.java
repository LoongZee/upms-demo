package com.loongzee.cms.rpc.api;

import com.loongzee.common.base.BaseServiceMock;
import com.loongzee.cms.dao.mapper.CmsCategoryTagMapper;
import com.loongzee.cms.dao.model.CmsCategoryTag;
import com.loongzee.cms.dao.model.CmsCategoryTagExample;

/**
* 降级实现CmsCategoryTagService接口
* 2019/4/15
*/
public class CmsCategoryTagServiceMock extends BaseServiceMock<CmsCategoryTagMapper, CmsCategoryTag, CmsCategoryTagExample> implements CmsCategoryTagService {

}
