<%@ page language="java" pageEncoding="UTF-8" %>
<!-- 模态框（Modal） -->
<div class="modal fade" id="updateModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="updateModal_Label">更新信息</h4>
            </div>
            <div class="modal-body">
                <form id="updateModal_form" data-parsley-validate class="form-horizontal form-label-left">
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" id="updateModal_save">提交</button>
            </div>
        </div>
        <!-- /.modal-content -->
    </div>
    <!-- /.modal -->
</div>

<!-- 模态框（Modal） -->
<div class="modal fade" id="addModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="addModal_Label">添加信息</h4>
            </div>
            <div class="modal-body">
                <form id="addModal_form" data-parsley-validate class="form-horizontal form-label-left">
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" id="addModal_save">提交</button>
            </div>
        </div>
        <!-- /.modal-content -->
    </div>
    <!-- /.modal -->
</div>

<form action="" id="exportForm" method="post" target="_blank" style="display: none;">
    <input type="hidden" name="exportForm_sort" id="exportForm_sort">
    <input type="hidden" name="exportForm_order" id="exportForm_order">
    <input type="hidden" name="exportForm_searchFields" id="exportForm_searchFields">
</form>

<div id="fakeloader"></div>
  
    
