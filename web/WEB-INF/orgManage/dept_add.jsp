<%--
  Created by IntelliJ IDEA.
  User: ML3426
  Date: 2015/9/19 0019
  Time: 22:00
  部门添加页面
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/datepicker/css/bootstrap-datepicker3.min.css">
<style>
    .month {
        font-size: small;
    }
</style>
<section class="content-header">
    <h1>
        部门添加
        <small>添加相应部门</small>
    </h1>
    <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-home"></i> 组织管理</a></li>
        <li>部门管理</li>
        <li class="active">部门添加</li>
    </ol>
</section>

<section class="content">
    <div class="row">
        <div class="col-md-12">
            <div class="box box-info">
                <div class="box-header with-border">
                    <h3 class="box-title">
                        添加新部门
                    </h3>
                </div> <!--herder 结束-->

                <form class="form-horizontal" id="dept_add_form">
                    <div class="box-body">
                        <div class="form-group">
                            <label for="dept_name" class="col-sm-2 control-label">部门名称</label>

                            <div class="col-sm-10">
                                <input type="text" name="dept_name" class="form-control" id="dept_name" placeholder="部门名称">
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="dept_type" class="col-sm-2 control-label">部门类型</label>

                            <div class="col-sm-10">
                                <select class="form-control" id="dept_type" name="dept_type">
                                    <option value="部门">部门</option>
                                    <option value="公司">公司</option>
                                </select>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="dept_tel" class="col-sm-2 control-label">部门电话</label>

                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="dept_tel" id="dept_tel" placeholder="部门电话">
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="dept_fax" class="col-sm-2 control-label">部门传真</label>

                            <div class="col-sm-10">
                                <input type="text" name="dept_fax" class="form-control" id="dept_fax" placeholder="部门传真">
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="dept_fax" class="col-sm-2 control-label">部门描述</label>

                            <div class="col-sm-10">
                                <textarea class="textarea" name="dept_desc" style="width: 100%; height: 200px; font-size: 14px; line-height: 18px;
                                border: 1px solid #dddddd; padding: 10px; resize: none" placeholder="部门描述"></textarea>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="dept_sdept" class="col-sm-2 control-label">上级部门</label>

                            <div class="col-sm-10">
                                <select class="form-control" name="dept_sdept" id="dept_sdept">
                                    <option value="0">无</option>
                                </select>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="dept_ftime" class="col-sm-2 control-label">成立日期</label>

                            <div class="col-sm-10 input-group date" style="padding-left: 15px; padding-right: 15px;">
                                <input id="dept_ftime" type="text" name="dept_ftime" class="form-control" placeholder="成立日期">
                                <span class="input-group-addon">
                                    <i class="glyphicon glyphicon-th"></i>
                                </span>
                            </div>
                        </div>
                    </div>

                    <div class="box-footer">
                        <button id="dept_add_save" type="button" class="btn btn-info pull-right">保存</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</section>
<script type="text/javascript"
        src="${pageContext.request.contextPath}/plugins/datepicker/js/bootstrap-datepicker.min.js"></script>
<script type="text/javascript"
        src="${pageContext.request.contextPath}/plugins/datepicker/locales/bootstrap-datepicker.zh-CN.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/plugins/form/jquery.form.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/plugins/datatables/extensions/fnReloadAjax.js"></script>
<!--Main.js-->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/pagejs/dept_add.js"></script>