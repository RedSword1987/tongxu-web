package com.tongxuweb.mapper.generate;

import com.tongxuweb.domain.generate.PLogOperate;
import com.tongxuweb.domain.generate.PLogOperateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PLogOperateMapper {
    int countByExample(PLogOperateExample example);

    int deleteByExample(PLogOperateExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(PLogOperate record);

    List<PLogOperate> selectByExample(PLogOperateExample example);

    PLogOperate selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PLogOperate record, @Param("example") PLogOperateExample example);

    int updateByPrimaryKeySelective(PLogOperate record);
}