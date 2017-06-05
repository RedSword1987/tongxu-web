package com.tongxuweb.controller;

import com.tongxuweb.domain.entity.common.Pagination;
import com.tongxuweb.domain.entity.common.PaginationResult;
import com.tongxuweb.domain.generate.TbItem;
import com.tongxuweb.domain.generate.TbOrderStatusInfo;
import com.tongxuweb.domain.generate.TbSeller;
import com.tongxuweb.service.TbService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 */
@Controller
@RequestMapping("/tb")
public class TbControl {


    @Resource
    private TbService tbService;

    @RequestMapping("/tbSeller")
    @ResponseBody
    public PaginationResult tbSeller(HttpServletRequest request) {
        Pagination pagination = new Pagination(request);
        PaginationResult result = tbService.tbSellerPage(pagination);
        return result;

    }

    @RequestMapping("/tbSellerAdd")
    @ResponseBody
    public TbSeller tbSellerAdd(@RequestBody TbSeller tbSeller, HttpServletRequest request) {
        tbService.tbSellerAdd(tbSeller);
        return tbSeller;
    }

    @RequestMapping("/tbSellerDelete")
    @ResponseBody
    public Map<String, Object> tbSellerDelete(@RequestBody List<Long> ids, HttpServletRequest request) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("result", true);
        result.put("msg", "成功");
        tbService.tbSellerDelete(ids);
        return result;
    }

    @RequestMapping("/tbSellerUpdate")
    @ResponseBody
    public Map<String, Object> tbSellerUpdate(@RequestBody TbSeller tbSeller, HttpServletRequest request) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("result", true);
        result.put("msg", "成功");
        tbService.tbSellerUpdate(tbSeller);
        return result;
    }


    @RequestMapping("/tbItem")
    @ResponseBody
    public PaginationResult tbItem(HttpServletRequest request) {
        Pagination pagination = new Pagination(request);
        PaginationResult result = tbService.tbItemPage(pagination);
        return result;
    }


    @RequestMapping("/tbItemAdd")
    @ResponseBody
    public TbItem tbItemAdd(@RequestBody TbItem tbItem) {
        tbService.tbItemAdd(tbItem);
        return tbItem;
    }

    @RequestMapping("/tbItemDelete")
    @ResponseBody
    public Map<String, Object> tbItemDelete(@RequestBody List<Long> ids) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("result", true);
        result.put("msg", "成功");
        tbService.tbItemDelete(ids);
        return result;
    }

    @RequestMapping("/tbItemUpdate")
    @ResponseBody
    public Map<String, Object> tbItemUpdate(@RequestBody TbItem tbItem, HttpServletRequest request) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("result", true);
        result.put("msg", "成功");
        tbService.tbItemUpdate(tbItem);
        return result;
    }


    //手动导入
    @RequestMapping("/tbItemImport")
    @ResponseBody
    public Map<String, Object> tbItemImport(HttpServletRequest request) {
        Map<String, Object> result = new HashMap<String, Object>();
        int re = tbService.tbItemImport();
        result.put("result", re);
        return result;
    }

    //手动导入
    @RequestMapping("/tbSellerImport")
    @ResponseBody
    public Map<String, Object> tbSellerImport(HttpServletRequest request) {
        Map<String, Object> result = new HashMap<String, Object>();
        int re = tbService.tbSellerImport();
        result.put("result", re);
        return result;
    }

    @RequestMapping("/tbItemRefreshPrice")
    @ResponseBody
    public Map<String, Object> tbItemRefreshPrice(HttpServletRequest request) {
        Map<String, Object> result = new HashMap<String, Object>();
        int re = tbService.tbItemRefreshPrice();
        result.put("result", re);
        return result;
    }






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


    @RequestMapping("/order/statusInfoPage")
    @ResponseBody
    public PaginationResult orderStatusInfoPage(HttpServletRequest request) {
        Pagination pagination = new Pagination(request);
        PaginationResult result = tbService.orderStatusInfoPage(pagination);
        return result;

    }

    @RequestMapping("/order/statusInfoAdd")
    @ResponseBody
    public TbOrderStatusInfo statusInfoAdd(@RequestBody TbOrderStatusInfo tbOrderStatusInfo, HttpServletRequest request) {
        tbService.statusInfoAdd(tbOrderStatusInfo);
        return tbOrderStatusInfo;
    }

    @RequestMapping("/order/statusInfoDelete")
    @ResponseBody
    public Map<String, Object> statusInfoDelete(@RequestBody List<Long> ids, HttpServletRequest request) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("result", true);
        result.put("msg", "成功");
        tbService.statusInfoDelete(ids);
        return result;
    }

    @RequestMapping("/order/statusInfoUpdate")
    @ResponseBody
    public Map<String, Object> statusInfoUpdate(@RequestBody TbOrderStatusInfo tbOrderStatusInfo, HttpServletRequest request) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("result", true);
        result.put("msg", "成功");
        tbService.statusInfoUpdate(tbOrderStatusInfo);
        return result;
    }

    @RequestMapping("/order/statusInfoImport")
    @ResponseBody
    public Map<String, Object> statusInfoImport() {
        Map<String, Object> result = new HashMap<String, Object>();
        int re = tbService.statusInfoImport();
        result.put("result", re);
        return result;
    }

    @RequestMapping("/order/statusInfoRefreshOrder")
    @ResponseBody
    public Map<String, Object> statusInfoRefreshOrder() {
        Map<String, Object> result = new HashMap<String, Object>();
        int re = tbService.statusInfoRefreshOrder();
        result.put("result", re);
        return result;
    }



}
