package com.tongxuweb.controller;

import com.tongxuweb.domain.generate.TbSeller;
import com.tongxuweb.domain.generate.TbSellerExample;
import com.tongxuweb.domain.generate.TbStaticItem;
import com.tongxuweb.domain.generate.TbStaticSize;
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
        return "jsp/task/taskType";
    }


}
