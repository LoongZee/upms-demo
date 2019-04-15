package com.loongzee.cms.rpc.api;

import com.loongzee.common.base.BaseServiceMock;
import com.loongzee.cms.dao.mapper.CmsCommentMapper;
import com.loongzee.cms.dao.model.CmsComment;
import com.loongzee.cms.dao.model.CmsCommentExample;

/**
* 降级实现CmsCommentService接口
* 2019/4/15
*/
public class CmsCommentServiceMock extends BaseServiceMock<CmsCommentMapper, CmsComment, CmsCommentExample> implements CmsCommentService {

}
