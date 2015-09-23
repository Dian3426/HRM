<%--
  Created by IntelliJ IDEA.
  User: ML3426
  Date: 2015/9/18 0018
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--dataTables-javascript-->
<link rel="stylesheet"
      href="${pageContext.request.contextPath}/plugins/datatables/media/css/dataTables.bootstrap.min.css">
<style rel="stylesheet">
    .table > tbody > tr > td, .table > tbody > tr > th, .table > tfoot > tr > td, .table > tfoot > tr > th, .table > thead > tr > td, .table > thead > tr > th {
        vertical-align: middle;
    }
</style>
<section class="content-header">
    <h1>
        岗位查询
        <small>查询岗位信息</small>
    </h1>
    <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-home"></i> 组织管理</a></li>
        <li>岗位管理</li>
        <li class="active">岗位查询</li>
    </ol>
</section>
<section class="content">
    <div class="row">
        <div class="col-xs-12">
            <div class="box">
                <div class="box-header">
                    <h3 class="box-title">查看岗位信息</h3>
                </div>
                <div class="box-body">
                    <table id="post_table" class="table table-bordered table-striped table-hover" cellspacing="0">
                        <thead>
                        <tr>
                            <th>岗位编号</th>
                            <th>岗位名称</th>
                            <th>类型</th>
                            <th>所属部门</th>
                            <th>岗位编制</th>
                            <th>编制限定</th>
                            <th>操作</th>
                        </tr>
                        </thead>
                        <tfoot>
                        <tr>
                            <th>岗位编号</th>
                            <th>岗位名称</th>
                            <th>类型</th>
                            <th>所属部门</th>
                            <th>岗位编制</th>
                            <th>编制限定</th>
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
<!--dept_info.js-->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/pagejs/post_info.js"></script>