package com.loongzee.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;

/**
 * @program: upms-demo
 * @description:
 * @author: Loongzee
 * @create: 2019-04-09 21:12
 */
public class AdminUtil implements InitializingBean, ServletContextAware {

    private static final Logger LOGGER = LoggerFactory.getLogger(AdminUtil.class);

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        LOGGER.info("===== 开始解压-admin =====");
        String version = PropertiesFileUtil.getInstance("admin-client").get("admin.version");
        LOGGER.info("admin.jar 版本: {}", version);
        String jarPath = servletContext.getRealPath("/WEB-INF/lib/admin-" + version + ".jar");
        LOGGER.info("admin.jar 包路径: {}", jarPath);
        String resources = servletContext.getRealPath("/") + "/resources/zheng-admin";
        LOGGER.info("admin.jar 解压到: {}", resources);
        JarUtil.decompress(jarPath, resources);
        LOGGER.info("===== 解压admin完成 =====");
    }

}
