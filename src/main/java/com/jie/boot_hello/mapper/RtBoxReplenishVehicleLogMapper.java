package com.jie.boot_hello.mapper;

import com.jie.boot_hello.entity.RtBoxReplenishVehicleLog;

/**
 * @ClassName RtBoxReplenishVehicleLogMapper
 * @Author zhouchengjie
 * @Date 2022/5/13 10:22
 * @Description: 
 **/
public interface RtBoxReplenishVehicleLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RtBoxReplenishVehicleLog record);

    int insertSelective(RtBoxReplenishVehicleLog record);

    RtBoxReplenishVehicleLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RtBoxReplenishVehicleLog record);

    int updateByPrimaryKey(RtBoxReplenishVehicleLog record);
}