package com.tongxuweb.controller;

import com.tongxuweb.domain.entity.MainOrders;
import com.tongxuweb.domain.generate.TaskGetdataTaobao;
import com.tongxuweb.service.TaskGetdataTaobaoOrderService;
import com.tongxuweb.service.TaskGetdataTaobaoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/fetchData")
public class TaobaoController {
    @Resource
    private TaskGetdataTaobaoOrderService taskGetdataTaobaoOrderService;

    @Resource
    private TaskGetdataTaobaoService taskGetdataTaobaoService;


    @RequestMapping("/test")
    @ResponseBody
    public Map<String, String> test() {
        Map<String, String> ss = new HashMap<String, String>();
        ss.put("1", "1");
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

    @RequestMapping("/batch")
    @ResponseBody
    public TaskGetdataTaobao batch(@RequestBody TaskGetdataTaobao taskGetdataTaobao) {
        TaskGetdataTaobao newTaskGetdataTaobao = taskGetdataTaobaoService.save(taskGetdataTaobao);
        return newTaskGetdataTaobao;
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

    @RequestMapping("/orders/trade")
    @ResponseBody
    public Map<String, Object> saveTrade(@RequestBody MainOrders mainOrders) {
        Map<String, Object> ss = new HashMap<String, Object>();
        Integer result = taskGetdataTaobaoOrderService.saveTradeAll(mainOrders, ss);
        ss.put("count", result);
        return ss;
    }
}
