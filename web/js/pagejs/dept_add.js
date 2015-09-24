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
        dataType: 'json',
        success: function (data) {
            if (data['success'] == "1") {
                var header = '<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>' +
                '<h4 class="modal-title" id="myModalLabel">信息</h4>';
                var body = '添加成功';
                var footer = '<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>';
                showModal(header, body, footer, {})
            } else {
                var header = '<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>' +
                    '<h4 class="modal-title" id="myModalLabel">信息</h4>';
                var body = '添加失败';
                var footer = '<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>';
                showModal(header, body, footer, {})
            }
            $('#dept_add_form')[0].reset();
        }
    });
});
