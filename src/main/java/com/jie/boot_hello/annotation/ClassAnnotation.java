package com.jie.boot_hello.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName ClassAnnotation
 * @Author zhouchengjie
 * @Date 2022/5/26 17:58
 * @Description:
 **/
@Target(value = ElementType.FIELD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface ClassAnnotation {
    int addValue();
}
