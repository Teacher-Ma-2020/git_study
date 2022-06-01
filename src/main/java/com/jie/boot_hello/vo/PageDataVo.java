/*
 * Copyright (C) 1997-2020 康成投资（中国）有限公司
 *
 * http://www.rt-mart.com
 *
 * 版权归本公司所有，不得私自使用、拷贝、修改、删除，否则视为侵权
 */

package com.jie.boot_hello.vo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @ClassName PageDataVo
 * @Author wangji
 * @Date 2020/8/14
 * @Description: 分页返回结果基类
 **/
public class PageDataVo<T> implements java.io.Serializable {

    private static final long serialVersionUID = 5963296206352853822L;

    /**
     * 一页显示记录数 (pageSize = Integer.MAX_VALUE时，查全部记录）
     */
    @ApiModelProperty(value = "一页显示记录数")
    private Integer pageSize = 10;

    /**
     * 当前页
     */
    @ApiModelProperty(value = "当前页数")
    private Integer curPage = 1;

    /**
     * 总页数
     */
    @ApiModelProperty(value = "总页数")
    private Integer totalPage = 0;

    /**
     * 总条数
     */
    @ApiModelProperty(value = "总条数")
    private Integer totalRows = 0;

    /**
     * 当前页数据
     */
    @ApiModelProperty(value = "当前页数据")
    private List<T> dataList;

    /**
     * 无参构造
     */
    public PageDataVo() {

    }

    /**
     * 分页数据结果构造
     *
     * @param pageConditionModel
     * @param iPage
     */
    public PageDataVo(PageConditionVo pageConditionModel, IPage<T> iPage) {
        this.pageSize = pageConditionModel.getPageSize();
        this.curPage = pageConditionModel.getCurPage();
        this.totalRows = (int) iPage.getTotal();
        this.dataList = iPage.getRecords();
        this.totalPage = totalRows > 0 ? (totalRows.intValue() - 1) / this.pageSize + 1 : 0;
    }

    /**
     * 分页构造函数
     *
     * @param pageConditionModel
     * @param totalRows
     * @param dataList
     */
    public PageDataVo(PageConditionVo pageConditionModel, Long totalRows, List<T> dataList) {
        this.pageSize = pageConditionModel.getPageSize();
        this.curPage = pageConditionModel.getCurPage();
        this.totalRows = totalRows.intValue();
        this.totalPage = totalRows > 0 ? (totalRows.intValue() - 1) / this.pageSize + 1 : 0;
        this.dataList = dataList;
    }


    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCurPage() {
        return curPage;
    }

    public void setCurPage(Integer curPage) {
        this.curPage = curPage;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(Integer totalRows) {
        this.totalRows = totalRows;
    }

    public List<T> getDataList() {
        return dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }
}
