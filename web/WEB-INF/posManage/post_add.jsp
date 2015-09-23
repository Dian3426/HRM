<%--
  Created by IntelliJ IDEA.
  User: ML3426
  Date: 2015/9/19 0019
  Time: 22:00
  部门添加页面
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<section class="content-header">
    <h1>
        岗位添加
        <small>为部门添加岗位</small>
    </h1>
    <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-home"></i> 组织管理</a></li>
        <li>岗位管理</li>
        <li class="active">岗位添加</li>
    </ol>
</section>

<section class="content">
    <div class="row">
        <div class="col-md-12">
            <div class="box box-info">
                <div class="box-header with-border">
                    <h3 class="box-title">
                        添加新岗位
                    </h3>
                </div> <!--herder 结束-->

                <form class="form-horizontal" id="post_add_form">
                    <div class="box-body">
                        <div class="form-group">
                            <label for="post_name" class="col-sm-2 control-label">岗位名称</label>

                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="post_name" id="post_name" placeholder="岗位名称">
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="post_sdept" class="col-sm-2 control-label">上级部门</label>

                            <div class="col-sm-10">
                                <select class="form-control" name="post_sdept" id="post_sdept">
                                </select>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="post_type" class="col-sm-2 control-label">岗位类型</label>

                            <div class="col-sm-10">
                                <select class="form-control" name="post_type" id="post_type">
                                </select>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="post_num" class="col-sm-2 control-label">岗位编制</label>

                            <div class="col-sm-10">
                                <input type="number" class="form-control" name="post_num" id="post_num" placeholder="岗位编制">
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="dept_is_num" class="col-sm-2 control-label">编制限定</label>

                            <div class="col-sm-10">
                                <select class="form-control" name="post_isnum" id="dept_is_num">
                                    <option value="0">是</option>
                                    <option value="1">否</option>
                                </select>
                            </div>
                        </div>
                    </div>

                    <div class="box-footer">
                        <button type="button" id="btn_post_add_save" class="btn btn-info pull-right">保存</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</section>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/pagejs/post_add.js"></script>