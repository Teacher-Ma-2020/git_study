package com.jie.boot_hello.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * @ClassName RtBoxReplenishBill
 * @Author zhouchengjie
 * @Date 2022/5/13 10:22
 * @Description: 
 **/
/**
    * 补货任务子单表
    */
@Data
public class RtBoxReplenishBill {
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
    * 补货批单号
    */
    private String replenishNo;

    /**
    * 补货作业表单号
    */
    private String replenishBillNo;

    /**
    * 任务状态：0:尚未开始(未抢单);1:进行中;2:已完成;3:已取消
    */
    private Byte status;

    /**
    * 商品RT货号
    */
    private String rtNo;

    /**
    * 商品名称
    */
    private String productName;

    /**
    * 应备量
    */
    private BigDecimal prepareReplenishQuantity;

    /**
    * 取消数量
    */
    private BigDecimal cancelQuantity;

    /**
    * 实际操作数量
    */
    private BigDecimal quantity;

    /**
    * 完成时间
    */
    private Date finishTime;

    /**
    * 取消时间
    */
    private Date cancelTime;

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