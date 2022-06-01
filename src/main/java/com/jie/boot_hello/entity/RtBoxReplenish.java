package com.jie.boot_hello.entity;

import java.util.Date;
import lombok.Data;

/**
 * @ClassName RtBoxReplenish
 * @Author zhouchengjie
 * @Date 2022/5/13 10:22
 * @Description: 
 **/
/**
    * 补货任务批单表
    */
@Data
public class RtBoxReplenish {
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
    * 补货作业单号
    */
    private String replenishNo;

    /**
    * 0: 尚未开始; 1:进行中; 2:已完成; 3:已取消
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