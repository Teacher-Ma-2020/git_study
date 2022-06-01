/**
 * @author liuxin
 * @Date 2020/11/9 13:51 Copyright (C) 1997-2020 康成投资（中国）有限公司
 * <p>
 * http://www.rt-mart.com
 * <p>
 * 版权归本公司所有，不得私自使用、拷贝、修改、删除，否则视为侵权
 */

package com.jie.boot_hello.vo.queryDataVo;


import com.jie.boot_hello.vo.PageConditionVo;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;


@Data
@Valid
public class ReplenishBatchVo extends PageConditionVo {

    @NotBlank(message = "门店号不能为空")
    private String storeId;
    /**
     * 调入仓
     */
    @NotBlank(message = "调入仓不能为空")
    private String entryWarehouseNo;
    /**
     * 调出仓库
     */
    @NotBlank(message = "调出仓不能为空")
    private String outWarehouseNo;

    /**
     *开始时间
     */
    @NotBlank(message = "开始时间不能为空")
    private String beginDate;

    /**
     * 结束时间
     */
    @NotBlank(message = "结束时间不能为空")
    private String endDate;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 载具号
     */
    private String vehicleNo;

    /**
     * 装车单号
     */
    private String deliveryNo;

    /**
     * 货号
     */
    private String rtNo;

    /**
     * 作业批单号
     */
    private String replenishBatchNo;

    /**
     * 操作人
     */
    private String employeeName;

}
