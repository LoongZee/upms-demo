package com.loongzee.upms.rpc.api;

import com.loongzee.common.base.BaseServiceMock;
import com.loongzee.upms.dao.mapper.UpmsUserMapper;
import com.loongzee.upms.dao.model.UpmsUser;
import com.loongzee.upms.dao.model.UpmsUserExample;

/**
* 降级实现UpmsUserService接口
* 2019/4/7
*/
public class UpmsUserServiceMock extends BaseServiceMock<UpmsUserMapper, UpmsUser, UpmsUserExample> implements UpmsUserService {

    @Override
    public UpmsUser createUser(UpmsUser upmsUser) {
        return null;
    }

}
