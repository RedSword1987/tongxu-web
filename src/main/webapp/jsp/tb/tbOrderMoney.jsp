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
            <h2>订单金额数据</h2>

            <div class="clearfix"></div>
          </div>
          <div class="x_content">
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
    {field: "date", title: "日期"},
    {field: "orderinfoId", title: "单号"},
    {field: "moneyFinalMoney", title: "净利润"},

    {field: "payinfoActualfee", title: "支付金额"},
    {field: "moneyYunyinYongjin", title: "运营佣金"},
    {field: "moneyYunyinFuwufei", title: "运营服务费"},
    {field: "moneyYunyinKoudian", title: "运营扣点"},
    {field: "moneyYunyinYouhuiquan", title: "优惠券"},
    {field: "moneyYunyinTeshu", title: "特殊费用"},
    {field: "moneyWuliuKuaidi", title: "快递费"},
    {field: "moneyWuliuChangku", title: "仓库管理"},
    {field: "moneyWuliuBaozhuang", title: "包装"},
    {field: "moneyWuliuYunfeixian", title: "运费险"},
    {field: "payTime", title: "付款时间"}

  ];




  var idField = "id";
  var url_prefix = "${pageContext.request.contextPath}/tb/";
  var url_page = url_prefix + "tbOrderMoney.action";

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