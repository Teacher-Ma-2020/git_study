package com.jie.boot_hello.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * @ClassName RtBoxReplenishDemand
 * @Author zhouchengjie
 * @Date 2022/5/13 10:22
 * @Description: 
 **/
/**
    * 补货需求单表
    */
@Data
public class RtBoxReplenishDemand {
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
    * 补货需求单号
    */
    private String replenishDemandNo;

    /**
    * 商品RT货号
    */
    private String rtNo;

    /**
    * 商品名称
    */
    private String productName;

    /**
    * 商品课别编号
    */
    private String courseId;

    /**
    * 商品课别名称
    */
    private String courseName;

    /**
    * 商品规格
    */
    private String spec;

    /**
    * 0:标品; 1:称重品
    */
    private Byte weightedFlag;

    /**
    * 0:常温; 1:冷藏; 2:冷冻
    */
    private Byte thermosphereFlag;

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
    * 需补量
    */
    private BigDecimal requiredQuantity;

    /**
    * 作业人员id
    */
    private String employeeNo;

    /**
    * 作业人员名称
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