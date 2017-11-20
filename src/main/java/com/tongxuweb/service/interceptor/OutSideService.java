package com.tongxuweb.service.interceptor;

import com.tongxuweb.domain.create.TaskRunExtend;
import com.tongxuweb.domain.entity.MainOrders;
import com.tongxuweb.domain.generate.ActivityPayNotify;
import com.tongxuweb.domain.generate.TaskRun;

import java.util.List;
import java.util.Map;

/**
 */
public interface OutSideService {
    Integer saveOrders(MainOrders mainOrders, Map<String, Object> ss);

    List<TaskRunExtend> getNeedTask();

    int taskRunStatus(TaskRun taskRun);

    ActivityPayNotify save(ActivityPayNotify activityPayNotify);

}
