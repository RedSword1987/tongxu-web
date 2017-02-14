package com.tongxuweb.mapper.generate;

import com.tongxuweb.domain.generate.PLogTable;
import com.tongxuweb.domain.generate.PLogTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PLogTableMapper {
    int countByExample(PLogTableExample example);

    int deleteByExample(PLogTableExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(PLogTable record);

    List<PLogTable> selectByExample(PLogTableExample example);

    PLogTable selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PLogTable record, @Param("example") PLogTableExample example);

    int updateByPrimaryKeySelective(PLogTable record);
}