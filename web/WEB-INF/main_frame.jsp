<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: ML3426
  Date: 2015/9/18 0018
  Time: 8:44
  后台的母页
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!--设置字符集，IE浏览器兼容模式，以及设置移动设备兼容-->
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <title>HRM人事管理系统 - 仪表盘</title>
    <!--Bootstrap 3.3.5-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <!-- Font Awesome 4.4.0-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font-awesome.min.css">
    <!-- Ionicons 2.0.1-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/ionicons.min.css">
    <!--Main Theme Style-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/AdminLTE.min.css">
    <!--Main Theme All Skin-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/skins/_all-skins.min.css">
    <!--iCheck 1.0.2-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/icheck/skins/all.css">
    <!--Animate.css 3.4.0-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/animate.css/animate.min.css">
    <!--bootstrap-wysihtml5-->
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
    <!-- 添加IE兼容支持 -->
    <!--[if lt IE 9]>
    <script type="text/javascript" src="/plugins/html5shiv/html5shiv.min.js"></script>
    <script type="text/javascript" src="/plugins/respond/respond.min.js"></script>
    <![endif]-->
</head>
<body class="hold-transition skin-green-light sidebar-mini"> <!--Body 开始-->
<!--模态框 开始-->
<div class="modal fade" id="mainModal" tabindex="-1" role="dialog" aria-labelledby="mainModalLabel">
    <div class="modal-dialog modal-lg" role="document">
        <div class="modal-content">
            <div class="modal-header">
            </div>
            <div class="modal-body">
            </div>
            <div class="modal-footer">
            </div>
        </div>
    </div>
</div>

<div class="wrapper">
    <header class="main-header">
        <!--Logo开始-->
        <a href="./dashboard" class="logo">
            <!--MiniLogo-->
            <span class="logo-mini"><b>H</b>RM</span>
            <!--完整Logo-->
            <span class="logo-lg">HRM人事管理</span>
        </a>
        <!--导航条开始-->
        <nav class="navbar navbar-static-top" role="navigation">
            <!-- 边栏放大缩小-->
            <a href="javascript: null;" class="sidebar-toggle" data-toggle="offcanvas" role="button">
                <span class="sr-only">Toggle navigation</span>
            </a>

            <div class="navbar-custom-menu">
                <ul class="nav navbar-nav">
                    <!-- 用户头像下拉框 -->
                    <li class="dropdown user user-menu">
                        <a href="javascript: null;" class="dropdown-toggle" data-toggle="dropdown">
                            <img src="/img/user.png" class="user-image" alt="User Image">
                            <span class="hidden-xs"><s:property value="#session.emp_id"/></span>
                        </a>
                        <ul class="dropdown-menu">
                            <!-- 用户头像 -->
                            <li class="user-header">
                                <img src="/img/user.png" class="img-circle" alt="User Image">

                                <p>
                                    <s:property value="#session.emp_id"/> - CEO
                                    <small>入职时间 11月. 2012</small>
                                </p>
                            </li>
                            <!-- 菜单footer按钮-->
                            <li class="user-footer">
                                <div class="pull-left">
                                    <a href="javascript: null;" class="btn btn-default btn-flat">信息</a>
                                </div>
                                <div class="pull-right">
                                    <a href="javascript: null;" class="btn btn-default btn-flat">登出</a>
                                </div>
                            </li>
                        </ul>
                    </li>
                    <!-- 右侧控制面板图标 -->
                    <li>
                        <a href="javascript: null;" data-toggle="control-sidebar" style="min-height: 50px"><i
                                class="fa fa-gears"></i></a>
                    </li>
                </ul>
            </div>
        </nav>
    </header>

    <!--左侧菜单栏-->
    <aside class="main-sidebar">
        <section class="sidebar">
            <div class="user-panel">
                <div class="pull-left image">
                    <img src="/img/user.png" class="img-circle" alt="User Image">
                </div>
                <div class="pull-left info">
                    <p><s:property value="#session.emp_id"/></p>
                    <a href="javascript: null;"><i class="fa fa-circle text-success"></i> Online</a>
                </div>
            </div>
            <ul class="sidebar-menu">
                <li class="header">
                    功能管理
                </li>
                <li class="active treeview">
                    <a href="javascript: null;">
                        <i class="fa fa-home"></i> <span>组织管理</span>
                        <i class="fa fa-angle-left pull-right"></i>
                    </a>
                    <ul class="treeview-menu menu-open" style="display: block;">
                        <li>
                            <a href="javascript: null;"><i class="fa fa-circle-o"></i> 部门管理 <i
                                    class="fa fa-angle-left pull-right"></i></a>
                            <ul class="treeview-menu">
                                <li><a href="javascript: null;" id="dept_add"><i class="fa fa-circle-o"></i> 部门添加</a>
                                </li>
                                <li><a href="javascript: null;" id="dept_info"><i class="fa fa-circle-o"></i> 部门查询</a>
                                </li>
                            </ul>
                        </li>

                        <li>
                            <a href="javascript: null;"><i class="fa fa-circle-o"></i> 岗位管理 <i
                                    class="fa fa-angle-left pull-right"></i></a>
                            <ul class="treeview-menu">
                                <li><a href="javascript: null;" id="post_add"><i class="fa fa-circle-o"></i> 岗位添加</a>
                                </li>
                                <li><a href="javascript: null;" id="post_info"><i class="fa fa-circle-o"></i> 岗位查询</a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </li>
                <li class="treeview">
                    <a href="javascript: null;">
                        <i class="fa fa-male"></i> <span>人员管理</span>
                        <i class="fa fa-angle-left pull-right"></i>
                    </a>
                    <ul class="treeview-menu">
                        <li>
                            <a href="javascript: null;"><i class="fa fa-circle-o"></i> 入职管理 <i
                                    class="fa fa-angle-left pull-right"></i></a>
                            <ul class="treeview-menu">
                                <li><a href="javascript: null;" id="emp_add"><i class="fa fa-circle-o"></i> 输入员工</a>
                                </li>
                                <li><a href="javascript: null;" id="emp_info"><i class="fa fa-circle-o"></i> 查询人才库</a>
                                </li>
                            </ul>
                        </li>

                        <li>
                            <a href="javascript: null;"><i class="fa fa-circle-o"></i> 试用期管理 <i
                                    class="fa fa-angle-left pull-right"></i></a>
                            <ul class="treeview-menu">
                                <li><a href="javascript: null;" id="prob_info"><i class="fa fa-circle-o"></i> 试用期审查</a>
                                </li>
                                <li><a href="javascript: null;" id="probed_info"><i class="fa fa-circle-o"></i> 已转正员工查询</a>
                                </li>
                            </ul>
                        </li>

                        <li>
                            <a href="javascript: null;"><i class="fa fa-circle-o"></i> 离职管理 <i
                                    class="fa fa-angle-left pull-right"></i></a>
                            <ul class="treeview-menu">
                                <li><a href="javascript: null;" id="emp_exit"><i class="fa fa-circle-o"></i> 员工离职办理</a>
                                </li>
                                <li><a href="javascript: null;" id="emp_exited"><i class="fa fa-circle-o"></i>
                                    已离职员工查询</a></li>
                            </ul>
                        </li>
                    </ul>
                </li>
                <li class="treeview">
                    <a href="javascript: null;">
                        <i class="fa fa-exchange"></i> <span>调动管理</span>
                        <i class="fa fa-angle-left pull-right"></i>
                    </a>
                    <ul class="treeview-menu">
                        <li><a href="javascript: null;" id="post_trans"><i class="fa fa-circle-o"></i> 部门岗位调动</a></li>
                        <li><a href="javascript: null;" id="post_transed"><i class="fa fa-circle-o"></i> 已调动员工查询</a>
                        </li>
                    </ul>
                </li>
                <li class="treeview">
                    <a href="javascript: null;">
                        <i class="fa fa-info"></i> <span>信息管理</span>
                        <i class="fa fa-angle-left pull-right"></i>
                    </a>
                    <ul class="treeview-menu">
                        <li><a href="javascript: null;" id="emp_search"><i class="fa fa-circle-o"></i> 入职员工查询</a></li>
                    </ul>
                </li>
                <li class="treeview">
                    <a href="javascript: null;">
                        <i class="fa fa-table"></i> <span>报表管理</span>
                        <i class="fa fa-angle-left pull-right"></i>
                    </a>
                    <ul class="treeview-menu">
                        <li><a href="javascript: null;" id="newemp_table"><i class="fa fa-circle-o"></i> 新聘员工报表</a></li>
                        <li><a href="javascript: null;" id="exitemp_table"><i class="fa fa-circle-o"></i> 离职员工报表</a>
                        </li>
                        <li><a href="javascript: null;" id="dept_trans"><i class="fa fa-circle-o"></i> 部门岗位调动员工报表</a>
                        </li>
                        <li><a href="javascript: null;" id="hr_month"><i class="fa fa-circle-o"></i> 人事月报</a></li>
                    </ul>
                </li>
                <li class="treeview">
                    <a href="javascript: null;">
                        <i class="fa fa-wrench"></i> <span>系统管理</span>
                        <i class="fa fa-angle-left pull-right"></i>
                    </a>
                    <ul class="treeview-menu">
                        <li><a href="javascript: null;"><i class="fa fa-circle-o"></i> 添加管理员</a></li>
                        <li><a href="javascript: null;"><i class="fa fa-circle-o"></i> 查询管理员</a></li>
                    </ul>
                </li>
            </ul>
        </section>
    </aside>

    <div class="content-wrapper" id="page_container" style="padding-bottom: 50px">
        <section class="content-header">
            <h1>
                主页
                <small>欢迎来到HRM人事管理系统</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-home"></i> 主页</a></li>
                <li class="active">用户信息</li>
            </ol>
        </section>

        <section class="content">
            <div class="row">
                <div class="col-md-3">
                    <!--用户基本资料-->

                    <div class="box box-primary">
                        <div class="box-body box-profile">
                            <img class="profile-user-img img-responsive img-circle"
                                 src="/img/user.png" alt="User profile picture">

                            <h3 class="profile-username text-center"><s:property value="#session.emp_id"/></h3>

                            <p class="text-muted text-center">CEO</p>
                            <ul class="list-group list-group-unbordered">
                                <li class="list-group-item">
                                    <b>部门</b> <a class="pull-right">无</a>
                                </li>
                                <li class="list-group-item">
                                    <b>职位</b> <a class="pull-right">CEO</a>
                                </li>
                                <li class="list-group-item">
                                    <b>入职时间</b> <a class="pull-right">2012-11</a>
                                </li>
                            </ul>
                            <a href="#" class="btn btn-danger btn-block"><b>登出</b></a>
                        </div>
                    </div>

                    <div class="box box-primary">
                        <div class="box-header with-border">
                            <h3 class="box-title">About ZhangRan</h3>
                        </div>
                        <div class="box-body">
                            <strong><i class="fa fa-book margin-r-5"></i> 最高学历</strong>

                            <p class="text-muted">
                                博士
                            </p>

                            <hr>

                            <strong><i class="fa fa-map-marker margin-r-5"></i> 籍贯</strong>

                            <p class="text-muted">金昌</p>

                            <hr>

                            <strong><i class="fa fa-pencil margin-r-5"></i> 精通技能</strong>

                            <p>
                                <span class="label label-danger">UI Design</span>
                                <span class="label label-success">Coding</span>
                                <span class="label label-info">Javascript</span>
                                <span class="label label-warning">PHP</span>
                                <span class="label label-primary">Node.js</span>
                            </p>

                            <hr>

                            <strong><i class="fa fa-file-text-o margin-r-5"></i> 备注</strong>

                            <p>无</p>
                        </div>
                    </div>
                </div>
                <div class="col-md-9">
                    <div class="nav-tabs-custom">
                        <ul class="nav nav-tabs">
                            <li class="active"><a href="#timeline" data-toggle="tab">Timeline</a></li>
                        </ul>
                        <div class="tab-content">
                            <div class="active tab-pane" id="timeline">
                                <!-- The timeline -->
                                <ul class="timeline timeline-inverse">
                                    <!-- timeline time label -->
                                    <li class="time-label">
                                        <span class="bg-red">
                                          2015-09-18
                                        </span>
                                    </li>
                                    <li>
                                        <i class="fa fa-user bg-aqua"></i>

                                        <div class="timeline-item">
                                            <span class="time"><i class="fa fa-clock-o"></i> 5 mins ago</span>

                                            <h3 class="timeline-header no-border">写出了新的Windows 10</h3>
                                        </div>
                                    </li>
                                    <li>
                                        <i class="fa fa-magic bg-purple"></i>

                                        <div class="timeline-item">
                                            <span class="time"><i class="fa fa-clock-o"></i> 25 mins ago</span>

                                            <h3 class="timeline-header no-border">写出了新的OS X 11</h3>
                                        </div>
                                    </li>
                                    <li>
                                        <i class="fa fa-comments bg-gray"></i>

                                        <div class="timeline-item">
                                            <span class="time"><i class="fa fa-clock-o"></i> 50 mins ago</span>

                                            <h3 class="timeline-header no-border">发表言论引领了行业的发展</h3>
                                        </div>
                                    </li>
                                    <li class="time-label">
                                        <span class="bg-green">
                                          2015-09-18
                                        </span>
                                    </li>
                                    <!-- /.timeline-label -->
                                    <!-- timeline item -->
                                    <li>
                                        <i class="fa fa-user bg-yellow"></i>

                                        <div class="timeline-item">
                                            <span class="time"><i class="fa fa-clock-o"></i> 19:52</span>

                                            <h3 class="timeline-header no-border">成为了世界上最年轻的排名世界第一程序员的人</h3>
                                        </div>
                                    </li>
                                    <li>
                                        <i class="fa fa-clock-o bg-gray"></i>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </div>

    <footer class="main-footer" style="position: fixed; bottom: 0; width: 100%;;">
        <div class="pull-right hidden-xs">
            <b>Version</b> 0.0.1
        </div>
        <strong>Copyright &copy; 2014-2015 <a href="javascript: null;">软件工程1304</a>.</strong> All rights
        reserved.
    </footer>

    <!-- 控制栏 -->
    <aside class="control-sidebar control-sidebar-light">
        <!-- 创建标签栏 -->
        <ul class="nav nav-tabs nav-justified control-sidebar-tabs">
            <li class="active">
                <a href="#control-sidebar-theme-tab" data-toggle="tab" aria-expanded="true"><i class="fa fa-wrench"></i></a>
            </li>
        </ul>
        <!-- 标签面板 -->
        <div class="tab-content">
            <div id="control-sidebar-theme-demo-options-tab" class="tab-pane active">
                <div><h4 class="control-sidebar-heading">主题选择</h4>
                    <ul class="list-unstyled clearfix">
                        <li style="float:left; width: 33.33333%; padding: 5px;">
                            <a href="javascript:void(0);" data-skin="skin-blue"
                               style="display: block; box-shadow: 0 0 3px rgba(0,0,0,0.4)"
                               class="clearfix full-opacity-hover">
                                <div>
                                    <span style="display:block; width: 20%; float: left; height: 7px; background: #367fa9;"></span>
                                    <span class="bg-light-blue"
                                          style="display:block; width: 80%; float: left; height: 7px;"></span>
                                </div>
                                <div>
                                    <span style="display:block; width: 20%; float: left; height: 20px; background: #222d32;"></span>
                                    <span style="display:block; width: 80%; float: left; height: 20px; background: #f4f5f7;"></span>
                                </div>
                            </a>

                            <p class="text-center no-margin">Blue</p>
                        </li>

                        <li style="float:left; width: 33.33333%; padding: 5px;">
                            <a href="javascript:void(0);" data-skin="skin-black"
                               style="display: block; box-shadow: 0 0 3px rgba(0,0,0,0.4)"
                               class="clearfix full-opacity-hover">
                                <div style="box-shadow: 0 0 2px rgba(0,0,0,0.1)" class="clearfix">
                                    <span style="display:block; width: 20%; float: left; height: 7px; background: #fefefe;"></span>
                                    <span style="display:block; width: 80%; float: left; height: 7px; background: #fefefe;"></span>
                                </div>
                                <div>
                                    <span style="display:block; width: 20%; float: left; height: 20px; background: #222;"></span>
                                    <span style="display:block; width: 80%; float: left; height: 20px; background: #f4f5f7;"></span>
                                </div>
                            </a>

                            <p class="text-center no-margin">Black</p>
                        </li>

                        <li style="float:left; width: 33.33333%; padding: 5px;"><a href="javascript:void(0);"
                                                                                   data-skin="skin-purple"
                                                                                   style="display: block; box-shadow: 0 0 3px rgba(0,0,0,0.4)"
                                                                                   class="clearfix full-opacity-hover">
                            <div><span style="display:block; width: 20%; float: left; height: 7px;"
                                       class="bg-purple-active"></span><span class="bg-purple"
                                                                             style="display:block; width: 80%; float: left; height: 7px;"></span>
                            </div>
                            <div><span
                                    style="display:block; width: 20%; float: left; height: 20px; background: #222d32;"></span><span
                                    style="display:block; width: 80%; float: left; height: 20px; background: #f4f5f7;"></span>
                            </div>
                        </a>

                            <p class="text-center no-margin">Purple</p></li>
                        <li style="float:left; width: 33.33333%; padding: 5px;"><a href="javascript:void(0);"
                                                                                   data-skin="skin-green"
                                                                                   style="display: block; box-shadow: 0 0 3px rgba(0,0,0,0.4)"
                                                                                   class="clearfix full-opacity-hover">
                            <div><span style="display:block; width: 20%; float: left; height: 7px;"
                                       class="bg-green-active"></span><span class="bg-green"
                                                                            style="display:block; width: 80%; float: left; height: 7px;"></span>
                            </div>
                            <div><span
                                    style="display:block; width: 20%; float: left; height: 20px; background: #222d32;"></span><span
                                    style="display:block; width: 80%; float: left; height: 20px; background: #f4f5f7;"></span>
                            </div>
                        </a>

                            <p class="text-center no-margin">Green</p></li>
                        <li style="float:left; width: 33.33333%; padding: 5px;"><a href="javascript:void(0);"
                                                                                   data-skin="skin-red"
                                                                                   style="display: block; box-shadow: 0 0 3px rgba(0,0,0,0.4)"
                                                                                   class="clearfix full-opacity-hover">
                            <div><span style="display:block; width: 20%; float: left; height: 7px;"
                                       class="bg-red-active"></span><span class="bg-red"
                                                                          style="display:block; width: 80%; float: left; height: 7px;"></span>
                            </div>
                            <div><span
                                    style="display:block; width: 20%; float: left; height: 20px; background: #222d32;"></span><span
                                    style="display:block; width: 80%; float: left; height: 20px; background: #f4f5f7;"></span>
                            </div>
                        </a>

                            <p class="text-center no-margin">Red</p></li>
                        <li style="float:left; width: 33.33333%; padding: 5px;"><a href="javascript:void(0);"
                                                                                   data-skin="skin-yellow"
                                                                                   style="display: block; box-shadow: 0 0 3px rgba(0,0,0,0.4)"
                                                                                   class="clearfix full-opacity-hover">
                            <div><span style="display:block; width: 20%; float: left; height: 7px;"
                                       class="bg-yellow-active"></span><span class="bg-yellow"
                                                                             style="display:block; width: 80%; float: left; height: 7px;"></span>
                            </div>
                            <div><span
                                    style="display:block; width: 20%; float: left; height: 20px; background: #222d32;"></span><span
                                    style="display:block; width: 80%; float: left; height: 20px; background: #f4f5f7;"></span>
                            </div>
                        </a>

                            <p class="text-center no-margin">Yellow</p></li>
                        <li style="float:left; width: 33.33333%; padding: 5px;"><a href="javascript:void(0);"
                                                                                   data-skin="skin-blue-light"
                                                                                   style="display: block; box-shadow: 0 0 3px rgba(0,0,0,0.4)"
                                                                                   class="clearfix full-opacity-hover">
                            <div><span
                                    style="display:block; width: 20%; float: left; height: 7px; background: #367fa9;"></span><span
                                    class="bg-light-blue"
                                    style="display:block; width: 80%; float: left; height: 7px;"></span></div>
                            <div><span
                                    style="display:block; width: 20%; float: left; height: 20px; background: #f9fafc;"></span><span
                                    style="display:block; width: 80%; float: left; height: 20px; background: #f4f5f7;"></span>
                            </div>
                        </a>

                            <p class="text-center no-margin" style="font-size: 12px">Blue Light</p></li>
                        <li style="float:left; width: 33.33333%; padding: 5px;"><a href="javascript:void(0);"
                                                                                   data-skin="skin-black-light"
                                                                                   style="display: block; box-shadow: 0 0 3px rgba(0,0,0,0.4)"
                                                                                   class="clearfix full-opacity-hover">
                            <div style="box-shadow: 0 0 2px rgba(0,0,0,0.1)" class="clearfix"><span
                                    style="display:block; width: 20%; float: left; height: 7px; background: #fefefe;"></span><span
                                    style="display:block; width: 80%; float: left; height: 7px; background: #fefefe;"></span>
                            </div>
                            <div><span
                                    style="display:block; width: 20%; float: left; height: 20px; background: #f9fafc;"></span><span
                                    style="display:block; width: 80%; float: left; height: 20px; background: #f4f5f7;"></span>
                            </div>
                        </a>

                            <p class="text-center no-margin" style="font-size: 12px">Black Light</p></li>
                        <li style="float:left; width: 33.33333%; padding: 5px;"><a href="javascript:void(0);"
                                                                                   data-skin="skin-purple-light"
                                                                                   style="display: block; box-shadow: 0 0 3px rgba(0,0,0,0.4)"
                                                                                   class="clearfix full-opacity-hover">
                            <div><span style="display:block; width: 20%; float: left; height: 7px;"
                                       class="bg-purple-active"></span><span class="bg-purple"
                                                                             style="display:block; width: 80%; float: left; height: 7px;"></span>
                            </div>
                            <div><span
                                    style="display:block; width: 20%; float: left; height: 20px; background: #f9fafc;"></span><span
                                    style="display:block; width: 80%; float: left; height: 20px; background: #f4f5f7;"></span>
                            </div>
                        </a>

                            <p class="text-center no-margin" style="font-size: 12px">Purple Light</p></li>
                        <li style="float:left; width: 33.33333%; padding: 5px;"><a href="javascript:void(0);"
                                                                                   data-skin="skin-green-light"
                                                                                   style="display: block; box-shadow: 0 0 3px rgba(0,0,0,0.4)"
                                                                                   class="clearfix full-opacity-hover">
                            <div><span style="display:block; width: 20%; float: left; height: 7px;"
                                       class="bg-green-active"></span><span class="bg-green"
                                                                            style="display:block; width: 80%; float: left; height: 7px;"></span>
                            </div>
                            <div><span
                                    style="display:block; width: 20%; float: left; height: 20px; background: #f9fafc;"></span><span
                                    style="display:block; width: 80%; float: left; height: 20px; background: #f4f5f7;"></span>
                            </div>
                        </a>

                            <p class="text-center no-margin" style="font-size: 12px">Green Light</p></li>
                        <li style="float:left; width: 33.33333%; padding: 5px;"><a href="javascript:void(0);"
                                                                                   data-skin="skin-red-light"
                                                                                   style="display: block; box-shadow: 0 0 3px rgba(0,0,0,0.4)"
                                                                                   class="clearfix full-opacity-hover">
                            <div><span style="display:block; width: 20%; float: left; height: 7px;"
                                       class="bg-red-active"></span><span class="bg-red"
                                                                          style="display:block; width: 80%; float: left; height: 7px;"></span>
                            </div>
                            <div><span
                                    style="display:block; width: 20%; float: left; height: 20px; background: #f9fafc;"></span><span
                                    style="display:block; width: 80%; float: left; height: 20px; background: #f4f5f7;"></span>
                            </div>
                        </a>

                            <p class="text-center no-margin" style="font-size: 12px">Red Light</p></li>
                        <li style="float:left; width: 33.33333%; padding: 5px;"><a href="javascript:void(0);"
                                                                                   data-skin="skin-yellow-light"
                                                                                   style="display: block; box-shadow: 0 0 3px rgba(0,0,0,0.4)"
                                                                                   class="clearfix full-opacity-hover">
                            <div><span style="display:block; width: 20%; float: left; height: 7px;"
                                       class="bg-yellow-active"></span><span class="bg-yellow"
                                                                             style="display:block; width: 80%; float: left; height: 7px;"></span>
                            </div>
                            <div><span
                                    style="display:block; width: 20%; float: left; height: 20px; background: #f9fafc;"></span><span
                                    style="display:block; width: 80%; float: left; height: 20px; background: #f4f5f7;"></span>
                            </div>
                        </a>

                            <p class="text-center no-margin" style="font-size: 12px;">Yellow Light</p></li>
                    </ul>
                </div>
            </div>
        </div>
    </aside><!-- /.control-sidebar -->
    <div class="control-sidebar-bg"></div>
</div>
<!-- jQuery 2.1.4 -->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-2.1.4.min.js"></script>
<!-- jQuery 1.11.4 -->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-ui.min.js"></script>
<!--Bootstrap 3.3.5-->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<!--iCheck 1.0.2-->
<script type="text/javascript" src="${pageContext.request.contextPath}/plugins/icheck/icheck.min.js"></script>
<!--AdminLTE APP-->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/app.min.js"></script>
<!--jQuery.cookie-->
<script type="text/javascript" src="${pageContext.request.contextPath}/plugins/cookie/jquery.cookie.js"></script>
<!--bootstrap-wysihtml5-->
<script type="text/javascript"
        src="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/plugins/form/jquery-form.js"></script>
<!--Main.js-->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/pagejs/main_frame.js"></script>
</body>
</html>
