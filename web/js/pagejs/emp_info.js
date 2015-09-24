/**
 * Created by ML3426 on 2015/9/21 0021.
 */
$("#emp_search_btn").click(function () {
    //$("#emp_info_idnum_form").ajaxSubmit({
    //    url: '',
    //    type: 'POST',
    //    dataType: 'JSON',
    //    success: function (data) {
    //        alert(data);
    //        $("#emp_result").attr("class", "row animated fadeInDown");
    //    }
    //});
    if ($("#emp_idNumS").val() == "430430430430430430") {
        $("#emp_result").attr("class", "row animated fadeInDown");
    } else if ($("#emp_idNumS").val() == "430430430430430431") {
        $("#emp_name").html("豆豆");
        $("#emp_idNum").html("430430430430430431");
        $("#emp_result").attr("class", "row animated fadeInDown");
    } else {
        var header = '<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>' +
            '<h4 class="modal-title" id="myModalLabel">信息</h4>';
        var body = '找不到对应的用户';
        var footer = '<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>';
        showModal(header, body, footer, {})
    }
});