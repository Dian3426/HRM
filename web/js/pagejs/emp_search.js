/**
 * Created by ML3426 on 2015/9/21 0021.
 */
$("#emp_search_btn").click(function () {
    $("#emp_search_form").ajaxSubmit({
        url: '',
        type: 'POST',
        dataType: 'JSON',
        success: function (data) {
            alert(data);
            $("#emp_result").attr("class", "row animated fadeInDown");
        }
    });
});