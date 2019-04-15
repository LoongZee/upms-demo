package com.loongzee.cms.rpc.api;

import com.loongzee.common.base.BaseServiceMock;
import com.loongzee.cms.dao.mapper.CmsSettingMapper;
import com.loongzee.cms.dao.model.CmsSetting;
import com.loongzee.cms.dao.model.CmsSettingExample;

/**
* 降级实现CmsSettingService接口
* 2019/4/15
*/
public class CmsSettingServiceMock extends BaseServiceMock<CmsSettingMapper, CmsSetting, CmsSettingExample> implements CmsSettingService {

}
