package com.jie.boot_hello.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jie.boot_hello.entity.RtBoxVehicleEdit;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName RtBoxVehicleEditMapper
 * @Author zhouchengjie
 * @Date 2022/5/13 10:22
 * @Description: 
 **/
@Mapper
public interface RtBoxVehicleEditMapper extends BaseMapper<RtBoxVehicleEdit> {
    int deleteByPrimaryKey(Long id);

    int insert(RtBoxVehicleEdit record);

    int insertSelective(RtBoxVehicleEdit record);

    RtBoxVehicleEdit selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RtBoxVehicleEdit record);

    int updateByPrimaryKey(RtBoxVehicleEdit record);
}