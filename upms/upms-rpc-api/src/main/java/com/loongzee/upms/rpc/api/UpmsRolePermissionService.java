package com.loongzee.upms.rpc.api;

import com.alibaba.fastjson.JSONArray;
import com.loongzee.common.base.BaseService;
import com.loongzee.upms.dao.model.UpmsRolePermission;
import com.loongzee.upms.dao.model.UpmsRolePermissionExample;

/**
* UpmsRolePermissionService接口
* 2019/4/7
*/
public interface UpmsRolePermissionService extends BaseService<UpmsRolePermission, UpmsRolePermissionExample> {
    /**
     * 角色权限
     * @param datas 权限数据
     * @param id 角色id
     * @return
     */
    int rolePermission(JSONArray datas, int id);

}