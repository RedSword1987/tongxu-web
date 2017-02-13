package com.tongxuweb.controller;

import com.tongxuweb.service.TaskGetdataTaobaoOrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/fetchData")
public class TaobaoController {
    @Resource
    private TaskGetdataTaobaoOrderService taskGetdataTaobaoOrderService;

    @RequestMapping("/orders")
    public boolean save(HttpServletRequest request) {

        taskGetdataTaobaoOrderService.saveAll();
        return true;
    }
}
