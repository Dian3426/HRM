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