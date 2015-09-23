/**
 * Created by ML3426 on 2015/9/23 0023.
 */

$("#btn_post_add_save").click(function () {
    $("#post_add_form").ajaxSubmit({
        url: '/postAdd',
        type: 'POST',
        dataType: 'JSON',
        success: function (data) {
            alert(data);
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