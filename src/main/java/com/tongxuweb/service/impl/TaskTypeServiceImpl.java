package com.tongxuweb.service.impl;

import com.tongxuweb.dao.TaskRunDao;
import com.tongxuweb.dao.TaskTypeDao;
import com.tongxuweb.domain.entity.common.Pagination;
import com.tongxuweb.domain.entity.common.PaginationResult;
import com.tongxuweb.domain.generate.TaskRun;
import com.tongxuweb.domain.generate.TaskRunExample;
import com.tongxuweb.domain.generate.TaskType;
import com.tongxuweb.domain.generate.TaskTypeExample;
import com.tongxuweb.service.TaskTypeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by higgs on 17/5/11.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TaskTypeServiceImpl implements TaskTypeService {

    @Resource
    private TaskTypeDao taskTypeDao;

    @Resource
    private TaskRunDao taskRunDao;


    public PaginationResult taskTypePage(Pagination pagination) {
        PaginationResult result = new PaginationResult();
        TaskTypeExample ex = new TaskTypeExample();
        ex.setOrderByClause("id asc limit " + pagination.getOffset() + "," + pagination.getLimit());
        List<TaskType> re = taskTypeDao.selectByExample(ex);

        Integer count = taskTypeDao.countByExample(new TaskTypeExample());
        pagination.setTotal(count);


        result.setPagination(pagination);
        result.setRows(re);
        return result;
    }

    public PaginationResult taskRunPage(Pagination pagination, String code) {
        PaginationResult result = new PaginationResult();
        TaskRunExample ex = new TaskRunExample();
        ex.createCriteria().andCodeEqualTo(code);
        ex.setOrderByClause("id asc limit " + pagination.getOffset() + "," + pagination.getLimit());
        List<TaskRun> re = taskRunDao.selectByExample(ex);

        Integer count = taskRunDao.countByExample(ex);
        pagination.setTotal(count);


        result.setPagination(pagination);
        result.setRows(re);
        return result;
    }
}
