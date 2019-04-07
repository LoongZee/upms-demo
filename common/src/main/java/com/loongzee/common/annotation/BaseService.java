package com.loongzee.common.annotation;

import java.lang.annotation.*;

/**
 * @program: upms-demo
 * @description: 初始化继承BaseService的service
 * @author: Loongzee
 * @create: 2019-04-06 21:29
 */
@Target({ElementType.TYPE})  //接口、类、枚举、注解
@Retention(RetentionPolicy.RUNTIME) // 注解会在class字节码文件中存在，在运行时可以通过反射获取到
@Documented
public @interface BaseService {
}