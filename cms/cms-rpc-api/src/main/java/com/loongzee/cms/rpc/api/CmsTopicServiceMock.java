package com.loongzee.cms.rpc.api;

import com.loongzee.common.base.BaseServiceMock;
import com.loongzee.cms.dao.mapper.CmsTopicMapper;
import com.loongzee.cms.dao.model.CmsTopic;
import com.loongzee.cms.dao.model.CmsTopicExample;

/**
* 降级实现CmsTopicService接口
* 2019/4/15
*/
public class CmsTopicServiceMock extends BaseServiceMock<CmsTopicMapper, CmsTopic, CmsTopicExample> implements CmsTopicService {

}
