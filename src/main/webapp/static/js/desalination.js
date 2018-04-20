/**
 * Created by try on 2018/4/19.
 */
$(document).ready(function () {


    var flagDesalinplant = setInterval(getDesalinplant, 1000);

    function getDesalinplant() {
        $.ajax({
            type: 'get',
            url: '../desalinplant/getdesalinplant',
            dataType: "json",
            success: function (result) {
                if (result.id == 0) {
                    alertWindow("未检测到海淡设备数据跳转到地图重新选择", "error");
                    clearInterval(flagDesalinplant);
                    setTimeout("window.location.href='map.html'", 1000);
                } else {
                    setHtmlDesalinplant(result);
                    // lineTwo(result);
                }
            },
        });
    }

    function setHtmlDesalinplant(data) {
        //流程图数据
        $("#原水箱").html(data.desalinplantAdd1013 + " cm");
        $("#UF产水箱").html(data.desalinplantAdd1014 + " cm");
        $("#一级产水箱").html(data.desalinplantAdd1015 + " cm");
        $("#一级产水流量").html("一级产水流量 " + data.desalinplantAdd1008 + " t/h");
        $("#一级产水电导").html("一级产水电导 " + data.desalinplantAdd1010 + " us/cm");
        $("#二级产水流量").html("二级产水流量 " + data.desalinplantAdd1009 + " t/h");
        $("#二级产水电导").html("二级产水电导 " + data.desalinplantAdd1011 + " us/cm");
        $("#产水箱").html(data.desalinplantAdd1016 + " cm");
        //右侧
        //暂无数据
        // $("#产水量").html(data.windturb1_40007);
        $("#负载功率").html(data.desalinplantAdd1007);
        if (data.desalinplantAdd1002Bit0Val1 == "1") {
            $("#就地").css({"background": "red"});
        } else {
            $("#就地").css({"background": "green"});
        }
        if (data.desalinplantAdd1002Bit0Val0 == "1") {
            $("#远程").css({"background": "red"});
        } else {
            $("#远程").css({"background": "green"});
        }
        if (data.desalinplantAdd1001Bit0 == "1") {
            $("#系统正常").css({"background": "red"});
        } else {
            $("#系统正常").css({"background": "green"});
        }
        if (data.desalinplantAdd1001Bit1 == "1") {
            $("#启动过程").css({"background": "red"});
        } else {
            $("#启动过程").css({"background": "green"});
        }
        if (data.desalinplantAdd1001Bit2 == "1") {
            $("#正常运行").css({"background": "red"});
        } else {
            $("#正常运行").css({"background": "green"});
        }
        if (data.desalinplantAdd1001Bit3 == "1") {
            $("#正常停机过程中").css({"background": "red"});
        } else {
            $("#正常停机过程中").css({"background": "green"});
        }
        if (data.desalinplantAdd1001Bit4 == "1") {
            $("#停机结束").css({"background": "red"});
        } else {
            $("#停机结束").css({"background": "green"});
        }
        if (data.desalinplantAdd1001Bit5 == "1") {
            $("#非正常停机").css({"background": "red"});
        } else {
            $("#非正常停机").css({"background": "green"});
        }
        if (data.desalinplantAdd1001Bit6 == "1") {
            $("#淡水冲洗").css({"background": "red"});
        } else {
            $("#淡水冲洗").css({"background": "green"});
        }
        if (data.desalinplantAdd1001Bit7 == "1") {
            $("#淡水冲洗结束").css({"background": "red"});
        } else {
            $("#淡水冲洗结束").css({"background": "green"});
        }
        //底部
        if (data.desalinplantAdd1004Bit0 == "1") {
            $("#氧化剂液位低").css({"background": "red"});
        } else {
            $("#氧化剂液位低").css({"background": "green"});
        }
        if (data.desalinplantAdd1004Bit3 == "1") {
            $("#阻垢剂液位低").css({"background": "red"});
        } else {
            $("#阻垢剂液位低").css({"background": "green"});
        }
        if (data.desalinplantAdd1004Bit6 == "1") {
            $("#碳酸氢钠液位低").css({"background": "red"});
        } else {
            $("#碳酸氢钠液位低").css({"background": "green"});
        }
        if (data.desalinplantAdd1003Bit5 == "1") {
            $("#一级高压泵故障").css({"background": "red"});
        } else {
            $("#一级高压泵故障").css({"background": "green"});
        }
        //not sure
        if (data.desalinplantAdd1003Bit4 == "1") {
            $("#UF增压泵故障").css({"background": "red"});
        } else {
            $("#UF增压泵故障").css({"background": "green"});
        }
        if (data.desalinplantAdd1004Bit1 == "1") {
            $("#氯化铁液位低").css({"background": "red"});
        } else {
            $("#氯化铁液位低").css({"background": "green"});
        }
        if (data.desalinplantAdd1004Bit4 == "1") {
            $("#还原剂液位低").css({"background": "red"});
        } else {
            $("#还原剂液位低").css({"background": "green"});
        }
        if (data.desalinplantAdd1003Bit0 == "1") {
            $("#产水高压").css({"background": "red"});
        } else {
            $("#产水高压").css({"background": "green"});
        }
        if (data.desalinplantAdd1003Bit6 == "1") {
            $("#压力提升泵故障").css({"background": "red"});
        } else {
            $("#压力提升泵故障").css({"background": "green"});
        }
        if (data.desalinplantAdd1003Bit3 == "1") {
            $("#UF反洗水泵故障").css({"background": "red"});
        } else {
            $("#UF反洗水泵故障").css({"background": "green"});
        }
        if (data.desalinplantAdd1004Bit2 == "1") {
            $("#盐酸液位低").css({"background": "red"});
        } else {
            $("#盐酸液位低").css({"background": "green"});
        }
        if (data.desalinplantAdd1004Bit5 == "1") {
            $("#氯化钙液位低").css({"background": "red"});
        } else {
            $("#氯化钙液位低").css({"background": "green"});
        }
        if (data.desalinplantAdd1003Bit1 == "1") {
            $("#取水泵故障").css({"background": "red"});
        } else {
            $("#取水泵故障").css({"background": "green"});
        }
        if (data.desalinplantAdd1003Bit7 == "1") {
            $("#二级高压泵故障").css({"background": "red"});
        } else {
            $("#二级高压泵故障").css({"background": "green"});
        }
        if (data.desalinplantAdd1003Bit2 == "1") {
            $("#一级增压泵故障").css({"background": "red"});
        } else {
            $("#一级增压泵故障").css({"background": "green"});
        }
    }
})

