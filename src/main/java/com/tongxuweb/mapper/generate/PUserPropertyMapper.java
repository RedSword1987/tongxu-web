package com.tongxuweb.mapper.generate;

import com.tongxuweb.domain.generate.PUserProperty;
import com.tongxuweb.domain.generate.PUserPropertyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PUserPropertyMapper {
    int countByExample(PUserPropertyExample example);

    int deleteByExample(PUserPropertyExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(PUserProperty record);

    List<PUserProperty> selectByExample(PUserPropertyExample example);

    PUserProperty selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PUserProperty record, @Param("example") PUserPropertyExample example);

    int updateByPrimaryKeySelective(PUserProperty record);
}