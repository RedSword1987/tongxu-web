<%@ page language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>数据分析</title>
    <%@include file="common/include/gentelella_css.jsp" %>
</head>
<body style="background:#F7F7F7;">
<div class="">
    <a class="hiddenanchor" id="toregister"></a> <a class="hiddenanchor" id="tologin"></a>

    <div id="wrapper">
        <div id="login" class=" form">
            <section class="login_content">
                <form>
                    <h1>登录</h1>

                    <div>
                        <input type="text" class="form-control" placeholder="用户名" id="login_name"/>
                    </div>
                    <div>
                        <input type="password" class="form-control" placeholder="密码" id="password"/>
                    </div>
                    <div>
                        <a class="btn btn-default submit" id="login_submit">登录</a>
                    </div>
                    <div class="clearfix"></div>
                    <div class="separator">
                        <div class="clearfix"></div>
                        <br/>

                        <div>
                            <p>©2016-2017 All Rights Reserved.</p>
                        </div>
                    </div>
                </form>
            </section>
        </div>
    </div>
</div>
<%@include file="common/include/gentelella_js.jsp" %>
<%@include file="common/include/modal.jsp" %>
<script type="text/javascript">
    var url_login = "${pageContext.request.contextPath}/p/login.action";

    function initLogin() {
        var login_name = getCookie("login_name_");
        var password = getCookie("password_");
        var password_set = $.trim(getCookie("password_set"));
        if (password_set != null && password_set != "") {
            password = password_set
        }

        $("#login_name").val(login_name);
        $("#password").val(password);
        if (login_name && password && login_name != '' && password != '') {
            login();
        } else {
            $("#login_name").val(login_name);
            $("#password").val("");
        }
    }

    $(function () {
        $("#login_submit").click(function () {
            login();
        });

        var fromPage = "${fromPage}";
        if ("login_out" == fromPage) {
            var login_name = getCookie("login_name_");
            if (login_name) {
                $("#login_name").val(login_name);
            }
        } else {
            initLogin();
        }
    });


    function login() {
        var login_name = $.trim($("#login_name").val());
        var password = $.trim($("#password").val());

        if (login_name && password && login_name != '' && password != '') {
            showLoading();
            $.ajax({
                type: "post",
                url: url_login,
                data: {
                    login_name: login_name,
                    password: password
                },
                dataType: "json",
                timeout: 20000,
                success: function (data) {
                    if (data.result) {
                        window.top.location = "${pageContext.request.contextPath}/url/index.action";
                    } else {
                        hideLoading();
                        var msg = data.msg + "";
                        alert(data.msg);
                    }
                },
                error: function (e) {
                    hideLoading();
                }
            });
        } else if (login_name == '') {
            alert("登录账户名不能为空");
        } else if (password == '') {
            alert("登录密码不能为空");
        }
    }

    function common_update_pass(addFields_p, url_update, first) {
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
                        window.top.location = "${pageContext.request.contextPath}/" + first;
                    } else {
                        alert(data.msg);
                    }
                },
                error: function (e) {
                    hideLoading();
                }
            });
        }
    }

</script>
</body>
</html>