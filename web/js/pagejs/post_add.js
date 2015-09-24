/**
 * Created by ML3426 on 2015/9/23 0023.
 */

$("#btn_post_add_save").click(function () {
    $("#post_add_form").ajaxSubmit({
        url: '/postAdd',
        type: 'POST',
        dataType: 'JSON',
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
        }
    });
});

$.ajax({
    url: '/deptInfo',
    type: 'POST',
    dataType: 'json',
    success: function (data) {
        for (var i = 0; i < data['skdepts'].length; i++) {
            $("#post_sdept").append("<option value='" + data['skdepts'][i]['dept_id'] + "'>" + data['skdepts'][i]['name'] + "</option>");
        }
    }
});

$.ajax({
    url: '/getJobs',
    type: 'POST',
    dataType: 'json',
    success: function (data) {
        for (var i = 0; i < data.length; i++) {
            $("#post_type").append("<option value='" + data[i]['key'] + "'>" + data[i]['value'] + "</option>");
        }
    }
});