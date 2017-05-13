package com.tongxuweb.mapper.generate;

import com.tongxuweb.domain.generate.TaskRunParam;
import com.tongxuweb.domain.generate.TaskRunParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskRunParamMapper {
    int countByExample(TaskRunParamExample example);

    int deleteByExample(TaskRunParamExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(TaskRunParam record);

    List<TaskRunParam> selectByExampleWithBLOBs(TaskRunParamExample example);

    List<TaskRunParam> selectByExample(TaskRunParamExample example);

    TaskRunParam selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TaskRunParam record, @Param("example") TaskRunParamExample example);

    int updateByPrimaryKeySelective(TaskRunParam record);
}