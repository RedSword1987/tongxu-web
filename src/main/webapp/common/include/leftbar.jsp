<%@ page language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
-
<div class="col-md-3 left_col">
    <div class="left_col scroll-view">
        <div class="navbar nav_title" style="border: 0;">
            <div href="" class="site_title">
                <span> 抓数管理</span>
            </div>
        </div>
        <div class="clearfix"></div>
        <!-- sidebar menu -->
        <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
            <div class="menu_section">
                <ul class="nav side-menu">
                    <li>
                        <a href="javascript:;">模块<span class="fa fa-chevron-down"></span></a>
                        <ul class="nav child_menu">
                            <li><a href="${pageContext.request.contextPath}">小模块</a></li>
                        </ul>
                    </li>


                    <li style="display: none;"><a
                            href="${pageContext.request.contextPath}/action/index/user_setting.action">密码修改</a></li>

                </ul>
            </div>
        </div>
    </div>
</div>
<!-- top navigation -->
<div class="top_nav">
    <div class="nav_menu">
        <nav class="" role="navigation">
            <div class="nav toggle">
                <a id="menu_toggle"><i class="fa fa-bars"></i></a>
            </div>
            <ul class="nav navbar-nav navbar-right">
                <li class=""><a href="javascript:;" class="user-profile dropdown-toggle" data-toggle="dropdown"
                                aria-expanded="false"> ${sessionScope.user_name} <span class=" fa fa-angle-down"></span>
                </a>
                    <ul class="dropdown-menu dropdown-usermenu pull-right">
                        <li><a href="${pageContext.request.contextPath}/action/index/user_setting.action">
                            <span>设置</span>
                        </a></li>
                        <li><a href="${pageContext.request.contextPath}/action/common_login/login_out.action"><i
                                class="fa fa-sign-out pull-right"></i>退出登录</a></li>
                    </ul>
                </li>
            </ul>
        </nav>
    </div>
</div>