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
    //$("#ht_month_table_form").ajaxSubmit({
    //    url: '',
    //    type: 'POST',
    //    dataType: 'JSON',
    //    success: function (data) {
    //        alert(data);
    //
    //    }
    //});
    $("#hr_month_div").attr("class", "row animated fadeInDown");
});