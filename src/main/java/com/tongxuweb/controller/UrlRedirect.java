package com.tongxuweb.controller;

import com.tongxuweb.dao.TaskTypeDao;
import com.tongxuweb.domain.generate.*;
import com.tongxuweb.mapper.generate.TbSellerMapper;
import com.tongxuweb.service.TbStaticService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * @author Redsword.shao
 * @date 2016-5-5 下午6:33:12
 */
@Controller
@RequestMapping("/url")
public class UrlRedirect {

    @Resource
    private TbStaticService tbStaticService;

    @Resource
    private TbSellerMapper tbSellerMapper;

    @Resource
    private TaskTypeDao taskTypeDao;

    @RequestMapping("/login")
    public String login(HttpServletRequest request) {
        System.out.println(1);
        return "login";
    }

    @RequestMapping("/user_setting")
    public String user_setting(HttpServletRequest request) {
        return "user_setting";
    }

    @RequestMapping("/index")
    public String index(HttpServletRequest request) {
        TbSellerExample example = new TbSellerExample();
        example.createCriteria().andSellerStatusEqualTo(1);
        List<TbSeller> li = tbSellerMapper.selectByExample(example);
        if (li.size() > 0) {
            Map<String, List<Map<String, Object>>> allLines = tbStaticService.getAllLines(li);
            List<Map<String, Object>> pieList = tbStaticService.getIndexPieList(li);
            List<TbStaticItem> tableList = tbStaticService.getIndexTableList(li);

            request.setAttribute("tableList", tableList);
            request.setAttribute("allLines", allLines);
            request.setAttribute("pieList", pieList);
        }
        return "index";
    }

    @RequestMapping("/taskType")
    public String taskType(HttpServletRequest request) {
        return "jsp/setting/taskType";
    }


    @RequestMapping("/taskRunMain")
    public String taskRunMain(HttpServletRequest request) {
        String code = "main";
        request.setAttribute("code", code);
        TaskTypeExample ex = new TaskTypeExample();
        ex.createCriteria().andCodeEqualTo(code);
        List<TaskType> li = taskTypeDao.selectByExample(ex);
        if (li.size() > 0) {
            request.setAttribute("name", li.get(0).getName());
        }
        return "jsp/task/taskRun";
    }

    @RequestMapping("/taskRunWuliu")
    public String taskRunWuliu(HttpServletRequest request) {
        String code = "wuliu";
        request.setAttribute("code", code);
        TaskTypeExample ex = new TaskTypeExample();
        ex.createCriteria().andCodeEqualTo(code);
        List<TaskType> li = taskTypeDao.selectByExample(ex);
        if (li.size() > 0) {
            request.setAttribute("name", li.get(0).getName());
        }
        return "jsp/task/taskRun";
    }

    @RequestMapping("/taskRunMoney")
    public String taskRunMoney(HttpServletRequest request) {
        String code = "money";
        request.setAttribute("code", code);
        TaskTypeExample ex = new TaskTypeExample();
        ex.createCriteria().andCodeEqualTo(code);
        List<TaskType> li = taskTypeDao.selectByExample(ex);
        if (li.size() > 0) {
            request.setAttribute("name", li.get(0).getName());
        }
        return "jsp/task/taskRun";
    }

    @RequestMapping("/tbStatic")
    public String tbStatic(HttpServletRequest request) {
        return "jsp/tb/tbStatic";
    }

    @RequestMapping("/tbStaticItem")
    public String tbStaticItem(HttpServletRequest request) {
        return "jsp/tb/tbStaticItem";
    }

    @RequestMapping("/tbStaticSize")
    public String tbStaticSize(HttpServletRequest request) {
        return "jsp/tb/tbStaticSize";
    }


    @RequestMapping("/tbOrder")
    public String tbOrder(HttpServletRequest request) {
        return "jsp/tb/tbOrder";
    }

    @RequestMapping("/tbOrderWuliu")
    public String tbOrderWuliu(HttpServletRequest request) {
        return "jsp/tb/tbOrderWuliu";
    }

    @RequestMapping("/tbOrderMoney")
    public String tbOrderMoney(HttpServletRequest request) {
        return "jsp/tb/tbOrderMoney";
    }

    @RequestMapping("/storeManage")
    public String storeManage(HttpServletRequest request) {
        return "jsp/setting/storeManage";
    }

    @RequestMapping("/itemManage")
    public String itemManage(HttpServletRequest request) {
        return "jsp/setting/itemManage";
    }

    @RequestMapping("/handStatic")
    public String handStatic(HttpServletRequest request) {
        return "jsp/tb/handStatic";
    }



}
