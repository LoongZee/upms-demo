package com.loongzee.upms.rpc.mapper;

import com.loongzee.upms.dao.model.UpmsPermission;
import com.loongzee.upms.dao.model.UpmsRole;

import java.util.List;

/**
 * @program: upms-demo
 * @description:
 * @author: Loongzee
 * @create: 2019-04-07 20:48
 */
public interface UpmsApiMapper {
    
    // 根据用户id获取所拥有的权限
    List<UpmsPermission> selectUpmsPermissionByUpmsUserId(Integer upmsUserId);

    // 根据用户id获取所属的角色
    List<UpmsRole> selectUpmsRoleByUpmsUserId(Integer upmsUserId);
}
