/*
 * Copyright (C) 1997-2022 康成投资（中国）有限公司
 *
 * http://www.rt-mart.com
 *
 * 版权归本公司所有，不得私自使用、拷贝、修改、删除，否则视为侵权
 */

package com.jie.boot_hello.aop;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.jie.boot_hello.annotation.AopAnnotation;
import com.jie.boot_hello.annotation.RepeatChecker;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @ClassName AspectClass
 * @Author zhouchengjie
 * @Date 2022/5/26 16:54
 * @Description:
 **/
@Aspect
@Component
public class AspectClass {


//    @Autowired
//    private RedisCacheClient redisCacheClient;

    @Pointcut("execution(* com.jie.boot_hello.contorller.BatchController.selectBatchList(..))")
    public void pointCut(){
    }

    @Around("@annotation(com.jie.boot_hello.annotation.AopAnnotation)")
    public Object around(ProceedingJoinPoint joinPoint){
        System.out.println(Arrays.toString(joinPoint.getArgs()));
        System.out.println("注解 before");
        Object proceed = null;
        try {
            proceed = joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("注解 after");
        return proceed;
    }

    @Around("pointCut()")
    public Object aroundExe(ProceedingJoinPoint joinPoint){
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Object[] args = joinPoint.getArgs();
        System.out.println(args);
        Method method = signature.getMethod();
        AopAnnotation annotation = method.getAnnotation(AopAnnotation.class);
        System.out.println(annotation.time());

        System.out.println("exe 方法执行before");
        Object proceed = null;
        try {
            proceed = joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("exe 方法执行after");
        return proceed;
    }

    @Pointcut("@annotation(com.jie.boot_hello.annotation.RepeatChecker)")
    public void check(){

    }



    @Before("check()")
    public void before(JoinPoint jp) {
        MethodSignature signature = (MethodSignature) jp.getSignature();
        RepeatChecker checker = signature.getMethod().getAnnotation(RepeatChecker.class);
        if(checker.value()){
            Object[] objects = jp.getArgs();
            for (Object obj : objects) {
                Map<String, Object> result = new LinkedHashMap<>();
                Map<String, Object> map = JSON.parseObject(JSON.toJSONString(obj), new TypeReference<Map<String, Object>>(){});
                map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEachOrdered(x -> result.put(x.getKey(), x.getValue()));
                StringBuffer sb = new StringBuffer();
                result.forEach((key, value) -> sb.append(key).append("=").append(value).append("&"));
//                String key = "repeat_" + DigestUtils.sha1Hex(sb.toString());
//                if(redisCacheClient.exists(key)){
//                    try {
//                        throw new Exception("请求过于频繁");
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                }
//                redisCacheClient.put(key, checker.times(), "");
            }
        }
    }

}
