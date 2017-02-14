package com.tongxuweb.mapper.generate;

import com.tongxuweb.domain.generate.TaskGetdataTaobao;
import com.tongxuweb.domain.generate.TaskGetdataTaobaoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskGetdataTaobaoMapper {
    int countByExample(TaskGetdataTaobaoExample example);

    int deleteByExample(TaskGetdataTaobaoExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(TaskGetdataTaobao record);

    List<TaskGetdataTaobao> selectByExample(TaskGetdataTaobaoExample example);

    TaskGetdataTaobao selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TaskGetdataTaobao record, @Param("example") TaskGetdataTaobaoExample example);

    int updateByPrimaryKeySelective(TaskGetdataTaobao record);
}