package com.tongxuweb.mapper.generate;

import com.tongxuweb.domain.generate.PPermission;
import com.tongxuweb.domain.generate.PPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PPermissionMapper {
    int countByExample(PPermissionExample example);

    int deleteByExample(PPermissionExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(PPermission record);

    List<PPermission> selectByExample(PPermissionExample example);

    PPermission selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PPermission record, @Param("example") PPermissionExample example);

    int updateByPrimaryKeySelective(PPermission record);
}