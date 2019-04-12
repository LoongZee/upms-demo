package com.loongzee.upms.server;

import com.loongzee.common.base.BaseInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @program: upms-demo
 * @description: 系统接口
 * @author: Loongzee
 * @create: 2019-04-08 22:46
 */
public class Initialize implements BaseInterface {

    private static final Logger LOGGER = LoggerFactory.getLogger(Initialize.class);


    @Override
    public void init() {
        LOGGER.info(">>>>> 系统初始化");
    }
}
