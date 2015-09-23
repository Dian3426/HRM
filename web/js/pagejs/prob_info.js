/**
 * Created by ML3426 on 2015/9/21 0021.
 */
$('#emp_prob_start').datepicker({
    format: "yyyy/mm",
    language: "zh-CN",
    endDate: "today",
    minViewMode: 1,
    autoclose: true
});

$('#emp_prob_end').datepicker({
    format: "yyyy/mm",
    language: "zh-CN",
    endDate: "today",
    minViewMode: 1,
    autoclose: true
});

var t = $('#emp_prob_result').DataTable({
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
        targets: -1,
        data: null,
        defaultContent: "<button class='btn btn-warning' role='edit_btn' onclick='edit_btn_click()' style='margin-right: 10px;'>修改</button>"
    }],
    order: [[1, 'asc']],
    autoWidth: true
});

function edit_btn_click() {
    var header = '<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>' +
        '<h4 class="modal-title" id="myModalLabel">试用期员工列表</h4>';
    var body = '<form><div class="form-group"><label for="recipient-name" class="control-label">考核结果:</label><select name="prob_result" class="form-control" id="prob_result"><option value="0">通过</option><option value="1">不通过</option></select></div><div class="form-group"><label for="prob_grade" class="control-label">考核评语:</label><textarea class="form-control" style="resize: none" rows="12" name="prob_grade" id="prob_grade"></textarea></div></form>';
    var footer = '<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>';
    showModal(header, body, footer, {})
}

$("#prob_search_btn").click(function () {
    $("#prob_result_div").attr("class", "row animated fadeInDown");
});