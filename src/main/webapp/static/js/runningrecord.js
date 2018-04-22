/**
 * Created by try on 2018/4/20.
 */
// $('.M-box').pagination({
//     totalData:60,
//     showData:10,
//     coping:true
// });
var totalData = 60;
var showData = 15;

$(".M-box").pagination({
    totalData:totalData,
    showData:showData,
    coping:true,
    callback: PageCallback,
});


function PageCallback(api) {
    var current = api.getCurrent();
    $.ajax({
        type: 'post',
        data:current,
        url: '../runningrecord/getter',
        dataType: "json",
        success: function (result) {

        }
    });
}


