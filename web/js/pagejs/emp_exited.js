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
    order: [[0, 'asc']],
    autoWidth: true
});

$("#emp_search_btn").click(function () {
    if ($("#search_emp_num").val() == "3303" && ($("#search_emp_name").val() == "" || $("#search_emp_name").val() == '张') && sessionStorage.getItem("exit_z") != undefined) {
        t.row.add([
            "3303",
            "张然",
            "行政部",
            "员工",
            "2015-09-24",
            "主动",
            "无"
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
