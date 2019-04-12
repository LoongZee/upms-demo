package com.loongzee.upms.client.shiro.filter;

import org.apache.shiro.session.Session;
import org.apache.shiro.web.filter.AccessControlFilter;
import org.apache.shiro.web.util.WebUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @program: upms-demo
 * @description: 强制退出会话过滤器
 * @author: Loongzee
 * @create: 2019-04-09 20:29
 */
public class UpmsSessionForceLogoutFilter extends AccessControlFilter {
    /**
     *
     * @param request
     * @param response
     * @param mappedValue
     * @return 返回true则允许访问，返回false则调用onAccessDenied
     * @throws Exception
     */
    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {
        //获得当前request的session
        Session session = getSubject(request, response).getSession(false);
        if(session == null) {
            return true;
        }
        boolean forceout = session.getAttribute("FORCE_LOGOUT") == null;
        return  forceout;
    }

    /**
     *
     * @param request
     * @param response
     * @return 返回false，进行拒绝访问的处理
     * @throws Exception
     */
    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
        //建立session并logout
        getSubject(request, response).logout();
        String loginUrl = getLoginUrl() + (getLoginUrl().contains("?") ? "&" : "?") + "forceLogout=1";
        WebUtils.issueRedirect(request, response, loginUrl);
        return false;
    }

}
