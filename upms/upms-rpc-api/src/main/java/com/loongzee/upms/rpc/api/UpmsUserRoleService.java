package com.loongzee.upms.rpc.api;

import com.loongzee.common.base.BaseService;
import com.loongzee.upms.dao.model.UpmsUserRole;
import com.loongzee.upms.dao.model.UpmsUserRoleExample;

/**
* UpmsUserRoleService接口
* 2019/4/7
*/
public interface UpmsUserRoleService extends BaseService<UpmsUserRole, UpmsUserRoleExample> {
    /**
     * 用户角色
     * @param roleIds 角色ids
     * @param id 用户id
     * @return
     */
    int role(String[] roleIds, int id);

}