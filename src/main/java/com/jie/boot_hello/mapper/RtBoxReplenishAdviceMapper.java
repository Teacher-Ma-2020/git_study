package com.jie.boot_hello.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jie.boot_hello.entity.RtBoxReplenishAdvice;
import com.jie.boot_hello.entity.RtBoxReplenishBatch;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName RtBoxReplenishAdviceMapper
 * @Author zhouchengjie
 * @Date 2022/5/13 10:22
 * @Description: 
 **/
@Mapper
public interface RtBoxReplenishAdviceMapper extends BaseMapper<RtBoxReplenishAdvice> {
    int deleteByPrimaryKey(Long id);

    int insert(RtBoxReplenishAdvice record);

    int insertSelective(RtBoxReplenishAdvice record);

    RtBoxReplenishAdvice selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RtBoxReplenishAdvice record);

    int updateByPrimaryKey(RtBoxReplenishAdvice record);
}