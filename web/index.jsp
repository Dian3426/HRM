<%--
  Created by IntelliJ IDEA.
  User: ML3426
  Date: 2015/9/17 0017
  Time: 14:42
  首页，即登陆页
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!--设置字符集，IE浏览器兼容模式，以及设置移动设备兼容-->
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <title>HRM人事管理系统</title>
    <!--Bootstrap 3.3.5-->
    <link rel="stylesheet" href="./css/bootstrap.min.css">
    <!-- Font Awesome 4.4.0-->
    <link rel="stylesheet" href="./css/font-awesome.min.css">
    <!-- Ionicons 2.0.1-->
    <link rel="stylesheet" href="./css/ionicons.min.css">
    <!--Main Theme Style-->
    <link rel="stylesheet" href="./css/AdminLTE.min.css">
    <!--iCheck 1.0.2-->
    <link rel="stylesheet" href="./plugins/icheck/skins/all.css">
    <!--Animate.css 3.4.0-->
    <link rel="stylesheet" href="./plugins/animate.css/animate.min.css">
    <!--本页面CSS-->
    <link rel="stylesheet" href="./css/pagecss/index.css">
    <!-- 添加IE兼容支持 -->
    <!--[if lt IE 9]>
    <script type="text/javascript" src="./plugins/html5shiv/html5shiv.min.js"></script>
    <script type="text/javascript" src="./plugins/respond/respond.min.js"></script>
    <![endif]-->
</head>
<body class="login-page animated fadeInDown">
<div class="login-box"> <!--login box start-->
    <div class="login-logo">
        <p class="huge-logo">HRM</p>
        人事管理系统
    </div>
    <div class="login-box-body">
        <p class="login-box-msg">请登录以开始操作</p>

        <form id="loginForm" action="" method="post"> <!--登录窗口的表单-->
            <div class="form-group has-feedback" id="emp_id_div">
                <input type="text" name="emp_id" class="form-control" placeholder="请输入工号" data-toggle="tooltip" required
                       autofocus>
                <span class="glyphicon glyphicon-user form-control-feedback"></span>
            </div>
            <div class="form-group has-feedback" id="emp_pass_div" data-toggle="tooltip">
                <input type="password" name="emp_pass" class="form-control" placeholder="请输入密码" required>
                <span class="glyphicon glyphicon-lock form-control-feedback"></span>
            </div>
            <div class="row">
                <div class="col-xs-8">
                    <div class="checkbox icheck">
                        <label>
                            <input type="checkbox"> 记住登录状态
                        </label>
                    </div>
                </div><!-- 记住我按钮 -->
                <div class="col-xs-4">
                    <button type="submit" class="btn btn-primary btn-block btn-flat">登录</button>
                </div><!-- /.col -->
            </div>
        </form>
    </div>
</div>  <!--login box end-->
<!-- jQuery 2.1.4 -->
<script type="text/javascript" src="./js/jquery-2.1.4.min.js"></script>
<!--Bootstrap 3.3.5-->
<script type="text/javascript" src="./js/bootstrap.min.js"></script>
<!--iCheck 1.0.2-->
<script type="text/javascript" src="./plugins/icheck/icheck.min.js"></script>
<!--页面的JS-->
<script type="text/javascript" src="./js/pagejs/index.js"></script>
</body>
</html>
