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
            <h2>订单物流数据</h2>

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
    {field: "orderinfoId", title: "订单编号" },
    {field: "statusinfoText", title: "订单卖家状态",  class: "th_100"  },
    {field: "logisticsName", title: "快递公司",  class: "th_100" },
    {field: "logisticsNum", title: "快递号",  class: "th_ka"  },
    {field: "logisticsNumTaobao", title: "淘宝物流编号",  class: "th_ka"  },
    {field: "buyerNick", title: "购买者昵称",  class: "th_150"  },
    {field: "buyerPhonenum", title: "注册手机",  class: "th_ka"  },
    {field: "buyerLogisticsPhone", title: "收货手机",  class: "th_ka"  },

    {field: "buyerProvice", title: "省",  class: "th_ka" },
    {field: "buyerCity", title: "市",  class: "th_ka" },
    {field: "buyerArea", title: "区",  class: "th_250"  },
    {field: "buyerPost", title: "邮编",  class: "th_ka"  },

    {field: "buyerName", title: "收货姓名",  class: "th_100"  },
    {field: "buyerAddress", title: "详细地址",  class: "th_250" },
    {field: "buyerVirtualPhone", title: "虚拟手机",  class: "th_100"  },

    {field: "payTime", title: "支付时间",  formatter:formatter_datetime,class:"th_time"  },
    {field: "sendTime", title: "发货时间",  formatter:formatter_datetime,class:"th_time"  },

    {field: "alipayId", title: "支付单号",  class: "th_ka"  },
    {field: "logisticsLastDesc", title: "物流最后状态",  class: "th_250"  }
  ];




  var idField = "id";
  var url_prefix = "${pageContext.request.contextPath}/tb/";
  var url_page = url_prefix + "tbOrderWuliu.action";

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