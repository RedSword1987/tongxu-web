<%--
  Created by IntelliJ IDEA.
  User: higgs
  Date: 17/2/19
  Time: 下午11:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>数据抓取</title>
    <!-- Bootstrap -->
    <%@include file="../common/include/gentelella_css.jsp" %>
</head>
<body class="nav-md">
<div class="container body">
    <div class="main_container">
        <%@include file="../common/include/leftbar.jsp" %>
        <div class="right_col" role="main">
            <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                    <div class="x_title">
                        <h2>错误信息</h2>

                        <div class="clearfix"></div>
                    </div>
                    <div class="x_content">
                         <table id="bootstrap-table">
                        </table>
                    </div>
                </div>
            </div>
        </div>
        <%@include file="../common/include/foot.jsp" %>
    </div>
</div>
<%@include file="../common/include/gentelella_js.jsp" %>
<%@include file="../common/include/modal.jsp" %>
<script type="text/javascript">

    var columns = [
        {field: "id", title: "ID", sortable: "true", class: "th_ka"}

    ];

    var idField = "id";
    var url_prefix = "${pageContext.request.contextPath}/task/taobao/";
    var url_page = url_prefix + "listTask.action";

    //此处不需要修改
    var tableId = "bootstrap-table";


    $(function () {


        initPage(tableId, idField, url_page, columns);

        $(window).resize(function () {
            $('#bootstrap-table').bootstrapTable('resetView');
        });

    });
</script>

</body>
</html>
