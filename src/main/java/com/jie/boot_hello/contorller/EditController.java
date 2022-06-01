/*
 * Copyright (C) 1997-2022 康成投资（中国）有限公司
 *
 * http://www.rt-mart.com
 *
 * 版权归本公司所有，不得私自使用、拷贝、修改、删除，否则视为侵权
 */

package com.jie.boot_hello.contorller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jie.boot_hello.entity.RtBoxReplenishBatch;
import com.jie.boot_hello.entity.RtBoxVehicleEdit;
import com.jie.boot_hello.mapper.RtBoxReplenishBatchMapper;
import com.jie.boot_hello.service.RtBoxReplenishBatchService;
import com.jie.boot_hello.service.RtBoxVehicleEditService;
import com.jie.boot_hello.vo.PageDataVo;
import com.jie.boot_hello.vo.queryDataVo.BatchNoQueryVo;
import com.jie.boot_hello.vo.queryDataVo.ReplenishBatchVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * @ClassName BatchController
 * @Author zhouchengjie
 * @Date 2022/5/13 10:32
 * @Description:
 **/
@RestController
@RequestMapping("/edit")
public class EditController {
    @Autowired
    RtBoxVehicleEditService vehicleEditService;

    @PostMapping("/getBatchListPage")
    public PageDataVo<RtBoxVehicleEdit> getBatchListPage(BatchNoQueryVo batchNoQueryVo){
        Page<RtBoxVehicleEdit> page = vehicleEditService.page(new Page<>(batchNoQueryVo.getCurPage(), batchNoQueryVo.getPageSize()),
                new LambdaQueryWrapper<RtBoxVehicleEdit>().eq(RtBoxVehicleEdit::getReplenishBatchNo,batchNoQueryVo.getReplenishBatchNo()));
        return new PageDataVo<>(batchNoQueryVo,page.getTotal(),page.getRecords());
    }
}
