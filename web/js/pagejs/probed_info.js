/**
 * Created by ML3426 on 2015/9/21 0021.
 */

$('#emp_prob_end').datepicker({
    format: "yyyy/mm",
    language: "zh-CN",
    endDate: "today",
    minViewMode: 1,
    autoclose: true
});

var t = $('#emp_probed_result').DataTable({
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
    }],
    order: [[1, 'asc']],
    autoWidth: true
});

t.on('order.dt search.dt', function () {
    t.column(0, {search: 'applied', order: 'applied'}).nodes().each(function (cell, i) {
        cell.innerHTML = i + 1;
    });
}).draw();

$("#probed_search_btn").click(function () {
    $("#probed_result_div").attr("class", "row animated fadeInDown");
});