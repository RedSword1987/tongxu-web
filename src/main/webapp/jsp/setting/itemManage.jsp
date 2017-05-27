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
                        <h2>商品管理</h2>

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
                                <button id="btn_down" type="button" class="btn btn-default">
                                    <span class="glyphicon glyphicon-arrow-down" aria-hidden="true"></span>自动导入
                                </button>
                                <button id="btn_refreshPrice" type="button" class="btn btn-default">
                                    <span class="glyphicon glyphicon-random" aria-hidden="true"></span>刷新订单金额
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
        {field: "code", title: "物品编码"},
        {field: "price", title: "成本价(元)"},
        {field: "skuTextSize", title: "床大小"},
        {field: "skuTextColour", title: "床颜色"}
    ];

    var addFields = [
        {field: "code", title: "物品编码"},
        {field: "price", title: "成本价(元)"},
        {field: "skuTextSize", title: "床大小"},
        {field: "skuTextColour", title: "床颜色"}
    ];

    var updateFields = [
        {field: "code", title: "物品编码"},
        {field: "price", title: "成本价(元)"},
        {field: "skuTextSize", title: "床大小"},
        {field: "skuTextColour", title: "床颜色"}
    ];


    var idField = "id";
    var url_prefix = "${pageContext.request.contextPath}/tb/";
    var url_page = url_prefix + "tbItem.action";
    var url_add = url_prefix + "tbItemAdd.action";
    var url_update = url_prefix + "tbItemUpdate.action";
    var url_delete = url_prefix + "tbItemDelete.action";

    //此处不需要修改
    var tableId = "bootstrap-table";


    $(function () {

        initPage(tableId, idField, url_page, columns);

        $(window).resize(function () {
            $('#bootstrap-table').bootstrapTable('resetView');
        });

        $("#btn_down").click(function () {
            $.ajax({
                type: "post",
                url: url_prefix + "tbItemImport.action",
                dataType: "json",
                timeout: 20000,
                success: function (data) {
                    alert("自动导入" + data.result + "条");
                    $('#bootstrap-table').bootstrapTable("refresh");
                }
            });
        });

        $("#btn_refreshPrice").click(function () {
            $.ajax({
                type: "post",
                url: url_prefix + "tbItemRefreshPrice.action",
                dataType: "json",
                timeout: 20000,
                success: function (data) {
                    alert("自动刷新订单金额:" + data.result + "条");
                    $('#bootstrap-table').bootstrapTable("refresh");
                }
            });
        });

        $("#btn_add").click(function () {
            var addFields = [
                {field: "code", title: "物品编码"},
                {field: "price", title: "成本价(元)"},
                {field: "skuTextSize", title: "床大小"},
                {field: "skuTextColour", title: "床颜色"}
            ];
            initAddModal(addFields);
            $('#addModal_save').unbind("click");
            $("#addModal_save").click(function () {
                common_add(addFields, url_prefix + "tbItemAdd.action", tableId);
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
                common_delete(url_prefix + "tbItemDelete.action", ids, idField, tableId);
            }
        });

        //更新按钮
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
                    common_getOne("", ids, idField, updateFields, url_prefix + "tbItemUpdate.action", one_data, tableId, idField);
                }
            }
        });


    });
</script>
</body>
</html>