package com.tongxuweb.controller;

import com.tongxuweb.domain.create.OTaskGetdataTaobao;
import com.tongxuweb.domain.entity.SearchTaskBean;
import com.tongxuweb.domain.entity.SearchTaskResultBean;
import com.tongxuweb.domain.entity.common.PaginationResult;
import com.tongxuweb.domain.generate.TaskGetdataTaobao;
import com.tongxuweb.service.TaskGetdataTaobaoService;
import com.tongxuweb.util.JsonUtil;
import com.tongxuweb.util.StringUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.QueryParam;
import java.util.HashMap;
import java.util.Map;

/**
 */
@Controller
@RequestMapping("/task/taobao")
public class TaskControl {
    @Resource
    private TaskGetdataTaobaoService taskGetdataTaobaoService;


    @RequestMapping("/saveTask")
    @ResponseBody
    public TaskGetdataTaobao saveTask(@RequestBody OTaskGetdataTaobao taskGetdataTaobao) {
        taskGetdataTaobao.init();
        TaskGetdataTaobao newTaskGetdataTaobao = taskGetdataTaobaoService.save(taskGetdataTaobao);

        return newTaskGetdataTaobao;
    }

    @RequestMapping("/updateTaskuStatus")
    @ResponseBody
    public Map<String, Object> updateTaskuStatus(@QueryParam("status") Integer status, HttpServletRequest request) {
        Map<String, Object> result = new HashMap<String, Object>();
        String ids = request.getParameter("ids");
        boolean result1 = taskGetdataTaobaoService.updateTaskuStatus(ids, status);
        result.put("result", 1);
        return result;
    }

    @RequestMapping("/updateTaskName")
    @ResponseBody
    public Map<String, Object> updateTaskName(@QueryParam("id") Long id, HttpServletRequest request) {
        Map<String, Object> result = new HashMap<String, Object>();
        String needUpdateFields = request.getParameter("needUpdateFields");
        if (!StringUtil.isEmpty(needUpdateFields)) {
            Map<String, Object> updateFieldsMap = JsonUtil.fromJson(needUpdateFields, JsonUtil.MapString_type);
            if (updateFieldsMap != null) {
                String taskName = String.valueOf(updateFieldsMap.get("taskName"));
                if (!StringUtil.isEmpty(taskName) && id != null) {
                    TaskGetdataTaobao taskGetdataTaobao = new TaskGetdataTaobao();
                    taskGetdataTaobao.setId(id);
                    taskGetdataTaobao.setTaskName(taskName);
                    taskGetdataTaobaoService.update(taskGetdataTaobao);
                }
            }
        }

        result.put("result", true);
        result.put("msg", "成功");
        return result;
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
        SearchTaskResultBean searchTaskResultBean = new SearchTaskResultBean(request);
        PaginationResult result = taskGetdataTaobaoService.listTaskResult(searchTaskResultBean);
        return result;
    }
}
