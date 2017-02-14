package com.tongxuweb.mapper.generate;

import com.tongxuweb.domain.generate.PPermissionAction;
import com.tongxuweb.domain.generate.PPermissionActionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PPermissionActionMapper {
    int countByExample(PPermissionActionExample example);

    int deleteByExample(PPermissionActionExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(PPermissionAction record);

    List<PPermissionAction> selectByExample(PPermissionActionExample example);

    PPermissionAction selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PPermissionAction record, @Param("example") PPermissionActionExample example);

    int updateByPrimaryKeySelective(PPermissionAction record);
}