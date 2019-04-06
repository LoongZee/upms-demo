package com.loongzee.upms.rpc.api;

import com.loongzee.common.base.BaseServiceMock;
import com.loongzee.upms.dao.mapper.UpmsUserOrganizationMapper;
import com.loongzee.upms.dao.model.UpmsUserOrganization;
import com.loongzee.upms.dao.model.UpmsUserOrganizationExample;

/**
* 降级实现UpmsUserOrganizationService接口
* Created by shuzheng on 2019/4/6.
*/
public class UpmsUserOrganizationServiceMock extends BaseServiceMock<UpmsUserOrganizationMapper, UpmsUserOrganization, UpmsUserOrganizationExample> implements UpmsUserOrganizationService {

}
