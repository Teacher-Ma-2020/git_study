package com.jie.boot_hello.annotation;

import java.lang.annotation.*;

/**
 * @ClassName RepeatChecker
 * @Author zhouchengjie
 * @Date 2022/6/1 11:12
 * @Description: 防止重复提交
 **/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RepeatChecker {

    boolean value() default true;

    int times() default 10;
}
