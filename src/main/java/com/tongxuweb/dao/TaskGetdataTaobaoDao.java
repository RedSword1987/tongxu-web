package com.tongxuweb.dao;

import com.tongxuweb.domain.create.OTaskGetdataTaobao;
import com.tongxuweb.domain.entity.SearchTaskBean;
import com.tongxuweb.domain.entity.SearchTaskResultBean;
import com.tongxuweb.domain.generate.TaskGetdataTaobao;
import com.tongxuweb.domain.generate.TaskGetdataTaobaoOrder;
import com.tongxuweb.mapper.generate.TaskGetdataTaobaoMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

/**
 * Created by higgs on 17/2/13.
 */
public interface TaskGetdataTaobaoDao extends TaskGetdataTaobaoMapper {
    List<OTaskGetdataTaobao> listNeedTask();

    List<String> getOrderids(@Param("taskId") Long taskId);

    List<TaskGetdataTaobao> listTask(SearchTaskBean searchTaskBean);

    Integer countTask(SearchTaskBean searchTaskBean);

    List<TaskGetdataTaobaoOrder> listTaskResult1(SearchTaskResultBean searchTaskResultBean);

    Integer countTaskResult1(SearchTaskResultBean searchTaskResultBean);

    List<TaskGetdataTaobaoOrder> listTaskResult2(SearchTaskResultBean searchTaskResultBean);

    Integer countTaskResult2(SearchTaskResultBean searchTaskResultBean);


    List<Map<String, Object>> listTaskResult1Map(SearchTaskResultBean searchTaskResultBean);

    List<Map<String, Object>> listTaskResult2Map(SearchTaskResultBean searchTaskResultBean);

    List<TaskGetdataTaobao> list(RowBounds rowBounds);
}
