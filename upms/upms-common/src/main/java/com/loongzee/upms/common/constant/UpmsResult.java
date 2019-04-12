package com.loongzee.upms.common.constant;

import com.loongzee.common.base.BaseResult;

/**
 * @program: upms-demo
 * @description: upms系统常量枚举类
 * @author: Loongzee
 * @create: 2019-04-09 21:26
 */
public class UpmsResult extends BaseResult {

    public UpmsResult(UpmsResultConstant upmsResultConstant, Object data) {
        super(upmsResultConstant.getCode(), upmsResultConstant.getMessage(), data);
    }

}
