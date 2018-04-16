/**
 * Created by try on 2018/4/16.
 */
var flagConverter;
var flagBattery;

function alertWindow(text,type){
    swal({
        title:"",
        text:text,
        type:type,
        animation:"slide-from-top",
        allowOutsideClick:true,
        timer:1000
    }, function() {
    });
}

$(document).ready(function(){
    $("#EMS正在控制").css({"background":"red"});
    flagConverter=setInterval(selectConverter,1000);
    flagBattery=setInterval(selectBattery,1000);
});

function selectConverter() {
    $.ajax({
        type: 'post',
        url: '../savepower/getenergystorage',
        dataType:"json",
        success: function(result) {
            console.log(JSON.stringify(result));
            if (result.id == 0) {
                alertWindow("未检测到变流器数据", "error");
                clearInterval(flagConverter);
            }
        }
    });
}

function selectBattery() {
    $.ajax({
        type: 'post',
        url: '../savepower/getbattery',
        dataType:"json",
        success: function(result) {
            console.log(JSON.stringify(result));
            if (result.id == 0) {
                alertWindow("未检测到电池组数据", "error");
                clearInterval(flagConverter);
            }
        }
    });
}