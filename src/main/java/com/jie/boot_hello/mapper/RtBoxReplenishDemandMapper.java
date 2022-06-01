package com.jie.boot_hello.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jie.boot_hello.entity.RtBoxReplenishDemand;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName RtBoxReplenishDemandMapper
 * @Author zhouchengjie
 * @Date 2022/5/13 10:22
 * @Description: 
 **/
@Mapper
public interface RtBoxReplenishDemandMapper extends BaseMapper<RtBoxReplenishDemand> {
    int deleteByPrimaryKey(Long id);

    int insert(RtBoxReplenishDemand record);

    int insertSelective(RtBoxReplenishDemand record);

    RtBoxReplenishDemand selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RtBoxReplenishDemand record);

    int updateByPrimaryKey(RtBoxReplenishDemand record);
}