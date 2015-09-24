/**
 * Created by ML3426 on 2015/9/23 0023.
 */
$.ajax({
    url: '/deptInfo',
    type: 'POST',
    dataType: 'json',
    success: function (data) {
        for (var i = 0; i < data['skdepts'].length; i++) {
            $("#trans_dept_name").append("<option value='" + data['skdepts'][i]['dept_id'] + "'>" + data['skdepts'][i]['name'] + "</option>");
        }
    }
});

$("#trans_dept_name").change(function () {
    $.ajax({
        url: '/getPostsByDept',
        type: 'POST',
        dataType: 'json',
        data: {
            dept_id: $(this).val()
        },
        success: function (data) {
            for (var i = 0; i < data['data'].length; i++) {
                $("#trans_post_name").append("<option value='" + data['data'][i][0] + "'>" + data['data'][i][1] + "</option>");
            }
            $.ajax({
                url: '/getEmpByPostID',
                type: 'POST',
                dataType: 'json',
                data: {
                    post_id: data['data'][0][0]
                },
                success: function (data) {
                    for (var i = 0; i < data['data'].length; i++) {
                        $("#trans_emp_name").append("<option value='" + data['data'][i][0] + "'>" + data['data'][i][1] + "</option>");
                    }
                }
            });
            $("#trans_emp_name").html("");
        }
    });
});

$("#trans_post_name").change(function () {
    $.ajax({
        url: '/getEmpByPostID',
        type: 'POST',
        dataType: 'json',
        data: {
            post_id: $(this).val()
        },
        success: function (data) {
            for (var i = 0; i < data['data'].length; i++) {
                $("#trans_emp_name").append("<option value='" + data['data'][i][0] + "'>" + data['data'][i][1] + "</option>");
            }
        }
    });
});

$.ajax({
    url: '/getPostAndSdept',
    type: 'POST',
    dataType: 'json',
    success: function (data) {
        for (var i = 0; i < data.length; i++) {
            $("#trans_new_post").append("<option value='" + data[i] + "'>" + data[i] + "</option>");
        }
    }
});

$("#emp_search_btn").click(function () {
    var header = '<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>' +
        '<h4 class="modal-title" id="myModalLabel">信息</h4>';
    var body = '调动成功';
    var footer = '<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>';
    showModal(header, body, footer, {})
    sessionStorage.setItem("trans_d", "a");
});