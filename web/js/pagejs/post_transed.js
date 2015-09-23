/**
 * Created by ML3426 on 2015/9/21 0021.
 */

$('input[name=trans_type]').iCheck({
    checkboxClass: 'icheckbox_flat-yellow',
    radioClass: 'iradio_flat-yellow',
    increaseArea: '20%' // optional
});

$("#emp_search_btn").click(function () {
    $("#post_transed_form").ajaxSubmit({
        url: '',
        type: 'POST',
        dataType: 'JSON',
        success: function (data) {
            alert(data);
        }
    });
});