/**
 * Created by ML3426 on 2015/9/23 0023.
 */
$("button[id=admin_add_save]").click(function () {
    $('#admin_add_form').ajaxSubmit({
        url: '',
        type: 'POST',
        success: function (data) {
            alert(data);
        }
    });
});