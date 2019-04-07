package com.loongzee.upms.rpc.api;

import com.loongzee.common.base.BaseService;
import com.loongzee.upms.dao.model.UpmsSystem;
import com.loongzee.upms.dao.model.UpmsSystemExample;

/**
* UpmsSystemService接口
* 2019/4/7
*/
public interface UpmsSystemService extends BaseService<UpmsSystem, UpmsSystemExample> {
    /**
     * 根据name获取UpmsSystem
     * @param name
     * @return
     */
    UpmsSystem selectUpmsSystemByName(String name);

}