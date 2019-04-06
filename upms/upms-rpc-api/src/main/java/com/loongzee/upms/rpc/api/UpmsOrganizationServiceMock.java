package com.loongzee.upms.rpc.api;

import com.loongzee.common.base.BaseServiceMock;
import com.loongzee.upms.dao.mapper.UpmsOrganizationMapper;
import com.loongzee.upms.dao.model.UpmsOrganization;
import com.loongzee.upms.dao.model.UpmsOrganizationExample;

/**
* 降级实现UpmsOrganizationService接口
* Created by shuzheng on 2019/4/6.
*/
public class UpmsOrganizationServiceMock extends BaseServiceMock<UpmsOrganizationMapper, UpmsOrganization, UpmsOrganizationExample> implements UpmsOrganizationService {

}
