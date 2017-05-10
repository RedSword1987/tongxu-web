package com.tongxuweb.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Set;

/**
 * cookie的contorl层()
 *
 * @author Redsword.shao
 * @date 2016-5-28 上午12:28:49
 */

public class CookieUtil {
    /**
     * 清空cookie
     */
    public static void clearCookie(HttpServletRequest request, HttpServletResponse response, String path, Set<String> keys) {
        Cookie[] cookies = request.getCookies();
        try {
            for (int i = 0; i < cookies.length; i++) {
                if (keys.contains(cookies[i].getName())) {
                    Cookie cookie = new Cookie(cookies[i].getName(), null);
                    cookie.setMaxAge(0);
                    cookie.setPath(path);// 根据你创建cookie的路径进行填写
                    response.addCookie(cookie);
                }
            }
        } catch (Exception ex) {
            System.out.println("清空Cookies发生异常！");
        }
    }

    /**
     * 清空cookie
     */
    public static void setCookie(HttpServletRequest request, HttpServletResponse response, String path, String name, String value) {
        try {
            Cookie c2 = new Cookie(name, value);
            // 设置生命周期为1小时，秒为单位
            c2.setMaxAge(3600 * 24 * 50);
            c2.setPath("/");
            response.addCookie(c2);
        } catch (Exception ex) {
            System.out.println("清空Cookies发生异常！");
        }
    }
}
