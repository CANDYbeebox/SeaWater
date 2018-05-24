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
var allData;

$(document).ready(function () {
    $.ajax({
        type: 'get',
        cache:false,
        url: '../runningrecord/getsession',
        success: function (result) {
            if (result == "error") {
                alertWindow("请返回地图选择要查看的设备", "error");
                setTimeout("window.location.href='map.html'", 1000);
            }
        }
    })
});

function confirmSelect() {
    var dateStr = $("#time").val();
    var dt = new Date(dateStr.replace(/-/,"/"));
    var timeLong = dt.getTime();
    $.ajax({
        type: 'post',
        cache:false,
        data:{
            timelong:timeLong
        },
        datatype:"json",
        url: '../runningrecord/getrecord',
        success: function (result) {
            // alert(JSON.stringify(result));
            totalData = result.length;
            if (totalData == 0) {
                alertWindow("未查到符合条件的数据或者未选定公司", "error");
            }
            allData = result;
            alert(totalData);
            $(".M-box").pagination({
                totalData:totalData,
                showData:showData,
                coping:true,
                load_first_page:true,
                callback: PageCallback,
            });
            var start = 1;
            var end = 16;
            $('#运行记录').html("");
            for (var i = start; i <= totalData && i < end; i++) {
                var rowData = allData[i - 1];
                var date = new Date(rowData.recordTime);
                Y = date.getFullYear() + '-';
                M = (date.getMonth()+1 < 10 ? '0'+(date.getMonth()+1) : date.getMonth()+1) + '-';
                D = date.getDate() + ' ';
                h = date.getHours() + ':';
                m = date.getMinutes();
                var recordTime = Y+M+D+h+m;
                var newRow = '<tr id="option" '+i+'><td>'+ i +'</td>'
                    + '<td >' +recordTime+ '</td>'
                    + '<td >' +rowData.oneSpeed+ '</td>'
                    + '<td >' +rowData.onePower+ '</td>'
                    + '<td >' +rowData.twoSpeed+ '</td>'
                    + '<td >' +rowData.twoPower+ '</td>'
                    + '<td >' +rowData.desalinationPower+ '</td>'
                    + '<td >' +rowData.desalinationYield+ '</td>'
                    + '<td >' +rowData.pcs+ '</td></tr>'
                $('#运行记录').append(newRow);// alert(JSON.stringify(allData[i]));
            }
        }
    });
}

function PageCallback(api) {
    $('#运行记录').html("");
    var current = api.getCurrent();
    var start = (current - 1) * 15 + 1;
    var end = (current - 1) * 15 + 15 + 1;
    for (var i = start; i <= totalData && i < end; i++) {

        var rowData = allData[i - 1];
        var date = new Date(rowData.recordTime);
        Y = date.getFullYear() + '-';
        M = (date.getMonth()+1 < 10 ? '0'+(date.getMonth()+1) : date.getMonth()+1) + '-';
        D = date.getDate() + ' ';
        h = date.getHours() + ':';
        m = date.getMinutes();
        var recordTime = Y+M+D+h+m;
        var newRow = '<tr id="option" '+i+'><td>'+ i +'</td>'
            + '<td >' +recordTime+ '</td>'
            + '<td >' +rowData.oneSpeed+ '</td>'
            + '<td >' +rowData.onePower+ '</td>'
            + '<td >' +rowData.twoSpeed+ '</td>'
            + '<td >' +rowData.twoPower+ '</td>'
            + '<td >' +rowData.desalinationPower+ '</td>'
            + '<td >' +rowData.desalinationYield+ '</td>'
            + '<td >' +rowData.pcs+ '</td></tr>'
        $('#运行记录').append(newRow);
    }
}


