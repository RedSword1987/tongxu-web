package com.tongxuweb.service;

import com.tongxuweb.domain.create.DTaskRun;
import com.tongxuweb.domain.entity.common.Pagination;
import com.tongxuweb.domain.entity.common.PaginationResult;

import java.util.List;

/**
 * Created by higgs on 17/5/8.
 */
public interface TaskTypeService {

    PaginationResult taskTypePage(Pagination pagination);

    List<DTaskRun> listTaskRun(Pagination pagination, String code, Integer status);

    PaginationResult taskRunPage(Pagination pagination, String code);

    void taskRunDelete(List<Long> ids);

    void taskRunAdd(DTaskRun taskRun);

    void taskRunUpdate(DTaskRun taskRun);

}
