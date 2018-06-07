/**
 * Created by try on 2018/3/24.
 */
//登陆
$('#login').click(function(){
    $.ajax({
        type: 'post',
        url: '../user/login',
        data: {
            username:$("#username").val(),
            password:$("#password").val(),//密码经过加密
            // password:hex_md5($("#password").val()).toUpperCase(),//密码经过加密
        },
        success: function(result) {
            if (result == "success") {
                window.location.href="map.html"+"?"+Math.random();
            } else {
                alertWindow("用户名或密码错误", "error");
            }
        }
    });
});

//nginx 转发跨域
// $('#login').click(function(){
//     var proxyUrl = "/seawater/user/login";
//     $.ajax({
//         type: 'post',
//         // url: 'http://127.0.0.1:8081/seawater/user/login',
//         url: proxyUrl,
//         data: {
//             username:$("#username").val(),
//             password:$("#password").val(),//密码经过加密
//             // password:hex_md5($("#password").val()).toUpperCase(),//密码经过加密
//         },
//         success: function(result) {
//             if (result == "success") {
//                 window.location.href="map.html"+"?"+Math.random();
//             } else {
//                 alertWindow("用户名或密码错误", "error");
//             }
//         }
//     });
// });