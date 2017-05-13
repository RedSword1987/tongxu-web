package com.tongxuweb.controller;

import com.tongxuweb.domain.entity.common.Pagination;
import com.tongxuweb.domain.entity.common.PaginationResult;
import com.tongxuweb.service.TbService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by higgs on 17/2/19.
 */
@Controller
@RequestMapping("/tb")
public class TbControl {
    @Resource
    private TbService tbService;


    @RequestMapping("/tbStatic")
    @ResponseBody
    public PaginationResult tbStaticPage(HttpServletRequest request) {
        Pagination pagination = new Pagination(request);
        PaginationResult result = tbService.tbStaticPage(pagination);
        return result;
    }

    @RequestMapping("/tbStaticSize")
    @ResponseBody
    public PaginationResult tbStaticSize(HttpServletRequest request) {
        Pagination pagination = new Pagination(request);
        PaginationResult result = tbService.tbStaticSize(pagination);
        return result;
    }

    @RequestMapping("/tbStaticItem")
    @ResponseBody
    public PaginationResult tbStaticItem(HttpServletRequest request) {
        Pagination pagination = new Pagination(request);
        PaginationResult result = tbService.tbStaticItem(pagination);
        return result;
    }


    @RequestMapping("/tbOrder")
    @ResponseBody
    public PaginationResult tbOrderPage(HttpServletRequest request) {
        Pagination pagination = new Pagination(request);
        PaginationResult result = tbService.tbOrderPage(pagination);
        return result;
    }

    @RequestMapping("/tbOrderWuliu")
    @ResponseBody
    public PaginationResult tbOrderWuliuPage(HttpServletRequest request) {
        Pagination pagination = new Pagination(request);
        PaginationResult result = tbService.tbOrderWuliuPage(pagination);
        return result;
    }

    @RequestMapping("/tbOrderMoney")
    @ResponseBody
    public PaginationResult tbOrderMoneyPage(HttpServletRequest request) {
        Pagination pagination = new Pagination(request);
        PaginationResult result = tbService.tbOrderMoneyPage(pagination);
        return result;
    }

    @RequestMapping("/refreshStatic")
    @ResponseBody
    public Map<String, Object> refreshStatic(HttpServletRequest request) {
        String beginDate = request.getParameter("beginDate");
        String endDate = request.getParameter("endDate");
        Map<String, Object> result = new HashMap<String, Object>();
        try {
            tbService.refreshStatic(beginDate, endDate);
            result.put("result", "true");
        } catch (Exception e) {
            e.printStackTrace();
            result.put("result", "false");
        }

        return result;
    }


}
