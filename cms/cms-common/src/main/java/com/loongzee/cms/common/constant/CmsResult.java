package com.loongzee.cms.common.constant;

import com.loongzee.common.base.BaseResult;

/**
 * @program: upms-demo
 * @description: cms系统常量枚举类
 * @author: Loongzee
 * @create: 2019-04-16 17:22
 */
public class CmsResult extends BaseResult {

    public CmsResult(CmsResultConstant cmsResultConstant, Object data) {
        super(cmsResultConstant.getCode(), cmsResultConstant.getMessage(), data);
    }

}