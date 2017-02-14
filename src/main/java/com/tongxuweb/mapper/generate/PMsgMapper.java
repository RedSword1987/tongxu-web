package com.tongxuweb.mapper.generate;

import com.tongxuweb.domain.generate.PMsg;
import com.tongxuweb.domain.generate.PMsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PMsgMapper {
    int countByExample(PMsgExample example);

    int deleteByExample(PMsgExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(PMsg record);

    List<PMsg> selectByExampleWithBLOBs(PMsgExample example);

    List<PMsg> selectByExample(PMsgExample example);

    PMsg selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PMsg record, @Param("example") PMsgExample example);

    int updateByPrimaryKeySelective(PMsg record);
}