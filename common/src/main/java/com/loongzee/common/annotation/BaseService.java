package com.loongzee.common.annotation;

import java.lang.annotation.*;

/**
 * @program: upms-demo
 * @description: 初始化继承BaseService的service
 * @author: Loongzee
 * @create: 2019-04-06 21:29
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface BaseService {
}