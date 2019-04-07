package com.loongzee.upms.rpc.api;

import com.alibaba.fastjson.JSONArray;
import com.loongzee.common.base.BaseServiceMock;
import com.loongzee.upms.dao.mapper.UpmsRolePermissionMapper;
import com.loongzee.upms.dao.model.UpmsRolePermission;
import com.loongzee.upms.dao.model.UpmsRolePermissionExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* 降级实现UpmsRolePermissionService接口
* 2019/4/7
*/
public class UpmsRolePermissionServiceMock extends BaseServiceMock<UpmsRolePermissionMapper, UpmsRolePermission, UpmsRolePermissionExample> implements UpmsRolePermissionService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UpmsRolePermissionServiceMock.class);

    @Override
    public int rolePermission(JSONArray datas, int id) {
        LOGGER.info("UpmsRolePermissionServiceMock => rolePermission");
        return 0;
    }

}
