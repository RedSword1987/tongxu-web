var urlPre_t="http://www.nttongxu.com/";
var urlPre_local="http://localhost:8089/";


var getNeedTask="outSide/getNeedTask.action";
var finishTask="outSide/finishTask.action";
var saveOrders="outSide/saveOrders.action";

var urlPre=urlPre_local;

chrome.extension.onMessage.addListener(
    function(request, sender, sendResponse) {
        saveData(request);

		//finishTask(request.batchId,2)
    }
);

var days=-30;
var timeInterval=11;



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

						alert("开始抓数(type:" + typeDesc + ") dateBegin:" + Date.parse(begin) + ",dateEnd:" + Date.parse(end) + ",batchId:" + taskId + ",");
						if ("main"==code) {
							//finishTask(taskId,4);
							chrome.tabs.sendMessage(tab.id, {
								"batchId": taskId,
								"begin": Date.parse(begin),
								"end": Date.parse(end),
								"timeInterval": timeInterval,
								"code": code,
								"orderId": null
							});
						}else if("wuliu"==code){
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
		//finishTask(data.batchId,2);
	}
}


function finishTask(taskId,status){
	var dataJson={"id":taskId,"status":status};
	$.ajax({
		type: "post",
		contentType: "application/json",
		dataType: "json",
		url: urlPre+finishTask,
		data: JSON.stringify(dataJson),

		timeout:   20000,
		success: function (data) {
			 
		},
		error: function (e) {
			alert("错拉");
		}
	});
}

function saveData(request){
	var requestData=JSON.stringify(request);
	$.ajax({
		    type: "post",
			contentType: "application/json",
		    url: urlPre+saveOrders,
		    data: requestData,
		    dataType: "json",
		    timeout:   20000,
		    success: function (data) {
		    },
		    error: function (e) {
		    }
		});
}
