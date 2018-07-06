
$(()=>{
  // "use strict";
//导航
$("#navigation:has([data-toggle=tab])")
    .on("click","[data-toggle=tab]",e=>{
        e.preventDefault();
        var $tar=$(e.target);
        if(!$tar.parent().is(".selected")){
            $tar.parent().addClass("selected")
                .siblings().removeClass("selected");
            var id=$tar.attr("href");
            $(id).addClass("active")
                .siblings().removeClass("active");
        }
    });



var my_profit = echarts.init(document.getElementById('my_profit'));

    var data3 = [["2000-06-05",0],["2000-06-06",10],["2000-06-07",13],["2000-06-08",14],["2000-06-09",15],["2000-06-10",16],["2000-06-11",12],["2000-06-12",13],["2000-06-13",14],["2000-06-14",12],["2000-06-15",29],["2000-06-16",7.3],["2000-06-17",4.5],["2000-06-18",10],["2000-06-19",30],["2000-06-20",35],["2000-06-21",38],["2000-06-22",40],["2000-06-23",43],["2000-06-24",40],["2000-06-25",30]];
    var  data1 = [["2000-06-05",-0],["2000-06-06",2],["2000-06-07",8],["2000-06-08",10],["2000-06-09",13],["2000-06-10",18],["2000-06-11",13],["2000-06-12",29],["2000-06-13",29],["2000-06-14",29],["2000-06-15",30],["2000-06-16",31],["2000-06-17",35],["2000-06-18",35],["2000-06-19",36],["2000-06-20",37],["2000-06-21",37.5],["2000-06-22",37.6],["2000-06-23",37.8],["2000-06-24",40],["2000-06-25",46]];
    var  data2 = [["2000-06-05",-0],["2000-06-06",-5],["2000-06-07",-10],["2000-06-08",-23],["2000-06-09",-25],["2000-06-10",-26],["2000-06-11",-22],["2000-06-12",-20],["2000-06-13",-20],["2000-06-14",-10],["2000-06-15",-8],["2000-06-16",-7],["2000-06-17",-4],["2000-06-18",3],["2000-06-19",14],["2000-06-20",24],["2000-06-21",34],["2000-06-22",45],["2000-06-23",45],["2000-06-24",45.8],["2000-06-25",50]];
    var dateList1 = data3.map(function (item) {
        return item[0];
    });

    option = {

        // Make gradient line here
        visualMap: [{
            show: false,
            type: 'continuous',
            seriesIndex: 0,
            min: 0,
            max: 400
        }],

        legend: {
            data:['冠源一号','泸深300','融智-股票策略指数']
        },

        tooltip: {
            trigger: 'axis'
        },
        xAxis: [{
            data: dateList1,
            boundaryGap: false
        } ],
        yAxis: [{
            type : 'value',
            splitLine: {show: true},
            axisLabel: {
                show: true,
                interval: 'auto',
                formatter: '{value} %'
            },
            show: true,
            min:-40,
            max:80
        }],
        series: [
            {
                name:'泸深300',
                type: 'line',
                showSymbol: false,
                smooth:0.3,
                color:"#00BBFF",
                data: data3,
                itemStyle : {
                    normal : {
                        lineStyle:{

                            color:"#00BBFF"//折线颜色
                        }
                    }
                }
            },
            {
                name:'融智-股票策略指数',
                type: 'line',
                smooth:0.3,
                showSymbol: false,
                color:"#FF8903",
                data: data1,

                itemStyle : {
                    normal : {
                        lineStyle:{

                            color:"#FF8903"//折线颜色
                        }
                    }
                }

            },
            {
                name:'冠源一号',
                type: 'line',
                smooth:0.3,
                color:"#E60012",
                showSymbol: false,
                data: data2,

                itemStyle : {
                    normal : {
                        lineStyle:{

                            color:"#E60012"//折线颜色
                        }
                    }
                }
            }
        ]
    };
// 使用刚指定的配置项和数据显示图表。
my_profit.setOption(option);


//基金经理收益曲线图
var rw_profit = echarts.init(document.getElementById('rw_profit'));

var data4 = [["2000-06-05",0],["2000-06-06",10],["2000-06-07",13],["2000-06-08",14],["2000-06-09",15],["2000-06-10",16],["2000-06-11",12],["2000-06-12",13],["2000-06-13",14],["2000-06-14",12],["2000-06-15",29],["2000-06-16",7.3],["2000-06-17",4.5],["2000-06-18",10],["2000-06-19",30],["2000-06-20",35],["2000-06-21",38],["2000-06-22",40],["2000-06-23",43],["2000-06-24",40],["2000-06-25",30]];
var  data5 = [["2000-06-05",-0],["2000-06-06",2],["2000-06-07",8],["2000-06-08",10],["2000-06-09",13],["2000-06-10",18],["2000-06-11",13],["2000-06-12",29],["2000-06-13",29],["2000-06-14",29],["2000-06-15",30],["2000-06-16",31],["2000-06-17",35],["2000-06-18",35],["2000-06-19",36],["2000-06-20",37],["2000-06-21",37.5],["2000-06-22",37.6],["2000-06-23",37.8],["2000-06-24",40],["2000-06-25",46]];
var  data6 = [["2000-06-05",-0],["2000-06-06",-5],["2000-06-07",-10],["2000-06-08",-23],["2000-06-09",-25],["2000-06-10",-26],["2000-06-11",-22],["2000-06-12",-20],["2000-06-13",-20],["2000-06-14",-10],["2000-06-15",-8],["2000-06-16",-7],["2000-06-17",-4],["2000-06-18",3],["2000-06-19",14],["2000-06-20",24],["2000-06-21",34],["2000-06-22",45],["2000-06-23",45],["2000-06-24",45.8],["2000-06-25",50]];
var dateList4 = data3.map(function (item) {
    return item[0];
});

option = {

    // Make gradient line here
    visualMap: [{
        show: false,
        type: 'continuous',
        seriesIndex: 0,
        min: 0,
        max: 400
    }],

    legend: {
        data:['冠源一号','泸深300','融智-股票策略指数']
    },

    tooltip: {
        trigger: 'axis'
    },
    xAxis: [{
        data: dateList1,
        boundaryGap: false
    } ],
    yAxis: [{
        type : 'value',
        splitLine: {show: true},
        axisLabel: {
            show: true,
            interval: 'auto',
            formatter: '{value} %'
        },
        show: true,
        min:-40,
        max:80
    }],
    series: [
        {
            name:'泸深300',
            type: 'line',
            showSymbol: false,
            smooth:0.3,
            color:"#00BBFF",
            data: data5,
            itemStyle : {
                normal : {
                    lineStyle:{

                        color:"#00BBFF"//折线颜色
                    }
                }
            }
        },
        {
            name:'融智-股票策略指数',
            type: 'line',
            smooth:0.3,
            showSymbol: false,
            color:"#FF8903",
            data: data4,

            itemStyle : {
                normal : {
                    lineStyle:{

                        color:"#FF8903"//折线颜色
                    }
                }
            }

        },
        {
            name:'冠源一号',
            type: 'line',
            smooth:0.3,
            color:"#E60012",
            showSymbol: false,
            data: data6,

            itemStyle : {
                normal : {
                    lineStyle:{

                        color:"#E60012"//折线颜色
                    }
                }
            }
        }
    ]
};
// 使用刚指定的配置项和数据显示图表。
rw_profit.setOption(option);




//公司介绍

 //收益曲线-菜单切换
    $(".profit_nav").on("click","a",e=>{
        var $tar=$(e.target);
        if(!$tar.parent().hasClass(".colour")){
            $tar.parent().addClass("colour").siblings(".colour").removeClass("colour");
        }
    });
// 旗下产品-菜单切换
$(".switch").on("mousemove","a",e=>{
    var $tar=$(e.target);
    if(!$tar.parent().hasClass(".selected")){
        $tar.parent().addClass("selected").siblings(".selected").removeClass("selected");
        $($tar.data("toggle")).show().siblings().hide()
    }
});


//基金经理
// -人物介绍菜单切换
$(".character").on("mousemove","a",e=>{
    var $tar=$(e.target);
    if(!$tar.hasClass(".active")){
        $tar.addClass("active").siblings(".active").removeClass("active");
        $($tar.data("toggle")).show().siblings().hide()
    }
});
//收益曲线-菜单切换
    $(".manager_nav").on("click","a",e=>{
        var $tar=$(e.target);
        if(!$tar.parent().hasClass(".colour")){
            $tar.parent().addClass("colour").siblings(".colour").removeClass("colour");
        }
    });

//旗下产品-菜单切换
$(".manager_switch").on("mousemove","a",e=>{
    var $tar=$(e.target);
    if(!$tar.parent().hasClass(".selected")){
        $tar.parent().addClass("selected").siblings(".selected").removeClass("selected");
        $($tar.data("toggle")).show().siblings().hide()
    }
});

});