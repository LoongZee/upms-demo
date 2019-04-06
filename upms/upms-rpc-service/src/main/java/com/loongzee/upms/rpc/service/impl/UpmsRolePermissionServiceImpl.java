package com.loongzee.upms.rpc.service.impl;

import com.loongzee.common.annotation.BaseService;
import com.loongzee.common.base.BaseServiceImpl;
import com.loongzee.upms.dao.mapper.UpmsRolePermissionMapper;
import com.loongzee.upms.dao.model.UpmsRolePermission;
import com.loongzee.upms.dao.model.UpmsRolePermissionExample;
import com.loongzee.upms.rpc.api.UpmsRolePermissionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UpmsRolePermissionService实现
* Created by shuzheng on 2019/4/6.
*/
@Service
@Transactional
@BaseService
public class UpmsRolePermissionServiceImpl extends BaseServiceImpl<UpmsRolePermissionMapper, UpmsRolePermission, UpmsRolePermissionExample> implements UpmsRolePermissionService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UpmsRolePermissionServiceImpl.class);

    @Autowired
    UpmsRolePermissionMapper upmsRolePermissionMapper;

}