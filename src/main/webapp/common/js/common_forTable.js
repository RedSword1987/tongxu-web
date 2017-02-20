var commonTableOption={
		method: 'GET',
		cache: false,
		striped: true,
		pagination: true,
		pageSize: 10,
		pageNumber:1,
		pageList: [10, 20, 50, 100],
		//是否展示搜索框
		search: false,
		//是否展示选择列
		showColumns: false,
		sidePagination:"server",
		//是否展示搜索按钮
		showRefresh: false,
		clickToSelect: true,
		toolbar: "#toolbar" ,
		queryParams: queryParams
		
};

//初始 化标准表格
//这边的method得为get，改成post后，后端没取到数据，等有空研究。
function initPage(tableId_p,idField_p,url_page_p,columns_p,own_option){
	var this_option={
			url:url_page_p,
			idField:idField_p,
			columns: columns_p
	};
	this_option=$.extend({},this_option,commonTableOption);
	if(own_option){
		this_option=$.extend({},this_option,own_option);
	}
	$('#'+tableId_p).bootstrapTable(this_option);
}

function getSearchFields(){
	var searchField={};
	$("#btn_search_content input[id^='searchForm_'],select[id^='searchForm_']").each(function(){
		var value_=$.trim($(this).val());
		if(value_!=''){
			var id=$.trim($(this).attr("id"));
			id=id.replace("searchForm_","");
			var idArr=id.split("----");
			var searchObj={};
			searchObj.searchType=idArr[1];
			searchObj.searchValue=value_;
			var alreadySearch=searchField[idArr[0]];
			if(alreadySearch){
				if(("3"==alreadySearch.searchType||"4"==alreadySearch.searchType)&&("3"==idArr[1]||"4"==idArr[1])){
					var oldSearchType=alreadySearch.searchType;
					var oldSearchValue=alreadySearch.searchValue;
					searchObj.searchType="5";
					if(value_>oldSearchValue){
						searchObj.searchValue=oldSearchValue+","+value_;
					}else{
						searchObj.searchValue=value_+","+oldSearchValue;
					}
				} 
			} 
			searchField[idArr[0]]=searchObj;
		}
	});
	return searchField;
}

function queryParams(params) {
	//搜索字段的搜索类型   1：全模糊   2： 等于    3：小于  4：大于    5：between区间
	var searchField=getSearchFields();
	var length_=getObjKeyNums(searchField);
	if(length_!=0){
		params["searchFields"]= JSON.stringify(searchField);  
	}
	
	return params
}


//随意定义的特殊字符，标识一项未选
var noChoose="-10000__";
//直接返回   -10000：一项未选    为空表示定义的idvalue有问题
function getChooseRawsIds(tableId_p,idField){
	var ids=noChoose;
	var select_arr=$('#'+tableId_p).bootstrapTable("getSelections");
	if(select_arr&&select_arr.length>0){
		 ids="";
		$.each(select_arr,function(i,value){
			var idValue=value[idField];
			if(idValue&&''!=idValue){
				ids+=","+idValue;
			}else if(0==idValue){
				ids+=","+idValue;
			}
		});
		if(ids.length!=0){
			ids=ids.substr(1);
		}
	}
	return ids;
}

//获取单选，被选中的行的json数据
function getChooseRawsJson(tableId_p){
	var result={};
	var select_arr=$('#'+tableId_p).bootstrapTable("getSelections");
	if(select_arr&&select_arr.length>0){
		result=select_arr[0];
	}
	return result;
}
