package com.jie.boot_hello.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * @ClassName RtBoxReplenishAdvice
 * @Author zhouchengjie
 * @Date 2022/5/13 10:22
 * @Description: 
 **/
/**
    * 盒子仓补货建议表
    */
@Data
public class RtBoxReplenishAdvice {
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
    * 商品层面深 xx_xx_xx
    */
    private String layCovDep;

    /**
    * 需求仓库存
    */
    private BigDecimal entryWarehouseStock;

    /**
    * 调出仓库存
    */
    private BigDecimal outWarehouseStock;

    /**
    * 建议补货量排序
    */
    private BigDecimal adviceQuantitySort;

    /**
    * 建议补货量
    */
    private BigDecimal adviceQuantity;

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