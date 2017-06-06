<%@ page language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>数据抓取</title>
    <!-- Bootstrap -->
    <%@include file="../../common/include/gentelella_css.jsp" %>
</head>
<body class="nav-md">
<div class="container body">
    <div class="main_container">
        <%@include file="../../common/include/leftbar.jsp" %>
        <div class="right_col" role="main">
            <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                    <div class="x_title">
                        <h2>${name}
                            <small><a href="${pageContext.request.contextPath}/file/抓数插件.zip" target="_blank">抓数插件下载</a>
                            </small>
                        </h2>

                        <div class="clearfix"></div>
                    </div>
                    <div class="x_content">
                        <div id="toolbar" class="btn-group">
                            <div>
                                <button id="btn_add" type="button" class="btn btn-default">
                                    <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
                                </button>
                                <button id="btn_delete" type="button" class="btn btn-default">
                                    <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
                                </button>
                                <button id="btn_update" type="button" class="btn btn-default">
                                    <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>修改
                                </button>
                            </div>
                        </div>
                        <table id="bootstrap-table">
                        </table>
                    </div>
                </div>
            </div>
        </div>
        <%@include file="../../common/include/foot.jsp" %>
    </div>
</div>
<%@include file="../../common/include/gentelella_js.jsp" %>
<%@include file="../../common/include/modal.jsp" %>
<script type="text/javascript">


    var columns = [
        {checkbox: true},
        {field: "taskName", title: "执行名称"},
        {field: "status", title: "状态", formatter: formatterTaskStatus},
        {field: "timeInterval", title: "抓数间隔时间(秒)"},
        {field: "paramBeginDate", title: "订单开始时间", formatter: formatter_datetime, class: "th_time"},
        {field: "paramEndDate", title: "订单结束时间", formatter: formatter_datetime, class: "th_time"},
        {field: "beginDate", title: "执行开始时间", formatter: formatter_datetime, class: "th_time"},
        {field: "endDate", title: "执行结束时间", formatter: getRunTimeDesc, class: "th_time"},
        {field: "createdAt", title: "创建时间", formatter: formatter_datetime, class: "th_time"}
    ];

    var addFields = [
        {field: "taskName", title: "执行名称", require: true},
        {field: "timeInterval", title: "抓数间隔时间(秒)", defaultValue: 10, require: true, fileType: 2},
        {field: "paramBeginDate", title: "订单开始时间", require: true, fileType: 3},
        {field: "paramEndDate", title: "订单结束时间", require: true, fileType: 3},
        {field: "code", isHidden: true, defaultValue: "${code}"}
    ];

    var updateFields = [
        {field: "taskName", title: "执行名称", require: true},
        {field: "timeInterval", title: "抓数间隔时间(秒)", require: true, fileType: 2},
        {field: "paramBeginDate", title: "订单开始时间", require: true, fileType: 3},
        {field: "paramEndDate", title: "订单结束时间", require: true, fileType: 3},
        {field: "status", title: "状态", fileType: 10, select_content: getTaskStatusSelect()}
    ];

    var idField = "id";
    var url_prefix = "${pageContext.request.contextPath}/taskType/";
    var url_page = url_prefix + "taskRunPage.action?code=${code}";
    var url_add = url_prefix + "taskRunAdd.action";
    var url_update = url_prefix + "taskRunUpdate.action";
    var url_delete = url_prefix + "taskRunDelete.action";


    //此处不需要修改
    var tableId = "bootstrap-table";


    $(function () {

        initPage(tableId, idField, url_page, columns);

        $(window).resize(function () {
            $('#bootstrap-table').bootstrapTable('resetView');
        });

        $("#btn_add").click(function () {

            initAddModal(addFields);
            $('#addModal_save').unbind("click");
            $("#addModal_save").click(function () {
                common_add(addFields, url_add, tableId);
            });

        });


        //删除按钮
        $("#btn_delete").click(function () {
            var ids = getChooseRawsIds(tableId, idField);
            if (ids == noChoose) {
                alert("至少选择一项");
            } else if (ids.length == 0) {
                alert("选择项目脏乱数据，不可删除，请联系开发人员");
            } else {
                common_delete(url_delete, ids, idField, tableId);
            }
        });

        //删除按钮
        $("#btn_refresh").click(function () {
            var ids = getChooseRawsIds(tableId, idField);
            if (ids == noChoose) {
                alert("至少选择一项");
            } else if (ids.length == 0) {
                alert("选择项目脏乱数据，不可删除，请联系开发人员");
            } else {
                common_delete(url_delete, ids, idField, tableId);
            }
        });


        //删除按钮
        $("#btn_update").click(function () {
            var ids = getChooseRawsIds(tableId, idField);
            if (ids == noChoose) {
                alert("至少选择一项");
            } else if (ids.length == 0) {
                alert("选择项目脏乱数据，不可编辑，请联系开发人员");
            } else {
                var id_arr = ids.split(",");
                if (id_arr.length > 1) {
                    alert("只可选择一项");
                } else {
                    var one_data = getChooseRawsJson(tableId);
                    common_getOne("", ids, idField, updateFields, url_update, one_data, tableId, idField);
                }
            }
        });

    });
</script>
</body>
</html>