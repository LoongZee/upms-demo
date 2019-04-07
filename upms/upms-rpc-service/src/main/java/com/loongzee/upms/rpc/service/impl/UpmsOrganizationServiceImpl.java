package com.loongzee.upms.rpc.service.impl;

import com.loongzee.common.annotation.BaseService;
import com.loongzee.common.base.BaseServiceImpl;
import com.loongzee.upms.dao.mapper.UpmsOrganizationMapper;
import com.loongzee.upms.dao.model.UpmsOrganization;
import com.loongzee.upms.dao.model.UpmsOrganizationExample;
import com.loongzee.upms.rpc.api.UpmsOrganizationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UpmsOrganizationService实现
* 2019/4/7
*/
@Service
@Transactional
@BaseService
public class UpmsOrganizationServiceImpl extends BaseServiceImpl<UpmsOrganizationMapper, UpmsOrganization, UpmsOrganizationExample> implements UpmsOrganizationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UpmsOrganizationServiceImpl.class);

    @Autowired
    UpmsOrganizationMapper upmsOrganizationMapper;

}