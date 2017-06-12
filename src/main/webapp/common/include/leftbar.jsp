<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
-
<div class="col-md-3 left_col">
    <div class="left_col scroll-view">
        <div class="navbar nav_title" style="border: 0;">
            <div href="" class="site_title">
                <span> 数据分析</span>
            </div>
        </div>
        <div class="clearfix"></div>
        <!-- sidebar menu -->
        <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
            <div class="menu_section">
                <ul class="nav side-menu">
                    <li>
                        <a href="${pageContext.request.contextPath}/url/index.action">首页</a>
                    </li>
                    <li>
                        <a href="javascript:;">订单数据<span class="fa fa-chevron-down"></span></a>
                        <ul class="nav child_menu">
                            <li>
                                <a href="${pageContext.request.contextPath}/url/tbOrder.action">订单主数据</a>
                            </li>
                            <li><a href="${pageContext.request.contextPath}/url/tbOrderWuliu.action">订单物流数据</a></li>
                            <li><a href="${pageContext.request.contextPath}/url/tbOrderMoney.action">订单金额数据</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="javascript:;">任务管理<span class="fa fa-chevron-down"></span></a>
                        <ul class="nav child_menu">
                            <li>
                                <a href="${pageContext.request.contextPath}/url/taskRunMain.action">订单主数据任务</a>
                            </li>
                            <li><a href="${pageContext.request.contextPath}/url/taskRunMoney.action">订单明细数据任务</a></li>
                            <li><a href="${pageContext.request.contextPath}/url/taskRunWuliu.action">订单物流数据任务</a></li>

                        </ul>
                    </li>
                    <li>
                        <a href="javascript:;">统计报表<span class="fa fa-chevron-down"></span></a>
                        <ul class="nav child_menu">
                            <li><a href="${pageContext.request.contextPath}/url/tbStatic.action">店铺日统计汇总</a></li>
                            <li><a href="${pageContext.request.contextPath}/url/tbStaticSize.action">店铺日尺码</a></li>
                            <li><a href="${pageContext.request.contextPath}/url/tbStaticItem.action">店铺日产品销量</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="javascript:;">配置管理<span class="fa fa-chevron-down"></span></a>
                        <ul class="nav child_menu">
                            <li><a href="${pageContext.request.contextPath}/url/storeManage.action">门店管理</a></li>
                            <li><a href="${pageContext.request.contextPath}/url/itemManage.action">商品管理</a></li>
                            <li><a href="${pageContext.request.contextPath}/url/taskType.action">任务类型</a></li>
                            <li><a href="${pageContext.request.contextPath}/url/tbOrderStatusInfo.action">订单状态</a></li>
                            <li><a href="${pageContext.request.contextPath}/url/handStatic.action">手动统计</a></li>
                            <li><a href="${pageContext.request.contextPath}/url/pConfig.action">参数配置</a></li>
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