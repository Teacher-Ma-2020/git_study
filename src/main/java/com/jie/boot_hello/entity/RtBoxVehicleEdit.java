package com.jie.boot_hello.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * @ClassName RtBoxVehicleEdit
 * @Author zhouchengjie
 * @Date 2022/5/13 10:22
 * @Description: 
 **/
/**
    * 载具更新记录表
    */
@Data
public class RtBoxVehicleEdit {
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
    * 更正数量
    */
    private BigDecimal editQuantity;

    /**
    * 更正前数量
    */
    private BigDecimal befQuantity;

    /**
    * 更正后数量
    */
    private BigDecimal aftQuantity;

    /**
    * 操作料位
    */
    private String shelfNo;

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