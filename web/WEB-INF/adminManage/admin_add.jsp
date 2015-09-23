<%--
  Created by IntelliJ IDEA.
  User: ML3426
  Date: 2015/9/19 0019
  Time: 22:00
  部门添加页面
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>
    .month {
        font-size: small;
    }
</style>
<section class="content-header">
    <h1>
        添加管理员
        <small>为系统添加管理员</small>
    </h1>
    <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-home"></i> 系统管理</a></li>
        <li class="active">添加管理员</li>
    </ol>
</section>

<section class="content">
    <div class="row">
        <div class="col-md-12">
            <div class="box box-info">
                <div class="box-header with-border">
                    <h3 class="box-title">
                        添加管理员
                    </h3>
                </div> <!--herder 结束-->

                <form class="form-horizontal" id="admin_add_form">
                    <div class="box-body">
                        <div class="form-group">
                            <label for="admin_name" class="col-sm-5 control-label">管理员账户名</label>

                            <div class="col-sm-3">
                                <input type="text" name="admin_name" class="form-control" id="admin_name" placeholder="管理员账户名">
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="admin_pass" class="col-sm-5 control-label">管理员密码</label>

                            <div class="col-sm-3">
                                <input type="password" name="admin_pass" class="form-control" id="admin_pass" placeholder="管理员密码">
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="admin_repass" class="col-sm-5 control-label">重复密码</label>

                            <div class="col-sm-3">
                                <input type="password" name="admin_repass" class="form-control" id="admin_repass" placeholder="重复密码">
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="admin_idnum" class="col-sm-5 control-label">管理员员工号</label>

                            <div class="col-sm-3">
                                <input type="password" name="admin_idnum" class="form-control" id="admin_idnum" placeholder="管理员员工号">
                            </div>
                        </div>
                    </div>

                    <div class="box-footer">
                        <button id="admin_add_save" type="button" class="btn btn-info pull-right">保存</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</section>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/pagejs/admin_add.js"></script>