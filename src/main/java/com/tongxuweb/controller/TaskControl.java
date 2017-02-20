package com.tongxuweb.controller;

import com.tongxuweb.domain.create.OTaskGetdataTaobao;
import com.tongxuweb.domain.entity.SearchTaskBean;
import com.tongxuweb.domain.entity.SearchTaskResultBean;
import com.tongxuweb.domain.entity.common.PaginationResult;
import com.tongxuweb.domain.generate.TaskGetdataTaobao;
import com.tongxuweb.service.TaskGetdataTaobaoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by higgs on 17/2/19.
 */
@Controller
@RequestMapping("/task/taobao")
public class TaskControl {
    @Resource
    private TaskGetdataTaobaoService taskGetdataTaobaoService;


    @RequestMapping("/saveTask")
    @ResponseBody
    public TaskGetdataTaobao batch(@RequestBody OTaskGetdataTaobao taskGetdataTaobao) {
        TaskGetdataTaobao newTaskGetdataTaobao = taskGetdataTaobaoService.save(taskGetdataTaobao);
        return newTaskGetdataTaobao;
    }



    @RequestMapping("/listTask")
    @ResponseBody
    public PaginationResult listTask(HttpServletRequest request) {
        //@RequestBody
        SearchTaskBean searchTaskBean = new SearchTaskBean(request);
        PaginationResult result = taskGetdataTaobaoService.listTask(searchTaskBean);
        return result;
    }

    @RequestMapping("/listTaskResult")
    @ResponseBody
    public PaginationResult listTaskResult(HttpServletRequest request) {
        //@RequestBody
        SearchTaskResultBean searchTaskResultBean = new SearchTaskResultBean(request);
        PaginationResult result = taskGetdataTaobaoService.listTaskResult(searchTaskResultBean);
        return result;
    }
}
