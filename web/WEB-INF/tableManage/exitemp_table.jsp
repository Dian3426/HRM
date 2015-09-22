<%--
  Created by IntelliJ IDEA.
  User: ML3426
  Date: 2015/9/20 0020
  Time: 16:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/datepicker/css/bootstrap-datepicker3.min.css">
<!--dataTables-css-->
<link rel="stylesheet"
      href="${pageContext.request.contextPath}/plugins/datatables/media/css/dataTables.bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/select2/dist/css/select2.min.css">
<style>
    .table-title {
        text-align: center;
    }

    .month {
        font-size: small;
    }

    .table-part {
        text-align: center;
    }

    .table > tbody > tr > td, .table > tbody > tr > th, .table > tfoot > tr > td, .table > tfoot > tr > th, .table > thead > tr > td, .table > thead > tr > th {
        vertical-align: middle;
        height: 50px;
    }

    .td-control {
        width: 100%;
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
        离职员工报表
        <small>查询各部门新聘员工情况</small>
    </h1>
    <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-table"></i> 报表管理</a></li>
        <li class="active">离职员工报表</li>
    </ol>
</section>

<section class="content">
    <div class="row">
        <div class="col-md-12">
            <div class="box box-primary">
                <div class="box-header with-border">
                    <h3 class="box-title">
                        离职员工查询
                    </h3>
                </div> <!--herder 结束-->

                <form class="form-horizontal">
                    <div class="box-body">
                        <span>请输入查询条件：（至少填写一项）</span>

                        <div class="form-group">
                            <label for="search_exit_time" class="col-sm-5 control-label">起止时间</label>

                            <div class="input-daterange col-sm-3" id="search_exit_time" style="width: 25%;">
                                从<input type="text" class="form-control" name="emp_job_start"
                                        placeholder="开始时间"/>
                                到<input type="text" class="form-control" name="emp_job_end"
                                        placeholder="结束时间"/>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="search_dept" class="col-sm-5 control-label">指定部门</label>

                            <div class="col-sm-3">
                                <select name="search_dept" id="search_dept" class="form-control">
                                    <option value="XX">XX</option>
                                    <option value="XX">XX</option>
                                    <option value="XX">XX</option>
                                    <option value="XX">XX</option>
                                    <option value="XX">XX</option>
                                </select>
                            </div>
                        </div>
                    </div>

                    <div class="box-footer">
                        <button type="button" class="btn btn-info pull-right" id="exitemp_search_btn">查询</button>
                    </div>
                </form>
            </div>
        </div>
    </div>

    <div class="row rhide" id="newemp_div">
        <div class="col-xs-12">
            <div class="box">
                <div class="box-header">
                    <h3 class="box-title">查询结果</h3>
                </div>

                <div class="box-body">
                    <table class="table table-bordered table-striped table-hover" id="exitemp_table_table">
                        <thead>
                        <tr>
                            <th></th>
                            <th>员工编号</th>
                            <th>部门名称</th>
                            <th>部门名称</th>
                            <th>姓名</th>
                            <th>性别</th>
                            <th>入职日期</th>
                            <th>学历</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td></td>
                            <td>员工编号</td>
                            <td>部门名称</td>
                            <td>部门名称</td>
                            <td>姓名</td>
                            <td>性别</td>
                            <td>入职日期</td>
                            <td>学历</td>
                        </tr>
                        </tbody>
                        <tfoot>
                        <tr>
                            <th></th>
                            <th>员工编号</th>
                            <th>部门名称</th>
                            <th>部门名称</th>
                            <th>姓名</th>
                            <th>性别</th>
                            <th>入职日期</th>
                            <th>学历</th>
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
<script type="text/javascript"
        src="${pageContext.request.contextPath}/plugins/select2/dist/js/select2.full.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/pagejs/exitemp_table.js"></script>