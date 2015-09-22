/**
 * 部门信息页面js
 */
var t = $('#post_table').DataTable({
    language: {
        lengthMenu: "每一页显示_MENU_条记录",
        zeroRecords: "对不起，找不到任何岗位",
        info: "第_PAGE_页，共_PAGES_页",
        infoEmpty: "未找到任何记录",
        infoFiltered: "(从总共_MAX_条数据中筛选)",
        infoPostFix: "",
        thousands: ",",
        loadingRecords: "载入中",
        processing: "处理中",
        search: "请输入岗位名搜索",
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
        targets: 0
    }, {
        searchable: false,
        orderable: false,
        targets: -1,
        data: null,
        defaultContent: "<button class='btn btn-warning' role='edit_btn' style='margin-right: 10px;'>编辑</button>" +
        "<button class='btn btn-danger' style='margin-right: 10px;' role='del_btn'>删除</button><button class='btn btn-info' onclick='view_post_emp()' role='del_btn'>查看员工信息</button>"
    }],
    order: [[1, 'asc']],
    autoWidth: true
});

t.on('order.dt search.dt', function () {
    t.column(0, {search: 'applied', order: 'applied'}).nodes().each(function (cell, i) {
        cell.innerHTML = i + 1;
    });
}).draw();

$("button[role=edit_btn]").click(function () {
    edit_post_info($(this));
});

function edit_post_info(edit_btn) {
    var tds = edit_btn.parent("td").siblings();
    var post_name = tds.eq(2);
    var post_type = tds.eq(3);
    var post_dept = tds.eq(4);
    var post_num = tds.eq(6);
    var post_isNum = tds.eq(7);
    post_name.html("<input type='text' class='form-control' value='" + post_name.text() + "'/>");
    post_type.html("<select name='type' class='form-control'><option value='0'>管理</option><option value='1'>技术</option><option value='2'>营销</option><option value='3'>市场</option></select>");
    post_dept.html("<select name='sdept' class='form-control'><option>行政部</option><option>生产部</option><option>技术部</option><option>销售部</option><option>财务部</option></select>");
    post_num.html("<input type='number' class='form-control' value='" + post_num.text() + "'/>");
    post_isNum.html("<select name='isNum' class='form-control'><option value='0'>是</option><option value='1'>否</option></select>");
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

function view_post_emp() {
    var header = '<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>' +
        '<h4 class="modal-title" id="myModalLabel">岗位员工信息列表</h4>';
    var body = '<table id="dept_emp_table" class="table table-bordered table-striped table-hover" cellspacing="0"><thead><tr><th></th><th>岗位编号</th><th>岗位名称</th><th>部门编号</th><th>部门名称</th><th>员工姓名</th><th>员工编号</th><th>职务</th><th>联系电话</th><th>入职日期</th></tr></thead><tbody></tbody><tfoot><tr><th></th><th>岗位编号</th><th>岗位名称</th><th>部门编号</th><th>部门名称</th><th>员工姓名</th><th>员工编号</th><th>职务</th><th>联系电话</th><th>入职日期</th></tr></tfoot></table>';
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