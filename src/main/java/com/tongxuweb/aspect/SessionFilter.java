package com.tongxuweb.aspect;

import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * session filter
 *
 * @author Redsword.shao
 * @date 2016-5-8 下午8:16:55
 */

public class SessionFilter extends OncePerRequestFilter {
    // 不过滤的url
    Set<String> notFilter = new HashSet<String>() {
        {
            add("index.html");
            add("login.jsp");
            add("common/js");
            add("common/css");
            add("gentelella-master");
            add("p/login");
            //

            add("common_download_xls");
            add("fetchData");
            add("taobaoke");
            add("task/taobao");
            add("task/");
            add("outSide");

        }
    };

    public static String getFullContextPath(HttpServletRequest request) {
        String path = request.getRequestURL().toString();
        path = path.substring(0, path.length() - request.getRequestURI().length());
        path += request.getContextPath();
        return path;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        boolean doFilter = false;

        // 请求的uri
        String path = request.getContextPath();
        String uri = request.getRequestURI();
        String res = uri.substring(path.length() + 1);


        if (res == null || "".equalsIgnoreCase(res.trim())) {
            doFilter = false;
        }


        if (res.toLowerCase().endsWith(".action") || res.toLowerCase().endsWith(".jsp") ||
                res.toLowerCase().endsWith(".json")) {
            doFilter = true;
        }



        // uri中包含background时才进行过滤
        // 是否过滤
        if (doFilter) {
            for (String s : notFilter) {
                if (uri.indexOf(s) != -1) {
                    // 如果uri中包含不过滤的uri，则不进行过滤
                    doFilter = false;
                    break;
                }
            }
        }
        if (doFilter) {
            // 想直接访问jsp文件，就得
            if (uri.endsWith(".jsp")) {
                response.sendRedirect(getFullContextPath(request) + "/login.jsp");
            }
        }

        //
        if (doFilter) {
            System.out.println("过滤的url:" + uri);
            // 执行过滤
            // 从session中获取登录者实体
            Object obj = request.getSession().getAttribute("user_bean");
            if (null == obj) {
                System.out.println("校验不通过-无Session:" + res);
                // 如果session中不存在登录者实体，则弹出框提示重新登录
                // 设置request和response的字符集，防止乱码
                response.sendRedirect(getFullContextPath(request) + "/login.jsp");
            } else {
                filterChain.doFilter(request, response);
                // 如果session中存在登录者实体，则继续

//                if (res.indexOf("action/index") != -1 && res.indexOf("action/index/user_setting") == -1) {
//                    boolean check = false;
//                    res = res.replace(".action", "");
//                    res = "/" + res;
//                    List<Map<String, Object>> reList = (List<Map<String, Object>>) request.getSession().getAttribute("sessionUserPermission");
//                    for (Map<String, Object> map : reList) {
//                        String permission_url = String.valueOf(map.get("PERMISSION_URL"));
//                        permission_url = permission_url.replace(".action", "");
//                        if (res.equals(permission_url)) {
//                            check = true;
//                            break;
//                        }
//                        List<Map<String, Object>> child = (List<Map<String, Object>>) map.get("childList");
//                        if (child != null) {
//                            for (Map<String, Object> map2 : child) {
//                                permission_url = String.valueOf(map2.get("PERMISSION_URL"));
//                                permission_url = permission_url.replace(".action", "");
//                                if (res.equals(permission_url)) {
//                                    check = true;
//                                    break;
//                                }
//                            }
//                        }
//                    }
//                    if (check) {
//                        filterChain.doFilter(request, response);
//                    } else {
//                        System.out.println("校验不通过-无权限:" + res);
//                        response.sendRedirect(getFullContextPath(request) + "/action/index/login.action");
//                    }
//                } else {
//                    filterChain.doFilter(request, response);
//                }
            }
        } else {
            // 如果不执行过滤，则继续
            filterChain.doFilter(request, response);
        }
    }
}
