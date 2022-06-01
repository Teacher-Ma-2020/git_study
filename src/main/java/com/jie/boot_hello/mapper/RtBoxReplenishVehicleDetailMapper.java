package com.jie.boot_hello.mapper;

import com.jie.boot_hello.entity.RtBoxReplenishVehicleDetail;

/**
 * @ClassName RtBoxReplenishVehicleDetailMapper
 * @Author zhouchengjie
 * @Date 2022/5/13 10:22
 * @Description: 
 **/
public interface RtBoxReplenishVehicleDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RtBoxReplenishVehicleDetail record);

    int insertSelective(RtBoxReplenishVehicleDetail record);

    RtBoxReplenishVehicleDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RtBoxReplenishVehicleDetail record);

    int updateByPrimaryKey(RtBoxReplenishVehicleDetail record);
}