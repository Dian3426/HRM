<%--
  Created by IntelliJ IDEA.
  User: ML3426
  Date: 2015/9/21 0021
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<section class="content-header">
    <h1>
        部门岗位调动
        <small>部门岗位调动</small>
    </h1>
    <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-exchange"></i> 调动管理</a></li>
        <li class="active">部门岗位调动</li>
    </ol>
</section>

<section class="content">
    <div class="row">
        <div class="col-md-12">
            <div class="box box-primary">
                <div class="box-header with-border">
                    <h3 class="box-title">
                        部门岗位调动
                    </h3>
                </div> <!--herder 结束-->

                <form class="form-horizontal">
                    <div class="box-body">
                        <div class="form-group">
                            <label for="trans_dept_name" class="col-sm-5 control-label">部门名称</label>

                            <div class="col-sm-3">
                                <select class="form-control" id="trans_dept_name" name="trans_dept_name">
                                    <option value="行政部">行政部</option>
                                    <option value="技术部">技术部</option>
                                    <option value="公关部">公关部</option>
                                    <option value="行政部">行政部</option>
                                    <option value="网络部">网络部</option>
                                </select>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="trans_post_name" class="col-sm-5 control-label">岗位名称</label>

                            <div class="col-sm-3">
                                <select class="form-control" id="trans_post_name" name="trans_post_name">
                                    <option value="经理">经理</option>
                                    <option value="总监">总监</option>
                                    <option value="职工">职工</option>
                                </select>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="trans_emp_name" class="col-sm-5 control-label">员工姓名</label>
                            <div class="col-sm-3">
                                <select class="form-control" id="trans_emp_name" name="trans_emp_name">
                                    <option value="XX">XX</option>
                                    <option value="XX">XX</option>
                                    <option value="XX">XX</option>
                                </select>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="trans_new_post" class="col-sm-5 control-label">新部门岗位</label>
                            <div class="col-sm-3">
                                <select class="form-control" id="trans_new_post" name="trans_new_post">
                                    <option value="XX">XX</option>
                                    <option value="XX">XX</option>
                                    <option value="XX">XX</option>
                                </select>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="trans_type" class="col-sm-5 control-label">调转类型</label>
                            <div class="col-sm-3">
                                <select class="form-control" id="trans_type" name="trans_type">
                                    <option value="主动">主动</option>
                                    <option value="被动">被动</option>
                                </select>
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
