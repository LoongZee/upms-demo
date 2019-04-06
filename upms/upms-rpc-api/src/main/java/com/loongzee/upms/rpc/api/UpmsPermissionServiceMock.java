package com.loongzee.upms.rpc.api;

import com.loongzee.common.base.BaseServiceMock;
import com.loongzee.upms.dao.mapper.UpmsPermissionMapper;
import com.loongzee.upms.dao.model.UpmsPermission;
import com.loongzee.upms.dao.model.UpmsPermissionExample;

/**
* 降级实现UpmsPermissionService接口
* Created by shuzheng on 2019/4/6.
*/
public class UpmsPermissionServiceMock extends BaseServiceMock<UpmsPermissionMapper, UpmsPermission, UpmsPermissionExample> implements UpmsPermissionService {

}
