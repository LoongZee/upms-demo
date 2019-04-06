package com.loongzee.upms.rpc.api;

import com.loongzee.common.base.BaseServiceMock;
import com.loongzee.upms.dao.mapper.UpmsUserPermissionMapper;
import com.loongzee.upms.dao.model.UpmsUserPermission;
import com.loongzee.upms.dao.model.UpmsUserPermissionExample;

/**
* 降级实现UpmsUserPermissionService接口
* Created by shuzheng on 2019/4/6.
*/
public class UpmsUserPermissionServiceMock extends BaseServiceMock<UpmsUserPermissionMapper, UpmsUserPermission, UpmsUserPermissionExample> implements UpmsUserPermissionService {

}
