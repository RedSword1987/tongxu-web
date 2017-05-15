package com.tongxuweb.controller;

import com.tongxuweb.domain.create.OTaskGetdataTaobao;
import com.tongxuweb.domain.entity.MainOrders;
import com.tongxuweb.domain.generate.TaskGetdataTaobao;
import com.tongxuweb.service.TaskGetdataTaobaoOrderService;
import com.tongxuweb.service.TaskGetdataTaobaoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.ws.rs.QueryParam;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/fetchData")
public class TaobaoController {
    @Resource
    private TaskGetdataTaobaoOrderService taskGetdataTaobaoOrderService;

    @Resource
    private TaskGetdataTaobaoService taskGetdataTaobaoService;


    @RequestMapping("/getNeedTask")
    @ResponseBody
    public Map<String, Object> getNeedTask() {
        Map<String, Object> result = new HashMap<String, Object>();
        List<OTaskGetdataTaobao> tasklist=taskGetdataTaobaoService.getNeedTask();
        result.put("tasklist",tasklist);
        return result;
    }

    @RequestMapping("/finishTask")
    @ResponseBody
    public Map<String, Object> finishTask(@RequestBody TaskGetdataTaobao taskGetdataTaobao) {
        Map<String, Object> ss = new HashMap<String, Object>();
        int result=taskGetdataTaobaoService.finishTask(taskGetdataTaobao);
        ss.put("result", result);
        return ss;
    }








    @RequestMapping("/getLast")
    @ResponseBody
    public Map<String, Object> getLastDate() {
        Map<String, Object> ss = new HashMap<String, Object>();
        String lastS = "";
        Date last = taskGetdataTaobaoOrderService.getLastDate();
        if (last != null) {
            lastS = String.valueOf(last.getTime());
        }
        ss.put("lastDate", lastS);
        return ss;
    }




    @RequestMapping("/orders")
    @ResponseBody
    public Map<String, Object> save(@RequestBody MainOrders mainOrders) {
        Map<String, Object> ss = new HashMap<String, Object>();
        ss.put("count", 0);
        if (mainOrders.getBatchId() != null) {
            Integer result = taskGetdataTaobaoOrderService.saveAll(mainOrders, ss);
            ss.put("count", result);
        }
        return ss;
    }

}
