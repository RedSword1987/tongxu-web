package com.tongxuweb.mapper.generate;

import com.tongxuweb.domain.generate.PUserRole;
import com.tongxuweb.domain.generate.PUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PUserRoleMapper {
    int countByExample(PUserRoleExample example);

    int deleteByExample(PUserRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(PUserRole record);

    List<PUserRole> selectByExample(PUserRoleExample example);

    PUserRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PUserRole record, @Param("example") PUserRoleExample example);

    int updateByPrimaryKeySelective(PUserRole record);
}