package com.loongzee.upms.rpc.api;

import com.loongzee.common.base.BaseService;
import com.loongzee.upms.dao.model.UpmsUserOrganization;
import com.loongzee.upms.dao.model.UpmsUserOrganizationExample;

/**
* UpmsUserOrganizationService接口
* 2019/4/7
*/
public interface UpmsUserOrganizationService extends BaseService<UpmsUserOrganization, UpmsUserOrganizationExample> {

    /**
     * 用户组织
     * @param organizationIds 组织ids
     * @param id 用户id
     * @return
     */
    int organization(String[] organizationIds, int id);

}