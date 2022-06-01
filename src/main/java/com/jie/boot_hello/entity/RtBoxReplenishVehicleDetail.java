package com.jie.boot_hello.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * @ClassName RtBoxReplenishVehicleDetail
 * @Author zhouchengjie
 * @Date 2022/5/13 10:22
 * @Description: 
 **/
/**
    * 补货任务载具详情表
    */
@Data
public class RtBoxReplenishVehicleDetail {
    /**
    * 主键
    */
    private Long id;

    /**
    * 门店编号
    */
    private String storeId;

    /**
    * 补货调拨作业批单号
    */
    private String replenishBatchNo;

    /**
    * 载具编号
    */
    private String vehicleNo;

    /**
    * 补货作业子单号
    */
    private String replenishBillNo;

    /**
    * 商品RT货号
    */
    private String rtNo;

    /**
    * 拣货数量
    */
    private BigDecimal pickQuantity;

    /**
    * 最差效期
    */
    private String badValidity;

    /**
    * 0:否; 1:是
    */
    private Boolean isDelete;

    /**
    * 创建人
    */
    private String createId;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 更新人
    */
    private String updateId;

    /**
    * 修改时间
    */
    private Date updateTime;
}