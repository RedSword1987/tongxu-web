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
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/fetchData")
public class TaobaoController {
    @Resource
    private TaskGetdataTaobaoOrderService taskGetdataTaobaoOrderService;

    @Resource
    private TaskGetdataTaobaoService taskGetdataTaobaoService;

    @RequestMapping("/batch")
    @ResponseBody
    public TaskGetdataTaobao save(@RequestBody TaskGetdataTaobao taskGetdataTaobao) {
        TaskGetdataTaobao newTaskGetdataTaobao = taskGetdataTaobaoService.save(taskGetdataTaobao);
        return newTaskGetdataTaobao;
    }


    @RequestMapping("/orders")
    @ResponseBody
    public Map<String, String> save(@RequestBody MainOrders mainOrders) {
        Map<String, String> ss = new HashMap<String, String>();
        ss.put("1", "1");
        taskGetdataTaobaoOrderService.saveAll();
        return ss;
    }
}
