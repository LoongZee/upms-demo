package com.loongzee.upms.container.jetty;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.alibaba.dubbo.common.utils.ConfigUtils;
import com.alibaba.dubbo.common.utils.NetUtils;
import com.alibaba.dubbo.container.Container;
import com.alibaba.dubbo.container.page.PageServlet;
import com.alibaba.dubbo.container.page.ResourceFilter;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.nio.SelectChannelConnector;
import org.mortbay.jetty.servlet.FilterHolder;
import org.mortbay.jetty.servlet.ServletHandler;
import org.mortbay.jetty.servlet.ServletHolder;

/**
 * @program: upms-demo
 * @description:
 * @author: Loongzee
 * @create: 2019-04-12 09:55
 */
public class JettyContainer implements Container {
    public static final String JETTY_PORT = "dubbo.jetty.port";
    public static final String JETTY_DIRECTORY = "dubbo.jetty.directory";
    public static final String JETTY_PAGES = "dubbo.jetty.page";
    public static final int DEFAULT_JETTY_PORT = 8080;
    private static final Logger logger = LoggerFactory.getLogger(com.alibaba.dubbo.container.jetty.JettyContainer.class);
    SelectChannelConnector connector;

    public JettyContainer() {
    }

    public void start() {
        String serverPort = ConfigUtils.getProperty("dubbo.jetty.port");
        int port;
        if (serverPort != null && serverPort.length() != 0) {
            port = Integer.parseInt(serverPort);
        } else {
            port = 8080;
        }

        this.connector = new SelectChannelConnector();
        this.connector.setPort(port);
        ServletHandler handler = new ServletHandler();
        String resources = ConfigUtils.getProperty("dubbo.jetty.directory");
        if (resources != null && resources.length() > 0) {
            FilterHolder resourceHolder = handler.addFilterWithMapping(ResourceFilter.class, "/*", 0);
            resourceHolder.setInitParameter("resources", resources);
        }

        ServletHolder pageHolder = handler.addServletWithMapping(PageServlet.class, "/*");
        pageHolder.setInitParameter("pages", ConfigUtils.getProperty("dubbo.jetty.page"));
        pageHolder.setInitOrder(2);

        //这里是新添加的，作用于druid日志监控系统的
        handler.addServletWithMapping(StatViewServlet.class, "/druid/*");

        Server server = new Server();
        server.addConnector(this.connector);
        server.addHandler(handler);

        try {
            server.start();
        } catch (Exception var8) {
            throw new IllegalStateException("Failed to start jetty server on " + NetUtils.getLocalHost() + ":" + port + ", cause: " + var8.getMessage(), var8);
        }
    }

    public void stop() {
        try {
            if (this.connector != null) {
                this.connector.close();
                this.connector = null;
            }
        } catch (Throwable var2) {
            logger.error(var2.getMessage(), var2);
        }

    }
}
