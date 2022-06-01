/*
 * Copyright (C) 1997-2022 康成投资（中国）有限公司
 *
 * http://www.rt-mart.com
 *
 * 版权归本公司所有，不得私自使用、拷贝、修改、删除，否则视为侵权
 */

package com.jie.boot_hello.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jie.boot_hello.entity.RtBoxDelivery;
import com.jie.boot_hello.entity.RtBoxReplenishBatch;
import com.jie.boot_hello.entity.RtBoxReplenishDemand;
import com.jie.boot_hello.entity.RtBoxReplenishVehicle;
import com.jie.boot_hello.mapper.RtBoxReplenishBatchMapper;
import com.jie.boot_hello.vo.PageDataVo;
import com.jie.boot_hello.vo.queryDataVo.ReplenishBatchVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import springfox.documentation.schema.Collections;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName RtBoxReplenishBatchService
 * @Author zhouchengjie
 * @Date 2022/5/13 10:27
 * @Description:
 **/
@Service
public class RtBoxReplenishBatchService extends ServiceImpl<RtBoxReplenishBatchMapper, RtBoxReplenishBatch> {

    @Autowired
    private RtBoxReplenishVehicleService vehicleService;

    @Autowired
    private RtBoxReplenishDeliveryService deliveryService;

    @Autowired
    private RtBoxReplenishDemandService demandService;

    public List<RtBoxReplenishBatch> selectBatchListByPage(ReplenishBatchVo replenishBatchVo) {
        List<RtBoxReplenishBatch> replenishBatchList = this.selectBatchList(replenishBatchVo);
        if (replenishBatchList==null || replenishBatchList.size()==0){
            return new ArrayList<>();
        }else{
            List<String> replenishBatchNoList = replenishBatchList.stream().map(RtBoxReplenishBatch::getReplenishBatchNo).collect(Collectors.toList());
            //查询指定 载具号 相关调拨单列表
            if (StringUtils.isNotBlank(replenishBatchVo.getVehicleNo())){
                List<String> batchListByVehicle = this.selectBatchListByVehicle(replenishBatchVo, replenishBatchNoList);
                replenishBatchList = replenishBatchList.stream()
                        .filter(replenishBatch->batchListByVehicle.contains(replenishBatch.getReplenishBatchNo()))
                        .collect(Collectors.toList());
            }
            //查询指定 装车单号 相关调拨单列表
            if (StringUtils.isNotBlank(replenishBatchVo.getVehicleNo())) {
                List<String> batchListByDelivery = this.selectBatchListByDelivery(replenishBatchVo, replenishBatchNoList);
                replenishBatchList = replenishBatchList.stream()
                        .filter(replenishBatch->batchListByDelivery.contains(replenishBatch.getReplenishBatchNo()))
                        .collect(Collectors.toList());
            }
            //查询指定 货号 相关调拨单列表
            if (StringUtils.isNotBlank(replenishBatchVo.getRtNo())) {
                List<String> batchListByRtNo = this.selectBatchListByDemand(replenishBatchVo, replenishBatchNoList);
                replenishBatchList = replenishBatchList.stream()
                        .filter(replenishBatch->batchListByRtNo.contains(replenishBatch.getReplenishBatchNo()))
                        .collect(Collectors.toList());
            }
            return replenishBatchList;
        }
    }

    public List<RtBoxReplenishBatch> selectBatchList(ReplenishBatchVo replenishBatchVo) {
        LambdaQueryWrapper<RtBoxReplenishBatch> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(RtBoxReplenishBatch::getStoreId, replenishBatchVo.getStoreId());
        queryWrapper.eq(RtBoxReplenishBatch::getOutWarehouseNo, replenishBatchVo.getOutWarehouseNo());
        queryWrapper.eq(RtBoxReplenishBatch::getEntryWarehouseNo, replenishBatchVo.getEntryWarehouseNo());
        queryWrapper.ge(RtBoxReplenishBatch::getCreateTime, replenishBatchVo.getBeginDate());
        queryWrapper.le(RtBoxReplenishBatch::getCreateTime, replenishBatchVo.getEndDate());
        if (replenishBatchVo.getReplenishBatchNo() != null) {
            queryWrapper.eq(RtBoxReplenishBatch::getReplenishBatchNo, replenishBatchVo.getReplenishBatchNo());
        }
        if (replenishBatchVo.getStatus() != null) {
            queryWrapper.eq(RtBoxReplenishBatch::getStatus, replenishBatchVo.getStatus());
        }
        return this.list(queryWrapper);
    }

    /**
     * 根据载具号查询范围内调拨单号
     * @param replenishBatchVo
     * @param replenishBatchNoList
     * @return
     */
    public List<String> selectBatchListByVehicle(ReplenishBatchVo replenishBatchVo, List<String> replenishBatchNoList){
        LambdaQueryWrapper<RtBoxReplenishVehicle> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(RtBoxReplenishVehicle::getStoreId, replenishBatchVo.getStoreId());
        queryWrapper.eq(RtBoxReplenishVehicle::getVehicleNo, replenishBatchVo.getVehicleNo());
        queryWrapper.ge(RtBoxReplenishVehicle::getCreateTime, replenishBatchVo.getBeginDate());
        queryWrapper.le(RtBoxReplenishVehicle::getCreateTime, replenishBatchVo.getEndDate());
        queryWrapper.in(RtBoxReplenishVehicle::getReplenishBatchNo, replenishBatchNoList);
        return vehicleService.list(queryWrapper).stream().map(RtBoxReplenishVehicle::getReplenishBatchNo).collect(Collectors.toList());
    }

    /**
     * 根据装车单号查询范围内调拨单号
     * @param replenishBatchVo
     * @param replenishBatchNoList
     * @return
     */
    public List<String> selectBatchListByDelivery(ReplenishBatchVo replenishBatchVo, List<String> replenishBatchNoList){
        LambdaQueryWrapper<RtBoxDelivery> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(RtBoxDelivery::getStoreId, replenishBatchVo.getStoreId());
        queryWrapper.eq(RtBoxDelivery::getDeliveryNo, replenishBatchVo.getDeliveryNo());
        queryWrapper.ge(RtBoxDelivery::getCreateTime, replenishBatchVo.getBeginDate());
        queryWrapper.le(RtBoxDelivery::getCreateTime, replenishBatchVo.getEndDate());
        queryWrapper.in(RtBoxDelivery::getReplenishBatchNo, replenishBatchNoList);
        return deliveryService.list(queryWrapper).stream().map(RtBoxDelivery::getReplenishBatchNo).collect(Collectors.toList());
    }

    /**
     * 根据装车单号查询范围内调拨单号
     * @param replenishBatchVo
     * @param replenishBatchNoList
     * @return
     */
    public List<String> selectBatchListByDemand(ReplenishBatchVo replenishBatchVo, List<String> replenishBatchNoList){
        LambdaQueryWrapper<RtBoxReplenishDemand> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(RtBoxReplenishDemand::getStoreId, replenishBatchVo.getStoreId());
        queryWrapper.eq(RtBoxReplenishDemand::getRtNo, replenishBatchVo.getDeliveryNo());
        queryWrapper.ge(RtBoxReplenishDemand::getCreateTime, replenishBatchVo.getBeginDate());
        queryWrapper.le(RtBoxReplenishDemand::getCreateTime, replenishBatchVo.getEndDate());
        queryWrapper.in(RtBoxReplenishDemand::getReplenishBatchNo, replenishBatchNoList);
        return demandService.list(queryWrapper).stream().map(RtBoxReplenishDemand::getReplenishBatchNo).collect(Collectors.toList());
    }




}


