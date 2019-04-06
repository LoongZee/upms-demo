package com.loongzee.upms.rpc.service.impl;

import com.loongzee.common.annotation.BaseService;
import com.loongzee.common.base.BaseServiceImpl;
import com.loongzee.upms.dao.mapper.UpmsUserMapper;
import com.loongzee.upms.dao.model.UpmsUser;
import com.loongzee.upms.dao.model.UpmsUserExample;
import com.loongzee.upms.rpc.api.UpmsUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UpmsUserService实现
* Created by shuzheng on 2019/4/6.
*/
@Service
@Transactional
@BaseService
public class UpmsUserServiceImpl extends BaseServiceImpl<UpmsUserMapper, UpmsUser, UpmsUserExample> implements UpmsUserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UpmsUserServiceImpl.class);

    @Autowired
    UpmsUserMapper upmsUserMapper;

}