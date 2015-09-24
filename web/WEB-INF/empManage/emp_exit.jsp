<%--
  Created by IntelliJ IDEA.
  User: ML3426
  Date: 2015/9/21 0021
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/datepicker/css/bootstrap-datepicker3.min.css">
<!--dataTables-css-->
<link rel="stylesheet"
      href="${pageContext.request.contextPath}/plugins/datatables/media/css/dataTables.bootstrap.min.css">
<style>
    .month {
        font-size: small;
    }
    .table > tbody > tr > td, .table > tbody > tr > th, .table > tfoot > tr > td, .table > tfoot > tr > th, .table > thead > tr > td, .table > thead > tr > th {
        vertical-align: middle;
        height: 50px;
    }

    .td-control > label {
        font-weight: normal;
    }

    .rhide {
        display: none;
    }

    @-webkit-keyframes fadeInDown {
        from {
            opacity: 0;
            -webkit-transform: translate3d(0, -5%, 0);
            transform: translate3d(0, -5%, 0)
        }
        to {
            opacity: 1;
            -webkit-transform: none;
            transform: none
        }
    }

    @keyframes fadeInDown {
        from {
            opacity: 0;
            -webkit-transform: translate3d(0, -5%, 0);
            transform: translate3d(0, -5%, 0)
        }
        to {
            opacity: 1;
            -webkit-transform: none;
            transform: none
        }
    }

    .fadeInDown {
        -webkit-animation-name: fadeInDown;
        animation-name: fadeInDown
    }
</style>
<section class="content-header">
    <h1>
        员工离职办理
        <small>将员工离职</small>
    </h1>
    <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-male"></i> 人员管理</a></li>
        <li>离职管理</li>
        <li class="active">员工离职办理</li>
    </ol>
</section>

<section class="content">
    <div class="row">
        <div class="col-md-12">
            <div class="box box-primary">
                <div class="box-header with-border">
                    <h3 class="box-title">
                        查询人才库
                    </h3>
                </div> <!--herder 结束-->

                <form class="form-horizontal">
                    <div class="box-body">
                        <div class="form-group">
                            <label for="emp_dept_num" class="col-sm-6 control-label">部门编号</label>

                            <div class="col-sm-3">
                                <input type="text" class="form-control" id="emp_dept_num" placeholder="部门编号">
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="emp_dept_name" class="col-sm-6 control-label">部门名称</label>

                            <div class="col-sm-3">
                                <input type="text" class="form-control" id="emp_dept_name" placeholder="部门名称">
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="emp_num" class="col-sm-6 control-label">员工编号</label>

                            <div class="col-sm-3">
                                <input type="text" class="form-control" id="emp_num" placeholder="员工编号">
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="emp_name" class="col-sm-6 control-label">员工姓名</label>

                            <div class="col-sm-3">
                                <input type="text" class="form-control" id="emp_name" placeholder="员工姓名">
                            </div>
                        </div>
                    </div>

                    <div class="box-footer">
                        <button type="button" class="btn btn-info pull-right" id="emp_search_btn">查询</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <div class="row rhide" id="emp_exit_resultdiv">
        <div class="col-xs-12">
            <div class="box">
                <div class="box-header">
                    <h3 class="box-title">查询结果</h3>
                </div>

                <div class="box-body">
                    <table class="table table-bordered table-striped table-hover" id="emp_exit_result">
                        <thead>
                        <tr>
                            <th>员工编号</th>
                            <th>姓名</th>
                            <th>部门名称</th>
                            <th>岗位名称</th>
                            <th></th>
                        </tr>
                        </thead>

                        <tfoot>
                        <tr>
                            <th>员工编号</th>
                            <th>姓名</th>
                            <th>部门名称</th>
                            <th>岗位名称</th>
                            <th></th>
                        </tr>
                        </tfoot>
                    </table>
                </div>
            </div>
        </div>
    </div>
</section>
<script type="text/javascript"
        src="${pageContext.request.contextPath}/plugins/datepicker/js/bootstrap-datepicker.min.js"></script>
<script type="text/javascript"
        src="${pageContext.request.contextPath}/plugins/datepicker/locales/bootstrap-datepicker.zh-CN.min.js"></script>
<!--dataTables-javascript-->
<script type="text/javascript"
        src="${pageContext.request.contextPath}/plugins/datatables/media/js/jquery.dataTables.min.js"></script>
<!--dataTables-bootstrap-->
<script type="text/javascript"
        src="${pageContext.request.contextPath}/plugins/datatables/media/js/dataTables.bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/pagejs/emp_exit.js"></script>