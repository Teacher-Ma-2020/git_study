package com.jie.boot_hello.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jie.boot_hello.entity.RtBoxReplenishVehicle;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName RtBoxReplenishVehicleMapper
 * @Author zhouchengjie
 * @Date 2022/5/13 10:22
 * @Description: 
 **/
@Mapper
public interface RtBoxReplenishVehicleMapper extends BaseMapper<RtBoxReplenishVehicle> {
    int deleteByPrimaryKey(Long id);

    int insert(RtBoxReplenishVehicle record);

    int insertSelective(RtBoxReplenishVehicle record);

    RtBoxReplenishVehicle selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RtBoxReplenishVehicle record);

    int updateByPrimaryKey(RtBoxReplenishVehicle record);
}