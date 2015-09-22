<%--
  Created by IntelliJ IDEA.
  User: ML3426
  Date: 2015/9/20 0020
  Time: 16:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/datepicker/css/bootstrap-datepicker3.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/select2/dist/css/select2.min.css">
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

    input {
        border-top: 0;
        border-right: 0;
        border-left: 0;
        border-bottom: 1px solid #c0c0c0;
        background-color: transparent;
        outline: none;
    }

    .month {
        font-size: small;
    }

    .select2-container--default .select2-selection--multiple .select2-selection__choice {
        background-color: #3c8dbc;
        border: #367fa9;
    }

    .rhide {
        display: none;
    }
</style>
<section class="content-header">
    <h1>
        输入员工
        <small>添加一名新员工</small>
    </h1>
    <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-male"></i> 人员管理</a></li>
        <li>入职管理</li>
        <li class="active">输入员工</li>
    </ol>
</section>

<section class="content">
    <div class="row">
        <div class="col-xs-12">
            <div class="box">
                <div class="box-header">
                    <h3 class="box-title">添加新员工</h3>
                </div>

                <div class="box-body">
                    <form method="post" id="emp_info_table" enctype="multipart/form-data">
                        <table id="emp_add_table" class="table table-bordered table-striped" cellspacing="0">

                            <tr>
                                <th colspan="11" class="table-title">员工入职信息表</th>
                            </tr>
                            <tr>
                                <td rowspan="4" class="table-part">员工基本信息</td>
                                <td style="width:15%;">
                                    <div class="td-control">
                                        <label for="emp_name" style="width:30%;">姓名：</label>
                                        <input id="emp_name" name="emp_name" type="text" style="width:60%;"
                                               placeholder="姓名">
                                    </div>
                                </td>
                                <td style="width: 15%;">
                                    <div class="td-control">
                                        <label for="emp_sex" style="width:40%;">性别：</label>
                                        <select name="emp_sex" id="emp_sex" style="width: 40%;">
                                            <option value="0">男</option>
                                            <option value="1">女</option>
                                        </select>
                                    </div>
                                </td>
                                <td colspan="3" style="width: 20%;">
                                    <div class="td-control">
                                        <label for="emp_nat" style="width:20%;">民族：</label>
                                        <select name="emp_nat" id="emp_nat" style="width: 60%;">
                                            <option value="汉族">汉族</option>
                                            <option value="蒙古族">蒙古族</option>
                                            <option value="彝族">彝族</option>
                                            <option value="侗族">侗族</option>
                                            <option value="哈萨克族">哈萨克族</option>
                                            <option value="畲族">畲族</option>
                                            <option value="纳西族">纳西族</option>
                                            <option value="仫佬族">仫佬族</option>
                                            <option value="仡佬族">仡佬族</option>
                                            <option value="怒族">怒族</option>
                                            <option value="保安族">保安族</option>
                                            <option value="鄂伦春族">鄂伦春族</option>
                                            <option value="回族">回族</option>
                                            <option value="壮族">壮族</option>
                                            <option value="瑶族">瑶族</option>
                                            <option value="傣族">傣族</option>
                                            <option value="高山族">高山族</option>
                                            <option value="景颇族">景颇族</option>
                                            <option value="羌族">羌族</option>
                                            <option value="锡伯族">锡伯族</option>
                                            <option value="乌孜别克族">乌孜别克族</option>
                                            <option value="裕固族">裕固族</option>
                                            <option value="赫哲族">赫哲族</option>
                                            <option value="藏族">藏族</option>
                                            <option value="布依族">布依族</option>
                                            <option value="白族">白族</option>
                                            <option value="黎族">黎族</option>
                                            <option value="拉祜族">拉祜族</option>
                                            <option value="柯尔克孜族">柯尔克孜族</option>
                                            <option value="布朗族">布朗族</option>
                                            <option value="阿昌族">阿昌族</option>
                                            <option value="俄罗斯族">俄罗斯族</option>
                                            <option value="京族">京族</option>
                                            <option value="门巴族">门巴族</option>
                                            <option value="维吾尔族">维吾尔族</option>
                                            <option value="朝鲜族">朝鲜族</option>
                                            <option value="土家族">土家族</option>
                                            <option value="傈僳族">傈僳族</option>
                                            <option value="水族">水族</option>
                                            <option value="土族">土族</option>
                                            <option value="撒拉族">撒拉族</option>
                                            <option value="普米族">普米族</option>
                                            <option value="鄂温克族">鄂温克族</option>
                                            <option value="塔塔尔族">塔塔尔族</option>
                                            <option value="珞巴族">珞巴族</option>
                                            <option value="苗族">苗族</option>
                                            <option value="满族">满族</option>
                                            <option value="哈尼族">哈尼族</option>
                                            <option value="佤族">佤族</option>
                                            <option value="东乡族">东乡族</option>
                                            <option value="达斡尔族">达斡尔族</option>
                                            <option value="毛南族">毛南族</option>
                                            <option value="塔吉克族">塔吉克族</option>
                                            <option value="德昂族">德昂族</option>
                                            <option value="独龙族">独龙族</option>
                                            <option value="基诺族">基诺族</option>
                                        </select>
                                    </div>
                                </td>
                                <td colspan="3" style="width: 25%;">
                                    <div class="td-control">
                                        <label for="emp_birth" class="control-label" style="width: 30%;">出生日期：</label>
                                        <input id="emp_birth" type="text" placeholder="出生日期" style="width: 60%;">
                                    </div>
                                </td>
                                <td colspan="2" rowspan="3" style=" text-align: center;">
                                    <div id="img_file">
                                        <button class="btn btn-primary" type="button" id="emp_faceimg_btn">
                                            选择
                                        </button>
                                    </div>
                                    <input accept="image/*" type="file" id="emp_faceimg_input" name="emp_img"
                                           style="display: none" onchange="handleFiles(this)">
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <div class="td-control">
                                        <label for="emp_height" style="width:30%;">身高：</label>
                                        <input id="emp_height" type="number" style="width:60%;" min="120" max="220"
                                               placeholder="身高">
                                    </div>
                                </td>
                                <td>
                                    <div class="td-control">
                                        <label for="emp_bloodtype" style="width:40%;">血型：</label>
                                        <select name="emp_sex" id="emp_bloodtype" style="width: 40%;">
                                            <option value="A">A</option>
                                            <option value="B">B</option>
                                            <option value="AB">AB</option>
                                            <option value="O">O</option>
                                        </select>
                                    </div>
                                </td>
                                <td colspan="3">
                                    <div class="td-control">
                                        <label for="emp_birthprov" style="width:20%;">出生地：</label>
                                        <select name="emp_birthprov" id="emp_birthprov" style="width: 25%;"
                                                onchange="set_city(this, document.getElementById('emp_birthcity'));">
                                            <option value="0">选择省</option>
                                            <option value="北京市">北京市</option>
                                            <option value="上海市">上海市</option>
                                            <option value="天津市">天津市</option>
                                            <option value="重庆市">重庆市</option>
                                            <option value="河北省">河北省</option>
                                            <option value="山西省">山西省</option>
                                            <option value="辽宁省">辽宁省</option>
                                            <option value="吉林省">吉林省</option>
                                            <option value="黑龙江省">黑龙江省</option>
                                            <option value="江苏省">江苏省</option>
                                            <option value="浙江省">浙江省</option>
                                            <option value="安徽省">安徽省</option>
                                            <option value="福建省">福建省</option>
                                            <option value="江西省">江西省</option>
                                            <option value="山东省">山东省</option>
                                            <option value="河南省">河南省</option>
                                            <option value="湖北省">湖北省</option>
                                            <option value="湖南省">湖南省</option>
                                            <option value="广东省">广东省</option>
                                            <option value="海南省">海南省</option>
                                            <option value="四川省">四川省</option>
                                            <option value="贵州省">贵州省</option>
                                            <option value="云南省">云南省</option>
                                            <option value="陕西省">陕西省</option>
                                            <option value="甘肃省">甘肃省</option>
                                            <option value="青海省">青海省</option>
                                            <option value="内蒙古自治区">内蒙古自治区</option>
                                            <option value="广西壮族自治区">广西壮族自治区</option>
                                            <option value="西藏自治区">西藏自治区</option>
                                            <option value="宁夏回族自治区">宁夏回族自治区</option>
                                            <option value="新疆维吾尔自治区">新疆维吾尔自治区</option>
                                            <option value="中国台湾">中国台湾</option>
                                            <option value="中国香港">中国香港</option>
                                            <option value="中国澳门">中国澳门</option>
                                        </select>
                                        <select name="emp_birthcity" id="emp_birthcity" style="width: 25%;" title="市">
                                        </select>
                                    </div>
                                </td>
                                <td colspan="3">
                                    <div class="td-control">
                                        <label for="emp_idNum" class="control-label" style="width: 30%;">身份证号：</label>
                                        <input id="emp_idNum" type="text" placeholder="身份证号" style="width: 60%;">
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <div class="td-control">
                                        <label for="emp_tel" class="control-label" style="width: 40%;">联系电话：</label>
                                        <input id="emp_tel" type="text" placeholder="联系电话" style="width: 50%;">
                                    </div>
                                </td>
                                <td colspan="2">
                                    <div class="td-control">
                                        <label for="emp_mail" class="control-label" style="width: 40%;">电子邮件：</label>
                                        <input id="emp_mail" type="text" placeholder="电子邮件" style="width: 50%;">
                                    </div>
                                </td>
                                <td>
                                    <div class="td-control">
                                        <label for="emp_native" class="control-label" style="width: 40%;">籍贯：</label>
                                        <input id="emp_native" type="text" placeholder="籍贯" style="width: 50%;">
                                    </div>
                                </td>
                                <td>
                                    <div class="td-control">
                                        <label for="emp_rresidence" class="control-label"
                                               style="width: 40%;">户口：</label>
                                        <input id="emp_rresidence" name="emp_rresidence" type="text" placeholder="户口"
                                               style="width: 50%;">
                                    </div>
                                </td>
                                <td>
                                    <div class="td-control">
                                        <label for="emp_marrige" style="width:40%;">婚姻：</label>
                                        <select name="emp_marrige" id="emp_marrige" style="width: 50%;">
                                            <option value="0">已婚</option>
                                            <option value="1">未婚</option>
                                            <option value="2">离婚</option>
                                            <option value="3">丧偶</option>
                                            <option value="4">其他</option>
                                        </select>
                                    </div>
                                </td>
                                <td colspan="2">
                                    <div class="td-control">
                                        <label for="emp_ps" style="width:40%;">政治面貌：</label>
                                        <select name="emp_ps" id="emp_ps" style="width: 50%;">
                                            <option value="0">党员</option>
                                            <option value="1">预备党员</option>
                                            <option value="2">团员</option>
                                            <option value="3">其他</option>
                                        </select>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <div class="td-control">
                                        <label for="emp_edu" style="width:30%;">学历：</label>
                                        <select name="emp_edu" id="emp_edu" style="width: 60%;">
                                            <option value="0">高中以下</option>
                                            <option value="1">高中</option>
                                            <option value="2">大专</option>
                                            <option value="3">本科</option>
                                            <option value="4">研究生</option>
                                        </select>
                                    </div>
                                </td>
                                <td colspan="2">
                                    <div class="td-control">
                                        <label for="emp_coll" style="width: 40%;">毕业院校：</label>
                                        <input id="emp_coll" name="emp_coll" type="text" style="width:50%;"
                                               placeholder="毕业院校">
                                    </div>
                                </td>
                                <td>
                                    <div class="td-control">
                                        <label for="emp_major" class="control-label" style="width: 40%;">专业：</label>
                                        <input id="emp_major" name="emp_major" type="text" placeholder="专业"
                                               style="width: 50%;">
                                    </div>
                                </td>
                                <td colspan="2">
                                    <div class="td-control">
                                        <label for="emp_grad" class="control-label" style="width: 30%;">毕业时间：</label>
                                        <input id="emp_grad" name="emp_grad" type="text" placeholder="毕业时间"
                                               style="width: 60%;">
                                    </div>
                                </td>
                                <td colspan="2">
                                    <div class="td-control">
                                        <label for="emp_from" style="width:40%;">人员来源：</label>
                                        <select name="emp_from" id="emp_from" style="width: 50%;">
                                            <option value="0">社会招聘</option>
                                            <option value="1">校园招聘</option>
                                            <option value="2">其他</option>
                                        </select>
                                    </div>
                                </td>
                                <td colspan="2">
                                    <div class="td-control">
                                        <label for="emp_jobtype" style="width:40%;">用工形式：</label>
                                        <select name="emp_jobtype" id="emp_jobtype" style="width: 50%;">
                                            <option value="0">正式员工</option>
                                            <option value="1">临时员工</option>
                                        </select>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td class="table-part">部门岗位安排</td>
                                <td colspan="10">
                                    <div class="td-control">
                                        <label for="emp_position" style="width:10%;">部门及岗位名称：</label>
                                        <select name="emp_position" id="emp_position" style="width: 80%;">
                                        </select>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td class="table-part">试用期安排</td>
                                <td colspan="2">
                                    <div class="td-control">
                                        <label for="emp_probation" style="width:35%;">是否安排试用期：</label>
                                        <select name="emp_probation" id="emp_probation" style="width: 55%;">
                                            <option value="0">否</option>
                                            <option value="1">是</option>
                                        </select>
                                    </div>
                                </td>
                                <td colspan="4">
                                    <div class="input-daterange td-control" id="probation_range">
                                        <label for="emp_probation" style="width:20%;">试用时间：</label>
                                        从<input type="text" id="emp_probation_start" name="emp_probation_start"
                                                placeholder="开始时间"/>
                                        到<input type="text" id="emp_probation_end" name="emp_probation_end"
                                                placeholder="结束时间"/>
                                    </div>
                                </td>
                                <td colspan="4">
                                    <div class="td-control">
                                        <label for="emp_attach" style="width:20%;">备注：</label>
                                        <input id="emp_attach" name="emp_attach" type="text" style="width:70%;"
                                               placeholder="备注">
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
                                    <div class="input-daterange td-control">
                                        从<input type="text" name="emp_job_start"
                                                placeholder="开始时间"/>
                                        到<input type="text" name="emp_job_end"
                                                placeholder="结束时间"/>
                                    </div>
                                </td>
                                <td colspan="2">
                                    <div class="td-control">
                                        <input id="emp_former_comp" name="emp_former_comp" type="text"
                                               style="width:100%;"
                                               placeholder="所在单位">
                                    </div>
                                </td>
                                <td>
                                    <div class="td-control">
                                        <input id="emp_former_position" name="emp_former_position" type="text"
                                               style="width:100%;"
                                               placeholder="担任职务">
                                    </div>
                                </td>
                                <td>
                                    <div class="td-control">
                                        <input id="emp_former_salary" name="emp_former_salary" type="number"
                                               style="width:100%;" step="1" min="0"
                                               placeholder="年薪">
                                    </div>
                                </td>
                                <td>
                                    <div class="td-control">
                                        <input id="emp_former_evidence" name="emp_former_evidence" type="text"
                                               style="width:100%;"
                                               placeholder="证明人">
                                    </div>
                                </td>
                                <td>
                                    <div class="td-control">
                                        <input id="emp_former_evidence_position" name="emp_former_evidence_position"
                                               type="text" style="width:100%;"
                                               placeholder="证明人职务">
                                    </div>
                                </td>
                                <td colspan="2">
                                    <div class="td-control">
                                        <input id="emp_job_attach" name="emp_job_attach" type="text"
                                               style="width:100%;"
                                               placeholder="备注">
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="10">
                                    <div class="td-control">
                                        <label for="emp_launage" style="width:10%;">外国语种：</label>
                                        <select name="emp_launage" id="emp_launage" class="select2"
                                                multiple="multiple" data-placeholder="选择外国语种" style="width: 80%;">
                                            <option>英语</option>
                                            <option>法语</option>
                                            <option>德语</option>
                                            <option>俄语</option>
                                            <option>日语</option>
                                            <option>韩语</option>
                                            <option>西班牙语</option>
                                        </select>
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
                                        <input id="emp_family_relation" name="emp_family_relation" type="text"
                                               style="width:100%;"
                                               placeholder="与本人关系">
                                    </div>
                                </td>
                                <td>
                                    <div class="td-control">
                                        <input id="emp_family_name" name="emp_family_name" type="text"
                                               style="width:100%;"
                                               placeholder="姓名">
                                    </div>
                                </td>
                                <td colspan="4">
                                    <div class="td-control">
                                        <input id="emp_family_comp" name="emp_family_comp" type="text"
                                               style="width:100%;"
                                               placeholder="所在单位">
                                    </div>
                                </td>
                                <td colspan="2">
                                    <div class="td-control">
                                        <input id="emp_family_position" name="emp_family_position" type="text"
                                               style="width:100%;"
                                               placeholder="职位">
                                    </div>
                                </td>
                                <td colspan="2">
                                    <div class="td-control">
                                        <input id="emp_family_tel" name="emp_family_tel" type="text"
                                               style="width:100%;"
                                               placeholder="电话">
                                    </div>
                                </td>
                            </tr>

                        </table>
                    </form>
                </div>

                <div class="box-footer">
                    <button type="button" id="emp_save" class="btn btn-info pull-right">保存</button>
                </div>
            </div>
        </div>
    </div>
</section>
<script type="text/javascript"
        src="${pageContext.request.contextPath}/plugins/datepicker/js/bootstrap-datepicker.min.js"></script>
<script type="text/javascript"
        src="${pageContext.request.contextPath}/plugins/datepicker/locales/bootstrap-datepicker.zh-CN.min.js"></script>
<script type="text/javascript"
        src="${pageContext.request.contextPath}/plugins/select2/dist/js/select2.full.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/pagejs/emp_add.js"></script>