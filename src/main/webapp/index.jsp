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
<%@include file="common/include/gentelella_css.jsp"%>
</head>
<body class="nav-md">
    <div class="container body">
        <div class="main_container">
            <%@include file="common/include/leftbar.jsp"%>
            <div class="right_col" role="main">
                <div class="col-md-5 col-sm-5 col-xs-12">
                    <div class="x_panel">
                        <div class="x_title">
                            <h2>抓数统计</h2>
                            <ul class="nav navbar-right panel_toolbox">
                            </ul>
                            <div class="clearfix"></div>
                        </div>
                        <div class="x_content">
                            <div id="echart_pie" style="height:250px;"></div>
                        </div>
                    </div>
                </div>
                <div class="col-md-7 col-sm-7 col-xs-12">
                    <div class="x_panel">
                        <div class="x_title">
                            <h2>任务状态</h2>
                            <ul class="nav navbar-right panel_toolbox">
                            </ul>
                            <div class="clearfix"></div>
                        </div>
                        <div class="x_content">
                            <div id="table" style="height:250px;">
                                <table class="table table-bordered table-hover table-striped ">
                                    <thead>
                                        <tr>
                                            <th>KA</th>
                                            <th>任务状态</th>
                                            <th class="th-inner sortable both">门店未匹配</th>
                                            <th>商品未匹配</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${tableList}" var="tableItem">
                                            <tr>
                                                <td>${tableItem.name}</td>
                                                <td>${tableItem.task_status}</td>
                                                <td>${tableItem.store}</td>
                                                <td>${tableItem.item}</td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-12 col-sm-12 col-xs-12">
                    <div class="x_panel">
                        <div class="x_title">
                            <h2>销售金额</h2>
                            <div class="clearfix"></div>
                        </div>
                        <div class="x_content">
                            <div id="echart_line" style="height:250px;"></div>
                        </div>
                    </div>
                </div>
            </div>
            <%@include file="common/include/foot.jsp"%>
        </div>
    </div>
    <%@include file="common/include/gentelella_js.jsp"%>
    <%@include file="common/include/modal.jsp"%>
    <script type="text/javascript">
					$(function(){
			//初始化pie图表
			initPie();
			
			//initLineChart()
			initLineChart();
    	});
		
		function initPie(){
			var pieMap='${pieList}';
			var titleArr=new Array();
			var dataArr=new Array();
			<c:forEach items="${pieList}" var="pieItem">
				titleArr.push('${pieItem.name}');
				var obj_={};
				obj_.value='${pieItem.num}';
				obj_.name='${pieItem.name}';
				dataArr.push(obj_);
			</c:forEach>
			
			var echartPie = echarts.init(document.getElementById('echart_pie'), theme);

		      echartPie.setOption({
		        tooltip: {
		          trigger: 'item',
		          formatter: "{a} <br/>{b} : {c} ({d}%)"
		        },
		        legend: {
		          x: 'center',
		          y: 'bottom',
		          data: titleArr
		        },
		        toolbox: {
		          show: true,
		          feature: {
		            magicType: {
		              show: true,
		              type: ['pie', 'funnel'],
		              option: {
		                funnel: {
		                  x: '25%',
		                  width: '50%',
		                  funnelAlign: 'left',
		                  max: 1548
		                }
		              }
		            },
		            saveAsImage: {
		              show: true,
		              title: "保存图片"
		            }
		          }
		        },
		        calculable: true,
		        series: [{
		          name: '抓数统计',
		          type: 'pie',
		          radius: '55%',
		          center: ['50%', '48%'],
		          data:  dataArr
		        }]
		      });
		}
		
		function initLineChart(){
			var echartLine = echarts.init(document.getElementById('echart_line'), theme);

			
			var dataLineName=new Array();
			var subscript=null;
			var lineData=new Array();
			<c:forEach items="${lineList}" var="pieItem">
				dataLineName.push('${pieItem.name}');
				if(subscript==null){
					subscript=new Array();
					subscript='${pieItem.dates}'.split(",");
				}
    			var obj_={};
    			obj_.name='${pieItem.name}';
    			obj_.data='${pieItem.values}'.split(",");
    			var oneData=$.extend(obj_,lineChartAttr);
    			lineData.push(oneData);
			</c:forEach>
		
			
		      echartLine.setOption({
		        title: {
		          text: '近一月统计',
		          subtext: ''
		        },
		        tooltip: {
		          trigger: 'axis'
		        },
		        legend: {
		          x: 220,
		          y: 40,
		          data: dataLineName
		        },
		        toolbox: {
		          show: true,
		          feature: {
		            magicType: {
		              show: true,
		              title: {
		                line: 'Line',
		                bar: 'Bar',
		                stack: 'Stack',
		                tiled: 'Tiled'
		              },
		              type: ['line', 'bar', 'stack', 'tiled']
		            },
		            saveAsImage: {
		              show: true,
		              title: "Save Image"
		            }
		          }
		        },
		        calculable: true,
		        xAxis: [{
		          type: 'category',
		          boundaryGap: false,
		          data: subscript
		        }],
		        yAxis: [{
		          type: 'value'
		        }],
		        series: lineData
		      });
			
		}
	
	      

	      
				</script>
</body>
</html>