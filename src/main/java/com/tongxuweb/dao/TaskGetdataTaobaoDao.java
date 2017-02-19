package com.tongxuweb.dao;

import com.tongxuweb.domain.create.OTaskGetdataTaobao;
import com.tongxuweb.domain.entity.SearchTaskBean;
import com.tongxuweb.domain.generate.TaskGetdataTaobao;
import com.tongxuweb.mapper.generate.TaskGetdataTaobaoMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by higgs on 17/2/13.
 */
public interface TaskGetdataTaobaoDao extends TaskGetdataTaobaoMapper {
    List<OTaskGetdataTaobao> listNeedTask();

    List<String> getOrderids(@Param("taskId") Long taskId);

    List<TaskGetdataTaobao> listTask(SearchTaskBean searchTaskBean);

    Integer countTask(SearchTaskBean searchTaskBean);
}
