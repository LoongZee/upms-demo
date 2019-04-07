package com.loongzee.upms.rpc.api;

import com.alibaba.fastjson.JSONArray;
import com.loongzee.common.base.BaseService;
import com.loongzee.upms.dao.model.UpmsUserPermission;
import com.loongzee.upms.dao.model.UpmsUserPermissionExample;

/**
* UpmsUserPermissionService接口
* 2019/4/7
*/
public interface UpmsUserPermissionService extends BaseService<UpmsUserPermission, UpmsUserPermissionExample> {
    /**
     * 用户权限
     * @param datas 权限数据
     * @param id 用户id
     * @return
     */
    int permission(JSONArray datas, int id);

}