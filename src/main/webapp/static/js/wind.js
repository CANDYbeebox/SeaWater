/**
 * Created by try on 2018/4/16.
 */
// getWindOne();
$(document).ready(function () {
    var windSpeedOne = new Array(60);
    var rotateSpeedOne = new Array(60);
    var powerOne = new Array(60);
    // for (var i = 0; i < 60; i ++) {
    //     windSpeedOne[i] = 0;
    //     rotateSpeedOne[i] = 0;
    //     powerOne[i] = 0;
    // }

    var windSpeedTwo = new Array(60);
    var rotateSpeedTwo = new Array(60);
    var powerTwo = new Array(60);
    // for (var i = 0; i < 60; i ++) {
    //     windSpeedTwo[i] = 0;
    //     rotateSpeedTwo[i] = 0;
    //     powerTwo[i] = 0;
    // }


// lineOne();
    var flagOne = setInterval(getWindOne, 1000);
    var flagTwo = setInterval(getWindTwo, 1000);

    function getWindOne() {
        $.ajax({
            type: 'get',
            url: '../wind/getone',
            dataType: "json",
            success: function (result) {
                if (result.id == 0) {
                    alertWindow("未检测到风机数据,跳转到地图重新选择", "error");
                    clearInterval(flagOne);
                    setTimeout("window.location.href='map.html'", 1000);

                } else {
                    setHtmlWindone(result);
                    lineOne(result);
                }
            },
        });
    }


    function getWindTwo() {
        $.ajax({
            type: 'get',
            url: '../wind/gettwo',
            dataType: "json",
            success: function (result) {
                if (result.id == 0) {
                    alertWindow("未检测到风机数据跳转到地图重新选择", "error");
                    clearInterval(flagTwo);
                    setTimeout("window.location.href='map.html'", 1000);
                } else {
                    setHtmlWindtwo(result);
                    lineTwo(result);
                }
            },
        });
    }

    function setHtmlWindone(data) {
        //机组参数
        $("#风向1").html(data.windturb1_40007);
        $("#电网电压U1").html(data.windturb1_40065);
        $("#1s风速1").html(data.windturb1_40005);
        $("#电网电压V1").html(data.windturb1_40066);
        $("#5min平均风速1").html(data.windturb1_40006);
        $("#电网电压W1").html(data.windturb1_40067);
        // $("#可发平均功率预测1").html(data.windturb1_40007);
        $("#输出电流U1").html(data.windturb1_40068);
        $("#转速1").html(data.windturb1_40008);
        $("#输出电流V1").html(data.windturb1_40069);
        $("#浆矩角1").html(data.windturb1_40009);
        $("#输出电流W1").html(data.windturb1_40070);
        $("#功率给定1").html(data.windturb1_40260);
        $("#功率因素1").html(data.windturb1_40073);
        $("#有功功率1").html(data.windturb1_40071);
        $("#累计发电量").html(data.windturb1_40075);
        $("#无功功率").html(data.windturb1_40072);
        //运行状态
        if (data.windturb1_40001_1 == "1") {
            $("#就地控制1").css({"background": "red"});
        } else {
            $("#就地控制1").css({"background": "green"});
        }
        if (data.windturb1_40001_2 == "1") {
            $("#远程控制1").css({"background": "red"});
        } else {
            $("#远程控制1").css({"background": "green"});
        }
        if (data.windturb1_40002_1 == "1") {
            $("#手动模式1").css({"background": "red"});
        } else {
            $("#手动模式1").css({"background": "green"});
        }
        if (data.windturb1_40002_2 == "1") {
            $("#自动模式1").css({"background": "red"});
        } else {
            $("#自动模式1").css({"background": "green"});
        }
        if (data.windturb1_40002_3 == "1") {
            $("#维护模式1").css({"background": "red"});
        } else {
            $("#维护模式1").css({"background": "green"});
        }
        if (data.windturb1_40002_4 == "1") {
            $("#停机模式1").css({"background": "red"});
        } else {
            $("#停机模式1").css({"background": "green"});
        }
        if (data.windturb1_40003_1 == "1") {
            $("#启动1").css({"background": "red"});
        } else {
            $("#启动1").css({"background": "green"});
        }
        if (data.windturb1_40003_2 == "1") {
            $("#运行1").css({"background": "red"});
        } else {
            $("#运行1").css({"background": "green"});
        }
        if (data.windturb1_40003_3 == "1") {
            $("#暂停1").css({"background": "red"});
        } else {
            $("#暂停1").css({"background": "green"});
        }
        if (data.windturb1_40003_4 == "1") {
            $("#停机1").css({"background": "red"});
        } else {
            $("#停机1").css({"background": "green"});
        }
        if (data.windturb1_40003_5 == "1") {
            $("#急停1").css({"background": "red"});
        } else {
            $("#急停1").css({"background": "green"});
        }
        if (data.windturb1_40003_6 == "1") {
            $("#空转1").css({"background": "red"});
        } else {
            $("#空转1").css({"background": "green"});
        }
        //故障报警
        if (data.windturb1_40261 == "1") {
            $("#通讯故障1").css({"background": "red"});
        } else {
            $("#通讯故障1").css({"background": "green"});
        }
        if (data.windturb1_40010_0 == "1") {
            $("#电机超速1").css({"background": "red"});
        } else {
            $("#电机超速1").css({"background": "green"});
        }
        if (data.windturb1_40010_1 == "1") {
            $("#直流过压1").css({"background": "red"});
        } else {
            $("#直流过压1").css({"background": "green"});
        }
        if (data.windturb1_40010_2 == "1") {
            $("#变桨故障1").css({"background": "red"});
        } else {
            $("#变桨故障1").css({"background": "green"});
        }
        if (data.windturb1_40010_3 == "1") {
            $("#电机故障1").css({"background": "red"});
        } else {
            $("#电机故障1").css({"background": "green"});
        }
        if (data.windturb1_40010_4 == "1") {
            $("#偏航故障1").css({"background": "red"});
        } else {
            $("#偏航故障1").css({"background": "green"});
        }
        if (data.windturb1_40010_5 == "1") {
            $("#逆变器故障1").css({"background": "red"});
        } else {
            $("#逆变器故障1").css({"background": "green"});
        }
        if (data.windturb1_40010_6 == "1") {
            $("#安全链故障1").css({"background": "red"});
        } else {
            $("#安全链故障1").css({"background": "green"});
        }
        if (data.windturb1_40010_7 == "1") {
            $("#大风报警").css({"background": "red"});
        } else {
            $("#大风报警").css({"background": "green"});
        }
    }

    function setHtmlWindtwo(data) {
        //机组参数
        $("#风向2").html(data.windturb2Add0001);
        $("#风速2").html(data.windturb2Add0000);
        $("#转速2").html(data.windturb2Add0002);
        $("#电网电压2").html(data.windturb2Add0003);
        $("#电网电流2").html(data.windturb2Add0004);
        $("#有功功率2").html(data.windturb2Add0005);
        $("#无功功率2").html(data.windturb2Add0006);
        $("#电网频率2").html(data.windturb2Add0007);
        $("#累计发电量2").html(data.windturb2Add0008);
        //运行状态
        if (data.windturb2Add0010Bit5 == "1") {
            $("#就地控制2").css({"background": "red"});
        } else {
            $("#就地控制2").css({"background": "green"});
        }
        if (data.windturb2Add0010Bit6 == "1") {
            $("#远程控制2").css({"background": "red"});
        } else {
            $("#远程控制2").css({"background": "green"});
        }
        if (data.windturb2Add0010Bit0 == "1") {
            $("#手动模式2").css({"background": "red"});
        } else {
            $("#手动模式2").css({"background": "green"});
        }
        if (data.windturb2Add0010Bit1 == "1") {
            $("#自动模式2").css({"background": "red"});
        } else {
            $("#自动模式2").css({"background": "green"});
        }
        if (data.windturb2Add0010Bit2 == "1") {
            $("#变流器待机2").css({"background": "red"});
        } else {
            $("#变流器待机2").css({"background": "green"});
        }
        if (data.windturb2Add0010Bit3 == "1") {
            $("#运行状态2").css({"background": "red"});
        } else {
            $("#运行状态2").css({"background": "green"});
        }
        if (data.windturb2Add0010Bit4 == "1") {
            $("#停机状态2").css({"background": "red"});
        } else {
            $("#停机状态2").css({"background": "green"});
        }
        //故障报警
        if (data.windturb2Add0034 == "1") {
            $("#通讯故障2").css({"background": "red"});
        } else {
            $("#通讯故障2").css({"background": "green"});
        }
        if (data.windturb2Add0011Bit0 == "1") {
            $("#电机超速2").css({"background": "red"});
        } else {
            $("#电机超速2").css({"background": "green"});
        }
        if (data.windturb2Add0011Bit1 == "1") {
            $("#大风报警2").css({"background": "red"});
        } else {
            $("#大风报警2").css({"background": "green"});
        }
        if (data.windturb2Add0011Bit5 == "1") {
            $("#变桨故障2").css({"background": "red"});
        } else {
            $("#变桨故障2").css({"background": "green"});
        }
        if (data.windturb2Add0011Bit4 == "1") {
            $("#偏航故障2").css({"background": "red"});
        } else {
            $("#偏航故障2").css({"background": "green"});
        }
        if (data.windturb2Add0011Bit3 == "1") {
            $("#逆变器故障2").css({"background": "red"});
        } else {
            $("#逆变器故障2").css({"background": "green"});
        }
        if (data.windturb2Add0011Bit2 == "1") {
            $("#电机故障2").css({"background": "red"});
        } else {
            $("#电机故障2").css({"background": "green"});
        }

    }

    function lineOne(data) {
        for (var i = 0; i < 59; i++) {
            windSpeedOne[i] = windSpeedOne[i + 1];
        }
        windSpeedOne[59] = data.windturb1_40005;
        // windSpeedOne[59] = windSpeedOne[59] + 1;
        for (var i = 0; i < 59; i++) {
            rotateSpeedOne[i] = rotateSpeedOne[i + 1];
        }
        rotateSpeedOne[59] = data.windturb1_40008;
        // rotateSpeedOne[59] = rotateSpeedOne[59] + 1;
        for (var i = 0; i < 59; i++) {
            powerOne[i] = powerOne[i + 1];
        }
        powerOne[59] = data.windturb1_40071;
        // powerOne[59] = powerOne[59] + 1;
        var timestamp =(new Date()).valueOf();
        timestamp -= 60000;
        var time = new Array(60);
        for (var i = 0; i < 60; i++) {
            time[i] = new Date(timestamp).toLocaleTimeString();
            timestamp+= 1000;
        }

        var echarts;
        var chart;
        var myChart;
        var groupCategories = [];
        var groupColors = [];
        require([
            'echarts'
        ], function (ec) {
            echarts = ec;
            chart = myChart = echarts.init(document.getElementById('line1'));
            option = {
                backgroundColor: '#3c8dbc',
                color: ['#d28367', '#c3362f', '#32CD32'],
                tooltip: {
                    trigger: 'axis',
                    axisPointer: {
                        type: 'cross',
                        animation: false,
                        label: {
                            backgroundColor: '#0D4286'
                        }
                    },
                },
                legend: {
                    left: 'center',
                    data: ['风速(m/s)', '转速(r/min)', '功率(kw)',],
                    textStyle: {
                        color: "#ffffff",
                        fontsize: 5
                    }
                },
//            dataZoom: [{
//                show: true,
//                realtime: true,
//                start: 0,
//                end: 5,
//                // backgroundColor:'#d'
//                textStyle: {
//                    color: "#ffffff"
//                },
//            }, {
//                type: 'inside',
//                realtime: true,
//                start: 5,
//                end: 85
//            }],
                grid: {
                    top: '10%',
                    left: '2%',
                    right: '1%',
                    bottom: '14%',
                    containLabel: true
                },
                xAxis: {
                    type: 'category',
//                type: 'value',
                    axisLine: {
                        lineStyle: {
                            color: '#FFFFFF'
                        }
                    },
                    axisLabel: { //调整x轴的lable
                        textStyle: {
                            color: '#FFFFFF'
                        }
                    },
                    data:time,
                },
                yAxis: [{
                    boundaryGap: [0, '50%'],
                    axisLine: {
                        lineStyle: {
                            color: '#FFFFFF'
                        }
                    },
                    type: 'value',
                    name: '风速',
                    position: 'left',
                    offset: 40,
                    splitNumber: 5,
                    min:0,
                    max:30,
                    axisLabel: {
                        formatter: '{value}',
                        textStyle: {
                            color: '#FFFFFF'
                        }
                    },
                    splitLine: {
                        show: false
                    }
                }, {
                    boundaryGap: [0, '50%'],
                    axisLine: {
                        lineStyle: {
                            color: '#FFFFFF'
                        }
                    },
                    splitLine: {
                        show: false,
                    },
                    type: 'value',
                    name: '转速',
                    position: 'left',
                    splitNumber: 4,
                    min:0,
                    max:80,
                    axisLabel: {
                        formatter: '{value} '
                    }
                }, {
                    boundaryGap: [0, '50%'],
                    axisLine: {
                        lineStyle: {
                            color: '#FFFFFF'
                        }
                    },
                    splitLine: {
                        show: false
                    },
                    type: 'value',
                    name: '功率',
                    position: 'right',
                    splitNumber: 4,
                    min:0,
                    max:120,
                    axisTick: {
                        inside: 'false',
                        length: 10
                    }
                }],
                series: [{
                    name: '风速(m/s)',
                    symbol:'none',//去掉点
                    smooth:true,//平滑
                    type: 'line',
//                step: 'middle',
                    data:windSpeedOne,
                    yAxisIndex: 0
                }, {
                    name: '转速(r/min)',
                    symbol:'none',//去掉点
                    smooth:true,
                    type: 'line',
//                step: 'start',
                    data:rotateSpeedOne,
                    yAxisIndex: 1
                }, {
                    name: '功率(kw)',
                    symbol:'none',//去掉点
                    smooth:true,
                    type: 'line',
//                step: 'end',
                    data:powerOne,
                    yAxisIndex: 2
                }]
            };
            chart.setOption(option);
        });
    }

    function lineTwo(data) {
        for (var i = 0; i < 59; i++) {
            windSpeedTwo[i] = windSpeedTwo[i + 1];
        }
        windSpeedTwo[59] = data.windturb2Add0000;
        // windSpeedOne[59] = windSpeedOne[59] + 1;
        for (var i = 0; i < 59; i++) {
            rotateSpeedTwo[i] = rotateSpeedTwo[i + 1];
        }
        rotateSpeedTwo[59] = data.windturb2Add0002;
        // rotateSpeedOne[59] = rotateSpeedOne[59] + 1;
        for (var i = 0; i < 59; i++) {
            powerTwo[i] = powerTwo[i + 1];
        }
        // alert(data.windturb2Add0005);
        powerTwo[59] = data.windturb2Add0005;
        // powerOne[59] = powerOne[59] + 1;
        var timestamp =(new Date()).valueOf();
        timestamp -= 60000;
        var time = new Array(60);
        for (var i = 0; i < 60; i++) {
            time[i] = new Date(timestamp).toLocaleTimeString();
            timestamp+= 1000;
        }

        var echarts;
        var chart;
        var myChart;
        var groupCategories = [];
        var groupColors = [];
        require([
            'echarts'
        ], function (ec) {
            echarts = ec;
            chart = myChart = echarts.init(document.getElementById('line2'));
            option = {
                backgroundColor: '#3c8dbc',
                color: ['#d28367', '#c3362f', '#32CD32'],
                tooltip: {
                    trigger: 'axis',
                    axisPointer: {
                        type: 'cross',
                        animation: false,
                        label: {
                            backgroundColor: '#0D4286'
                        }
                    },
                },
                legend: {
                    left: 'center',
                    data: ['风速(m/s)', '转速(r/min)', '功率(kw)',],
                    textStyle: {
                        color: "#ffffff",
                        fontsize: 5
                    }
                },
//            dataZoom: [{
//                show: true,
//                realtime: true,
//                start: 0,
//                end: 5,
//                // backgroundColor:'#d'
//                textStyle: {
//                    color: "#ffffff"
//                },
//            }, {
//                type: 'inside',
//                realtime: true,
//                start: 5,
//                end: 85
//            }],
                grid: {
                    top: '10%',
                    left: '2%',
                    right: '1%',
                    bottom: '14%',
                    containLabel: true
                },
                xAxis: {
                    type: 'category',
//                type: 'value',
                    axisLine: {
                        lineStyle: {
                            color: '#FFFFFF'
                        }
                    },
                    axisLabel: { //调整x轴的lable
                        textStyle: {
                            color: '#FFFFFF'
                        }
                    },
                    data:time,
                },
                yAxis: [{
                    boundaryGap: [0, '50%'],
                    axisLine: {
                        lineStyle: {
                            color: '#FFFFFF'
                        }
                    },
                    type: 'value',
                    name: '风速',
                    position: 'left',
                    offset: 40,
                    splitNumber: 5,
                    min:0,
                    max:30,
                    axisLabel: {
                        formatter: '{value}',
                        textStyle: {
                            color: '#FFFFFF'
                        }
                    },
                    splitLine: {
                        show: false
                    }
                }, {
                    boundaryGap: [0, '50%'],
                    axisLine: {
                        lineStyle: {
                            color: '#FFFFFF'
                        }
                    },
                    splitLine: {
                        show: false,
                    },
                    type: 'value',
                    name: '转速',
                    position: 'left',
                    splitNumber: 4,
                    min:0,
                    max:80,
                    axisLabel: {
                        formatter: '{value} '
                    }
                }, {
                    boundaryGap: [0, '50%'],
                    axisLine: {
                        lineStyle: {
                            color: '#FFFFFF'
                        }
                    },
                    splitLine: {
                        show: false
                    },
                    type: 'value',
                    name: '功率',
                    position: 'right',
                    splitNumber: 4,
                    min:0,
                    max:120,
                    axisTick: {
                        inside: 'false',
                        length: 10
                    }
                }],
                series: [{
                    name: '风速(m/s)',
                    symbol:'none',//去掉点
                    smooth:true,//平滑
                    type: 'line',
//                step: 'middle',
                    data:windSpeedTwo,
                    yAxisIndex: 0
                }, {
                    name: '转速(r/min)',
                    symbol:'none',//去掉点
                    smooth:true,
                    type: 'line',
//                step: 'start',
                    data:rotateSpeedTwo,
                    yAxisIndex: 1
                }, {
                    name: '功率(kw)',
                    symbol:'none',//去掉点
                    smooth:true,
                    type: 'line',
//                step: 'end',
                    data:powerTwo,
                    yAxisIndex: 2
                }]
            };
            chart.setOption(option);
        });
    }
});
