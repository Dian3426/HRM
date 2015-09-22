/**
 * Created by ML3426 on 2015/9/22 0022.
 */
$('.input-daterange').datepicker({
    format: "yyyy-mm",
    minViewMode: 1,
    weekStart: 7,
    language: "zh-CN",
    autoclose: true,
    todayHighlight: true
});

var t = $('#exitemp_table_table').DataTable({
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

$("#exitemp_search_btn").click(function () {
    $("#newemp_div").attr("class", "row animated fadeInDown");
});