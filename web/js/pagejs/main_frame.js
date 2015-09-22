/**
 * 后台主界面的js
 */
$(document).ready(function () {
    var data_skin = $.cookie('data-skin');
    if (data_skin != undefined) {
        var data_skin_array = [];
        $("a[data-skin]").each(function () {
            data_skin_array.push($(this).attr("data-skin"));
        });
        if ($.inArray(data_skin, data_skin_array) > 0) {
            $("body").attr("class", "hold-transition " + data_skin + " sidebar-mini");
        }
    }
    //  点击主题链接切换页面主题
    $("a[data-skin]").click(function () {
        $("body").attr("class", "hold-transition " + $(this).attr("data-skin") + " sidebar-mini");
        $.cookie('data-skin', $(this).attr("data-skin"), {expires: 7});
    });

    $("#dept_info").click(function () {
        $("#page_container").load("./deptInfo");
    });

    $("#dept_add").click(function () {
        $("#page_container").load("./deptAdd");
    });

    $("#post_add").click(function () {
        $("#page_container").load("./postAdd");
    });

    $("#post_info").click(function () {
        $("#page_container").load("./postInfo");
    });

    $("#emp_add").click(function () {
        $("#page_container").load("./empAdd");
    });

    $("#emp_info").click(function () {
        $("#page_container").load("./empInfo");
    });

    $("#prob_info").click(function () {
        $("#page_container").load("./probInfo");
    });

    $("#probed_info").click(function () {
        $("#page_container").load("./probedInfo");
    });

    $("#emp_exit").click(function () {
        $("#page_container").load("./empExit");
    });

    $("#emp_exited").click(function () {
        $("#page_container").load("./empExited");
    });

    $("#post_trans").click(function () {
        $("#page_container").load("./postTrans");
    });

    $("#post_transed").click(function () {
        $("#page_container").load("./postTransed");
    });

    $("#emp_search").click(function () {
        $("#page_container").load("./empSearch");
    });

    $("#newemp_table").click(function () {
        $("#page_container").load("./newEmpTable");
    });

    $("#exitemp_table").click(function () {
        $("#page_container").load("./exitEmpTable");
    });

    $("#dept_trans").click(function () {
        $("#page_container").load("./deptTransTable");
    });

    $("#hr_month").click(function () {
        $("#page_container").load("./hrMonth");
    });
});

function showModal(header, content, footer, options, callback) {
    var modal = $("#mainModal");
    $(".modal-header").html(header);
    $(".modal-body").html(content);
    $(".modal-footer").html(footer);
    modal.modal(options);
    if (callback != undefined) {
        callback();
    }
    modal.modal('show');
}

function hideModal() {
    var modal = $("#mainModal");
    $(".modal-header").html("");
    $(".modal-body").html("");
    $(".modal-footer").html("");
    modal.modal('hide');
}
