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
                        <h2>刷新统计数据</h2>

                        <div class="clearfix"></div>
                    </div>
                    <div class="x_content">
                        <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">

                            <div class="form-group">
                                <label class="control-label col-md-3 col-sm-3 col-xs-12"
                                       for="addForm_beginDate">开始日期
                                    <span class="required">*</span>
                                </label>

                                <div id="beginDate-date" class="input-group date form_date col-md-6 col-sm-6 col-xs-12"
                                     data-date-format="yyyy-mm-dd" data-link-field="addForm_beginDate"
                                     data-link-format="yyyy-mm-dd">
                                    <input class="form-control" size="16" type="text" readonly> <span
                                        class="input-group-addon"><span
                                        class="glyphicon glyphicon-remove"></span></span>
                                    <input type="hidden" id="addForm_beginDate" value=""/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-md-3 col-sm-3 col-xs-12" for="addForm_beginDate">结束日期 <span
                                        class="required">*</span>
                                </label>

                                <div id="endDate-date" class="input-group date form_date col-md-6 col-sm-6 col-xs-12"
                                     data-date-format="yyyy-mm-dd" data-link-field="addForm_endDate"
                                     data-link-format="yyyy-mm-dd">
                                    <input class="form-control" size="16" type="text" readonly> <span
                                        class="input-group-addon"><span
                                        class="glyphicon glyphicon-remove"></span></span>
                                    <input type="hidden" id="addForm_endDate" value=""/>
                                </div>
                            </div>
                            <div class="ln_solid"></div>
                            <div class="form-group">
                                <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
                                    <button id="refreshAll" type="button" class="btn btn-success">开始刷新</button>
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
        $('#beginDate-date').datetimepicker({
            language: 'zh-CN',
            weekStart: 1,
            todayBtn: 1,
            autoclose: 1,
            todayHighlight: 1,
            startView: 2,
            minView: 2,
            forceParse: 1
        });

        $('#endDate-date').datetimepicker({
            language: 'zh-CN',
            weekStart: 1,
            todayBtn: 1,
            autoclose: 1,
            todayHighlight: 1,
            startView: 2,
            minView: 2,
            forceParse: 1
        });

        $("#refreshAll").click(function(){
            var beginDate= $.trim($("#addForm_beginDate").val());
            var endDate=$.trim($("#addForm_endDate").val());
            if(!beginDate&&!endDate){
                alert("开始日期,结束日期不能为空");
                return;
            }

            if(!beginDate&&endDate){
                beginDate=endDate;
            }
            if(beginDate&&!endDate){
                endDate=beginDate;
            }
            $.ajax({
                type: "post",
                url: "${pageContext.request.contextPath}/tb/refreshStatic.action?beginDate="+beginDate+"&endDate="+endDate,
                contentType: "application/json",
                dataType: "json",
                timeout:   20000,
                success: function (data) {
                    if(data.result){
                        alert("刷新统计数据成功");
                    }else{
                        alert("刷新统计数据失败");
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