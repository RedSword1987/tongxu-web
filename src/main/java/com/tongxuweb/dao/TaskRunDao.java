package com.tongxuweb.dao;

import com.tongxuweb.mapper.generate.TaskRunMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * Created by   on 17/5/8.
 */
public interface TaskRunDao extends TaskRunMapper {
    @Update("update task_run set begin_date=null,end_date = null where id=#{id}")
    void clearBeginAndEndDate(@Param("id") Long id);
}
