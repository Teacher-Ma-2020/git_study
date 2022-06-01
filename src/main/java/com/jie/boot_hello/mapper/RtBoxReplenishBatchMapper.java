package com.jie.boot_hello.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jie.boot_hello.entity.RtBoxReplenishBatch;
import com.jie.boot_hello.vo.queryDataVo.ReplenishBatchVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName RtBoxReplenishBatchMapper
 * @Author zhouchengjie
 * @Date 2022/5/13 10:22
 * @Description: 
 **/
@Mapper
public interface RtBoxReplenishBatchMapper extends BaseMapper<RtBoxReplenishBatch> {
    int deleteByPrimaryKey(Long id);

    int insert(RtBoxReplenishBatch record);

    int insertSelective(RtBoxReplenishBatch record);

    RtBoxReplenishBatch selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RtBoxReplenishBatch record);

    int updateByPrimaryKey(RtBoxReplenishBatch record);

    List<RtBoxReplenishBatch> selectBatchListByVo(ReplenishBatchVo replenishBatchVo);
}