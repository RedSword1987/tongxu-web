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
    <%@include file="common/include/gentelella_css.jsp" %>
</head>
<body class="nav-md">
<div class="container body">
    <div class="main_container">
        <%@include file="common/include/leftbar.jsp" %>
        <div class="right_col" role="main">
            <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                    <div class="x_title">
                        <h2>设置</h2>

                        <div class="clearfix"></div>
                    </div>
                    <div class="x_content" style="min-height: 500px">
                        <form id="btn_edit_content" data-parsley-validate class="form-horizontal form-label-left">
                            <div class="form-group">
                                <label class="control-label col-md-2 col-sm-2 col-xs-2">旧密码</label>

                                <div class="col-md-4 col-sm-4 col-xs-4">
                                    <input type="password" name="updateForm_oldPassword" id="updateForm_oldPassword"
                                           class="form-control col-md-3 col-xs-3"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-md-2 col-sm-2 col-xs-2"> 新密码</label>

                                <div class="col-md-4 col-sm-4 col-xs-4">
                                    <input type="password" name="updateForm_newPassword" id="updateForm_newPassword"
                                           class="form-control col-md-3 col-xs-3"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-md-2 col-sm-2 col-xs-2"> 重复新密码</label>

                                <div class="col-md-4 col-sm-4 col-xs-4">
                                    <input type="password" name="updateForm_newPasswordRepeat"
                                           id="updateForm_newPasswordRepeat" class="form-control col-md-3 col-xs-3"/>
                                </div>
                            </div>
                            <div class="ln_solid"></div>
                            <div class="form-group">
                                <div class="col-md-12 col-sm-12 col-xs-12 col-md-offset-6">
                                    <button id="btn_update_action" class="btn btn-primary" type="button">
                                        <span class="glyphicon glyphicon-search" aria-hidden="true"></span>修改
                                    </button>
                                </div>
                            </div>
                        </form>
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

    var url_prefix = "${pageContext.request.contextPath}/action/common_login/";
    var url_update = url_prefix + "reset_password.json";

    $(function () {
        //添加按钮
        $("#btn_update_action").click(function () {
            var oldPassword = $.trim($("#updateForm_oldPassword").val());
            var newPassword = $.trim($("#updateForm_newPassword").val());
            var newPasswordRepeat = $.trim($("#updateForm_newPasswordRepeat").val());

            if (oldPassword == '') {
                alert("旧密码 不能为空");
            } else if (newPassword == '') {
                alert("新密码 不能为空");

            } else if (newPasswordRepeat == '') {
                alert("重复新密码 不能为空");

            } else if (newPassword != newPassword) {
                alert("新密码 和 重复新密码 不一致");
            } else if (oldPassword == newPassword) {
                alert("新密码 和 旧密码 不能一致");
            } else {
                showLoading();

                $.ajax({
                    type: "post",
                    url: url_update,
                    data: {
                        oldPassword: oldPassword,
                        newPassword: newPassword
                    },
                    dataType: "json",
                    timeout: 20000,
                    success: function (data) {
                        hideLoading();
                        if (data.result) {
                            alert(data.msg);
                        } else {
                            alert(data.msg);
                        }
                    },
                    error: function (e) {
                        hideLoading();
                    }
                });
            }
        });
    });
</script>

</body>
</html>