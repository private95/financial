
$(()=>{
    "use strict";
//页面展开和收取功能
$(".stop>a").click(e=>{
    e.preventDefault();
    var $tar=$(e.target);
    if($tar.parent().is(".active")){
        $tar.html("更多选项设置");
        $tar.parent().removeClass("active");
        $(".main_list").css("height","185px");

    }else{
        $(".main_list").css("height","400px");
        $tar.html("收起");
        $tar.parent().addClass("active");
    }
});
    //排名周期
    $(".list1").on("click","a",e=>{
        e.preventDefault();
        var $tar=$(e.target);
        var $idx=$tar.parent().index()+1;
        console.log($idx);
        if(!$tar.parent().hasClass(".bac_col")){
            $tar.parent().addClass("bac_col").siblings(".bac_col").removeClass("bac_col");
            var year=$tar.html();
            $(".tbn_nf").html(year);
        }
    });
   
    //初始化模板
	var tpl=$('#tpl').html();
	//预编译模板
	var template=Handlebars.compile(tpl);
    //私募基金--默认为近一个月
    GetData('topOneMonth','PrivateStock','topOneMonth');
    Fenlei('PrivateStock');
     //分类查询
    function Fenlei(type){
    	$('.list1').find('a').each(function(index){
        	$(this).click(function(){
        		//alert(index)
        		//$('tbody').empty();
        		//GetData(arr[index],type)
        		var text=$(this).text();
        		$('.dataTypes').text(text+"%")
        		$('tbody').html(GetData(arr[index],type,arr[index]));
        	})
        })
    }
    
    //分类查询
    var arr=[
    	"topOneMonth",
    	"topThreeMonth",
    	"topHalfYear",
    	"topOne",
    	"topTwo",
    	"topThree",
    	"topFive",
    	"top2018",
    	"top2017",
    	"top2016",
    	"top2015",
    	"top2014",
    	"top2013",
    	"topDate",
    	]
   
    //
    function GetData(url,str,name){
    	var url='/'+url+str;
    	$.ajax({
        	url:url,
        	type:"post",
        	data:{str:str},
        	dataType:"json",
        	beforeSend:function(){
        		//alert('show')
        		$('.loading').css('display','blcok')
        	},
        	complete:function(){
        		//alert('hide')
        		$('.loading').hide()
        	},
        	success:function(data){
        		//alert()
        		console.log(data)
        		var res=split_arr(data,50);
    			console.log(res)
    			//将数据插入到模板
    			var d=template(res[0]);
    			//console.log(d)
    			$('tbody').html(d)
    			//console.log(data.list.length)
    			var length=data.length;
    			var pages=Math.ceil(length/50)
    			console.log(pages)
    			//
    			$(data).each(function(index){
    				$('tbody').find('tr').each(function(item){
    					$(this).find('#type').html(data[item].topOneMonth+'%')
    				})
    			})
    			
    			//初始化分页
    			$(".zxf_pagediv").createPage({
    				pageNum: pages,//总页码
    				current: 1,//当前页
    				shownum: 10,//每页显示个数
    				backfun: function(e) {
//    					console.log(e);//回调
    					var index_page=template(res[e.current-1]);
    					$('tbody').html(index_page)
    					//0或者是null时显示--
    					CheckType()
    				}
    			});
    			
    			$('.changeType').each(function(index){
    				$(this).text(data[index][name]+"%")
    			})
    			//0或者是null时显示--
    			CheckType()
    			if(pages==1){
					//alert()
					$('.zxfokbtn').hide()
				}
        	},
        	error:function(){
        		layer.open({
  				  title: '提示信息',
  				  content: '服务器异常,稍后请重试'
        		});
        	}
        })
    }
  //0或者是null时显示--
    function CheckType(){
    	$('td').each(function(index){
    		if($(this).text()=='0'||$(this).text()=='null'||$(this).text()=='0%'){
    			$(this).text('--')
    		}
    	})
    }
	
    ////分割数组的方法
	function split_arr(arr,len){
		var a_len=arr.length;
		var result=[];
		for(var i=0;i<a_len;i+=len){
			result.push(arr.slice(i,i+len))
		}
		return result;
	}

});