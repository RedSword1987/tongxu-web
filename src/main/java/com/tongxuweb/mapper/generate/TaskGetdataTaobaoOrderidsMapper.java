package com.tongxuweb.mapper.generate;

import com.tongxuweb.domain.generate.TaskGetdataTaobaoOrderids;
import com.tongxuweb.domain.generate.TaskGetdataTaobaoOrderidsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskGetdataTaobaoOrderidsMapper {
    int countByExample(TaskGetdataTaobaoOrderidsExample example);

    int deleteByExample(TaskGetdataTaobaoOrderidsExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(TaskGetdataTaobaoOrderids record);

    List<TaskGetdataTaobaoOrderids> selectByExample(TaskGetdataTaobaoOrderidsExample example);

    TaskGetdataTaobaoOrderids selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TaskGetdataTaobaoOrderids record, @Param("example") TaskGetdataTaobaoOrderidsExample example);

    int updateByPrimaryKeySelective(TaskGetdataTaobaoOrderids record);
}