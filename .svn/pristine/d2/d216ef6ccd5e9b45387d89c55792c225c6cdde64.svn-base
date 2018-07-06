		    var shabi = echarts.init(document.getElementById('shabi'));
		    
		    var option = {
				    title : {//是否显示标题组件
				        text: '',//主标题文本
				        subtext: '',
				        show:false,
				    },
				    tooltip : {
				        trigger: 'axis'
				    },
				    legend: {//图例
				    	//图例的数据数组
				        //data:['冠源一号','沪深300','融智-股票策略指数']
				        data:[
				        	{
				        		name:'冠源一号',
				        		icon:'bar',
				        		textStyle:'#d42d25'
				        	},
				        	{
				        		name:'沪深300',
				        		icon:'bar',
				        		textStyle:'#51b9f8'
				        	},
				        	{
				        		name:'融智-股票策略指数',
				        		icon:'bar',
				        		textStyle:'#f66701'
				        	}
				        ],					       
				    },
				    toolbox: {
				        show : false,
				        feature : {
				            mark : {show: false},
				            dataView : {show: true, readOnly: false},
				            magicType : {show: true, type: ['line', 'bar']},
				            restore : {show: true},
				            saveAsImage : {show: true}
				        }
				    },
				    calculable : true,
				    xAxis : [
				        {
				            type : 'category',//坐标轴的类型
				            boundaryGap : false,
				            data : ['2017-12-09','2017-12-10','2017-12-11'],
				            boundaryGap:true
				        }
				    ],
				    yAxis : [
				        {
				            type : 'value',
				            axisLabel : {
				                formatter: '{value} %'
				            }					            
				        }
				    ],
				    series : [
				        {
				            name:'冠源一号',
				            type:'line',
				            data:[0,-28,3,5,8],					           
				        },
				        {
				            name:'沪深300',
				            type:'line',
				            data:[0,2,-3,7,-15],					           
				        },
				         {
				            name:'融智-股票策略指数',
				            type:'line',
				            data:[0, 8, -2,4,9],					           
				        }
				        
				    ]
				};
		    
		    
//		    var data3 = [["2000-06-05",0],["2000-06-06",10],["2000-06-07",13],["2000-06-08",14],["2000-06-09",15],["2000-06-10",16],["2000-06-11",12],["2000-06-12",13],["2000-06-13",14],["2000-06-14",12],["2000-06-15",29],["2000-06-16",7.3],["2000-06-17",4.5],["2000-06-18",10],["2000-06-19",30],["2000-06-20",35],["2000-06-21",38],["2000-06-22",40],["2000-06-23",43],["2000-06-24",40],["2000-06-25",30]];
//		    var  data1 = [["2000-06-05",-0],["2000-06-06",2],["2000-06-07",8],["2000-06-08",10],["2000-06-09",13],["2000-06-10",18],["2000-06-11",13],["2000-06-12",29],["2000-06-13",29],["2000-06-14",29],["2000-06-15",30],["2000-06-16",31],["2000-06-17",35],["2000-06-18",35],["2000-06-19",36],["2000-06-20",37],["2000-06-21",37.5],["2000-06-22",37.6],["2000-06-23",37.8],["2000-06-24",40],["2000-06-25",46]];
//		    var  data2 = [["2000-06-05",-0],["2000-06-06",-5],["2000-06-07",-10],["2000-06-08",-23],["2000-06-09",-25],["2000-06-10",-26],["2000-06-11",-22],["2000-06-12",-20],["2000-06-13",-20],["2000-06-14",-10],["2000-06-15",-8],["2000-06-16",-7],["2000-06-17",-4],["2000-06-18",3],["2000-06-19",14],["2000-06-20",24],["2000-06-21",34],["2000-06-22",45],["2000-06-23",45],["2000-06-24",45.8],["2000-06-25",50]];
//		    var dateList1 = data3.map(function (item) {
//		        return item[0];
//		    });
//
//		    option = {
//
//		        // Make gradient line here
//		        visualMap: [{
//		            show: false,
//		            type: 'continuous',
//		            seriesIndex: 0,
//		            min: 0,
//		            max: 400
//		        }],
//
//		        legend: {
//		            data:['冠源一号','泸深300','融智-股票策略指数']
//		        },
//
//		        tooltip: {
//		            trigger: 'axis'
//		        },
//		        xAxis: [{
//		            data: dateList1,
//		            boundaryGap: false
//		        } ],
//		        yAxis: [{
//		            type : 'value',
//		            splitLine: {show: true},
//		            axisLabel: {
//		                show: true,
//		                interval: 'auto',
//		                formatter: '{value} %'
//		            },
//		            show: true,
//		            min:-40,
//		            max:80
//		        }],
//		        series: [
//		            {
//		                name:'泸深300',
//		                type: 'line',
//		                showSymbol: false,
//		                smooth:0.3,
//		                color:"#00BBFF",
//		                data: data3,
//		                itemStyle : {
//		                    normal : {
//		                        lineStyle:{
//
//		                            color:"#00BBFF"//折线颜色
//		                        }
//		                    }
//		                }
//		            },
//		            {
//		                name:'融智-股票策略指数',
//		                type: 'line',
//		                smooth:0.3,
//		                showSymbol: false,
//		                color:"#FF8903",
//		                data: data1,
//
//		                itemStyle : {
//		                    normal : {
//		                        lineStyle:{
//
//		                            color:"#FF8903"//折线颜色
//		                        }
//		                    }
//		                }
//
//		            },
//		            {
//		                name:'冠源一号',
//		                type: 'line',
//		                smooth:0.3,
//		                color:"#E60012",
//		                showSymbol: false,
//		                data: data2,
//
//		                itemStyle : {
//		                    normal : {
//		                        lineStyle:{
//
//		                            color:"#E60012"//折线颜色
//		                        }
//		                    }
//		                }
//		            }
//		        ]
//		    };
				 //使用刚指定的配置项和数据显示图表。
				 //myChart.setOption(option);
		    shabi.setOption(option);