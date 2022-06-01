package com.jie.boot_hello.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName FieldAnnotation
 * @Author zhouchengjie
 * @Date 2022/5/30 11:32
 * @Description: 字段赋值
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface FieldAnnotation {
    int addValue();
}

