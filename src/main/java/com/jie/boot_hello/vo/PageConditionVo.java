/*
 * Copyright (C) 1997-2020 康成投资（中国）有限公司
 *
 * http://www.rt-mart.com
 *
 * 版权归本公司所有，不得私自使用、拷贝、修改、删除，否则视为侵权
 */

package com.jie.boot_hello.vo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;
import java.util.Locale;

/**
 * @ClassName PageConditionVo
 * @Author wangji
 * @Date 2020/8/14
 * @Description: 分页查询条件基类
 **/
public class PageConditionVo implements Serializable {

    private static final long serialVersionUID = 2315645433674535307L;

    /**
     * 当前页码
     */
    @ApiModelProperty(value = "当前页数", example = "1")
    private int curPage = 1;

    /**
     * 每页条数
     */
    @ApiModelProperty(value = "一页显示记录数", example = "10")
    private int pageSize = 10;

    /**
     * 是否分页 默认分页
     */
    @ApiModelProperty(value = "是否分页 默认分页")
    protected Boolean pagination = true;

    /**
     * 排序对象
     */
    @ApiModelProperty(value = "排序列表")
    private List<OrderBy> orderByList;

    public int getCurPage() {
        return curPage;
    }

    public void setCurPage(int curPage) {
        this.curPage = curPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public Boolean getPagination() {
        return pagination;
    }

    public void setPagination(Boolean pagination) {
        this.pagination = pagination;
    }

    public List<OrderBy> getOrderByList() {
        return orderByList;
    }

    public void setOrderByList(List<OrderBy> orderByList) {
        this.orderByList = orderByList;
    }


    /**
     * 设置排序
     *
     * @param queryWrapper
     */
    @ApiModelProperty(hidden = true)
    public void setWrapperOrder(QueryWrapper<?> queryWrapper) {
        if (this.orderByList == null || this.orderByList.size() == 0) {
            return;
        }
        orderByList.forEach(orderBy -> {
            if (Direction.ASC.toString().equals(orderBy.getOrder().toUpperCase())) {
                queryWrapper.orderByAsc(orderBy.getSidx());
            } else {
                queryWrapper.orderByDesc(orderBy.getSidx());
            }
        });
    }

    /**
     * 排序对象
     */
    public static class OrderBy {

        /**
         * 排序字段
         */
        private String sidx;

        /**
         * 排序方式
         */
        private String order;

        public OrderBy() {
        }

        public OrderBy(String sidx, String order) {
            this.sidx = sidx;
            this.order = order;
        }

        public String getSidx() {
            return sidx;
        }

        public void setSidx(String sidx) {
            this.sidx = sidx;
        }

        public String getOrder() {
            return order;
        }

        public void setOrder(String order) {
            this.order = order;
        }
    }

    /**
     * 排序枚举
     */
    public static enum Direction {
        ASC, DESC;

        public static Direction fromString(String value) {
            try {
                return Direction.valueOf(value.toUpperCase(Locale.US));
            } catch (Exception e) {
                return ASC;
            }
        }
    }
}
