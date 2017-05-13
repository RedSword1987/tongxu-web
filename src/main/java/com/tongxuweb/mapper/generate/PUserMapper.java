package com.tongxuweb.mapper.generate;

import com.tongxuweb.domain.generate.PUser;
import com.tongxuweb.domain.generate.PUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PUserMapper {
    int countByExample(PUserExample example);

    int deleteByExample(PUserExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(PUser record);

    List<PUser> selectByExample(PUserExample example);

    PUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PUser record, @Param("example") PUserExample example);

    int updateByPrimaryKeySelective(PUser record);
}