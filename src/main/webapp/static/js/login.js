/**
 * Created by try on 2018/3/24.
 */
//登陆
$('#login').click(function(){
    // $("#password").val();
    // alert($("#password").val());
    // alert(hex_md5($("#password").val()));
    // saveUserInfo();
    $.ajax({
        type: 'post',
        url: '../user/login',
        data: {
            username:$("#username").val(),
            password:$("#password").val(),//密码经过加密
            // password:hex_md5($("#password").val()).toUpperCase(),//密码经过加密
        },
        // data: $("#log_form").serialize(),
        success: function(result) {
            // alert("11233");
            //  var data=result['result'];
            // if(data['info']=="正确")
            if (result == "success") {
                window.location.href="map.html"+"?"+Math.random();
            } else {
                alertWindow("用户名或密码错误", "error");
            }
            // if(result['info']=="正确")
            //     window.location.href="map.html";
            // else
            //     sweetAlert("用户名或密码错误");
        }
    });
});


// function alertWindow(text,type){
//     swal({
//         title:"",
//         text:text,
//         type:type,
//         animation:"slide-from-top",
//         allowOutsideClick:true,
//         timer:3000
//     }, function() {
//     });
// }