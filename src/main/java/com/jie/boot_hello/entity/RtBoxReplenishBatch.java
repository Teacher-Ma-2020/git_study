package com.jie.boot_hello.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @ClassName RtBoxReplenishBatch
 * @Author zhouchengjie
 * @Date 2022/5/13 10:22
 * @Description: 
 **/
/**
    * 补货调拨作业批单表
    */
@Data
@TableName("rt_box_replenish_batch")
public class RtBoxReplenishBatch {
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
    * 需求仓库名称
    */
    private String entryWarehouseName;

    /**
    * 调出仓库编号
    */
    private String outWarehouseNo;

    /**
    * 调出仓库名称
    */
    private String outWarehouseName;

    /**
    * 补货调拨作业批单号
    */
    private String replenishBatchNo;

    /**
    * 调拨单号
    */
    private String transfersNo;

    /**
    * 0: 尚未开始; 1:进行中; 2:已完成; 3:已取消
    */
    private Byte status;

    /**
    * 创建人员id
    */
    private String employeeNo;

    /**
    * 创建人员名称
    */
    private String employeeName;

    /**
    * 0:否; 1:是
    */
    private Byte isDelete;

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