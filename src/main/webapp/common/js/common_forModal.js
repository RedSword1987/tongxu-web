//初始化添加弹出框
//fileType: 1:string   2：int  3：date    4：area   5:radio  6.password  10:下拉 ka的选项  13:日期的时分秒
//isHidden:默认的不需要展示编辑的保存字段值
function initAddModal(addFields_p){
	var content="";
	$.each(addFields_p,function(i,value){
		if(value.isHidden){
			 content+='<input type="hidden" id="addForm_'+value.field+'" value="'+value.defaultValue+'">';
		}else{
			 content+='<div class="form-group" id="form-group-'+value.field+'">';
			 content+='<label class="control-label col-md-3 col-sm-3 col-xs-12" for="addForm_'+value.field+'">'+value.title;
			 if(value.require){
				 content+=' <span class="required">*</span>';
			 }
			 content+='</label>';
			 content+='<div class="col-md-6 col-sm-6 col-xs-12">';
			 if(3==value.fileType){
				 var defaultV="";
				 if(value.defaultValue!=null){
					 defaultV=getDateOffset(value.defaultValue);
				 }
				 content+='<div id="'+value.field+'-date" class="input-group date form_date  col-md-12 col-sm-12 col-xs-12" data-date="'+defaultV+'" data-date-format="yyyy-mm-dd" data-link-field="addForm_'+value.field+'"  data-link-format="yyyy-mm-dd">';
				 content+='<input class="form-control" size="16" type="text"   readonly value="'+defaultV+'"> <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>';
				 content+='</div>';
				content+='<input type="hidden" id="addForm_'+value.field+'" value="'+defaultV+'"/> ';
			 } else if(13==value.fileType){
				 var defaultV="";
				 content+='<div id="'+value.field+'-date" class="input-group date form_date  col-md-12 col-sm-12 col-xs-12" data-date="'+defaultV+'" data-date-format="hh:ii:ss" data-link-field="addForm_'+value.field+'"  data-link-format="hh:ii:ss">';
				 content+='<input class="form-control" size="16" type="text"   readonly value="'+defaultV+'"> <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>';
				 content+='</div>';
				content+='<input type="hidden" id="addForm_'+value.field+'" value="'+defaultV+'"/> ';
			 }else if(23==value.fileType){
				 var defaultV="";
				 if(value.defaultValue!=null){
					 defaultV=value.defaultValue;
				 }

				 content+='<div id="'+value.field+'-date" class="input-group date form_date  col-md-12 col-sm-12 col-xs-12" data-date="'+defaultV+'" data-date-format="yyyy-mm-dd hh:ii:ss" data-link-field="addForm_'+value.field+'"  data-link-format="yyyy-mm-dd hh:ii:ss">';
				 content+='<input class="form-control" size="16" type="text"   readonly value="'+defaultV+'"> <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>';
				 content+='</div>';
				 content+='<input type="hidden" id="addForm_'+value.field+'" value="'+defaultV+'"/> ';
			 }else if(2==value.fileType){
				 if(value.defaultValue){
					 content+='<input type="text"  id="addForm_'+value.field+'"   value="'+value.defaultValue+'"  class="form-control col-md-7 col-xs-12">';
				 }else{
					 content+='<input type="text"  id="addForm_'+value.field+'"     class="form-control col-md-7 col-xs-12">';
				 }
			 }else if(5==value.fileType){
				 if(value.defaultValue&&value.defaultValue=="0"){
					  content+='<div class="control-label" style="text-align: left;" >是:<input type="radio" class="flat" name="radio_'+value.field+'" id="addForm_'+value.field+'_1" value="1"   style="margin-right: 15px!important;"/> ';
				      content+='    否:<input type="radio" class="flat" name="radio_'+value.field+'" id="addForm_'+value.field+'_0" value="0" checked="checked"/></div> ';
				 }else{
					 content+='<div class="control-label" style="text-align: left;" >是:<input type="radio" class="flat" name="radio_'+value.field+'" id="addForm_'+value.field+'_1" value="1"  checked="checked" style="margin-right: 15px!important;"/> ';
					 content+='    否:<input type="radio" class="flat" name="radio_'+value.field+'" id="addForm_'+value.field+'_0" value="0" /></div>  ';
				 }
			 } else if(10==value.fileType){
				 var select_content=value.select_content;
				 content+='<select id="addForm_'+value.field+'" class="form-control">';
				 content+=select_content;
				 content+='</select>';
	         
			 }else if(11==value.fileType){
				 var select_content=value.select_content;
				 content+='<select id="addForm_'+value.field+'" class="select2_multiple form-control col-md-7 col-xs-12" multiple="multiple"  style="width: 100%">';
				 content+=select_content;
				 content+='</select>';
	         
			 }else if(6==value.fileType){
				 if(value.defaultValue){
					 content+='<input type="password"  id="addForm_'+value.field+'"   value="'+value.defaultValue+'"  class="form-control col-md-7 col-xs-12">';
				 }else{
					 content+='<input type="password"  id="addForm_'+value.field+'"     class="form-control col-md-7 col-xs-12">';
				 }
			 }else  if(27==value.fileType){
				 content+='<textarea type="textarea" rows="3"   id="addForm_'+value.field+'" class="form-control col-md-7 col-xs-12"></textarea>';
			 }else{
				 if(value.defaultValue){
					 content+='<input type="text"  id="addForm_'+value.field+'"   value="'+value.defaultValue+'"  class="form-control col-md-7 col-xs-12">';
				 }else{
					 content+='<input type="text"  id="addForm_'+value.field+'"     class="form-control col-md-7 col-xs-12">';
				 }
			 }
			 content+='</div>';
			 content+='</div>';
		}
	 });
	$("#addModal_form").html(content);
	var today__=new Date();
	$.each(addFields_p,function(i,value){
		if(3==value.fileType){
			$('#'+value.field+'-date').datetimepicker({
		        language:  'zh-CN',
		        weekStart: 1,
		        todayBtn:  1,
				autoclose: 1,
				todayHighlight: 1,
				startView: 2,
				minView: 2,
				forceParse: 1
		    });
		}else if(13==value.fileType){
			$('#'+value.field+'-date').datetimepicker({
				 language:  'zh-CN',
			        weekStart: 1,
			        todayBtn:  1,
			        autoclose: 1,
			        todayHighlight: 1,
			        startView: 1,
			        minView: 0,
			        forceParse: 1 ,
			        minuteStep:2
		    });
		}else if(23==value.fileType){
			$('#'+value.field+'-date').datetimepicker({
				language:  'zh-CN',
				weekStart: 1,
				todayBtn:  1,
				autoclose: 1,
				todayHighlight: 1,
				startView: 1,
				minView: 0,
				forceParse: 1 ,
				minuteStep:2
			});
		}else if(11==value.fileType){
			$('#addForm_'+value.field).select2({
				placeholder: "请选择用户",
				allowClear: true
	        });
		}
	});
	
	
	$("#addModal").modal('show')
}

// 字段的属性  isShow：字段只做展示，不可编辑
function initUpdateModal(obj,updateFields ){
	
	var updateContent="";
	$.each(updateFields,function(i,value){
		updateContent += '<div class="form-group">';
		updateContent += '<label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name">' + value.title;
		if (value.require) {
			updateContent += ' <span class="required">*</span>';
		}
		updateContent += '</label>';
		updateContent += '<div class="col-md-6 col-sm-6 col-xs-12">';
		var field_value = obj[value.field];
		if (field_value == null) {
			field_value = "";
		}
		if (value.isShow) {
			if (field_value != null && field_value != '') {
				updateContent += '<div class="control-label" style="text-align: left;" >' + field_value + '</div>';
			} else {
				updateContent += '';
			}
		} else {
			if (3 == value.fileType) {
				updateContent += '<div id="' + value.field + '-date" class="input-group date form_date  col-md-12 col-sm-12 col-xs-12" data-date="' + field_value + '" data-date-format="yyyy-mm-dd" data-link-field="updateForm_' + value.field + '"  data-link-format="yyyy-mm-dd">';
				updateContent += '<input class="form-control" size="16" type="text"   readonly value="' + field_value + '"> <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>';
				updateContent += '</div>';
				updateContent += '<input type="hidden" id="updateForm_' + value.field + '" value="' + field_value + '"/> ';
			} else if (13 == value.fileType) {
				updateContent += '<div id="' + value.field + '-date" class="input-group date form_date  col-md-12 col-sm-12 col-xs-12" data-date="' + field_value + '" data-date-format="hh:ii:ss" data-link-field="updateForm_' + value.field + '"  data-link-format="hh:ii:ss">';
				updateContent += '<input class="form-control" size="16" type="text"   readonly value="' + field_value + '"> <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>';
				updateContent += '</div>';
				updateContent += '<input type="hidden" id="updateForm_' + value.field + '" value="' + field_value + '"/> ';
			} else if (5 == value.fileType) {
				updateContent += '<div style="margin-top: 5px; ">是:<input type="radio" class="flat" name="radio_' + value.field + '" id="updateForm_' + value.field + '_1" value="1"   style="margin-right: 15px!important;"/> ';
				updateContent += '    否:<input type="radio" class="flat" name="radio_' + value.field + '" id="updateForm_' + value.field + '_0" value="0"  /></div> ';
			} else if (10 == value.fileType) {
				var select_content = value.select_content;
				updateContent += '<select id="updateForm_' + value.field + '" class="form-control">';
				updateContent += select_content;
				updateContent += '</select>';

			} else if (11 == value.fileType) {
				var select_content = value.select_content;
				updateContent += '<select id="updateForm_' + value.field + '" class="select2_multiple form-control col-md-7 col-xs-12" multiple="multiple"  style="width: 100%">';
				updateContent += select_content;
				updateContent += '</select>';

			} else if (6 == value.fileType) {
				if ((field_value != null && field_value != '') || ((typeof(field_value) == "number" || typeof(field_value) == "string") && field_value == '0')) {
					updateContent += '<input type="password"  id="updateForm_' + value.field + '"  value="' + field_value + '"  class="form-control col-md-7 col-xs-12">';
				} else {
					updateContent += '<input type="password"  id="updateForm_' + value.field + '"  value=""  class="form-control col-md-7 col-xs-12">';
				}
			} else if (27 == value.fileType) {
				updateContent += '<textarea type="textarea" rows="3"   id="updateForm_' + value.field + '" class="form-control col-md-7 col-xs-12"></textarea>';
			} else {
				if ((field_value != null && field_value != '') || ((typeof(field_value) == "number" || typeof(field_value) == "string") && field_value == '0')) {
					updateContent += '<input type="text"  id="updateForm_' + value.field + '"  value="' + field_value + '"  class="form-control col-md-7 col-xs-12">';
				} else {
					updateContent += '<input type="text"  id="updateForm_' + value.field + '"  value=""  class="form-control col-md-7 col-xs-12">';
				}
			}
		}


		updateContent += '</div>';
		updateContent += '</div>';
	 });
	 
	$("#updateModal_form").html(updateContent);
	$.each(updateFields,function(i,value){
		if(3==value.fileType){
			$('#'+value.field+'-date').datetimepicker({
		        language:  'zh-CN',
		        weekStart: 1,
		        todayBtn:  1,
				autoclose: 1,
				todayHighlight: 1,
				startView: 2,
				minView: 2,
				forceParse: 1
		    });
		}else if(13==value.fileType){
			$('#'+value.field+'-date').datetimepicker({
				 language:  'zh-CN',
			        weekStart: 1,
			        todayBtn:  1,
			        autoclose: 1,
			        todayHighlight: 1,
			        startView: 1,
			        minView: 0,
			        forceParse: 1 ,
			        minuteStep:2
		    });
		}else if(10==value.fileType){
			$("#updateForm_"+value.field).val(obj[value.field]);
		}else if(5==value.fileType){
			$("#updateForm_"+value.field+"_"+obj[value.field]).attr("checked",true);
		}else if(11==value.fileType){
			$('#updateForm_'+value.field).select2({
				placeholder: "请选择用户",
				allowClear: true
	        });
			var value_=obj[value.field];
			if(value_){
				var objjj=value_.split(",");
				$('#updateForm_'+value.field).val(objjj).trigger("change");
			}
		}
	});
	
	$("#updateModal").modal('show')
	
}

function clearSearchForm(){
	$("#btn_search_content input[id^='searchForm_']:text").each(function(){
		$(this).val("");
	});
	$("#btn_search_content input[id^='searchForm_']:hidden").each(function(){
		//日期控件
		var id=$(this).attr("id");
		$("div[data-link-field='"+id+"']").attr("data-date","");
		$("div[data-link-field='"+id+"'] input:text").val("");
		$(this).val("");
	});
	
	$("#btn_search_content select[id^='searchForm_']").each(function(){
		var id=$(this).attr("id");
		//下拉控件
		if(!$(this).hasClass("select2_single")){
			$(this).val("");
		}else{
			//var placeholder_=$("#select2-"+id+"-container").find("span.select2-selection__placeholder").html();
			//$(this).select2({
		          //placeholder: placeholder_,
		          //allowClear: true
		    //});
		}
	});
}

