package com.jie.boot_hello.mapper;

import com.jie.boot_hello.entity.RtBoxReplenish;

/**
 * @ClassName RtBoxReplenishMapper
 * @Author zhouchengjie
 * @Date 2022/5/13 10:22
 * @Description: 
 **/
public interface RtBoxReplenishMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RtBoxReplenish record);

    int insertSelective(RtBoxReplenish record);

    RtBoxReplenish selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RtBoxReplenish record);

    int updateByPrimaryKey(RtBoxReplenish record);
}