package com.jie.boot_hello.mapper;

import com.jie.boot_hello.entity.RtBoxReplenishBill;

/**
 * @ClassName RtBoxReplenishBillMapper
 * @Author zhouchengjie
 * @Date 2022/5/13 10:22
 * @Description: 
 **/
public interface RtBoxReplenishBillMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RtBoxReplenishBill record);

    int insertSelective(RtBoxReplenishBill record);

    RtBoxReplenishBill selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RtBoxReplenishBill record);

    int updateByPrimaryKey(RtBoxReplenishBill record);
}