package com.tongxuweb.mapper.generate;

import com.tongxuweb.domain.generate.PMenu;
import com.tongxuweb.domain.generate.PMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PMenuMapper {
    int countByExample(PMenuExample example);

    int deleteByExample(PMenuExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(PMenu record);

    List<PMenu> selectByExample(PMenuExample example);

    PMenu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PMenu record, @Param("example") PMenuExample example);

    int updateByPrimaryKeySelective(PMenu record);
}