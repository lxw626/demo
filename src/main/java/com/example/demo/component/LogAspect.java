package com.example.demo.component;


import com.alibaba.fastjson.JSON;
import com.example.demo.core.base.entity.Response;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.Map;

@Component
@Aspect
public class LogAspect {
    /**
     * 日志切面
     */
    @Pointcut("execution(public * com.example.demo.controller.*.*(..))\"")
    public void projectPointcut() {
    }
    @Around("projectPointcut()")
    public Object projectBefore(ProceedingJoinPoint jp) throws Throwable {
        String name = jp.getSignature().getName();
        /**
         * 执行目标方法,只有环绕通知里面有吗???前置通知里面肯定没有
         * 所以环绕通可以当拦截器???
         */
        jp.proceed();
        System.out.println(name);
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        Map<String, String[]> parameterMap = request.getParameterMap();
        request.getParameterNames();
        System.out.println(JSON.toJSONString(parameterMap));
        Enumeration<String> parameterNames = request.getParameterNames();
        while(parameterNames.hasMoreElements()){
            String s = parameterNames.nextElement();
            System.out.println();
            String parameter = request.getParameter(s);
            System.out.println("key:"+s+",value:"+parameter);
        }
        return  new Response().failure();

    }
}
