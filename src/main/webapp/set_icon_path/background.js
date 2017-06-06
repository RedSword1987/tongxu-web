var urlPre_t="http://www.nttongxu.com/";
var urlPre_local="http://localhost:8089/";


var getNeedTask="outSide/getNeedTask.action";
var finishTask = "outSide/taskRunStatus.action";
var saveOrders="outSide/saveOrders.action";

var urlPre=urlPre_local;

chrome.extension.onMessage.addListener(
    function(request, sender, sendResponse) {
		var action = request.action;
		if (action && 2 == action) {
			taskStatus(request.id, request.status);
		} else {
			saveData(request);
		}
    }
);

var days=-30;
var timeInterval = 3;



// 当点击插件按钮的时候开始执行
chrome.browserAction.onClicked.addListener(function(tab) {
		$.ajax({
		    type: "post",
			contentType: "application/json",
		    url: urlPre+getNeedTask,
		    dataType: "json",
		    timeout:   20000,
		    success: function (responseData) {
				
				
				if(responseData&&responseData.tasklist&&$(responseData.tasklist).length>0){
					var data=responseData.tasklist;
					$.each(data,function(i,task){
						var taskId=task.id;
						if (task.timeInterval) {
							timeInterval = task.timeInterval;
						}

						taskStatus(taskId, 4);

						var code=task.code;


						var begin=new Date();
						var end=new Date();
						if (task.paramBeginDate) {
							var dayF = task.paramBeginDate.split("-");
							begin = new Date(dayF[0] * 1, dayF[1] * 1 - 1, dayF[2] * 1, 0, 0, 0);
						}
						if (task.paramEndDate) {
							var dayF = task.paramEndDate.split("-");
							end = new Date(dayF[0] * 1, dayF[1] * 1 - 1, dayF[2] * 1, 23, 59, 59);
						}

						var typeDesc = code;

						if ("main"==code) {
							alert("开始抓数(type:" + typeDesc + ") dateBegin:" + Date.parse(begin) + ",dateEnd:" + Date.parse(end) + ",batchId:" + taskId + ",");

							chrome.tabs.sendMessage(tab.id, {
								"batchId": taskId,
								"begin": Date.parse(begin),
								"end": Date.parse(end),
								"timeInterval": timeInterval,
								"code": code,
								"orderId": null
							});
						}else if("wuliu"==code){
							alert("开始抓数(type:" + typeDesc + ") :抓数数量:" + task.orderNum + ",batchId:" + taskId);

							if (task.orderIds) {
								var orderArr = task.orderIds.split(",");
								if ($(orderArr).size() > 0) {
									getOrderDetail(tab.id,
										{
											"batchId": taskId,
											"begin": begin,
											"end": end,
											"timeInterval": timeInterval,
											"code": code
										},
										0,
										orderArr);
								}
							}
						} else if ("money" == code) {
							alert("开始抓数(type:" + typeDesc + ") :抓数数量:" + task.orderNum + ",batchId:" + taskId);

							if (task.orderIds) {
								var orderArr = task.orderIds.split(",");
								if ($(orderArr).size() > 0) {
									getOrderDetail(tab.id,
										{
											"batchId": taskId,
											"begin": begin,
											"end": end,
											"timeInterval": timeInterval,
											"code": code
										},
										0,
										orderArr);
								}
							}
						}
					});
				}else{
					alert("无需要抓取的任务");
				}
		    },
		    error: function (e) {
				alert("错拉");
		    }
		});
});

function getOrderDetail(tab_id,data,index_,orderids){
	data.orderId=orderids[index_];
	chrome.tabs.sendMessage(tab_id,data); 
	index_++;
	if(index_<$(orderids).length){
		setTimeout(function () { 
			getOrderDetail(tab_id,data,index_,orderids);
		}, timeInterval*1000);
	}else{
		taskStatus(taskId, 2);
	}
}


function taskStatus(taskId, status) {
	var dataJson={"id":taskId,"status":status};
	$.ajax({
		type: "post",
		contentType: "application/json",
		dataType: "json",
		url: urlPre+finishTask,
		data: JSON.stringify(dataJson),

		timeout: 200000,
		success: function (data) {

		},
		error: function (e) {
			alert("错拉");
		}
	});
}


function saveData(request){
	var requestData=JSON.stringify(request);
	$.ajax(
		{
		    type: "post",
			contentType: "application/json",
		    url: urlPre+saveOrders,
		    data: requestData,
		    dataType: "json",
			timeout: 200000,
		    success: function (data) {
		    },
		    error: function (e) {
		    }
		}
	);
}
