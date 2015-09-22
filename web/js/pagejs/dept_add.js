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

$.ajax({
    url: '/deptInfo',
    type: 'POST',
    dataType: 'json',
    success: function (data) {
        for (var i = 0; i < data['skdepts'].length; i++) {
            $("#dept_sdept").append("<option value='" + data['skdepts'][i]['dept_id'] + "'>" + data['skdepts'][i]['name'] + "</option>");
        }
    }
});

$('.textarea').wysihtml5();

$("button[id=dept_add_save]").click(function () {
    $('#dept_add_form').ajaxSubmit({
        url: '/deptAdd',
        type: 'POST',
        success: function (data) {
            alert(data);
        }
    });
});
