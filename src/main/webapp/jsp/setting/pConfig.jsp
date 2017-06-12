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
                        <h2>参数配置</h2>

                        <div class="clearfix"></div>
                    </div>
                    <div class="x_content">
                        <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">

                            <div class="form-group">
                                <label class="control-label col-md-3 col-sm-3 col-xs-12">佣金比例(比例)<span
                                        class="required">*</span>
                                </label>

                                <div class="input-group date form_date col-md-3 col-sm-3 col-xs-12">
                                    <input type="number" id="yunyinYongjin" value="${pConfigAll.yunyinYongjin}"
                                           class="form-control col-md-6 col-xs-6">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-md-3 col-sm-3 col-xs-12">服务费<span
                                        class="required">*</span>
                                </label>

                                <div class="input-group date form_date col-md-3 col-sm-3 col-xs-12">
                                    <input type="number" id="yunyinFuwufei" value="${pConfigAll.yunyinFuwufei}"
                                           class="form-control col-md-6 col-xs-6">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-md-3 col-sm-3 col-xs-12">扣点费<span
                                        class="required">*</span>
                                </label>

                                <div class="input-group date form_date col-md-3 col-sm-3 col-xs-12">
                                    <input type="number" id="yunyinKoudian" value="${pConfigAll.yunyinKoudian}"
                                           class="form-control col-md-6 col-xs-6">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-md-3 col-sm-3 col-xs-12">优惠券<span
                                        class="required">*</span>
                                </label>

                                <div class="input-group date form_date col-md-3 col-sm-3 col-xs-12">
                                    <input type="number" id="yunyinYouhuiquan" value="${pConfigAll.yunyinYouhuiquan}"
                                           class="form-control col-md-6 col-xs-6">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-md-3 col-sm-3 col-xs-12">特殊费用<span
                                        class="required">*</span>
                                </label>

                                <div class="input-group date form_date col-md-3 col-sm-3 col-xs-12">
                                    <input type="number" id="yunyinTeshu" value="${pConfigAll.yunyinTeshu}"
                                           class="form-control col-md-6 col-xs-6">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-md-3 col-sm-3 col-xs-12">快递费<span
                                        class="required">*</span>
                                </label>

                                <div class="input-group date form_date col-md-3 col-sm-3 col-xs-12">
                                    <input type="number" id="wuliuKuaidi" value="${pConfigAll.wuliuKuaidi}"
                                           class="form-control col-md-6 col-xs-6">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-md-3 col-sm-3 col-xs-12">仓库人工费<span
                                        class="required">*</span>
                                </label>

                                <div class="input-group date form_date col-md-3 col-sm-3 col-xs-12">
                                    <input type="number" id="wuliuChangku" value="${pConfigAll.wuliuChangku}"
                                           class="form-control col-md-6 col-xs-6">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-md-3 col-sm-3 col-xs-12">包装费<span
                                        class="required">*</span>
                                </label>

                                <div class="input-group date form_date col-md-3 col-sm-3 col-xs-12">
                                    <input type="number" id="wuliuBaozhuang" value="${pConfigAll.wuliuBaozhuang}"
                                           class="form-control col-md-6 col-xs-6">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-md-3 col-sm-3 col-xs-12">运费险<span
                                        class="required">*</span>
                                </label>

                                <div class="input-group date form_date col-md-3 col-sm-3 col-xs-12">
                                    <input type="number" id="wuliuYunfeixian" value="${pConfigAll.wuliuYunfeixian}"
                                           class="form-control col-md-6 col-xs-6">
                                </div>
                            </div>

                            <div class="ln_solid"></div>
                            <div class="form-group">
                                <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
                                    <button id="refreshAll" type="button" class="btn btn-success">提交更新</button>
                                </div>
                            </div>
                        </form>
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

    $(function () {

        $("#refreshAll").click(function () {
            var yunyinYongjin = $.trim($("#yunyinYongjin").val());
            if (yunyinYongjin == '') {
                alert("佣金比例(比例) 不可为空");
                return;
            } else if (yunyinYongjin > 1 || yunyinYongjin < 0) {
                alert("佣金比例(比例) 值范围是0.0-1.0");
                return;
            }
            var yunyinFuwufei = $.trim($("#yunyinFuwufei").val());
            if (yunyinFuwufei == '') {
                alert("服务费 不可为空");
                return;
            } else if (yunyinFuwufei > 1 || yunyinFuwufei < 0) {
                alert("服务费 值范围是0.0-1.0");
                return;
            }
            var yunyinKoudian = $.trim($("#yunyinKoudian").val());
            if (yunyinKoudian == '') {
                alert("扣点费 不可为空");
                return;
            }
            var yunyinYouhuiquan = $.trim($("#yunyinYouhuiquan").val());
            if (yunyinYouhuiquan == '') {
                alert("优惠券 不可为空");
                return;
            }
            var yunyinTeshu = $.trim($("#yunyinTeshu").val());
            if (yunyinTeshu == '') {
                alert("特殊费用 不可为空");
                return;
            }
            var wuliuKuaidi = $.trim($("#wuliuKuaidi").val());
            if (wuliuKuaidi == '') {
                alert("快递费 不可为空");
                return;
            }
            var wuliuChangku = $.trim($("#wuliuChangku").val());
            if (wuliuChangku == '') {
                alert("仓库人工费 不可为空");
                return;
            }
            var wuliuBaozhuang = $.trim($("#wuliuBaozhuang").val());
            if (wuliuBaozhuang == '') {
                alert("包装费 不可为空");
                return;
            }
            var wuliuYunfeixian = $.trim($("#wuliuYunfeixian").val());
            if (wuliuYunfeixian == '') {
                alert("运费险 不可为空");
                return;
            }


            var pConfigAll = {
                "yunyinYongjin": yunyinYongjin,
                "yunyinFuwufei": yunyinFuwufei,
                "yunyinKoudian": yunyinKoudian,
                "yunyinYouhuiquan": yunyinYouhuiquan,
                "yunyinTeshu": yunyinTeshu,
                "wuliuKuaidi": wuliuKuaidi,
                "wuliuChangku": wuliuChangku,
                "wuliuBaozhuang": wuliuBaozhuang,
                "wuliuYunfeixian": wuliuYunfeixian

            }


            $.ajax({
                type: "post",
                url: "${pageContext.request.contextPath}/p/updatePConfig.action",
                contentType: "application/json",
                dataType: "json",
                data: JSON.stringify(pConfigAll),
                timeout: 20000,
                success: function (data) {
                    if (data.result) {
                        alert("更新成功");
                    } else {
                        alert("更新成功");
                    }
                },
                error: function (e) {
                }
            });


        });

    });
</script>
</body>
</html>