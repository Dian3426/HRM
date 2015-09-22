/**
 * Created by ML3426 on 2015/9/22 0022.
 */
$('input[id=hr_month]').datepicker({
    format: "yyyy/mm",
    language: "zh-CN",
    endDate: "today",
    minViewMode: 1,
    autoclose: true
});

$("#hr_month_btn").click(function () {
    $("#hr_month_div").attr("class", "row animated fadeInDown");
});