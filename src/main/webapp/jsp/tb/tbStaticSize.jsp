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
            <h2>店铺日尺码</h2>

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
    {field: "sellerName", title: "店铺名称"},
    {field: "date", title: "销售日期"},
    {field: "size09", title: "床宽0.9"},
    {field: "size10", title: "床宽1.0"},
    {field: "size12", title: "床宽1.2"},
    {field: "size15", title: "床宽1.5"},
    {field: "size18", title: "床宽1.8"},
    {field: "size20", title: "床宽2.0"}
  ];




  var idField = "id";
  var url_prefix = "${pageContext.request.contextPath}/tb/";
  var url_page = url_prefix + "tbStaticSize.action";

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