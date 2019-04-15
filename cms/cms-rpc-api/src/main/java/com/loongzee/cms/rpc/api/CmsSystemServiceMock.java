package com.loongzee.cms.rpc.api;

import com.loongzee.common.base.BaseServiceMock;
import com.loongzee.cms.dao.mapper.CmsSystemMapper;
import com.loongzee.cms.dao.model.CmsSystem;
import com.loongzee.cms.dao.model.CmsSystemExample;

/**
* 降级实现CmsSystemService接口
* 2019/4/15
*/
public class CmsSystemServiceMock extends BaseServiceMock<CmsSystemMapper, CmsSystem, CmsSystemExample> implements CmsSystemService {

}
