function initMap() {
    $.ajaxSettings.async = false;
    createMap();//创建地图
    setMapEvent();//设置地图事件
    addMapControl();//向地图添加控件
    //showAllElevator();//显示所有电梯公司
    // clear();
    showMarker();
}

//创建地图函数：
function createMap() {
    var map = new BMap.Map("allmap");//在百度地图容器中创建一个地图
    // var point = new BMap.Point(118.78112418181817, 32.06591672727273);//定义一个中心点坐标
    var point = new BMap.Point(118.701875, 32.11);//定义一个中心点坐标
    window.map = map;//将map变量存储在全局
    map.centerAndZoom(point, 5);//设定地图的中心点和坐标并将地图显示在地图容器中

    map.clearOverlays();
}
//地图事件设置函数：
function setMapEvent() {
    map.enableDragging();//启用地图拖拽事件，默认启用(可不写)
    map.enableScrollWheelZoom();//启用地图滚轮放大缩小
    map.enableDoubleClickZoom();//启用鼠标双击放大，默认启用(可不写)
    map.enableKeyboard();//启用键盘上下左右键移动地图
}
//地图控件添加函数：
function addMapControl() {
    //向地图中添加缩放控件
    var ctrl_nav = new BMap.NavigationControl({anchor: BMAP_ANCHOR_TOP_LEFT, type: BMAP_NAVIGATION_CONTROL_LARGE});
    map.addControl(ctrl_nav);
    //向地图中添加缩略图控件
    var ctrl_ove = new BMap.OverviewMapControl({anchor: BMAP_ANCHOR_BOTTOM_RIGHT, isOpen: 1});
    map.addControl(ctrl_ove);
    //向地图中添加比例尺控件
    var ctrl_sca = new BMap.ScaleControl({anchor: BMAP_ANCHOR_BOTTOM_LEFT});
    map.addControl(ctrl_sca);
}

function showMarker() {
    $.ajax({
        type: 'post',
        url: '../user/companygetter',
        dataType:"json",
        success: function(data) {
            if($.isEmptyObject(data)) {
                alertWindow("没有符合条件的数据", error);
            } else {
                var rowCount = 0;
                $.each(data, function (i, value) {

                    //表格
                    rowCount++;
                    var newRow = '<tr id="FAC' + rowCount + '"><td id="FACID' + rowCount + '"></td>' +
                        '<td id="FACNAME' + rowCount + '"></td></tr>';
                    $('#company').append(newRow);
                    $("#FACID" + rowCount).html(value.id);
                    $("#FACNAME" + rowCount).html(value.name);

                    //地图标注点
                    var point = new BMap.Point(value.x, value.y);
                    var marker = new BMap.Marker(point); //将点转化成标注点
//                                var label = new window.BMap.Label(i+1, { offset: new window.BMap.Size(0, 0) });
                    var label = new window.BMap.Label(value.id, { offset: new window.BMap.Size(0, 0) });
                    label.setStyle({
                        color : "white",
                        fontSize : "14px",
                        backgroundColor :"0.05",
                        border :"0",
                        fontWeight :"bold"
                    });

                    marker.setLabel(label);
                    map.addOverlay(marker);  //将标注点添加到地图上
                    //添加响应监听
                    (function() {
                        // var thePoint = value;
                        marker.addEventListener("click",
                            function() {
                                alert(value.id);
                                setId(value.id);
                                //   showInfo(this,thePoint);
                            });
                        marker.addEventListener("mouseover",
                            function() {
                            });
                    })();
                })
            }
        }
    });
    
}

function setId(id) {
    $.ajax({
        type: 'post',
        url: '../user/mapsessionsetter',
        data: {
            id: id
        },
        success: function(result) {
            if (result == "success") {
                window.location.href="wind.html";
            } else {
                alertWindow("跳转失败", "error");
            }
        }
    });

}



initMap();