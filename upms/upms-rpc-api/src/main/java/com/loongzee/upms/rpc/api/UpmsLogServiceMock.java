package com.loongzee.upms.rpc.api;

import com.loongzee.common.base.BaseServiceMock;
import com.loongzee.upms.dao.mapper.UpmsLogMapper;
import com.loongzee.upms.dao.model.UpmsLog;
import com.loongzee.upms.dao.model.UpmsLogExample;

/**
* 降级实现UpmsLogService接口
* 2019/4/7
*/
public class UpmsLogServiceMock extends BaseServiceMock<UpmsLogMapper, UpmsLog, UpmsLogExample> implements UpmsLogService {

}
