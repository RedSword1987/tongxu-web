package com.tongxuweb.mapper.generate;

import com.tongxuweb.domain.generate.PResource;
import com.tongxuweb.domain.generate.PResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PResourceMapper {
    int countByExample(PResourceExample example);

    int deleteByExample(PResourceExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(PResource record);

    List<PResource> selectByExample(PResourceExample example);

    PResource selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PResource record, @Param("example") PResourceExample example);

    int updateByPrimaryKeySelective(PResource record);
}