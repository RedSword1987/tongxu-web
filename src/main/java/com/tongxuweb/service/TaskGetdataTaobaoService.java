package com.tongxuweb.service;

import com.tongxuweb.domain.create.OTaskGetdataTaobao;
import com.tongxuweb.domain.entity.SearchTaskBean;
import com.tongxuweb.domain.entity.SearchTaskResultBean;
import com.tongxuweb.domain.entity.common.PaginationResult;
import com.tongxuweb.domain.generate.TaskGetdataTaobao;

import java.util.List;
import java.util.Map;

/**
 */
public interface TaskGetdataTaobaoService {


    TaskGetdataTaobao getOne(Long id);

    TaskGetdataTaobao save(OTaskGetdataTaobao taskGetdataTaobao);

    List<OTaskGetdataTaobao> getNeedTask();


    int finishTask(TaskGetdataTaobao taskGetdataTaobao);

    PaginationResult listTask(SearchTaskBean searchTaskBean);

    PaginationResult listTaskResult(SearchTaskResultBean searchTaskResultBean);

    List<Map<String,Object>> listTaskResultMap(SearchTaskResultBean searchTaskResultBean);

    boolean updateTaskuStatus(String ids, Integer status);


    void update(TaskGetdataTaobao taskGetdataTaobao);
}
