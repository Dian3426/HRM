<%--
  Created by IntelliJ IDEA.
  User: ML3426
  Date: 2015/9/22 0022
  Time: 1:45
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
        人事月报
        <small>人事月报</small>
    </h1>
    <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-table"></i> 报表管理</a></li>
        <li class="active">人事月报</li>
    </ol>
</section>

<section class="content">
    <div class="row">
        <div class="col-md-12">
            <div class="box box-primary">
                <div class="box-header with-border">
                    <h3 class="box-title">
                        人事月报
                    </h3>
                </div> <!--herder 结束-->

                <form class="form-horizontal">
                    <div class="box-body">
                        <span>请输入查询条件：</span>

                        <div class="form-group">
                            <label for="search_exit_time" class="col-sm-5 control-label">月份</label>

                            <div class="col-sm-3" id="search_exit_time" style="width: 25%;">
                                <input type="text" id="hr_month" class="form-control" name="hr_month"
                                       placeholder="月份"/>
                            </div>
                        </div>
                    </div>

                    <div class="box-footer">
                        <button type="button" class="btn btn-info pull-right" id="hr_month_btn">查询</button>
                    </div>
                </form>
            </div>
        </div>
    </div>

    <div class="row rhide" id="hr_month_div">
        <div class="col-xs-12">
            <div class="box">
                <div class="box-header">
                    <h3 class="box-title">查询结果</h3>
                </div>

                <div class="box-body">
                    <table class="table table-bordered table-striped table-hover" id="hr_month_table">
                        <tr>
                            <th colspan="11">XXXX-XX 人事月报</th>
                        </tr>
                        <tr>
                            <td rowspan="2">部门名称</td>
                            <td colspan="6">人数统计</td>
                            <td colspan="4">学历统计</td>
                        </tr>
                        <tr>
                            <td>学历统计</td>
                            <td>月末人数</td>
                            <td>本月新入职</td>
                            <td>本月新入职</td>
                            <td>本月调入</td>
                            <td>本月调入</td>
                            <td>研究生</td>
                            <td>本科</td>
                            <td>大专</td>
                            <td>高中及以下</td>
                        </tr>
                        <tr>
                            <td>XX</td>
                            <td>1</td>
                            <td>1</td>
                            <td>1</td>
                            <td>1</td>
                            <td>1</td>
                            <td>1</td>
                            <td>1</td>
                            <td>1</td>
                            <td>1</td>
                            <td>1</td>
                        </tr>
                        <tr>
                            <td>XX</td>
                            <td>1</td>
                            <td>1</td>
                            <td>1</td>
                            <td>1</td>
                            <td>1</td>
                            <td>1</td>
                            <td>1</td>
                            <td>1</td>
                            <td>1</td>
                            <td>1</td>
                        </tr>
                        <tr>
                            <td>XX</td>
                            <td>1</td>
                            <td>1</td>
                            <td>1</td>
                            <td>1</td>
                            <td>1</td>
                            <td>1</td>
                            <td>1</td>
                            <td>1</td>
                            <td>1</td>
                            <td>1</td>
                        </tr>
                        <tr>
                            <td>XX</td>
                            <td>1</td>
                            <td>1</td>
                            <td>1</td>
                            <td>1</td>
                            <td>1</td>
                            <td>1</td>
                            <td>1</td>
                            <td>1</td>
                            <td>1</td>
                            <td>1</td>
                        </tr>
                        <tr>
                            <td>XX</td>
                            <td>1</td>
                            <td>1</td>
                            <td>1</td>
                            <td>1</td>
                            <td>1</td>
                            <td>1</td>
                            <td>1</td>
                            <td>1</td>
                            <td>1</td>
                            <td>1</td>
                        </tr>
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
<script type="text/javascript" src="${pageContext.request.contextPath}/js/pagejs/hr_month_table.js"></script>