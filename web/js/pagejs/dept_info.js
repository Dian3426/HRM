/**
 * 部门信息页面js
 */
var t = $('#dept_table').DataTable({
    ajax: "/deptSearch",
    language: {
        lengthMenu: "每一页显示_MENU_条记录",
        zeroRecords: "对不起，找不到任何部门",
        info: "第_PAGE_页，共_PAGES_页",
        infoEmpty: "未找到任何记录",
        infoFiltered: "(从总共_MAX_条数据中筛选)",
        infoPostFix: "",
        thousands: ",",
        loadingRecords: "载入中",
        processing: "处理中",
        search: "请输入工号搜索",
        paginate: {
            first: "第一页",
            last: "最后一页",
            next: "下一页",
            previous: "上一页"
        },
        aria: {
            sortAscending: ": 升序排列",
            sortDescending: ": 降序排列"
        }
    },
    columnDefs: [{
        searchable: false,
        orderable: false,
        targets: -1,
        data: null,
        render: function (data, type, row) {
            return "<button class='btn btn-warning' onclick='edit_dept_info($(this))' role='edit_btn' style='margin-right: 10px;'>编辑</button>" +
                "<button class='btn btn-danger' onclick='del_edit_info(" + row[0] + ")' style='margin-right: 10px;' role='del_btn'>删除</button><button class='btn btn-info' onclick='view_dept_emp(" + row[0] + ")' role='del_btn'>查看员工信息</button>";
        }
    }, {
        searchable: false,
        orderable: false,
        targets: 5,
        data: null,
        render: function (data, type, row) {
            return "<button class='btn btn-success' role='view_btn' onclick='view_dept_desc(\"" + row[5] + "\")' style='margin-right: 10px;'>查看</button>"
        }
    }
    ],
    order: [[0, 'asc']],
    autoWidth: true
});

$("button[role=edit_btn]").click(function () {
    edit_dept_info($(this));
});

function view_dept_desc(data) {
    var header = '<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>' +
        '<h4 class="modal-title" id="myModalLabel">部门描述</h4>';
    var body = data;
    var footer = '<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>';
    showModal(header, body, footer, {});
}

function edit_dept_desc() {
    var header = '<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>' +
        '<h4 class="modal-title" id="myModalLabel">修改部门描述</h4>';
    var body = '<textarea class="textarea" style="width: 100%; height: 200px; font-size: 14px; line-height: 18px; border: 1px solid #dddddd; padding: 10px;" placeholder="请输入部门描述……"></textarea>';
    var footer = '<button type="button" class="btn btn-success" data-dismiss="modal">关闭</button>';
    showModal(header, body, footer, {}, function () {
        $('.textarea').wysihtml5();
    });
}

function edit_dept_info(edit_btn) {
    var tds = edit_btn.parent("td").siblings();
    var dept_name = tds.eq(1);
    var dept_type = tds.eq(2);
    var dept_info = tds.slice(3, 5);
    var dept_desc = tds.eq(5);
    var dept_sdept = tds.eq(6);
    dept_name.html("<input type='text' class='form-control' value='" + dept_name.text() + "'/>");
    $.ajax({
        url: '/deptInfo',
        type: 'POST',
        dataType: 'json',
        success: function (data) {
            var dept_type_html = "<select name='type' name='dept_type' class='form-control'><option value='-1'>无</option>";
            for (var i = 0; i < data['skdepts'].length; i++) {
                dept_type_html = dept_type_html + "<option value='" + data['skdepts'][i]['dept_id'] + "'>" + data['skdepts'][i]['name'] + "</option>";
            }
            dept_type_html = dept_type_html + "</select>";
            dept_sdept.html(dept_type_html);
        }
    });
    dept_type.html("<select name='type' class='form-control'><option>部门</option><option>公司</option></select>");
    dept_info.each(function () {
        $(this).html("<input type='text' class='form-control' value='" + $(this).text() + "'/>")
    });
    dept_desc.html("<button class='btn btn-default' role='desc_edit_btn' onclick='edit_dept_desc()' style='margin-right: 10px;'>编辑</button>");
    edit_btn.attr("class", "btn btn-warning animated fadeOut");
    setTimeout(function () {
        edit_btn.text("保存");
        edit_btn.attr("role", "save_btn");
        $("button[role=edit_btn]").each(function () {
            $(this).attr("disabled", "true");
        });
        edit_btn.unbind("click");
        edit_btn.removeAttr("onclick");
        edit_btn.click(function () {
            save_edit_info();
        });
        edit_btn.attr("class", "btn btn-warning animated fadeIn");
    }, 1000);
}

function save_edit_info() {
    t.ajax.reload();
    $("button[role=edit_btn]").each(function () {
        $(this).removeAttr("disabled");
        edit_btn.attr("onclick", "edit_dept_info($(this))");
    });
    t.draw();
}

function del_edit_info(dept_id) {
    $.ajax({
        url: '/deptDelete',
        type: 'POST',
        data: {
            dept_id: dept_id
        },
        dataType: 'json',
        success: function (data) {
            if (data['success'] == "1") {
                var header = '<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>' +
                    '<h4 class="modal-title" id="myModalLabel">信息</h4>';
                var body = '删除成功';
                var footer = '<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>';
                showModal(header, body, footer, {})
            } else {
                var header = '<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>' +
                    '<h4 class="modal-title" id="myModalLabel">信息</h4>';
                if (data['msg'] != undefined) {
                    var body = data['msg'];
                } else {
                    var body = '删除失败';
                }
                var footer = '<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>';
                showModal(header, body, footer, {})
            }
            t.ajax.reload();
        }
    });
}

function view_dept_emp(dept_id) {
    var header = '<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>' +
        '<h4 class="modal-title" id="myModalLabel">部门</h4>';
    var body = '<table id="dept_emp_table" class="table table-bordered table-striped table-hover" cellspacing="0"><thead><tr><th>员工姓名</th><th>员工编号</th><th>职务</th><th>联系电话</th><th>入职日期</th></tr></thead><tbody></tbody><tfoot><tr><th>员工姓名</th><th>员工编号</th><th>职务</th><th>联系电话</th><th>入职日期</th></tr></tfoot></table>';
    var footer = '<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>';
    showModal(header, body, footer, {}, function () {
        var ts = $("#dept_emp_table").DataTable({
            language: {
                lengthMenu: "每一页显示_MENU_条记录",
                zeroRecords: "对不起，找不到任何员工",
                info: "第_PAGE_页，共_PAGES_页",
                infoEmpty: "未找到任何记录",
                infoFiltered: "(从总共_MAX_条数据中筛选)",
                infoPostFix: "",
                thousands: ",",
                loadingRecords: "载入中",
                processing: "处理中",
                search: "请输入工号搜索",
                paginate: {
                    first: "第一页",
                    last: "最后一页",
                    next: "下一页",
                    previous: "上一页"
                },
                aria: {
                    sortAscending: ": 升序排列",
                    sortDescending: ": 降序排列"
                }
            },
            searching: false,
            ordering: false
        });

        if (dept_id == "2" && sessionStorage.getItem("trans_d") == undefined) {
            ts.row.add([
                "豆豆",
                "0001",
                "行政部-行政总监",
                "213-213213213",
                "2015-09-23"
            ]).draw();
        }

        if (dept_id == "4") {
            ts.row.add([
                "蒋实知",
                "0004",
                "技术部-行政总监",
                "213-213213213",
                "2015-09-23"
            ]).draw();
        }

        if (dept_id == "7" && sessionStorage.getItem("trans_d") != undefined) {
            ts.row.add([
                "豆豆",
                "0001",
                "技术部-行政主管",
                "213-213213213",
                "2015-09-23"
            ]).draw();
        }
    });
}