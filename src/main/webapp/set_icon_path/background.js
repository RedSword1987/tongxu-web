var urlPre_t="http://www.nttongxu.com/";
var urlPre_local="http://localhost:8080/";

var urlPre=urlPre_t;

chrome.extension.onMessage.addListener(
    function(request, sender, sendResponse) {
		//alert("back 收到1条消息");
        saveData(request);
    }
);

var days=-30;
var timeInterval=11;



// 当点击插件按钮的时候开始执行
chrome.browserAction.onClicked.addListener(function(tab) {
	
	
		
		$.ajax({
		    type: "post",
			contentType: "application/json",
		    url: urlPre+"fetchData/getNeedTask.action",
		    dataType: "json",
		    timeout:   20000,
		    success: function (responseData) {
				
				
				if(responseData&&responseData.tasklist&&$(responseData.tasklist).length>0){
					var data=responseData.tasklist;
					$.each(data,function(i,task){
						var taskId=task.id;
						var begin=new Date();
						var end=new Date();
						if(task.beginDate){
							begin=task.beginDate;
						}
						if(task.endDate){
							end=task.endDate;
						}
						var typeDesc="订单主数据"
						var type=task.type;
						
						if(2==type){
							typeDesc="订单明细数据"
						}
						alert("开始抓数(type:"+typeDesc+") dateBegin:"+begin+",dateEnd:"+end+",batchId:"+taskId+"," );
						if (3 == type || 1 == type) {
							 
							chrome.tabs.sendMessage(tab.id,{"batchId":taskId,"begin":begin,"end":end,"timeInterval":timeInterval,"type":type,"orderId":null}); 
							
						}else if(2==type){
							if(task.orderids&&$(task.orderids).size()>0){
								getOrderDetail(tab.id,
									{"batchId":taskId,
									"begin":begin,
									"end":end,
									"timeInterval":timeInterval,
									"type":type},
									0,
									task.orderids);
							}
						}
						finishTask(taskId);
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
			console.info(new Date());
			getOrderDetail(tab_id,data,index_,orderids);
		}, timeInterval*1000);
	}
}


function finishTask(taskId){
	var dataJson={"id":taskId};
	$.ajax({
		type: "post",
		contentType: "application/json",
		url: urlPre+"fetchData/finishTask.action",
		data: JSON.stringify(dataJson),
		dataType: "json",
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
		    url: urlPre+"fetchData/orders.action",
		    data: requestData,
		    dataType: "json",
		    timeout:   20000,
		    success: function (data) {
		    },
		    error: function (e) {
		    }
		});
	
}


 
