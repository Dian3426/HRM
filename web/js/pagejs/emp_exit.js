/**
 * Created by ML3426 on 2015/9/21 0021.
 */

var t = $('#emp_exit_result').DataTable({
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
    ordering: false,
    columnDefs: [{
        searchable: false,
        orderable: false,
        targets: 0
    }, {
        searchable: false,
        orderable: false,
        targets: -1,
        data: null,
        defaultContent: "<button class='btn btn-warning' onclick='exit_modal_show()' role='exit_btn' style='margin-right: 10px;'>离职</button>"
    }],
    order: [[1, 'asc']],
    autoWidth: true
});

t.on('order.dt search.dt', function () {
    t.column(0, {search: 'applied', order: 'applied'}).nodes().each(function (cell, i) {
        cell.innerHTML = i + 1;
    });
}).draw();

$("#emp_search_btn").click(function () {
    if ($("#emp_num").val() == "3303" && ($("#emp_name").val() == "" || $("#emp_name").val() == '张') && sessionStorage.getItem("exit_z") == undefined) {
        t.row.add([
            "3303",
            "张然",
            "行政部",
            "员工"
        ]).draw(false);
        if ($("#emp_exit_resultdiv").hasClass("rhide")) {
            $("#emp_exit_resultdiv").attr("class", "row animated fadeInDown");
        }
    } else {
        var header = '<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>' +
            '<h4 class="modal-title" id="myModalLabel">信息</h4>';
        var body = '找不到对应的员工';
        var footer = '<button type="button" class="btn btn-default" data-dismiss="modal">确定</button>';
        showModal(header, body, footer, {})
    }

});

function exit_modal_show() {
    var header = '<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>' +
        '<h4 class="modal-title" id="myModalLabel">填写离职信息</h4>';
    var body = '<form><div class="form-group"><label for="exit_date" class="control-label">离职日期:</label><input name="exit_date" class="form-control" id="exit_date"></div><div class="form-group"><label for="exit_type" class="control-label">离职类型:</label><select class="form-control" name="exit_type" id="exit_type"><option value="主动辞职">主动辞职</option><option value="辞退">辞退</option><option value="退休">退休</option><option value="开除">开除</option><option value="试用期未通过">试用期未通过</option></select></div><div class="form-group"><label for="exit_to" class="control-label">离职去向:</label><input name="exit_to" class="form-control" id="exit_to"></div><div class="form-group"><label for="into_talent" class="control-label">是否进入人才库:</label><select name="into_talent" class="form-control" id="into_talent"><option value="1">是</option><option value="0">否</option></select></div></form>';
    var footer = '<button type="button" onclick="del()" class="btn btn-danger">离职</button><button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>';
    showModal(header, body, footer, {}, function () {
        $('#exit_date').datepicker({
            format: "yyyy/mm/dd",
            weekStart: 7,
            todayBtn: "linked",
            language: "zh-CN",
            endDate: "today",
            autoclose: true,
            todayHighlight: true
        });
    });
}

function del() {
    sessionStorage.setItem("exit_z", "a")
    hideModal();
}