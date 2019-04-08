package com.loongzee.common.plugin;

import com.loongzee.common.util.AESUtil;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

/**
 * @program: upms-demo
 * @description: 解密文件插件
 * @author: Loongzee
 * @create: 2019-04-08 10:27
 */
public class EncryptPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {

    private String[] propertyNames = {
            "master.jdbc.password", "slave.jdbc.password", "generator.jdbc.password", "master.redis.password"
    };

    /**
     * 解密指定propertyName的加密属性值
     * @param propertyName
     * @param propertyValue
     * @return
     */
    @Override
    protected String convertProperty(String propertyName, String propertyValue) {
        for (String p : propertyNames) {
            if (p.equalsIgnoreCase(propertyName)) {
                return AESUtil.aesDecode(propertyValue);
            }
        }
        return super.convertProperty(propertyName, propertyValue);
    }
}
