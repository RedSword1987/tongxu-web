package com.tongxuweb.controller;

import com.tongxuweb.domain.create.OTaskGetdataTaobao;
import com.tongxuweb.domain.entity.SearchTaskBean;
import com.tongxuweb.domain.entity.common.PaginationResult;
import com.tongxuweb.domain.generate.TaskGetdataTaobao;
import com.tongxuweb.service.TaskGetdataTaobaoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

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
    public PaginationResult listTask(@RequestBody SearchTaskBean searchTaskBean) {
        PaginationResult result = taskGetdataTaobaoService.listTask(searchTaskBean);
        return result;
    }
}
