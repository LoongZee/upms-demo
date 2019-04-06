package com.loongzee.upms.rpc.api;

import com.loongzee.common.base.BaseServiceMock;
import com.loongzee.upms.dao.mapper.UpmsSystemMapper;
import com.loongzee.upms.dao.model.UpmsSystem;
import com.loongzee.upms.dao.model.UpmsSystemExample;

/**
* 降级实现UpmsSystemService接口
* Created by shuzheng on 2019/4/6.
*/
public class UpmsSystemServiceMock extends BaseServiceMock<UpmsSystemMapper, UpmsSystem, UpmsSystemExample> implements UpmsSystemService {

}
