//ajax单对象增加
function common_add(addFields_p,url_add,table_id_p){
	//更改了值的字段
	var check=true;
	var notEmptyFieldTitles="";
	var needAddFields={};
	
	$.each(addFields_p,function(i,value){
		var newValue;
		if(value.fileType&&value.fileType=="5"){
			newValue = $('input[name="radio_'+value.field+'"]:checked').val();
		} else{
			newValue=$.trim($("#addForm_"+value.field).val());	
		}
		if(newValue!=''){
			if(value.fileType=="2"){
				if(!chechInt(newValue)){
					check=false;
					alert(value.title+" 得为整数");
				}else{
					needAddFields[value.field]=newValue;
				}
			}else {
				needAddFields[value.field]=newValue;
			}
		}else {
			if(value.require&&check){
				check=false;
				alert(value.title+" 不可为空");
			}
		}
	 });
	
	if(check){
		var keys=getObjKeyNums(needAddFields);
		if(keys==0){
			check=false;
			alert("所有字段值均为空，请填写必要的参数");
		}
	}

	if(check){
		var param={};
		param.needAddFields= JSON.stringify(needAddFields);  
		showLoading();
		$.ajax({
                type: "post",
                url: url_add,
                data: param,
                dataType: "json",
                timeout:   20000,
                success: function (data) {
                	hideLoading();
					if(data.result){
						if(table_id_p){
							$('#'+table_id_p).bootstrapTable("refresh");
						}
						$('#addModal').modal('hide')
					}else{
						alert(data.msg);
					}
                },
                error: function (e) {
                	hideLoading();
                }
         });
	}
}		

//ajax删除动作
function common_delete(url_del_p,ids,idField,table_id_p){
	$.confirm({
	    title: '确认修改',
	    content: "确认删除所选项吗？",
	    confirm: function(){
	    	showLoading();
	    	$.ajax({
	    	    type: "post",
	    	    url: url_del_p,
	    	    data: {
	    	    	ids: ids,
	    	    	idField:idField
	    	    },
	    	    dataType: "json",
	    	    timeout:   20000,
	    	    success: function (data) {
	    	    	hideLoading();
	    			if(data.result){
	    				alert(data.msg);
	    				$('#'+table_id_p).bootstrapTable("refresh");
	    			}else{
	    				alert(data.msg);
	    			}
	    	    },
	    	    error: function (e) {
	    	    	hideLoading();
	    	    }
	    	});
	    }
	});
}

//获取单对象的数据
function common_getOne(url_getOne,id,idField_p,updateFields_p,url_update_p,one_data,table_id_p,idField_p){
	if(one_data){
		$('#updateModal_save').unbind("click");
		initUpdateModal(one_data,updateFields_p);
		$("#updateModal_save").click(function(){
			common_update(one_data,updateFields_p,url_update_p,table_id_p,idField_p)
		});
	}else{
		$.ajax({
		    type: "post",
		    url: url_getOne,
		    data: {
		    	id: id,
		    	idField:idField
		    },
		    dataType: "json",
		    timeout:   20000,
		    success: function (data) {
				if(data.result){
					$('#updateModal_save').unbind("click");
					initUpdateModal(data.one_data,updateFields_p);
					$("#updateModal_save").click(function(){
						common_update(data.one_data,updateFields,url_update_p,table_id_p)
					});
				}else{
					alert(data.msg);
				}
		    },
		    error: function (e) {
		    }
		});
	}
	
}

//修改单对象的数据
function common_update(obj,updateFields_p,url_update,table_id_p,idField_p){
	var check=true;
	
	//更改了值的字段
	var needUpdateFields={};
	
	$.each(updateFields_p,function(i,value){
		if(!value.isShow){
			var newValue;
			if(value.fileType&&value.fileType=="5"){
				newValue = $('input[name="radio_'+value.field+'"]:checked').val();
			}else{
				newValue=$.trim($("#updateForm_"+value.field).val());
			}
			
			if(newValue==''){
				if(value.require&&check){
					check=false;
					alert(value.title+" 不可为空");
				}else if(!(obj[value.field]==null)){
					needUpdateFields[value.field]=null;
				}else if(obj[value.field]){
					needUpdateFields[value.field]=newValue;
				}
			}else {
				
				if(value.fileType=="2"){
					if(!chechInt(newValue)){
						check=false;
						alert(value.title+" 得为整数");
					} 
				} 
				
				if(check){
					if(!(obj[value.field]==null)){
						needUpdateFields[value.field]=newValue;
					}else{
						if(newValue!=obj[value.field]){
							needUpdateFields[value.field]=newValue;
						}
					}
				}
			}
		}
	 });
	
	if(check){
		var keys=getObjKeyNums(needUpdateFields);
		if(keys==0){
			$('#updateModal').modal('hide')
			check=false;
		}
	}
	
	if(check){
		var param={};
		param[idField_p]=obj[idField_p];
		param.idField=idField_p;
		param.needUpdateFields= JSON.stringify(needUpdateFields);  
		
		showLoading();
		
		$.ajax({
                    type: "post",
                    url: url_update,
                    data: param,
                    dataType: "json",
                    timeout:   20000,
                    success: function (data) {
                    	hideLoading();
						if(data.result){
							$('#updateModal').modal('hide')
							$('#'+table_id_p).bootstrapTable("refresh");
						}else{
							alert(data.msg);
						}
                    },
                    error: function (e) {
                    	hideLoading();
                    }
             });
		}
}	


			

