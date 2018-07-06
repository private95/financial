    //图一
    var myChart = echarts.init(document.getElementById('charts'));
    //var jingjinjinli = echarts.init(document.getElementById('jingjinjinli'));
    
//    var option = {
//		    title : {//是否显示标题组件
//		        text: '',//主标题文本
//		        subtext: '',
//		        show:false,
//		    },
//		    tooltip : {
//		        trigger: 'axis'
//		    },
//		    legend: {//图例
//		    	//图例的数据数组
//		        //data:['冠源一号','沪深300','融智-股票策略指数']
//		        data:[
//		        	{
//		        		name:'冠源一号',
//		        		icon:'bar',
//		        		textStyle:'#d42d25'
//		        	},
//		        	{
//		        		name:'沪深300',
//		        		icon:'bar',
//		        		textStyle:'#51b9f8'
//		        	},
//		        	{
//		        		name:'融智-股票策略指数',
//		        		icon:'bar',
//		        		textStyle:'#f66701'
//		        	}
//		        ],					       
//		    },
//		    toolbox: {
//		        show : false,
//		        feature : {
//		            mark : {show: false},
//		            dataView : {show: true, readOnly: false},
//		            magicType : {show: true, type: ['line', 'bar']},
//		            restore : {show: true},
//		            saveAsImage : {show: true}
//		        }
//		    },
//		    calculable : true,
//		    xAxis : [
//		        {
//		            type : 'category',//坐标轴的类型
//		            boundaryGap : false,
//		            data : ['2017-12-09','2017-12-10','2017-12-11'],
//		            boundaryGap:true
//		        }
//		    ],
//		    yAxis : [
//		        {
//		            type : 'value',
//		            axisLabel : {
//		                formatter: '{value} %'
//		            }					            
//		        }
//		    ],
//		    series : [
//		        {
//		            name:'冠源一号',
//		            type:'line',
//		            data:[0,-28,3,5,8],					           
//		        },
//		        {
//		            name:'沪深300',
//		            type:'line',
//		            data:[0,2,-3,7,-15],					           
//		        },
//		         {
//		            name:'融智-股票策略指数',
//		            type:'line',
//		            data:[0, 8, -2,4,9],					           
//		        }
//		        
//		    ]
//		};
    
    
    var data3 = [["2000-06-05",0],["2000-06-06",10],["2000-06-07",13],["2000-06-08",14],["2000-06-09",15],["2000-06-10",16],["2000-06-11",12],["2000-06-12",13],["2000-06-13",14],["2000-06-14",12],["2000-06-15",29],["2000-06-16",7.3],["2000-06-17",4.5],["2000-06-18",10],["2000-06-19",30],["2000-06-20",35],["2000-06-21",38],["2000-06-22",40],["2000-06-23",43],["2000-06-24",40],["2000-06-25",30],["2000-06-26",20]];
    var  data1 = [["2000-06-05",-0],["2000-06-06",2],["2000-06-07",8],["2000-06-08",10],["2000-06-09",13],["2000-06-10",18],["2000-06-11",13],["2000-06-12",29],["2000-06-13",29],["2000-06-14",29],["2000-06-15",30],["2000-06-16",31],["2000-06-17",35],["2000-06-18",35],["2000-06-19",36],["2000-06-20",37],["2000-06-21",37.5],["2000-06-22",37.6],["2000-06-23",37.8],["2000-06-24",40],["2000-06-25",46],["2000-06-26",20]];
    var  data2 = [["2000-06-05",-0],["2000-06-08",-23],["2000-06-09",-25],["2000-06-10",-26],["2000-06-11",-22],["2000-06-12",-20],["2000-06-13",-20],["2000-06-14",-10],["2000-06-15",-8],["2000-06-16",-7],["2000-06-17",-4],["2000-06-18",3],["2000-06-19",14],["2000-06-20",24],["2000-06-21",34],["2000-06-22",45],["2000-06-23",45],["2000-06-24",45.8]];
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
		 //使用刚指定的配置项和数据显示图表。
		 myChart.setOption(option);
		 //jingjinjinli.setOption(option);
		 
		 //动态撤回
		 var dongtai=echarts.init(document.getElementById('Delete'));
		 var data = [["2000-06-05",-1],["2000-06-06",0],["2000-06-07",0],["2000-06-08",0],["2000-06-09",0],["数据日期：2000-06-10",0],["数据日期：2000-06-11",-1.3],["2000-06-12",-1],["2000-06-13",-2],["2000-06-14",-1],["2000-06-15",-2.5],["2000-06-16",-0.4],["2000-06-17",-0.4],["2000-06-18",-1],["2000-06-19",0],["2000-06-20",0],["2000-06-21",0],["2000-06-22",0],["2000-06-23",-5],["2000-06-24",-0.5],["2000-06-25",-1],["2000-06-26",-1.6],["2000-06-27",-1],["：2000-06-28",0],["2000-06-29",0],["2000-06-30",0],["2000-07-01",-3],["：2000-07-02",-5],["2000-07-03",-0.7],["2000-07-04",-2],["2000-07-05",-4],["数据日期：2000-07-06",-2],["数据日期：2000-07-07",-0.6],["数据日期：2000-07-08",-0.7],["数据日期：2000-07-09",-2],["数据日期：2000-07-10",-1],["数据日期：2000-07-11",0],["数据日期：2000-07-12",0],["数据日期：2000-07-13",0],["2000-07-14",0],["数据日期：2000-07-15",0],["数据日期：2000-07-16",-4],["数据日期：2000-07-17",-0.8],["数据日期：2000-07-18",-1],["数据日期：2000-07-19",-0.7],["数据日期：2000-07-20",-3],["数据日期：2000-07-21",-1],["数据日期：2000-07-22",-3],["数据日期：2000-07-23",-5],["数据日期：2000-07-24",-3]];
		    var dateList = data.map(function (item) {
		        return item[0];
		    });
		    var valueList = data.map(function (item) {
		        return item[1];
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
		        tooltip: {
		            trigger: 'axis'

		        },
		        title: [{
		            left: 'center',
		            text: '冠源一号'
		        }],
		        xAxis: [{

		            data: dateList,
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
		            min:0,
		            max:-6
		        }],

		        series: [{
		            name:'回撤值',
		            type: 'line',
		            showSymbol: false,
		            data: valueList,

		            itemStyle : {
		                normal : {
		                    areaStyle: {
		                        color:"#E5F8FF"
		                    },
		                    lineStyle:{

		                        color:"#00BBFF"//折线颜色
		                    }
		                }
		            }
		        }]
		    };
		    //渲染
		    dongtai.setOption(option);
		    //区间收益
		    var qujian = echarts.init(document.getElementById('qujian'));
		    var option = {
		    	    tooltip : {
		    	        trigger: 'axis',
		    	        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
		    	            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
		    	        }
		    	    },
		    	    legend: {
		    	        data:['本基金','同类平均','泸深300']
		    	    },


		    	    grid: {
		    	        left: '3%',
		    	        right: '4%',
		    	        bottom: '3%',
		    	        containLabel: true
		    	    },
		    	    xAxis : [
		    	        {
		    	            type : 'category',
		    	            data : ['成立以来','今年以来','近一个月','最近半年','最近两年','最近一年','最近两年','最近五年','最近十年']
		    	        }
		    	    ],
		    	    yAxis : [
		    	        {
		    	            type: 'value',
		    	            axisLabel: {
		    	                show: true,
		    	                interval: 'auto',
		    	                formatter: '{value} %'
		    	            },
		    	            show: true,
		    	            min:-20,
		    	            max:80
		    	        }

		    	    ],
		    	    series : [
		    	        {
		    	            name:'本基金',
		    	            color:'#E60012',
		    	            type:'bar',
		    	            data:[-2, 32, 1, 4, 30, 30, 20],
		    	            barWidth : 12,
		    	            label: {
		    	                normal: {
		    	                    show: true,
		    	                    position: 'top'
		    	                }
		    	            }
		    	        },
		    	        {
		    	            name:'同类平均',
		    	            color:'#FF8903',
		    	            type:'bar',
		    	            barWidth : 12,
		    	            data:[12, -13, 11, 34, 9, 30, 10],
		    	            label: {
		    	                normal: {
		    	                    show: true,
		    	                    position: 'top'
		    	                }
		    	            }
		    	        },
		    	        {
		    	            name:'泸深300',
		    	            color:'#4AB2EB',
		    	            type:'bar',
		    	            barWidth : 12,
		    	            data:[20, 12, 11, 24, 20, 30, -10],
		    	            label: {
		    	                normal: {
		    	                    show: true,
		    	                    position: 'top'
		    	                }
		    	            }
		    	        }

		    	    ]
		    	};
		    qujian.setOption(option);
		    ///////////////////////////////////////
