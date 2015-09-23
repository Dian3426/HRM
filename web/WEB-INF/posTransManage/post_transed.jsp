<%--
  Created by IntelliJ IDEA.
  User: ML3426
  Date: 2015/9/21 0021
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/icheck/skins/all.css">
<section class="content-header">
    <h1>
        已调动员工查询
        <small>部门岗位调动</small>
    </h1>
    <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-exchange"></i> 调动管理</a></li>
        <li class="active">已调动员工查询</li>
    </ol>
</section>

<section class="content">
    <div class="row">
        <div class="col-md-12">
            <div class="box box-primary">
                <div class="box-header with-border">
                    <h3 class="box-title">
                        已调动员工查询
                    </h3>
                </div> <!--herder 结束-->

                <form class="form-horizontal" id="post_transed_form">
                    <div class="box-body">
                        <div class="form-group">
                            <label for="trans_emp_id" class="col-sm-5 control-label">员工编号：</label>

                            <div class="col-sm-3">
                                <input type="text" class="form-control" id="trans_emp_id" name="trans_emp_id" placeholder="员工编号">
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="trans_emp_name" class="col-sm-5 control-label">员工姓名：</label>

                            <div class="col-sm-3">
                                <input type="text" class="form-control" id="trans_emp_name" name="trans_emp_name"
                                       placeholder="员工编号">
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="trans_time" class="col-sm-5 control-label">调动时间：</label>

                            <div class="col-sm-3">
                                <input type="text" class="form-control" id="trans_time" name="trans_time"
                                       placeholder="调动时间">
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="trans_type" class="col-sm-5 control-label">调动方式：</label>

                            <div class="col-sm-3" id="trans_type">
                                <input title="主动调动" name="trans_type" class="form-control" type="radio"> 主动调动
                                <input title="被动调动" name="trans_type" class="form-control" type="radio"> 被动调动
                            </div>
                        </div>
                    </div>

                    <div class="box-footer">
                        <button type="button" class="btn btn-info pull-right" id="emp_search_btn">保存</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</section>
<!--iCheck 1.0.2-->
<script type="text/javascript" src="${pageContext.request.contextPath}/plugins/icheck/icheck.min.js"></script>
<!--页面的JS-->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/pagejs/post_transed.js"></script>