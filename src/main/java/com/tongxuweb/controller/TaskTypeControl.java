package com.tongxuweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by higgs on 17/2/19.
 */
@Controller
@RequestMapping("/taskType")
public class TaskTypeControl{

    @RequestMapping("/commonPage")
    @ResponseBody
    public void commonPage() {

    }
}
