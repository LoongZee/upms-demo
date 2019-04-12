package com.loongzee.upms.server.interceptor;

import com.loongzee.common.util.PropertiesFileUtil;
import com.loongzee.upms.dao.model.UpmsUser;
import com.loongzee.upms.rpc.api.UpmsApiService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: upms-demo
 * @description:
 * @author: Loongzee
 * @create: 2019-04-09 11:10
 */
public class UpmsInterceptor  extends HandlerInterceptorAdapter {

    private static final Logger LOGGER = LoggerFactory.getLogger(UpmsInterceptor.class);
    private static final String OSS_ALIYUN_OSS_POLICY = PropertiesFileUtil.getInstance("oss-client").get("oss.aliyun.oss.policy");

    @Autowired
    UpmsApiService upmsApiService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        request.setAttribute("OSS_ALIYUN_OSS_POLICY", OSS_ALIYUN_OSS_POLICY);
        // 过滤ajax
        //如果 requestedWith 为 null，则为同步请求
        //如果 requestedWith 为 XMLHttpRequest 则为Ajax请求
        if (null != request.getHeader("X-Requested-With") && "XMLHttpRequest".equalsIgnoreCase(request.getHeader("X-Requested-With"))) {
            return true;
        }
        // 登录信息
        Subject subject = SecurityUtils.getSubject();
        String username = (String) subject.getPrincipal();
        UpmsUser upmsUser = upmsApiService.selectUpmsUserByUsername(username);
        request.setAttribute("upmsUser", upmsUser);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        super.afterCompletion(request, response, handler, ex);
    }

    @Override
    public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        super.afterConcurrentHandlingStarted(request, response, handler);
    }
}
