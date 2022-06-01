package com.jie.boot_hello.entity;

import java.util.Date;
import lombok.Data;

/**
 * @ClassName RtBoxDelivery
 * @Author zhouchengjie
 * @Date 2022/5/15 22:26
 * @Description: 
 **/
/**
    * 装车任务表
    */
@Data
public class RtBoxDelivery {
    /**
    * 主键
    */
    private Long id;

    /**
    * 门店编号
    */
    private String storeId;

    /**
    * 需求仓库编号
    */
    private String entryWarehouseNo;

    /**
    * 调出仓库编号
    */
    private String outWarehouseNo;

    /**
    * 补货调拨作业批单号
    */
    private String replenishBatchNo;

    /**
    * 装车任务号
    */
    private String deliveryTaskNo;

    /**
    * 装车单号
    */
    private String deliveryNo;

    /**
    * 载具编号
    */
    private String vehicleNo;

    /**
    * 任务状态：0:待装车;1:已装车;2:已取消
    */
    private Byte status;

    /**
    * 完成时间
    */
    private Date finishTime;

    /**
    * 取消时间
    */
    private Date cancelTime;

    /**
    * 操作人员id
    */
    private String employeeNo;

    /**
    * 操作人员名称
    */
    private String employeeName;

    /**
    * 是否收货 0：否 1：是
    */
    private Boolean isReceive;

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