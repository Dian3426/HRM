/**
 * 首页的js功能
 */

// 初始化iCheck
$('input').iCheck({
    checkboxClass: 'icheckbox_square-blue',
    radioClass: 'iradio_square-blue',
    increaseArea: '20%' // optional
});

// 文本框的报错动画以及Tootip弹出
function inputWrong(div, msg) {
    div.find("input").tooltip({
        animation: true,
        placement: 'right',
        title: msg,
        trigger: 'manual '
    });
    div.find("input").tooltip('show');
    div.attr("class", "form-group has-feedback has-error animated flash");
    setTimeout(
        function () {
            div.attr("class", "form-group has-feedback");
            div.find("input").tooltip('destroy');
            div.find("input").focus().select();
        }, 1000
    )
}

$("#log_btn").click(function () {
    $.ajax({
        url: '/login',
        type: 'POST',
        data: {
            emp_id: $("#emp_id").val(),
            emp_pass: $("#emp_pass").val(),
            emp_rem: $("#emp_rem").is(":checked")
        },
        dataType: 'json',
        success: function (data) {
            if (data['success'] == "1") {
                window.location.href = "/mainFrame/";
            }
        }
    });
});