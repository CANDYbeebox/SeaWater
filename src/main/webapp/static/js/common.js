/**
 * Created by try on 2018/5/24.
 */

// 获得当前用户名
$(document).ready(function () {
    $.ajax({
        type: 'get',
        cache:false,
        url: '../user/usermessage',
        success: function (result) {
            $("#username").html(result);
        },
    });
});
