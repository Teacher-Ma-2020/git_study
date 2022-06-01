package com.jie.boot_hello.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jie.boot_hello.entity.RtBoxDelivery;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName RtBoxDeliveryMapper
 * @Author zhouchengjie
 * @Date 2022/5/15 22:26
 * @Description: 
 **/
@Mapper
public interface RtBoxDeliveryMapper extends BaseMapper<RtBoxDelivery> {
    int deleteByPrimaryKey(Long id);

    int insert(RtBoxDelivery record);

    int insertSelective(RtBoxDelivery record);

    RtBoxDelivery selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RtBoxDelivery record);

    int updateByPrimaryKey(RtBoxDelivery record);
}