/*
 * Copyright (C) 1997-2022 康成投资（中国）有限公司
 *
 * http://www.rt-mart.com
 *
 * 版权归本公司所有，不得私自使用、拷贝、修改、删除，否则视为侵权
 */

package com.jie.boot_hello.entity;

import com.jie.boot_hello.annotation.ClassAnnotation;
import lombok.Data;

/**
 * @ClassName UserClass
 * @Author zhouchengjie
 * @Date 2022/5/26 18:06
 * @Description:
 **/
@Data
public class UserClass {
    @ClassAnnotation(addValue = 111111)
    private int value;
}
