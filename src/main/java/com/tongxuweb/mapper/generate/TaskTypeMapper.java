package com.tongxuweb.mapper.generate;

import com.tongxuweb.domain.generate.TaskType;
import com.tongxuweb.domain.generate.TaskTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskTypeMapper {
    int countByExample(TaskTypeExample example);

    int deleteByExample(TaskTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(TaskType record);

    List<TaskType> selectByExample(TaskTypeExample example);

    TaskType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TaskType record, @Param("example") TaskTypeExample example);

    int updateByPrimaryKeySelective(TaskType record);
}