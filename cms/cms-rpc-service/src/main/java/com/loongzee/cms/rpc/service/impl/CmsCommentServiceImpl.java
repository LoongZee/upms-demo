package com.loongzee.cms.rpc.service.impl;

import com.loongzee.common.annotation.BaseService;
import com.loongzee.common.base.BaseServiceImpl;
import com.loongzee.cms.dao.mapper.CmsCommentMapper;
import com.loongzee.cms.dao.model.CmsComment;
import com.loongzee.cms.dao.model.CmsCommentExample;
import com.loongzee.cms.rpc.api.CmsCommentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* CmsCommentService实现
* 2019/4/15
*/
@Service
@Transactional
@BaseService
public class CmsCommentServiceImpl extends BaseServiceImpl<CmsCommentMapper, CmsComment, CmsCommentExample> implements CmsCommentService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CmsCommentServiceImpl.class);

    @Autowired
    CmsCommentMapper cmsCommentMapper;

}