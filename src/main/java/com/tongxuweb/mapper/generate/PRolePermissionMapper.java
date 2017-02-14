package com.tongxuweb.mapper.generate;

import com.tongxuweb.domain.generate.PRolePermission;
import com.tongxuweb.domain.generate.PRolePermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PRolePermissionMapper {
    int countByExample(PRolePermissionExample example);

    int deleteByExample(PRolePermissionExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(PRolePermission record);

    List<PRolePermission> selectByExample(PRolePermissionExample example);

    PRolePermission selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PRolePermission record, @Param("example") PRolePermissionExample example);

    int updateByPrimaryKeySelective(PRolePermission record);
}