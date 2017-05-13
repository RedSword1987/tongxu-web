package com.tongxuweb.controller;

import com.tongxuweb.domain.entity.SearchTaskBean;
import com.tongxuweb.domain.entity.common.Pagination;
import com.tongxuweb.domain.entity.common.PaginationResult;
import com.tongxuweb.service.TaskTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by higgs on 17/2/19.
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
        PaginationResult result = taskTypeService.taskRunPage(pagination,code);
        return result;
    }


}
