<%--
  Created by IntelliJ IDEA.
  User: ML3426
  Date: 2015/9/20 0020
  Time: 16:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>
    .table-title {
        text-align: center;
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
        入职员工查询
        <small>在入职员工中进行查询</small>
    </h1>
    <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-info"></i> 信息管理</a></li>
        <li class="active">入职员工查询</li>
    </ol>
</section>

<section class="content">
    <div class="row">
        <div class="col-md-12">
            <div class="box box-primary">
                <div class="box-header with-border">
                    <h3 class="box-title">
                        入职员工查询
                    </h3>
                </div> <!--herder 结束-->

                <form class="form-horizontal" id="emp_search_form">
                    <div class="box-body">
                        <span>请输入查询条件：（至少填写一项）</span>
                        <div class="form-group">
                            <label for="search_emp_idNumS" class="col-sm-5 control-label">身份证号</label>

                            <div class="col-sm-3">
                                <input type="text" class="form-control" id="search_emp_idNumS" name="search_emp_idNumS" placeholder="身份证号">
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="search_emp_idNum" class="col-sm-5 control-label">员工编号</label>

                            <div class="col-sm-3">
                                <input type="text" class="form-control" id="search_emp_idNum" name="search_emp_idNum" placeholder="员工编号">
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
    <div class="row rhide" id="emp_result">
        <div class="col-xs-12">
            <div class="box">
                <div class="box-header">
                    <h3 class="box-title">查询结果</h3>
                </div>

                <div class="box-body">
                    <table id="emp_add_table" class="table table-bordered table-striped" cellspacing="0">
                        <tr>
                            <th colspan="11" class="table-title">员工信息表</th>
                        </tr>
                        <tr>
                            <td rowspan="4" class="table-part">员工基本信息</td>
                            <td style="width:15%;">
                                <div class="td-control">
                                    <label for="emp_name" style="width:30%;">姓名：</label>
                                    <span id="emp_name" style="width: 60%">老吴</span>
                                </div>
                            </td>
                            <td style="width: 15%;">
                                <div class="td-control">
                                    <label for="emp_sex" style="width:40%;">性别：</label>
                                    <span id="emp_sex" style="width: 50%">男</span>
                                </div>
                            </td>
                            <td colspan="3" style="width: 20%;">
                                <div class="td-control">
                                    <label for="emp_nat" style="width:20%;">民族：</label>
                                    <span id="emp_nat" style="width: 60%">汉族</span>
                                </div>
                            </td>
                            <td colspan="3" style="width: 25%;">
                                <div class="td-control">
                                    <label for="emp_birth" class="control-label" style="width: 30%;">出生日期：</label>
                                    <span id="emp_birth" style="width: 60%">1987/09/01</span>
                                </div>
                            </td>
                            <td colspan="2" rowspan="3" style=" text-align: center; width: 13%; height: 150px">
                                <img src="/img/user.png" alt="用户图片">
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <div class="td-control">
                                    <label for="emp_height" style="width:30%;">身高：</label>
                                    <span id="emp_height" style="width: 60%">175cm</span>
                                </div>
                            </td>
                            <td>
                                <div class="td-control">
                                    <label for="emp_bloodtype" style="width:40%;">血型：</label>
                                    <span id="emp_bloodtype" style="width: 40%">A</span>
                                </div>
                            </td>
                            <td colspan="3">
                                <div class="td-control">
                                    <label for="emp_birthprov" style="width:25%;">出生地：</label>
                                    <span id="emp_birthprov" style="width: 45%">湖南省长沙市</span>
                                </div>
                            </td>
                            <td colspan="3">
                                <div class="td-control">
                                    <label for="emp_idNum" class="control-label" style="width: 30%;">身份证号：</label>
                                    <span id="emp_idNum" style="width: 60%">21093719870901281</span>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <div class="td-control">
                                    <label for="emp_tel" class="control-label" style="width: 40%;">联系电话：</label>
                                    <span id="emp_tel" style="width: 50%">2572838387721</span>
                                </div>
                            </td>
                            <td colspan="2">
                                <div class="td-control">
                                    <label for="emp_mail" class="control-label" style="width: 40%;">电子邮件：</label>
                                    <span id="emp_mail" style="width: 50%">laowu@neusoft.com</span>
                                </div>
                            </td>
                            <td>
                                <div class="td-control">
                                    <label for="emp_native" class="control-label" style="width: 40%;">籍贯：</label>
                                    <span id="emp_native" style="width: 50%">抚顺</span>
                                </div>
                            </td>
                            <td>
                                <div class="td-control">
                                    <label for="emp_rresidence" class="control-label" style="width: 40%;">户口：</label>
                                    <span id="emp_rresidence" style="width: 50%">抚顺</span>
                                </div>
                            </td>
                            <td>
                                <div class="td-control">
                                    <label for="emp_marrige" style="width:40%;">婚姻：</label>
                                    <span id="emp_marrige" style="width: 50%">已婚</span>
                                </div>
                            </td>
                            <td colspan="2">
                                <div class="td-control">
                                    <label for="emp_ps" style="width:40%;">政治面貌：</label>
                                    <span id="emp_ps" style="width: 50%">党员</span>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <div class="td-control">
                                    <label for="emp_edu" style="width:30%;">学历：</label>
                                    <span id="emp_edu" style="width: 60%">研究生</span>
                                </div>
                            </td>
                            <td colspan="2">
                                <div class="td-control">
                                    <label for="emp_coll" style="width: 40%;">毕业院校：</label>
                                    <span id="emp_coll" style="width: 50%">东北大学</span>
                                </div>
                            </td>
                            <td>
                                <div class="td-control">
                                    <label for="emp_major" class="control-label" style="width: 40%;">专业：</label>
                                    <span id="emp_major" style="width: 50%">计算机</span>
                                </div>
                            </td>
                            <td colspan="2">
                                <div class="td-control">
                                    <label for="emp_grad" class="control-label" style="width: 30%;">毕业时间：</label>
                                    <span id="emp_grad" style="width: 60%">2000/06/30</span>
                                </div>
                            </td>
                            <td colspan="2">
                                <div class="td-control">
                                    <label for="emp_from" style="width:40%;">人员来源：</label>
                                    <span id="emp_from" style="width: 50%">社会招聘</span>
                                </div>
                            </td>
                            <td colspan="2">
                                <div class="td-control">
                                    <label for="emp_jobtype" style="width:50%;">用工形式：</label>
                                    <span id="emp_jobtype" style="width: 40%">正式员工</span>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td rowspan="7" class="table-part">其他信息</td>
                            <td colspan="10">职业生涯</td>
                        </tr>
                        <tr>
                            <td colspan="2">起止年月</td>
                            <td colspan="2">所在单位</td>
                            <td>担任职务</td>
                            <td>年薪</td>
                            <td style="width: 7%;">证明人</td>
                            <td>证明人职务</td>
                            <td colspan="2">备注</td>
                        </tr>
                        <tr>
                            <td colspan="2">
                                <span id="emp_former_jobtime">2008/02/10-2010/10/12</span>
                            </td>
                            <td colspan="2">
                                <span id="emp_former_comp">化为网络科技</span>
                            </td>
                            <td>
                                <span id="emp_former_position">java工程师</span>
                            </td>
                            <td>
                                <div class="td-control">
                                    <span id="emp_former_salary">6000</span>
                                </div>
                            </td>
                            <td>
                                <div class="td-control">
                                    <span id="emp_former_evidence">王涛</span>
                                </div>
                            </td>
                            <td>
                                <div class="td-control">
                                    <span id="emp_former_evidence_position">项目经理</span>
                                </div>
                            </td>
                            <td colspan="2">
                                <div class="td-control">
                                    <span id="emp_job_attach">负责oa项目</span>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="10">
                                <div class="td-control">
                                    <label for="emp_launage" style="width:10%;">外国语种：</label>
                                    <span id="emp_launage" style="width: 80%">英语, 法语</span>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="10">家庭成员及社会关系</td>
                        </tr>
                        <tr>
                            <td>与本人关系</td>
                            <td>姓名</td>
                            <td colspan="4">所在单位</td>
                            <td colspan="2">职位</td>
                            <td colspan="2">电话</td>
                        </tr>
                        <tr>
                            <td>
                                <div class="td-control">
                                    <span id="emp_family_relation">父亲</span>
                                </div>
                            </td>
                            <td>
                                <div class="td-control">
                                    <span id="emp_family_name">李元芳</span>
                                </div>
                            </td>
                            <td colspan="4">
                                <div class="td-control">
                                    <span id="emp_family_comp">村委会</span>
                                </div>
                            </td>
                            <td colspan="2">
                                <div class="td-control">
                                    <span id="emp_family_position">村主任</span>
                                </div>
                            </td>
                            <td colspan="2">
                                <div class="td-control">
                                    <span id="emp_family_tel">111111111111</span>
                                </div>
                            </td>
                        </tr>
                    </table>
                </div>
            </div>
        </div>
    </div>
</section>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/pagejs/emp_search.js"></script>