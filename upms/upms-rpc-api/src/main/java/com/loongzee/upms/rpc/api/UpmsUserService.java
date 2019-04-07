package com.loongzee.upms.rpc.api;

import com.loongzee.common.base.BaseService;
import com.loongzee.upms.dao.model.UpmsUser;
import com.loongzee.upms.dao.model.UpmsUserExample;

/**
* UpmsUserService接口
* 2019/4/7
*/
public interface UpmsUserService extends BaseService<UpmsUser, UpmsUserExample> {

    UpmsUser createUser(UpmsUser upmsUser);

}