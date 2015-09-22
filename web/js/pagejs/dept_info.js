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
            return "<button class='btn btn-warning' role='edit_btn' style='margin-right: 10px;'>编辑</button>" +
                "<button class='btn btn-danger' onclick='del_edit_info(" + row[0] + ")' style='margin-right: 10px;' role='del_btn'>删除</button><button class='btn btn-info' onclick='view_dept_emp()' role='del_btn'>查看员工信息</button>";
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
    var footer = '<button type="button" class="btn btn-success">关闭</button>';
    showModal(header, body, footer, {}, function () {
        $('.textarea').wysihtml5();
    });
}

function edit_dept_info(edit_btn) {
    var tds = edit_btn.parent("td").siblings();
    var dept_name = tds.eq(2);
    var dept_type = tds.eq(3);
    var dept_info = tds.slice(4, 6);
    var dept_desc = tds.eq(6);
    var dept_sdept = tds.eq(7);
    dept_name.html("<input type='text' class='form-control' value='" + dept_name.text() + "'/>");
    dept_type.html("<select name='type' class='form-control'><option>部门</option><option>公司</option></select>");
    dept_info.each(function () {
        $(this).html("<input type='text' class='form-control' value='" + $(this).text() + "'/>")
    });
    dept_desc.html("<button class='btn btn-default' role='edit_btn' onclick='edit_dept_desc()' style='margin-right: 10px;'>编辑</button>");
    dept_sdept.html("<select name='sdept' class='form-control'><option>部门一</option><option>部门二</option><option>部门三</option><option>部门四</option></select>");
    edit_btn.attr("class", "btn btn-warning animated fadeOut");
    setTimeout(function () {
        edit_btn.text("保存");
        edit_btn.unbind("click");
        edit_btn.click(function () {
            save_edit_info();
        });
        edit_btn.attr("class", "btn btn-warning animated fadeIn");
    }, 1000);
}

function save_edit_info() {
    alert("save")
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
            if(data['success'] == "1") {
                t.ajax.reload();
            }
        }
    });
    alert("del" + dept_id);
}

function view_dept_emp() {
    var header = '<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>' +
        '<h4 class="modal-title" id="myModalLabel">部门</h4>';
    var body = '<table id="dept_emp_table" class="table table-bordered table-striped table-hover" cellspacing="0"><thead><tr><th>员工姓名</th><th>员工编号</th><th>职务</th><th>联系电话</th><th>入职日期</th></tr></thead><tbody></tbody><tfoot><tr><th>员工姓名</th><th>员工编号</th><th>职务</th><th>联系电话</th><th>入职日期</th></tr></tfoot></table>';
    var footer = '<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>';
    showModal(header, body, footer, {}, function () {
        var t = $("#dept_emp_table").DataTable({
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
    });
}