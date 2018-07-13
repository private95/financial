/**
 * Created by Administrator on 2018/4/4.
 */
$(document).ready(function(){
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
    //添加删选
    TabsChange('list-item','parent');
    function TabsChange(str1,str2){
		var arr=["0"];
		$('.'+str1).each(function(index){
			$(this).click(function(){
				var unm='"'+index+'"'
				var u=arr.indexOf(unm,0);
				if(u==-1){
					arr.push(unm)
					var text=$(this).find('a').text()			
					$('.'+str2).append('<span class="bt_click" name="'+index+'">'+text+'<a class="delete-btn">x</a></span>')
					$('.delete-btn').each(function(item){
						$(this).click(function(){
							var result=[]
							var num2='"'+item+'"';
							//console.log(num2)
							for(var i=0;i<arr.length;i++){
								if(arr[i]==num2){
									arr[i]=null;
									result.push(arr[i])
								}
							}
							$(this).parent().remove();
						})
					})
				}else{
					//return false;
				}
				
				
			})
		})
	}
    $('.list-item').each(function(){
		$(this).click(function(){
			$('body').find($('.list-item')).not($(this)).removeClass('bac_col ');
			$(this).addClass('bac_col');
		})
		$('body').find($('.list-item')[0]).trigger('click')
	})
    //收益周期
    $(".list1").on("click","a",e=>{
        e.preventDefault();
        var $tar=$(e.target);
        var $idx=$tar.parent().index()+1;
       // console.log($idx);
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
	DefaultData('topOneMonth')//企业信息列表
	function DefaultData(url,data){
		var newurl="/"+url;
		 //获取数据
	    $.ajax({
	    	url:newurl,
	    	type:"get",
	    	data:data,
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
				//console.log(res)
				//将数据插入到模板
				var d=template(res[0]);
				//console.log(d)
				$('tbody').html(d)
				//console.log(data.list.length)
				var length=data.length;
				var pages=Math.ceil(length/50)
				//console.log(pages)
				
				
				//初始化分页
				$(".zxf_pagediv").createPage({
					pageNum: pages,//总页码
					current: 1,//当前页
					shownum: 10,//每页显示个数
					backfun: function(e) {
						var index_page=template(res[e.current-1]);
						$('tbody').html(index_page)
						CheckType()
					}
				}); 
				//0或者是null时显示--
				CheckType()
				if(pages==1){
					//alert()
					$('.zxfokbtn').hide()
				}
				//
    			$('.changeType').each(function(index){
    				$(this).text(data[index].topOneMonth+"%")
    			})
				
	    	},
	    	error:function(){
	    		layer.open({
					  title: '提示信息',
					  content: '服务器异常,稍后请重试'
	    		});
	    	}
	    })
	}
   

  //分割数组的方法
	function split_arr(arr,len){
		var a_len=arr.length;
		var result=[];
		for(var i=0;i<a_len;i+=len){
			result.push(arr.slice(i,i+len))
		}
		return result;
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
    	"topDate",
    	"top2018",
    	"top2017",
    	"top2016",
    	"top2015",
    	"top2014",
    	"top2013",
    	"top2012",
    	"top2011"
    	]
    //
    $('.list1').find('a').each(function(index){
    	$(this).click(function(){
    		//alert(index)
    		var text=$(this).text();
    		$('.dataTypes').text(text+"%")
    		$('tbody').html(GetData(arr[index],arr[index]));
    		
    	})
    })
    //
  //0或者是null时显示--
    function CheckType(){
    	$('td').each(function(index){
    		if($(this).text()=='0'||$(this).text()=='null'||$(this).text()=='0%'){
    			$(this).text('--')
    		}
    	})
    }
    function GetData(url,name){
    	var url='/'+url;
    	$.ajax({
        	url:url,
        	type:"post",
        	data:{"company":name},
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
    			//console.log(res)
    			//将数据插入到模板
    			var d=template(res[0]);
    			//console.log(d)
    			$('tbody').html(d)
    			//console.log(data.list.length)
    			var length=data.length;
    			var pages=Math.ceil(length/50)
    			//console.log(pages)
    			
    			
    			//初始化分页
    			$(".zxf_pagediv").createPage({
    				pageNum: pages,//总页码
    				current: 1,//当前页
    				shownum: 10,//每页显示个数
    				backfun: function(e) {
//    					console.log(e);//回调
    					var index_page=template(res[e.current-1]);
    					$('tbody').html(index_page)
    					CheckType()
    				}
    			});
    			//0或者是null时显示--
    			CheckType()
    			//changeType
    			$('.changeType').each(function(index){
    				$(this).text(data[index][name]+"%")
    			})
    			
        	},
        	error:function(){
        		layer.open({
					  title: '提示信息',
					  content: '服务器异常,稍后请重试'
	    		});
        	}
        })
    }

   
});
