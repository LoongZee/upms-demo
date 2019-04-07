package com.loongzee.upms.rpc.api;

import com.alibaba.fastjson.JSONArray;
import com.loongzee.common.base.BaseService;
import com.loongzee.upms.dao.model.UpmsPermission;
import com.loongzee.upms.dao.model.UpmsPermissionExample;

/**
* UpmsPermissionService接口
* 2019/4/7
*/
public interface UpmsPermissionService extends BaseService<UpmsPermission, UpmsPermissionExample> {
    JSONArray getTreeByRoleId(Integer roleId);

    JSONArray getTreeByUserId(Integer usereId, Byte type);

}