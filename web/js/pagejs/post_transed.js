/**
 * Created by ML3426 on 2015/9/21 0021.
 */

$('input[name=trans_type]').iCheck({
    checkboxClass: 'icheckbox_flat-yellow',
    radioClass: 'iradio_flat-yellow',
    increaseArea: '20%' // optional
});

var ts = $("#post_transed_result").DataTable({
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

$("#emp_search_btn").click(function () {
    if ($("#trans_emp_id").val() == "0001") {
        $("#post_transed_div").attr("class", "row animated fadeInDown");
    } else {
        var header = '<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>' +
            '<h4 class="modal-title" id="myModalLabel">信息</h4>';
        var body = '找不到对应员工';
        var footer = '<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>';
        showModal(header, body, footer, {})
    }

});