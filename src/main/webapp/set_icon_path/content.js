var timeInterval=5;
var pageSize=100; 

 $.ajaxSetup({
  async: false
  });
  
chrome.extension.onMessage.addListener(
    function(request, sender, sendResponse) {
		var code=request.code;
		var orderId=request.orderId;
		var dateBegin=request.begin;
		var dateEnd=request.end;
		var batchId=request.batchId;
		timeInterval=request.timeInterval;


		getData(dateBegin,dateEnd,1,batchId,code,orderId);
    }
);

function getData(dateBegin,dateEnd,pageNum,batchId,code,orderId){
	if(orderId){
		dateBegin=0;
		dateEnd=0;
	}
	
	var prePageNo=pageNum;
	if(prePageNo>1){
		prePageNo=prePageNo-1;
	}
	$.ajax({
		    type: "post",
			asyn:false,
		    url: "https://trade.taobao.com/trade/itemlist/asyncSold.htm?event_submit_do_query=1&_input_charset=utf8",
		    data: {
		    	auctionType:0,
				close:0,
				pageNum:pageNum,
				pageSize:pageSize,
				queryMore:true,
				rxAuditFlag:0,
				rxHasSendFlag:0,
				rxOldFlag:0,
				rxSendFlag:0,
				rxSuccessflag:0,
				tradeTag:0,
				useCheckcode:false,
				useOrderInfo:false,
				errorCheckcode:false,
				action:"itemlist/SoldQueryAction",
				prePageNo:prePageNo,
				buyerNick:"",
				dateBegin:dateBegin,
				dateEnd:dateEnd,
				logisticsService:"",
				orderStatus:"",
				queryOrder:"desc",
				rateStatus:"",
				refund:"",
				sellerNick:"",
				tabCode:"latest3Months",
				orderId:orderId
		    },
		    dataType: "json",
		    timeout:   20000,
		    success: function (data) {
				if(data){
					if(data.mainOrders&&$(data.mainOrders).length>0){
						
						for(iii=0;iii<data.mainOrders.length;iii++){
							var id__=data.mainOrders[iii].id;
							
							if(code=='wuliu'&&orderId){
								 
								$.ajax({
									type: "get",
									asyn:false,
									url: "https://trade.taobao.com/trade/detail/trade_order_detail.htm?biz_order_id="+id__,
									timeout:   20000,
									success: function (htmlData) {	 
										var result=getSendInfo(htmlData)
										data.mainOrders[iii].trade=result;
									},
									error: function (e) {
									}
								});
								 
							}
								 
								 if(data.mainOrders[iii].payInfo&&data.mainOrders[iii].payInfo.operations){
									 if($(data.mainOrders[iii].payInfo.operations).length>0&&data.mainOrders[iii].trade
									 &&data.mainOrders[iii].trade.logisticsNum){
										 for(i=0;i<data.mainOrders[iii].payInfo.operations.length;i++){
											var operations=data.mainOrders[iii].payInfo.operations[i];
											if(operations&&operations.url&&operations.text&&operations.text.indexOf("查看物流")!=-1){
												$.ajax({
													type: "get",
													asyn:false,
													url: "https:"+operations.url,
													timeout:   20000,
													success: function (htmlData) {	 
														var data1=htmlData;
														var begin=htmlData.indexOf("物流编号");
														if(begin!=-1){
															data1=htmlData.substring(begin,begin+100);
														}
														begin=data1.indexOf("<em>");
														var end=data1.indexOf("</em>");
														if(begin!=-1&&end!=-1){
															data1=data1.substring(begin+4,end);
														}
														var wuliucode=data1;
														if(wuliucode.indexOf("LP")!=-1){
															data.mainOrders[iii].trade.logisticsNumTaobao=wuliucode;
															var nows=new Date();
															var nows_s=nows.getTime();
															$.ajax({
																type: "get",
																asyn:false,
																url:"https://detail.i56.taobao.com/call/query_trace.do?_ksTS="+nows_s+"_54&callback=jsonp55&dimension=ORDER_CODE&orderCode="+wuliucode,
																timeout:   20000,
																success: function (jsonData) {	
																	var jsonData_=jsonData;
																	if(jsonData_){
																		jsonData_=jsonData_.substring(10,jsonData_.length-1);
																		 
																		var wuliuJson = JSON.parse(jsonData_); 
																		if(wuliuJson.detailList&&$(wuliuJson.detailList).length>0){
																			var wuliudetail=wuliuJson.detailList[0];
																			if(wuliudetail&&wuliudetail.detail&&$(wuliudetail.detail).length>0){
																				var alldesc='';
																				for(i=0;i<wuliudetail.detail.length;i++){
																					var wuliaoObject=wuliudetail.detail[i];
																					
																					if(wuliaoObject.time){
																						alldesc+=wuliaoObject.time+" ";
																					}
																					
																					if(wuliaoObject.city){
																						alldesc+=wuliaoObject.city+" ";
																					}
																					
																					if(wuliaoObject.desc){
																						alldesc+=wuliaoObject.desc;;
																					}
																					
																					alldesc+=";";
																					if(i==(wuliudetail.detail.length-1)){
																						data.mainOrders[iii].trade.logisticsLastDesc=wuliaoObject.desc;
																					}
																				}
																				
																				data.mainOrders[iii].trade.logisticsDesc=alldesc;
																				
																			}
																		}
																	}
																},
																error: function (e) {
																}
															});
														}
													},
													error: function (e) {
													}
												});
											}
											
										}
										
									 }
								 }
								 
							
							 
							
						}
						var totalPage=data.page.totalPage;
						data.batchId=batchId;
						chrome.extension.sendMessage(data, function(response) {});
						if(pageNum<totalPage){
							 setTimeout(function () { 
							   getData(dateBegin,dateEnd,pageNum+1,batchId)
							}, timeInterval*1000);
						} else{

						}

					}
				}
		    },
		    error: function (e) {
		    }
		});
	
}

function getSendInfo(htmlData){
	var result={};
	var dataHtml=htmlData;
	var begin='var data = ';
	var end='script>';
	var beginI=dataHtml.indexOf(begin);
	if(beginI!=-1){
			dataHtml=dataHtml.substring(beginI+10);
			var endI=dataHtml.indexOf(end);
			if(endI!=-1){
				dataHtml=dataHtml.substring(0,endI-2);
				var finalHtml=dataHtml;
				var finalJson = JSON.parse(finalHtml); 
				
				if(finalJson.tabs&&$(finalJson.tabs).length>0){
					for(i=0;i<finalJson.tabs.length;i++){
						var tab__=finalJson.tabs[i];
						if(tab__.content&&"logistics"==tab__.id){
							result.logisticsName=tab__.content.logisticsName;
							result.buyerAddress=tab__.content.address;
							result.logisticsNum=tab__.content.logisticsNum;
						}
					}
				}
				
				if(finalJson.mainOrder&&finalJson.mainOrder.orderInfo&&finalJson.mainOrder.orderInfo.lines){
					 
					if($(finalJson.mainOrder.orderInfo.lines).length>0){
						for(i=0;i<finalJson.mainOrder.orderInfo.lines.length;i++){
							var content__=finalJson.mainOrder.orderInfo.lines[i].content;
							if(content__&&$(content__).length>0){
								 for(i=0;i<content__.length;i++){
									var values__=content__[i];
									if(values__&&values__.value&&values__.value.name){
										if(values__.value.name.indexOf("支付宝")!=-1){
											result.alipayId=values__.value.value;
										}  
										if(values__.value.name.indexOf("创建")!=-1){
											result.createTime=values__.value.value;
										} 
										if(values__.value.name.indexOf("发货")!=-1){
											result.sendTime=values__.value.value;
										} 
										if(values__.value.name.indexOf("付款")!=-1){
											result.payTime=values__.value.value;
										} 
									}
								}
							}
						}
					}
				}
				if(finalJson.buyMessage){
					result.buy_message=finalJson.buyMessage;
				}
				if(finalJson.orderBar&&finalJson.orderBar.currentIndex){
					result.orderBar=finalJson.orderBar.currentIndex;
					if(finalJson.orderBar.nodes&&$(finalJson.orderBar.nodes).length>0){
						for(i=0;i<finalJson.orderBar.nodes.length;i++){
							if(result.orderBar==finalJson.orderBar.nodes[i].index){
								result.orderBarText=finalJson.orderBar.nodes[i].text;
							}
						}
					}
				}
			}
	}
	return result;
}





