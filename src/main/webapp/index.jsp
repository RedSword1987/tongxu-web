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
            <div class="col-md-6 col-sm-6 col-xs-12">
                <div class="x_panel">
                    <div class="x_title">
                        <h2>近一周床尺寸分布</h2>
                        <ul class="nav navbar-right panel_toolbox">
                        </ul>
                        <div class="clearfix"></div>
                    </div>
                    <div class="x_content">
                        <div id="echart_pie" style="height:310px;"></div>
                    </div>
                </div>
            </div>
            <div class="col-md-6 col-sm-6 col-xs-12">
                <div class="x_panel">
                    <div class="x_title">
                        <h2>昨日产品销量top8</h2>
                        <ul class="nav navbar-right panel_toolbox">
                        </ul>
                        <div class="clearfix"></div>
                    </div>
                    <div class="x_content">
                        <div id="table" style="height:310px;">
                            <table class="table table-bordered table-hover table-striped ">
                                <thead>
                                <tr>
                                    <th>产品名称</th>
                                    <th>销量数量</th>
                                    <th>订单数量</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${tableList}" var="tableItem">
                                    <tr>
                                        <td>${tableItem.itemName}</td>
                                        <td>${tableItem.itemNum}</td>
                                        <td>${tableItem.itemOrder}</td>
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
                    <div class="x_content">
                        <div id="echart_finalmoney" style="height:250px;"></div>
                    </div>
                </div>
            </div>
            <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                    <div class="x_content">
                        <div id="echart_actualfee" style="height:250px;"></div>
                    </div>
                </div>
            </div>
            <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                    <div class="x_content">
                        <div id="echart_payNum" style="height:250px;"></div>
                    </div>
                </div>
            </div>
            <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                    <div class="x_content">
                        <div id="echart_items" style="height:250px;"></div>
                    </div>
                </div>
            </div>
        </div>
        <%@include file="common/include/foot.jsp" %>
    </div>
</div>
<%@include file="common/include/gentelella_js.jsp" %>
<%@include file="common/include/modal.jsp" %>
<script type="text/javascript">
    $(function () {
        //初始化pie图表
        initPie();

        initLineChart_finalmoney();
        initLineChart_actualfee();
        initLineChart_payNum();
        initLineChart_items();
    });

    function initPie() {
        var titleArr = new Array();
        var dataArr = new Array();
        <c:forEach items="${pieList}" var="pieItem">
        titleArr.push('${pieItem.name}');
        var obj_ = {};
        obj_.value = '${pieItem.num}';
        obj_.name = '${pieItem.name}';
        dataArr.push(obj_);
        </c:forEach>

        var echartPie = echarts.init(document.getElementById('echart_pie'), theme);

        echartPie.setOption({
            tooltip: {
                trigger: 'item',
                formatter: "{a} <br/>{b}  ({d}%)"
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
                    },
                    restore : {show: true}
                }
            },
            calculable: true,
            series: [{
                name: '近一周床尺寸分布',
                type: 'pie',
                radius: '55%',
                center: ['50%', '48%'],
                data: dataArr,
                itemStyle:{
                    normal:{
                        label:{
                            show: true,
                            formatter: '{b}  ({d}%)'
                        },
                        labelLine :{show:true}
                    }
                }
            }]
        });
    }

    function initLineChart_finalmoney() {
        var echartLine = echarts.init(document.getElementById("echart_finalmoney"), theme);

        var dataLineName = new Array();
        var subscript = null;
        var lineData = new Array();
        <c:forEach items="${allLines.finalmoney}" var="pieItem">

        dataLineName.push('${pieItem.name}');
        if (subscript == null) {
            subscript = new Array();
            subscript = '${pieItem.dates}'.split(",");
        }
        var obj_ = {};
        obj_.name = '${pieItem.name}';
        obj_.data = '${pieItem.values}'.split(",");
        var oneData = $.extend(obj_, lineChartAttr);
        lineData.push(oneData);
        </c:forEach>


        echartLine.setOption({
            title: {
                text: '净利润',
                subtext: '近一月统计'
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

    function initLineChart_actualfee() {
        var echartLine = echarts.init(document.getElementById("echart_actualfee"), theme);

        var dataLineName = new Array();
        var subscript = null;
        var lineData = new Array();
        <c:forEach items="${allLines.actualfee}" var="pieItem">

        dataLineName.push('${pieItem.name}');
        if (subscript == null) {
            subscript = new Array();
            subscript = '${pieItem.dates}'.split(",");
        }
        var obj_ = {};
        obj_.name = '${pieItem.name}';
        obj_.data = '${pieItem.values}'.split(",");
        var oneData = $.extend(obj_, lineChartAttr);
        lineData.push(oneData);
        </c:forEach>


        echartLine.setOption({
            title: {
                text: '销售金额',
                subtext: '近一月统计'
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

    function initLineChart_payNum() {
        var echartLine = echarts.init(document.getElementById("echart_payNum"), theme);

        var dataLineName = new Array();
        var subscript = null;
        var lineData = new Array();
        <c:forEach items="${allLines.payNum}" var="pieItem">

        dataLineName.push('${pieItem.name}');
        if (subscript == null) {
            subscript = new Array();
            subscript = '${pieItem.dates}'.split(",");
        }
        var obj_ = {};
        obj_.name = '${pieItem.name}';
        obj_.data = '${pieItem.values}'.split(",");
        var oneData = $.extend(obj_, lineChartAttr);
        lineData.push(oneData);
        </c:forEach>


        echartLine.setOption({
            title: {
                text: '订单数',
                subtext: '近一月统计'
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

    function initLineChart_items() {
        var echartLine = echarts.init(document.getElementById("echart_items"), theme);

        var dataLineName = new Array();
        var subscript = null;
        var lineData = new Array();
        <c:forEach items="${allLines.items}" var="pieItem">

        dataLineName.push('${pieItem.name}');
        if (subscript == null) {
            subscript = new Array();
            subscript = '${pieItem.dates}'.split(",");
        }
        var obj_ = {};
        obj_.name = '${pieItem.name}';
        obj_.data = '${pieItem.values}'.split(",");
        var oneData = $.extend(obj_, lineChartAttr);
        lineData.push(oneData);
        </c:forEach>


        echartLine.setOption({
            title: {
                text: '产品数',
                subtext: '近一月统计'
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