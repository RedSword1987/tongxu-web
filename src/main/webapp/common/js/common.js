//获取js object对象key的数量
function getObjKeyNums(obj){
	var result=0;
	if(obj&&typeof obj=="object"){
		for(var each in obj){
			result++;
	   }
	}
	return result;
}



// 获取cookie
function getCookie(cname) {
	var value=$.cookie(cname);
	return value;
}

function formatter_datetime(value,row,index){  
	 if(value){

		 if(value.indexOf("-")==-1){
			 var date_l = new Date(value);
			 var time = date_l.CCFormat("yyyy-MM-dd hh:mm:ss");
			 return time;
		 } else if (chechInt(value)) {
			 var date_l = new Date(value*1);
			 var time = date_l.CCFormat("yyyy-MM-dd hh:mm:ss");
			 return time;
		 }
	 }
     return value;  
} 

function formatter_money(value,row,index){  
	 if(value){
		 s = parseFloat((value + "").replace(/[^\d\.-]/g, "")).toFixed(2) + "";   
	     return s;  
	 }else{
		 return "0.00";
	 }
    return value;  
} 






function formatter_pass(value){
    return "******";  
}


// 对Date的扩展，将 Date 转化为指定格式的String
// 月(M)、日(d)、小时(h)、分(m)、秒(s)、季度(q) 可以用 1-2 个占位符，
// 年(y)可以用 1-4 个占位符，毫秒(S)只能用 1 个占位符(是 1-3 位的数字)
// 例子：
// (new Date()).Format("yyyy-MM-dd hh:mm:ss.S") ==> 2006-07-02 08:09:04.423
// (new Date()).Format("yyyy-M-d h:m:s.S") ==> 2006-7-2 8:9:4.18
Date.prototype.CCFormat = function (fmt) { // author: meizz
 var o = {
     "M+": this.getMonth() + 1, // 月份
     "d+": this.getDate(), // 日
     "h+": this.getHours(), // 小时
     "m+": this.getMinutes(), // 分
     "s+": this.getSeconds(), // 秒
     "q+": Math.floor((this.getMonth() + 3) / 3), // 季度
     "S": this.getMilliseconds() // 毫秒
 };
 if (/(y+)/.test(fmt)) fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
 for (var k in o)
 if (new RegExp("(" + k + ")").test(fmt)) fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
 return fmt;
}

// 获取cookie
function getDateOffset(days) {
	var date___=new Date();
	if(days){
		date___.setDate(date___.getDate()+days);
	}
	
	var time1 = date___.CCFormat("yyyy-MM-dd");
	return time1;
}


function chechInt(value){
	var result=true;
	var reg = new RegExp("^[0-9]*$");  
     if(!reg.test(value)){  
    	 result=false;
     }  
    return result;
}

function showLoading(){
	jQuery('body').showLoading(
			{ 
					'addClass': 'loading-indicator-bars' 
			}
	);
}

function hideLoading(){
	jQuery('body').hideLoading();
}


function getQueryString(name) {
	var reg = new RegExp('(^|&)' + name + '=([^&]*)(&|$)', 'i');
	var r = window.location.search.substr(1).match(reg);
	if (r != null) {
		return unescape(r[2]);
	}
	return null;
}

function getObjType(ooo) {
	var gettype = Object.prototype.toString;
	var objS = gettype.call(ooo);
	if (objS == "[object String]") {
		return "string";
	} else if (objS == "[object Number]") {
		return "number";
	} else if (objS == "[object Boolean]") {
		return "boolean";
	} else if (objS == "[object Undefined]") {
		return "undefined";
	} else if (objS == "[object Null]") {
		return "null";
	} else if (objS == "[object Object]") {
		return "object";
	} else if (objS == "[object Array]") {
		return "array";
	} else if (objS == "[object Function]") {
		return "function";
	}
	return "";
}


function formatterTaskStatus(value, row, index) {
	if (value) {
		value = value + '';
		if (value == 1) {
			return "待执行 (<a href='https://myseller.taobao.com/seller_admin.htm' target='_blank'>去抓数<a>)";
		} else if (value == 2) {
			if (row && row.code && "wuliu" == row.code) {
				return "成功 (<a href='/url/taskRunWuliuResult.action?id=" + row.id + "' target='_blank'>查看结果<a>)";
			}
			return "成功";
		} else if (value == 3) {
			return "失败";
		}
	}
	return value;
}