package com.loongzee.cms.rpc.api;

import com.loongzee.common.base.BaseServiceMock;
import com.loongzee.cms.dao.mapper.CmsMenuMapper;
import com.loongzee.cms.dao.model.CmsMenu;
import com.loongzee.cms.dao.model.CmsMenuExample;

/**
* 降级实现CmsMenuService接口
* 2019/4/15
*/
public class CmsMenuServiceMock extends BaseServiceMock<CmsMenuMapper, CmsMenu, CmsMenuExample> implements CmsMenuService {

}
