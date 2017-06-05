package com.tongxuweb.controller;

import com.tongxuweb.domain.create.DTaskRun;
import com.tongxuweb.domain.entity.MainOrders;
import com.tongxuweb.domain.entity.common.Pagination;
import com.tongxuweb.domain.generate.TaskRun;
import com.tongxuweb.service.TaskTypeService;
import com.tongxuweb.service.interceptor.OutSideService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by higgs on 17/2/19.
 */
@Controller
@RequestMapping("/outSide")
public class OutSideControl {

    @Resource
    private OutSideService outSideService;

    @Resource
    private TaskTypeService taskTypeService;


    @RequestMapping("/getNeedTask")
    @ResponseBody
    public Map<String, Object> getNeedTask() {
        Map<String, Object> result = new HashMap<String, Object>();
        Pagination pagination = new Pagination();
        pagination.setOffset(0);
        pagination.setLimit(1);
        List<DTaskRun> tasklist = taskTypeService.listTaskRun(pagination, null, 1);
//        List<TaskRunExtend> tasklist = outSideService.getNeedTask();
        result.put("tasklist", tasklist);
        return result;
    }

    @RequestMapping("/taskRunStatus")
    @ResponseBody
    public Map<String, Object> taskRunStatus(@RequestBody TaskRun taskRun) {
        Map<String, Object> ss = new HashMap<String, Object>();
        if (taskRun.getStatus() != null) {
            if (taskRun.getStatus() == 4) {
                taskRun.setBeginDate(new Date());
            } else if (taskRun.getStatus() == 2) {
                taskRun.setEndDate(new Date());
            }
        }
        int result = outSideService.taskRunStatus(taskRun);
        ss.put("result", result);
        return ss;
    }


    @RequestMapping("/saveOrders")
    @ResponseBody
    public Map<String, Object> save(@RequestBody MainOrders mainOrders) {
        Map<String, Object> ss = new HashMap<String, Object>();
        ss.put("count", 0);
        if (mainOrders.getBatchId() != null) {
            Integer result = outSideService.saveOrders(mainOrders, ss);
            ss.put("count", result);
        }
        return ss;
    }
}
