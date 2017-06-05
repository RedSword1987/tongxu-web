package com.tongxuweb.controller;

import com.tongxuweb.domain.create.DTaskRun;
import com.tongxuweb.domain.entity.common.Pagination;
import com.tongxuweb.domain.entity.common.PaginationResult;
import com.tongxuweb.service.TaskTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 */
@Controller
@RequestMapping("/taskType")
public class TaskTypeControl{
    @Resource
    private TaskTypeService taskTypeService;



    @RequestMapping("/taskTypePage")
    @ResponseBody
    public PaginationResult taskTypePage(HttpServletRequest request) {
        Pagination pagination=new Pagination(request);
        PaginationResult result = taskTypeService.taskTypePage(pagination);
        return result;
    }

    @RequestMapping("/taskRunPage")
    @ResponseBody
    public PaginationResult taskRunPage(HttpServletRequest request) {
        String code=request.getParameter("code");
        Pagination pagination=new Pagination(request);
        PaginationResult result = taskTypeService.taskRunPage(pagination, code);
        return result;
    }


    @RequestMapping("/taskRunAdd")
    @ResponseBody
    public DTaskRun taskRunAdd(@RequestBody DTaskRun taskRun) {
        taskTypeService.taskRunAdd(taskRun);
        return taskRun;
    }

    @RequestMapping("/taskRunUpdate")
    @ResponseBody
    public Map<String, Object> taskRunUpdate(@RequestBody DTaskRun taskRun) {
        taskTypeService.taskRunUpdate(taskRun);
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("result", true);
        result.put("msg", "成功");
        return result;
    }

    @RequestMapping("/taskRunDelete")
    @ResponseBody
    public Map<String, Object> taskRunDelete(@RequestBody List<Long> ids, HttpServletRequest request) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("result", true);
        result.put("msg", "成功");
        taskTypeService.taskRunDelete(ids);
        return result;
    }


    @RequestMapping("/taskRunWuliuResultPage")
    @ResponseBody
    public PaginationResult taskRunWuliuResultPage(@RequestParam Long id, HttpServletRequest request) {
        Pagination pagination = new Pagination(request);
        PaginationResult result = taskTypeService.taskRunWuliuResultPage(pagination, id);
        return result;
    }



}
