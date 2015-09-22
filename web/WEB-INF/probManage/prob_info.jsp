<%--
  Created by IntelliJ IDEA.
  User: ML3426
  Date: 2015/9/20 0020
  Time: 16:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--dataTables-css-->
<link rel="stylesheet"
      href="${pageContext.request.contextPath}/plugins/datatables/media/css/dataTables.bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/datepicker/css/bootstrap-datepicker3.min.css">
<style>
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
        试用期审查
        <small>对试用员工进行审查</small>
    </h1>
    <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-male"></i> 人员管理</a></li>
        <li>试用期管理</li>
        <li class="active">试用期审查</li>
    </ol>
</section>

<section class="content">
    <div class="row">
        <div class="col-md-12">
            <div class="box box-primary">
                <div class="box-header with-border">
                    <h3 class="box-title">
                        试用期审查
                    </h3>
                </div> <!--herder 结束-->

                <form class="form-horizontal">
                    <div class="box-body">
                        <span>请输入查询条件：（至少填写一项）</span>
                        <div class="form-group">
                            <label for="emp_id" class="col-sm-6 control-label">员工编号：</label>

                            <div class="col-sm-3">
                                <input type="text" class="form-control" id="emp_id" name="emp_id" placeholder="员工编号">
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="emp_name" class="col-sm-6 control-label">员工姓名 (支持模糊查询)：</label>

                            <div class="col-sm-3">
                                <input type="text" class="form-control" id="emp_name" name="emp_name" placeholder="员工编号">
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="emp_prob_start" class="col-sm-6 control-label">试用期开始时间：</label>

                            <div class="col-sm-3">
                                <input type="text" class="form-control" id="emp_prob_start" name="emp_prob_start" placeholder="试用期开始时间">
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="emp_prob_end" class="col-sm-6 control-label">试用期结束时间：</label>

                            <div class="col-sm-3">
                                <input type="text" class="form-control" id="emp_prob_end" name="emp_prob_end" placeholder="试用期结束时间">
                            </div>
                        </div>
                    </div>

                    <div class="box-footer">
                        <button type="button" class="btn btn-info pull-right" id="prob_search_btn">查询</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <div class="row rhide" id="prob_result_div">
        <div class="col-xs-12">
            <div class="box">
                <div class="box-header">
                    <h3 class="box-title">查询结果</h3>
                </div>

                <div class="box-body">
                    <table class="table table-bordered table-striped table-hover" id="emp_prob_result">
                        <thead>
                            <tr>
                                <th></th>
                                <th>员工编号</th>
                                <th>姓名</th>
                                <th>部门名称</th>
                                <th>岗位名称</th>
                                <th>试用期状态</th>
                                <th>试用期开始日期</th>
                                <th>试用期结束日期</th>
                                <th>操作</th>
                            </tr>
                        </thead>

                        <tbody>
                            <tr>
                                <td></td>
                                <td>员工编号</td>
                                <td>姓名</td>
                                <td>部门名称</td>
                                <td>岗位名称</td>
                                <td>试用期状态</td>
                                <td>试用期开始日期</td>
                                <td>试用期结束日期</td>
                                <td></td>
                            </tr>
                        </tbody>

                        <tfoot>
                        <tr>
                            <th></th>
                            <th>员工编号</th>
                            <th>姓名</th>
                            <th>部门名称</th>
                            <th>岗位名称</th>
                            <th>试用期状态</th>
                            <th>试用期开始日期</th>
                            <th>试用期结束日期</th>
                            <th>操作</th>
                        </tr>
                        </tfoot>
                    </table>
                </div>
            </div>
        </div>
    </div>
</section>
<!--dataTables-javascript-->
<script type="text/javascript"
        src="${pageContext.request.contextPath}/plugins/datatables/media/js/jquery.dataTables.min.js"></script>
<!--dataTables-bootstrap-->
<script type="text/javascript"
        src="${pageContext.request.contextPath}/plugins/datatables/media/js/dataTables.bootstrap.min.js"></script>
<script type="text/javascript"
        src="${pageContext.request.contextPath}/plugins/datepicker/js/bootstrap-datepicker.min.js"></script>
<script type="text/javascript"
        src="${pageContext.request.contextPath}/plugins/datepicker/locales/bootstrap-datepicker.zh-CN.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/pagejs/prob_info.js"></script>