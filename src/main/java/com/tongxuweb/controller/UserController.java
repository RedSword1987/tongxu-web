package com.tongxuweb.controller;

import com.tongxuweb.generate.Bean.TUser;
import com.tongxuweb.service.UserService;
import com.tongxuweb.util.TestCache;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 */
@Controller
@RequestMapping("/aa")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/index1")
    public TUser getIndex(HttpServletRequest request) {
        TUser user = userService.selectUserById(1);


        TUser user1 = userService.selectUserById1(1);
        String s = TestCache.sss("asfd");
        System.out.println(s);


        TestCache ss = new TestCache();
        ss.sssaaaaaaa("sss");
        return user;
    }
}
