package com.tongxuweb.mapper.generate;

import com.tongxuweb.domain.generate.PRole;
import com.tongxuweb.domain.generate.PRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PRoleMapper {
    int countByExample(PRoleExample example);

    int deleteByExample(PRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(PRole record);

    List<PRole> selectByExample(PRoleExample example);

    PRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PRole record, @Param("example") PRoleExample example);

    int updateByPrimaryKeySelective(PRole record);
}