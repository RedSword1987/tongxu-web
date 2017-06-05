<%@ page language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>数据抓取</title>
    <meta http-equiv="pragma" content="no-cache">
    <!-- HTTP 1.0 -->
    <meta http-equiv="cache-control" content="no-cache">
    <!-- Prevent caching at the proxy server -->
    <meta http-equiv="expires" content="0">
    <%@include file="../../common/include/gentelella_css.jsp" %>


</head>
<body class="nav-md">
<div class="container body">
    <div class="main_container">
        <div role="main">
            <div class="col-md-12 col-sm-12 col-xs-12" style="min-height: 400px!important;">
                <div class="x_panel">
                    <div class="x_title">
                        <h2>任务抓取</h2>

                        <div class="clearfix"></div>
                    </div>
                    <div class="x_content">
                        <div id="toolbar" class="btn-group">
                            <div>
                                <button id="btn_export_xls" type="button" class="btn btn-default">
                                    <span class="glyphicon glyphicon-export" aria-hidden="true"></span>导出
                                </button>
                            </div>
                        </div>

                        <table id="bootstrap-table">
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<%@include file="../../common/include/gentelella_js.jsp" %>
<%@include file="../../common/include/modal.jsp" %>
<div id="fakeloader"></div>
<script type="text/javascript">
    var idValue = "${id}";

    var columns = [
        {field: "id", title: "ID", class: "th_id", sortable: "true"},
        {field: "orderinfoId", title: "订单编号", class: "th_ka", sortable: "true"},
        {
            field: "orderinfoCreatetime",
            title: "订单创建时间",
            class: "th_ka",
            formatter: formatter_datetime,
            class: "th_time",
            sortable: "true"
        },
        {field: "orderBarText", title: "订单买家状态", class: "th_100", sortable: "true"},
        {field: "statusinfoText", title: "订单卖家状态", class: "th_100", sortable: "true"},
        {field: "logisticsName", title: "快递公司", class: "th_100", sortable: "true"},
        {field: "logisticsNum", title: "快递号", class: "th_ka", sortable: "true"},
        {field: "logisticsNumTaobao", title: "淘宝物流编号", class: "th_ka", sortable: "true"},
        {field: "buyerNick", title: "购买者昵称", class: "th_150", sortable: "true"},
        {field: "buyerPhonenum", title: "注册手机", class: "th_ka", sortable: "true"},
        {field: "buyerLogisticsPhone", title: "收货手机", class: "th_ka", sortable: "true"},

        {field: "buyerProvice", title: "省", class: "th_ka", sortable: "true"},
        {field: "buyerCity", title: "市", class: "th_ka", sortable: "true"},
        {field: "buyerArea", title: "区", class: "th_250", sortable: "true"},
        {field: "buyerPost", title: "邮编", class: "th_ka", sortable: "true"},

        {field: "buyerName", title: "收货姓名", class: "th_100", sortable: "true"},
        {field: "buyerAddress", title: "详细地址", class: "th_250", sortable: "true"},
        {field: "buyerVirtualPhone", title: "虚拟手机", class: "th_100", sortable: "true"},

        {
            field: "payTime",
            title: "支付时间",
            class: "th_ka",
            formatter: formatter_datetime,
            class: "th_time",
            sortable: "true"
        },
        {
            field: "sendTime",
            title: "发货时间",
            class: "th_ka",
            formatter: formatter_datetime,
            class: "th_time",
            sortable: "true"
        },

        {field: "alipayId", title: "支付单号", class: "th_ka", sortable: "true"},
        {field: "logisticsLastDesc", title: "物流最后状态", class: "th_250", sortable: "true"}
        // ,{field: "logisticsDesc", title: "物流明细",  class: "th_ka" },


    ];


    var idField = "id";
    var url_prefix = "/taskType/";
    var url_page = url_prefix + "taskRunWuliuResultPage.action?id=" + idValue;

    //此处不需要修改
    var tableId = "bootstrap-table";


    $(function () {

        $("#btn_export_xls").click(function () {
            $("#exportForm #exportForm_sort").val("");
            $("#exportForm #exportForm_order").val("");
            $("#exportForm #exportForm_searchField").val("");


            var sortOrder = $('#' + tableId).bootstrapTable('getOptions').sortOrder;
            var sortName = $('#' + tableId).bootstrapTable('getOptions').sortName;
            if (!sortName) {
                sortName = "";
            }

            $("#exportForm #exportForm_sort").val(sortName);
            $("#exportForm #exportForm_order").val(sortOrder);
            var url = "/common/common_download_xls.action?id=" + idValue;
            $("#exportForm").attr("action", url);
            $("#exportForm").submit();
        });


        initPage(tableId, idField, url_page, columns);

        $(window).resize(function () {
            $('#bootstrap-table').bootstrapTable('resetView');
        });

    });
</script>
<form action="" id="exportForm" method="post" target="_blank" style="display: none;">
    <input type="hidden" name="sort" id="exportForm_sort">
    <input type="hidden" name="order" id="exportForm_order">
    <input type="hidden" name="searchFields" id="exportForm_searchFields">
</form>
</body>
</html>
