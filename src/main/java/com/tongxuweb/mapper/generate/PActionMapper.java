package com.tongxuweb.mapper.generate;

import com.tongxuweb.domain.generate.PAction;
import com.tongxuweb.domain.generate.PActionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PActionMapper {
    int countByExample(PActionExample example);

    int deleteByExample(PActionExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(PAction record);

    List<PAction> selectByExample(PActionExample example);

    PAction selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PAction record, @Param("example") PActionExample example);

    int updateByPrimaryKeySelective(PAction record);
}