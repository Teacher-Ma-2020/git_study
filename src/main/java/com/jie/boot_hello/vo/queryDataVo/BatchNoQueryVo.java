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
public class BatchNoQueryVo extends PageConditionVo {
    /**
     * 调拨批单号
     */
    @NotBlank(message = "调拨批单号不能为空")
    private String replenishBatchNo;

}
