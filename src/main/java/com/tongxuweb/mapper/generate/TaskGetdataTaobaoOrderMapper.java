package com.tongxuweb.mapper.generate;

import com.tongxuweb.domain.generate.TaskGetdataTaobaoOrder;
import com.tongxuweb.domain.generate.TaskGetdataTaobaoOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskGetdataTaobaoOrderMapper {
    int countByExample(TaskGetdataTaobaoOrderExample example);

    int deleteByExample(TaskGetdataTaobaoOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(TaskGetdataTaobaoOrder record);

    List<TaskGetdataTaobaoOrder> selectByExampleWithBLOBs(TaskGetdataTaobaoOrderExample example);

    List<TaskGetdataTaobaoOrder> selectByExample(TaskGetdataTaobaoOrderExample example);

    TaskGetdataTaobaoOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TaskGetdataTaobaoOrder record, @Param("example") TaskGetdataTaobaoOrderExample example);

    int updateByPrimaryKeySelective(TaskGetdataTaobaoOrder record);
}