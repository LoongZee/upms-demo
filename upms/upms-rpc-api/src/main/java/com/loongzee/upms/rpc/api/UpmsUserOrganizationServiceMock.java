package com.loongzee.upms.rpc.api;

import com.loongzee.common.base.BaseServiceMock;
import com.loongzee.upms.dao.mapper.UpmsUserOrganizationMapper;
import com.loongzee.upms.dao.model.UpmsUserOrganization;
import com.loongzee.upms.dao.model.UpmsUserOrganizationExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* 降级实现UpmsUserOrganizationService接口
* 2019/4/7
*/
public class UpmsUserOrganizationServiceMock extends BaseServiceMock<UpmsUserOrganizationMapper, UpmsUserOrganization, UpmsUserOrganizationExample> implements UpmsUserOrganizationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UpmsUserOrganizationServiceMock.class);

    @Override
    public int organization(String[] organizationIds, int id) {
        LOGGER.info("UpmsUserOrganizationServiceMock => organization");
        return 0;
    }

}
