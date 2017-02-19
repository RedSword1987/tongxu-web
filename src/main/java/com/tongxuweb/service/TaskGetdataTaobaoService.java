package com.tongxuweb.service;

import com.tongxuweb.domain.create.OTaskGetdataTaobao;
import com.tongxuweb.domain.entity.SearchTaskBean;
import com.tongxuweb.domain.entity.common.PaginationResult;
import com.tongxuweb.domain.generate.TaskGetdataTaobao;

import java.util.Date;
import java.util.List;

/**
 * Created by higgs on 17/2/14.
 */
public interface TaskGetdataTaobaoService {
    TaskGetdataTaobao save(OTaskGetdataTaobao taskGetdataTaobao);

    List<OTaskGetdataTaobao> getNeedTask();


    int finishTask(TaskGetdataTaobao taskGetdataTaobao);

    PaginationResult listTask(SearchTaskBean searchTaskBean);
}
