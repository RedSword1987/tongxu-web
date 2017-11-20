package com.tongxuweb.controller;

import com.tongxuweb.domain.create.BusinessNoticeBeanRequest;
import com.tongxuweb.domain.create.DTaskRun;
import com.tongxuweb.domain.create.NotifyResponseBeanResponse;
import com.tongxuweb.domain.entity.MainOrders;
import com.tongxuweb.domain.entity.common.Pagination;
import com.tongxuweb.domain.generate.ActivityPayNotify;
import com.tongxuweb.domain.generate.TaskRun;
import com.tongxuweb.service.TaskTypeService;
import com.tongxuweb.service.interceptor.OutSideService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 */
@Controller
@RequestMapping("/outSide")
public class OutSideControl {

    @Resource
    private OutSideService outSideService;

    @Resource
    private TaskTypeService taskTypeService;


    @RequestMapping("/getNeedTask")
    @ResponseBody
    public Map<String, Object> getNeedTask() {
        Map<String, Object> result = new HashMap<String, Object>();
        Pagination pagination = new Pagination();
        pagination.setOffset(0);
        pagination.setLimit(1);
        List<DTaskRun> tasklist = taskTypeService.listTaskRun(pagination, null, 1);
        result.put("tasklist", tasklist);
        return result;
    }

    @RequestMapping("/taskRunStatus")
    @ResponseBody
    public Map<String, Object> taskRunStatus(@RequestBody TaskRun taskRun) {
        Map<String, Object> ss = new HashMap<String, Object>();
        if (taskRun.getStatus() != null) {
            if (taskRun.getStatus() == 4) {
                taskRun.setBeginDate(new Date());
            } else if (taskRun.getStatus() == 2) {
                taskRun.setEndDate(new Date());
            }
        }
        int result = outSideService.taskRunStatus(taskRun);
        ss.put("result", result);
        return ss;
    }


    @RequestMapping("/saveOrders")
    @ResponseBody
    public Map<String, Object> save(@RequestBody MainOrders mainOrders) {
        Map<String, Object> ss = new HashMap<String, Object>();
        ss.put("count", 0);
        if (mainOrders.getBatchId() != null) {
            Integer result = outSideService.saveOrders(mainOrders, ss);
            ss.put("count", result);
        }
        return ss;
    }


    @RequestMapping(value = "/tradepayapi/receiveNotify", method = RequestMethod.POST)
//    @Consumes("text/json")
    @ResponseBody
    public NotifyResponseBeanResponse save1(HttpServletRequest request, @RequestBody BusinessNoticeBeanRequest nb1) {
        System.out.println("收到请求---------");
        System.out.println(nb1.toString());
        System.out.println(String.valueOf(nb1));
        Enumeration em = request.getParameterNames();
        while (em.hasMoreElements()) {
            String name = (String) em.nextElement();
            String value = request.getParameter(name);
            System.out.println(name + ":" + value);
        }

        BusinessNoticeBeanRequest nb = nb1;
//                new BusinessNoticeBeanRequest();
//        nb.setOid_partner(request.getParameter("oid_partner"));
//        nb.setSign_type(request.getParameter("sign_type"));
//        nb.setSign(request.getParameter("sign"));
//        nb.setNo_order(request.getParameter("no_order"));
//        nb.setDt_order(request.getParameter("dt_order"));
//        nb.setMoney_order(request.getParameter("money_order"));
//        nb.setOid_paybill(request.getParameter("oid_paybill"));
//        nb.setInfo_order(request.getParameter("info_order"));
//        nb.setResult_pay(request.getParameter("result_pay"));
//        nb.setSettle_date(request.getParameter("settle_date"));


        ActivityPayNotify activityPayNotify = nb.toAp();
        NotifyResponseBeanResponse re = new NotifyResponseBeanResponse();
        ActivityPayNotify newA = outSideService.save(activityPayNotify);
        if (newA.getId() != null) {
            re.setRet_code("0000");
            re.setRet_msg("交易成功");
        }
        System.out.println("请求结束---------");
        return re;
    }
}
