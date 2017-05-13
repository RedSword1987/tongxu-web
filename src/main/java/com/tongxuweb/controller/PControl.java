package com.tongxuweb.controller;

import com.tongxuweb.domain.generate.PUser;
import com.tongxuweb.service.PService;
import com.tongxuweb.util.CookieUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Redsword.shao
 * @date 2016-5-5 下午6:33:12
 */
@Controller
@RequestMapping("/p")
public class PControl {
    @Resource
    private PService pService;

    /**
     * 登录
     *
     * @param request
     * @return result:true 或者 false msg：描述
     */
    @RequestMapping("/login")
    @ResponseBody
    public Map<String, Object> login(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> result = new HashMap<String, Object>();
        String loginName = request.getParameter("login_name");
        String password = request.getParameter("password");
        PUser pUser=pService.getByLoginAndPass(loginName,password);

        if (pUser==null){
            result.put("result", false);
            result.put("msg", "用户名或密码错误");
        }else{
            pUser.setLoginPass(null);
            result.put("loginName", pUser.getUserName());
            request.getSession().setAttribute("user_bean", pUser);
            request.getSession().setAttribute("user_name", pUser.getUserName());
            result.put("result", true);

            //
            CookieUtil.setCookie(request, response, "/", "login_name_", loginName);
            CookieUtil.setCookie(request, response, "/", "password_", password);

        }

        return result;

    }
}
