package com.jie.boot_hello.entity;

import java.util.Date;
import lombok.Data;

/**
 * @ClassName RtBoxReplenishVehicle
 * @Author zhouchengjie
 * @Date 2022/5/13 10:22
 * @Description: 
 **/
/**
    * 补货任务载具表
    */
@Data
public class RtBoxReplenishVehicle {
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
    * 补货作业单号
    */
    private String replenishNo;

    /**
    * 载具编号
    */
    private String vehicleNo;

    /**
    * 是否封载具，0:否，1：是
    */
    private Boolean isSealed;

    /**
    * 开板时间
    */
    private Date openVehicleTime;

    /**
    * 封板时间
    */
    private Date sealedVehicleTime;

    /**
    * 操作人员id
    */
    private String employeeNo;

    /**
    * 操作人员名称
    */
    private String employeeName;

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