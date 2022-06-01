/*
 * Copyright (C) 1997-2022 康成投资（中国）有限公司
 *
 * http://www.rt-mart.com
 *
 * 版权归本公司所有，不得私自使用、拷贝、修改、删除，否则视为侵权
 */

package com.jie.boot_hello.contorller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jie.boot_hello.annotation.AopAnnotation;
import com.jie.boot_hello.annotation.ClassAnnotation;
import com.jie.boot_hello.annotation.RepeatChecker;
import com.jie.boot_hello.entity.RtBoxReplenishBatch;
import com.jie.boot_hello.entity.UserClass;
import com.jie.boot_hello.mapper.RtBoxReplenishBatchMapper;
import com.jie.boot_hello.service.RtBoxReplenishBatchService;
import com.jie.boot_hello.vo.PageDataVo;
import com.jie.boot_hello.vo.queryDataVo.ReplenishBatchVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.lang.reflect.Field;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName BatchController
 * @Author zhouchengjie
 * @Date 2022/5/13 10:32
 * @Description:
 **/
@RestController
public class BatchController {
    @Autowired
    RtBoxReplenishBatchService batchService;

    @Autowired
    RtBoxReplenishBatchMapper batchMapper;

    /**
     * 根据条件查询调拨批单号列表
     * @param replenishBatchVo
     * @return
     */
    @AopAnnotation(time = "111")
    @PostMapping("/selectBatchList")
    public List<String> selectBatchList(@Valid @RequestBody ReplenishBatchVo replenishBatchVo){
        System.out.println("方法主体");
        return null;
    }

    /**
     * 根据条件查询调拨批单号列表
     * @param replenishBatchVo
     * @return
     */
    @AopAnnotation(time = "222")
    @PostMapping("/selectBatchList222")
    public List<String> selectBatchList222(@Valid @RequestBody ReplenishBatchVo replenishBatchVo){

        UserClass userClass=new UserClass();
        userClass.setValue(2222222);
        this.addValue(userClass);
        System.out.println(userClass);
        return null;
    }


    public void addValue(UserClass userClass){
        Class<? extends UserClass> aClass = userClass.getClass();
        ClassAnnotation annotation = null;
        try {
            annotation = aClass.getDeclaredField("value").getAnnotation(ClassAnnotation.class);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        int addValue = annotation.addValue();
        try {
            Field value = aClass.getDeclaredField("value");
            value.setAccessible(true);
            try {
                value.set(userClass,(int)value.get(userClass)+addValue);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    @RepeatChecker
    @PostMapping("/selectBatchList333")
    public List<String> selectBatchList333(@Valid @RequestBody ReplenishBatchVo replenishBatchVo){

        return null;
    }


}
