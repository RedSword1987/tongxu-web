package com.tongxuweb.mapper.generate;

import com.tongxuweb.domain.generate.PMsgBatch;
import com.tongxuweb.domain.generate.PMsgBatchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PMsgBatchMapper {
    int countByExample(PMsgBatchExample example);

    int deleteByExample(PMsgBatchExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(PMsgBatch record);

    List<PMsgBatch> selectByExampleWithBLOBs(PMsgBatchExample example);

    List<PMsgBatch> selectByExample(PMsgBatchExample example);

    PMsgBatch selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PMsgBatch record, @Param("example") PMsgBatchExample example);

    int updateByPrimaryKeySelective(PMsgBatch record);
}