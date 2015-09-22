/**
 * Created by ML3426 on 2015/9/20 0020.
 */
$('.input-group.date').datepicker({
    format: "yyyy/mm/dd",
    weekStart: 7,
    todayBtn: "linked",
    language: "zh-CN",
    autoclose: true,
    todayHighlight: true
});

$('.textarea').wysihtml5();