package com.loongzee.upms.client.interceptor;

import com.alibaba.fastjson.JSON;
import com.loongzee.common.util.RequestUtil;
import com.loongzee.upms.dao.model.UpmsLog;
import com.loongzee.upms.rpc.api.UpmsApiService;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.ObjectUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

/**
 * @program: upms-demo
 * @description: 日志记录AOP实现
 * @author: Loongzee
 * @create: 2019-04-09 20:42
 */
@Aspect
public class LogAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogAspect.class);

    // 开始时间
    private long startTime = 0L;
    // 结束时间
    private long endTime = 0L;

    @Autowired
    UpmsApiService upmsApiService;

    /**
     * 第一个* 代表任何返回值
     * “.*”表示包下的所有类，而“..*”表示包、子孙包下的所有类
     * 最后*(..):最后这个星号表示方法名，*号表示所有的方法，后面括弧里面表示方法的参数，两个句点表示任何参数
     * @param joinPoint
     */
    @Before("execution(* *..controller..*.*(..))")
    public void doBeforeInServiceLayer(JoinPoint joinPoint) {
        LOGGER.debug("doBeforeInServiceLayer");
        startTime = System.currentTimeMillis();
    }

    @After("execution(* *..controller..*.*(..))")
    public void doAfterInServiceLayer(JoinPoint joinPoint) {
        LOGGER.debug("doAfterInServiceLayer");
    }

    /**
     * 代理的方法在其中执行
     * @param pjp
     * @return
     * @throws Throwable
     */
    @Around("execution(* *..controller..*.*(..))")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        // 获取request
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) requestAttributes;
        HttpServletRequest request = servletRequestAttributes.getRequest();

        UpmsLog upmsLog = new UpmsLog();
        // 从注解中获取操作名称、获取响应结果
        // 获得执行的结果
        Object result = pjp.proceed();
        //获得目标对象的方法对象
        Signature signature = pjp.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        //获得方法
        Method method = methodSignature.getMethod();
        //是否被ApiOperation标记，并获得标记的值
        if (method.isAnnotationPresent(ApiOperation.class)) {
            ApiOperation log = method.getAnnotation(ApiOperation.class);
            upmsLog.setDescription(log.value());
        }
        //是否被RequiresPermissions标记，并获得RequiresPermissions的值
        if (method.isAnnotationPresent(RequiresPermissions.class)) {
            RequiresPermissions requiresPermissions = method.getAnnotation(RequiresPermissions.class);
            String[] permissions = requiresPermissions.value();
            if (permissions.length > 0) {
                upmsLog.setPermissions(permissions[0]);
            }
        }
        endTime = System.currentTimeMillis();
        LOGGER.debug("doAround>>>result={},耗时：{}", result, endTime - startTime);
        //设置upmsLog属性
        upmsLog.setBasePath(RequestUtil.getBasePath(request));
        upmsLog.setIp(RequestUtil.getIpAddr(request));
        upmsLog.setMethod(request.getMethod());
        if ("GET".equalsIgnoreCase(request.getMethod())) {
            upmsLog.setParameter(request.getQueryString());
        } else {
            upmsLog.setParameter(ObjectUtils.toString(request.getParameterMap()));
        }

        upmsLog.setResult(JSON.toJSONString(result));
        upmsLog.setSpendTime((int) (endTime - startTime));
        upmsLog.setStartTime(startTime);
        upmsLog.setUri(request.getRequestURI());
        upmsLog.setUrl(ObjectUtils.toString(request.getRequestURL()));
        upmsLog.setUserAgent(request.getHeader("User-Agent"));
        upmsLog.setUsername(ObjectUtils.toString(request.getUserPrincipal()));
        upmsApiService.insertUpmsLogSelective(upmsLog);
        return result;
    }

}
