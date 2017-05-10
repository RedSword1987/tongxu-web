package com.tongxuweb.controller;

import com.tongxuweb.domain.generate.Taobaoke;
import com.tongxuweb.mapper.generate.TaobaokeMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.QueryParam;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/taobaoke")
public class TaoBaoKeController {
    @Resource
    private TaobaokeMapper taobaokeMapper;


    @RequestMapping("/count")
    @ResponseBody
    public Map<String, Object> getNeedTask(@QueryParam("pageShortCode") String pageShortCode,
                                           @QueryParam("shortCode") String shortCode,
                                           HttpServletRequest request) {

        String ip = getRemoteHost(request);
        Map<String, Object> result = new HashMap<String, Object>();
        Taobaoke taobaoke = new Taobaoke();
        taobaoke.setPageShortCode(pageShortCode);
        taobaoke.setShortCode(shortCode);
        taobaoke.setIp(ip);
        Integer count = taobaokeMapper.insertSelective(taobaoke);
        result.put("a", count);
        return result;
    }

    public String getRemoteHost(javax.servlet.http.HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip.equals("0:0:0:0:0:0:0:1") ? "127.0.0.1" : ip;
    }

}
