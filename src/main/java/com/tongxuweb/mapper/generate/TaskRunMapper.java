package com.tongxuweb.mapper.generate;

import com.tongxuweb.domain.generate.TaskRun;
import com.tongxuweb.domain.generate.TaskRunExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskRunMapper {
    int countByExample(TaskRunExample example);

    int deleteByExample(TaskRunExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(TaskRun record);

    List<TaskRun> selectByExample(TaskRunExample example);

    TaskRun selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TaskRun record, @Param("example") TaskRunExample example);

    int updateByPrimaryKeySelective(TaskRun record);
}