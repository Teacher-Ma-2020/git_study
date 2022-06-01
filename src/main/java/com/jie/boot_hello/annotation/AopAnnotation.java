package com.jie.boot_hello.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName AopAnnotation
 * @Author zhouchengjie
 * @Date 2022/5/26 16:42
 * @Description:
 **/
@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface AopAnnotation {
    String time();
}
