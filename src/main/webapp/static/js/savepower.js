/**
 * Created by try on 2018/4/16.
 */
var flagConverter;
var flagBattery;


// $(document).ready(function () {
    flagConverter = setInterval(selectConverter, 1000);
    flagBattery = setInterval(selectBattery, 1000);
// });

function selectConverter() {
    $.ajax({
        type: 'post',
        url: '../savepower/getenergystorage',
        dataType: "json",
        success: function (result) {
            if (result.id == 0) {
                alertWindow("未检测到变流器数据", "error");
                clearInterval(flagConverter);
                setTimeout("window.location.href='map.html'", 5000);
            } else {
                setHtmlConverter(result);
            }
        }
    });
}

function setHtmlConverter(data) {
    //运行模式
    if (data.pcsAdd2012Bit4Val0 == "1") {
        $("#EMS正在控制").css({"background": "red"});
    } else {
        $("#EMS正在控制").css({"background": "green"});
    }
    if (data.pcsAdd2012Bit12Val1 == "1") {
        $("#VF模式").css({"background": "red"});
    } else {
        $("#VF模式").css({"background": "green"});
    }
    if (data.pcsAdd2012Bit0Val1 == "1") {
        $("#开机状态").css({"background": "red"});
    } else {
        $("#开机状态").css({"background": "green"});
    }
    if (data.pcsAdd2012Bit12Val0 == "1") {
        $("#PQ模式").css({"background": "red"});
    } else {
        $("#PQ模式").css({"background": "green"});
    }
    if (data.pcsAdd2012Bit4Val2 == "1") {
        $("#正在调试").css({"background": "red"});
    } else {
        $("#正在调试").css({"background": "green"});
    }
    if (data.pcsAdd2012Bit12Val4 == "1") {
        $("#均压维护模式").css({"background": "red"});
    } else {
        $("#均压维护模式").css({"background": "green"});
    }
    if (data.pcsAdd2012Bit0Val0 == "1") {
        $("#停机状态").css({"background": "red"});
    } else {
        $("#停机状态").css({"background": "green"});
    }
    if (data.pcsAdd2012Bit12Val5 == "1") {
        $("#恒压充放电模式").css({"background": "red"});
    } else {
        $("#恒压充放电模式").css({"background": "green"});
    }
    if (data.pcsAdd2012Bit0Val2 == "1") {
        $("#故障锁定状态").css({"background": "red"});
    } else {
        $("#故障锁定状态").css({"background": "green"});
    }
    if (data.pcsAdd2012Bit12Val3 == "1") {
        $("#SOC标定模式").css({"background": "red"});
    } else {
        $("#SOC标定模式").css({"background": "green"});
    }
    if (data.pcsAdd2012Bit12Val2 == "1") {
        $("#电池维护模式").css({"background": "red"});
    } else {
        $("#电池维护模式").css({"background": "green"});
    }
    //遥测数据
    $("#A相电压").html(data.pcsAdd2000);
    $("#A相电流").html(data.pcsAdd2003);
    $("#B相电压").html(data.pcsAdd2001);
    $("#B相电流").html(data.pcsAdd2004);
    $("#C相电压").html(data.pcsAdd2002);
    $("#C相电流").html(data.pcsAdd2005);
    $("#无功功率").html(data.pcsAdd2008);
    $("#直流电压值").html(data.pcsAdd2009);
    $("#有功功率").html(data.pcsAdd2007);
    $("#直流电流值").html(data.pcsAdd2010);
    $("#电网频率").html(data.pcsAdd2006);
    $("#直流侧功率").html(data.pcsAdd2011);

    //报警故障
    if (data.pcsAdd2014Bit15 == "1") {
        $("#交流过流保护").css({"background": "red"});
    } else {
        $("#交流过流保护").css({"background": "green"});
    }
    if (data.pcsAdd2014Bit7 == "1") {
        $("#直流过压保护").css({"background": "red"});
    } else {
        $("#直流过压保护").css({"background": "green"});
    }
    if (data.pcsAdd2014Bit14 == "1") {
        $("#交流过压保护").css({"background": "red"});
    } else {
        $("#交流过压保护").css({"background": "green"});
    }
    if (data.pcsAdd2014Bit6 == "1") {
        $("#直流欠压保护").css({"background": "red"});
    } else {
        $("#直流欠压保护").css({"background": "green"});
    }
    if (data.pcsAdd2014Bit13 == "1") {
        $("#交流欠压保护").css({"background": "red"});
    } else {
        $("#交流欠压保护").css({"background": "green"});
    }
    if (data.pcsAdd2014Bit4 == "1") {
        $("#内部短路保护").css({"background": "red"});
    } else {
        $("#内部短路保护").css({"background": "green"});
    }
    if (data.pcsAdd2014Bit12 == "1") {
        $("#交流过频保护").css({"background": "red"});
    } else {
        $("#交流过频保护").css({"background": "green"});
    }
    if (data.pcsAdd2014Bit5 == "1") {
        $("#直流极性反接保护").css({"background": "red"});
    } else {
        $("#直流极性反接保护").css({"background": "green"});
    }
    if (data.pcsAdd2014Bit11 == "1") {
        $("#交流欠频保护").css({"background": "red"});
    } else {
        $("#交流欠频保护").css({"background": "green"});
    }
    if (data.pcsAdd2014Bit10 == "1") {
        $("#相序错误保护").css({"background": "red"});
    } else {
        $("#相序错误保护").css({"background": "green"});
    }
    if (data.pcsAdd2014Bit9 == "1") {
        $("#过载保护").css({"background": "red"});
    } else {
        $("#过载保护").css({"background": "green"});
    }
    if (data.pcsAdd2014Bit1 == "1") {
        $("#开关状态异常保护").css({"background": "red"});
    } else {
        $("#开关状态异常保护").css({"background": "green"});
    }
    if (data.pcsAdd2014Bit3 == "1") {
        $("#过温保护").css({"background": "red"});
    } else {
        $("#过温保护").css({"background": "green"});
    }
    if (data.pcsAdd2014Bit0 == "1") {
        $("#系统状态流保护").css({"background": "red"});
    } else {
        $("#系统状态流保护").css({"background": "green"});
    }
    if (data.pcsAdd2014Bit2 == "1") {
        $("#绝缘保护").css({"background": "red"});
    } else {
        $("#绝缘保护").css({"background": "green"});
    }
    if (data.pcsAdd2015Bit0 == "1") {
        $("#响应BMS故障停机").css({"background": "red"});
    } else {
        $("#响应BMS故障停机").css({"background": "green"});
    }

}

function selectBattery() {
    $.ajax({
        type: 'post',
        url: '../savepower/getbattery',
        dataType: "json",
        success: function (result) {
            console.log(JSON.stringify(result));
            if (result.id == 0) {
                alertWindow("未检测到电池组数据", "error");
                clearInterval(flagBattery);
                setTimeout("window.location.href='map.html'", 5000);
            } else {
                setHtmlBattery(result);
            }
        }
    });
}

function setHtmlBattery(data) {
    //电池组系统状态
    if (data.bmsAdd0001Bit2Val0 == "1") {
        $("#远程").css({"background": "red"});
    } else {
        $("#远程").css({"background": "green"});
    }
    if (data.bmsAdd0001Bit2Val1 == "1") {
        $("#就地").css({"background": "red"});
    } else {
        $("#就地").css({"background": "green"});
    }
    if (data.bmsAdd0001Bit3 == "1") {
        $("#维护").css({"background": "red"});
    } else {
        $("#维护").css({"background": "green"});
    }
    if (data.bmsAdd0001Bit1 == "1") {
        $("#运行").css({"background": "red"});
    } else {
        $("#运行").css({"background": "green"});
    }
    if (data.bmsAdd0001Bit6 == "1") {
        $("#均衡").css({"background": "red"});
    } else {
        $("#均衡").css({"background": "green"});
    }
    if (data.bmsAdd0001Bit4 == "1") {
        $("#报警").css({"background": "red"});
    } else {
        $("#报警").css({"background": "green"});
    }
    if (data.bmsAdd0001Bit5 == "1") {
        $("#故障").css({"background": "red"});
    } else {
        $("#故障").css({"background": "green"});
    }
    //报警故障
    if (data.bmsAdd0002Bit0 == "1") {
        $("#电池充满报警").css({"background": "red"});
    } else {
        $("#电池充满报警").css({"background": "green"});
    }
    if (data.bmsAdd0002Bit3 == "1") {
        $("#电流报警").css({"background": "red"});
    } else {
        $("#电流报警").css({"background": "green"});
    }
    if (data.bmsAdd0002Bit1 == "1") {
        $("#电池放空报警").css({"background": "red"});
    } else {
        $("#电池放空报警").css({"background": "green"});
    }
    if (data.bmsAdd0002Bit2 == "1") {
        $("#温度报警").css({"background": "red"});
    } else {
        $("#温度报警").css({"background": "green"});
    }
    if (data.bmsAdd0002Bit4 == "1") {
        $("#电池充满故障").css({"background": "red"});
    } else {
        $("#电池充满故障").css({"background": "green"});
    }
    if (data.bmsAdd0002Bit6 == "1") {
        $("#温度故障").css({"background": "red"});
    } else {
        $("#温度故障").css({"background": "green"});
    }
    if (data.bmsAdd0002Bit5 == "1") {
        $("#电池放空故障").css({"background": "red"});
    } else {
        $("#电池放空故障").css({"background": "green"});
    }
    if (data.bmsAdd0002Bit7 == "1") {
        $("#电流故障").css({"background": "red"});
    } else {
        $("#电流故障").css({"background": "green"});
    }
    if (data.bmsAdd0002Bit8 == "1") {
        $("#BMS内部故障").css({"background": "red"});
    } else {
        $("#BMS内部故障").css({"background": "green"});
    }
    if (data.bmsAdd0002Bit9 == "1") {
        $("#BMS通讯故障").css({"background": "red"});
    } else {
        $("#BMS通讯故障").css({"background": "green"});
    }
    //1#电池组
    $("#电压1").html(data.bmsAdd0004);
    $("#电流1").html(data.bmsAdd0007);
    $("#soc1").html(data.bmsAdd0010);
    $("#soh1").html(data.bmsAdd0013);
    $("#可放电量1").html(data.bmsAdd0016);
    $("#可充电量1").html(data.bmsAdd0019);
    //2#电池组
    $("#电压2").html(data.bmsAdd0005);
    $("#电流2").html(data.bmsAdd0008);
    $("#soc2").html(data.bmsAdd0011);
    $("#soh2").html(data.bmsAdd0014);
    $("#可放电量2").html(data.bmsAdd0017);
    $("#可充电量2").html(data.bmsAdd0020);
    //2#下面
    $("#单体高压").html(data.bmsAdd0023);
    $("#单体低压").html(data.bmsAdd0025);
    $("#单体高压号").html(data.bmsAdd0022);
    $("#单体低压号").html(data.bmsAdd0024);
    $("#单体高温").html(data.bmsAdd0027);
    $("#单体低温").html(data.bmsAdd0029);
    $("#单体高温编号").html(data.bmsAdd0026);
    $("#单体低温编号").html(data.bmsAdd0028);
    //电池组遥测量
    var mycars = new Array(6);
    mycars[0] = Math.round(data.bmsAdd0006 * 1);
    mycars[1] = Math.round(data.bmsAdd0009 * 1);
    mycars[2] = Math.round(data.bmsAdd0012 * 1);
    mycars[3] = Math.round(data.bmsAdd0015 * 1);
    mycars[4] = Math.round(data.bmsAdd0018 * 1);
    mycars[5] = Math.round(data.bmsAdd0021 * 1);
    $("#遥测量电压").html(mycars[0]);
    $("#遥测量电流").html(mycars[1]);
    $("#遥测量SOC").html(mycars[2]);
    $("#遥测量SOH").html(mycars[3]);
    $("#遥测量可充kWh").html(mycars[4]);
    $("#遥测量可放kWh").html(mycars[5]);
    var percents = new Array(6);
    percents[0] = mycars[0] / 200 * 100 + "%";
    percents[1] = (mycars[1] + 300) / 500 * 100 + "%";
    percents[2] = mycars[2] / 100 * 100 + "%";
    percents[3] = mycars[3] / 100 * 100 + "%";
    percents[4] = mycars[4] / 400 * 100 + "%";
    percents[5] = mycars[5] / 400 * 100 + "%";
    $("#遥测量电压长度").css({"width": percents[0]});
    $("#遥测量电流长度").css({"width": percents[1]});
    $("#遥测量SOC长度").css({"width": percents[2]});
    $("#遥测量SOH长度").css({"width": percents[3]});
    $("#遥测量可充kWh长度").css({"width": percents[4]});
    $("#遥测量可放kWh长度").css({"width": percents[5]});

}