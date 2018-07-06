	
$(document).ready(function () {
	// checkCookie();
	// 企业信息
	$.ajax({
		url:"/companyQuery",
		type:"get",
		dataType:"json",
		success:function(res){
			console.log(res)
			var Data=split_arr(res,6);
			console.log(Data)
			
			for(var i=0;i<Data[0].length;i++){
				var str='<li>'+
			                '<ul>'+
				                '<li>'+
				                    '<a href="#">'+Data[0][i].name+'</a>'+
				               '</li>'+
				                '<li><span>成立日期 :'+Data[0][i].establishTime+'</span></li>'+
				                '<li><span>法人代表 :'+ Data[0][i].personName+'</span></li>'+
				                '<li><span>注册资本 :'+ Data[0][i].capitalMoney+'</span></li>'+
				                '<li><span>注册地区 :'+Data[0][i].address+'</span></li>'+
				            '</ul>'+
				        '</li>'
				 $('.enterprise_list').append(str)
			}
		},
		error:function(err){
			console.log(err)
		}
	})
    $(window).scroll(()=> {
        // 获得滚动高度:
    	$('.classificationlist').hide();
    	$('.HistorySearch').hide();
    	$('.searchInput').val('')
        var $top = $(this).scrollTop();
        var $search = $(".search-main");
        // 如果滚动高度>=500
       // console.log($top)
        if ($top >=261){
        	// 设置id为search-main添加class为fixed_ipt
            $search.addClass("fixed_ipt");
        	$('.gotop').css('display','block');
        }
        else {
            $search.removeClass("fixed_ipt");
            $('.gotop').css('display','none');
        }
    });
    // 搜索关键词
    $('.Search_default').find('li').each(function(){
    	$(this).click(function(){
    		 $('.Search_default').find('li').not($(this)).find('a').removeClass("active")
    		$(this).find('a').addClass("active");
    	})
    })
    // gotop回到顶部
    $('.gotop').click(function(){
    	// alert();
    	$("html,body").animate({scrollTop:0}, 500);
    })
    // search分类
    $('.span_no').click(function(){    	
    	$('.bg_pic').toggleClass('addbg')
    	$('.classificationlist').toggle()
    })
    // select_search分类
    $('.classificationlist').find('li').each(function(index){
    	$(this).click(function(){
    		$('.all_text').text($(this).text());
    		ChangePlaceholder($(this).text())
    		$('.classificationlist').hide();
    	})
    })
    function ChangePlaceholder(value){
    	$('.searchInput').attr('placeholder','请输入'+value+'名称进行搜索')
    }
   
    // 产品推荐
    $.ajax({
    	url:'/selectCompanyByTwo',
    	data:{"company":"topOneMonth"},
    	dataType:"json",
    	type:"post",
    	success:function(data){
    		  console.log(data)
    		$('.company_name1').text(data[0].fund_shortName)
    		$('.one_shouyi').text(data[0].cumulative_nav)
    		$('.one_jingzhi').text(data[0].nav)
    		$('.one_celue').text(data[0].corestrategy)
    		$('#xq1').text(data[0].id)
    		$('#abc').attr('href','/details?id='+data[0].id);
    		  
    		$('.company_name2').text(data[1].fund_shortName)
    		$('.two_shouyi').text(data[1].cumulative_nav)
    		$('.two_jingzhi').text(data[1].nav)
    		$('.one_celue').text(data[1].corestrategy)
    	},
    	error:function(err){
    		layer.open({
				  title: '提示信息',
				  content: '服务器异常,稍后请重试'
    		});
    	}
    })
    // //初始化模板
	var tpl=$('#tpl').html();
	// 预编译模板
	var template=Handlebars.compile(tpl);
    // 私募基金--默认为近一个月
    GetData('DescPrivateStock');
  //注册索引+1的helpe
    Handlebars.registerHelper("addOne",function(index,options){
    	  return parseInt(index)+1;
    });
    
   
    function GetData(url){
    	// var url='/'+url+str;
    	$.ajax({
        	url:url,
        	type:"get",
        	// data:{str:str},
        	dataType:"json",
        	success:function(data){
        		
        		// alert()
        		console.log(data)
        		var res=split_arr(data,10);
    			// console.log(res)
    			// 将数据插入到模板
    			var d=template(res[0]);
    			// console.log(d)
    			$('tbody').html(d)
    			// console.log(data.list.length)
    			var length=data.length;
    			var pages=Math.ceil(length/10)
    			// console.log(pages)
    			
    			// 初始化分页
    			$(".zxf_pagediv").createPage({
    				pageNum: pages,// 总页码
    				current: 1,// 当前页
    				shownum: 10,// 每页显示个数
    				backfun: function(e) {
    					var index_page=template(res[e.current-1]);
    					$('tbody').html(index_page)
    					// 0或者是null时显示--
		    			$('td').each(function(index){
		    				if($(this).text()=='0'||$(this).text()=='null'||$(this).text()=='0%'||$(this).text()==''){
		    					$(this).text('--')
		    				}
		    			})
    				}
    			});
    			// 0或者是null时显示--
    			$('td').each(function(index){
    				if($(this).text()=='0'||$(this).text()=='null'||$(this).text()=='0%'||$(this).text()==''){
    					$(this).text('--')
    				}
    			})
    			if(pages==1){
					// alert()
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
    
    
    // //分割数组的方法
	function split_arr(arr,len){
		var a_len=arr.length;
		var result=[];
		for(var i=0;i<a_len;i+=len){
			result.push(arr.slice(i,i+len))
		}
		return result;
	}
	
	
	
	
	//点击搜索按钮
	/*$('#searchData').click(function(){
		//Search()
	})*/
	
	// 搜索框历史记录
	$('.searchInput').keydown(function(){
		//取值写入页面 
		if($('#histlory').text()!==''){
			$('.HistorySearch').show();
		}
	})
	//搜索历史记录显示到页面中
	ShowListHistory()
	function ShowListHistory(){
		var str=localStorage.historyItems;  
	    var s = '';  
	    if(str==undefined){   
	    	$('.HistorySearch').hide();
	    }else{  
	        var strs= new Array();  
	        strs=str.split("|");  
	        for(var i=0;i<strs.length;i++){  
	            s+= "<li>"+strs[i]+"</li>";  
	        }  
	        $("#histlory").html(s);  
	        
	        //选中搜索历史记录
	        $('.HistorySearch').find('li').each(function(){
				$(this).click(function(){
					$('.searchInput').val($(this).text());
					$('.HistorySearch').hide();
				})
			})
	    } 
	}
	
	
	// 搜索按钮的方法
		//存值
	function SiteSearch(){  
		var input=$('.searchInput').val();  
	    setHistoryItems(input); 
	    ShowListHistory()//存储并显示新的搜索历史记录
	};
	 
    //存值方法,新的值添加在首位  
	function setHistoryItems(keyword) {  
	    let { historyItems } = localStorage;  
	    if (historyItems === undefined) {  
	        localStorage.historyItems = keyword;  
	    } else {  
	        historyItems = keyword + '|' + historyItems.split('|').filter(e => e != keyword).join('|');  
	        localStorage.historyItems = historyItems;  
	    }  
	};  
    //搜所的方法
	function Search(){
		var text=$('.all_text').text();
		var input=$('.searchInput').val();
		console.log(text)
		// 搜索框历史记录
		if(input!==''){
			SiteSearch()			
		}
				
		// 判断搜索类型
		if(text=="公司"){
			// var name=$('.searchInput').val();
			localStorage.setItem('SearchType',input+'#1');
			window.location.href="/special_inquiry";
			$('.searchInput').val('')
		}else if(text=="基金"){
			// alert()
			localStorage.setItem('SearchType',input+'#2');
			window.location.href="/special_inquiry";
			$('.searchInput').val('')
		}else if(text=="全部"){
			// alert()
			localStorage.setItem('SearchType',input+'#2');
			window.location.href="/special_inquiry";
			$('.searchInput').val('')
		}
		else if(input==''){
			layer.open({
				  title: '提示信息',
				  content: '请输入搜索信息'
			});
		}

		
	}
	// 键盘监听事件
	document.onkeydown=function(e){ 
		var keyNum=window.event ? e.keyCode :e.which;  // 获取被按下的键值
		// 判断如果用户按下了回车键（keycody=13）
		if(keyNum==13){ 
			// alert('您按下了回车');
			Search()
		} 
	}
	 
    
	// 判断Cookie
	// cookie
	function getCookie(c_name){
		if (document.cookie.length>0)
		  {
		  c_start=document.cookie.indexOf(c_name + "=")
		  if (c_start!=-1)
		    { 
		    c_start=c_start + c_name.length+1 
		    c_end=document.cookie.indexOf(";",c_start)
		    if (c_end==-1) c_end=document.cookie.length
		    return unescape(document.cookie.substring(c_start,c_end))
		    } 
		  }
		return ""
	}
		
	function setCookie(c_name,value,expiredays){
		var exdate=new Date()
		exdate.setDate(exdate.getDate()+expiredays)
		document.cookie=c_name+ "=" +escape(value)+
		((expiredays==null) ? "" : ";expires="+exdate.toGMTString())
	}

	function checkCookie(){
		username=getCookie('username')
		if (username!=null && username!=""){
			alert('Welcome again '+username+'!')
			// $('#loginorno').css('background','red')
		 }
		else 
		  {
		  username=prompt('Please enter your name:',"")
		  if (username!=null && username!="")
		    {
		    setCookie('username',username,365)
		    }
		  }
	}
	/////////////////////////////////////////////////////////////////////////
//	//搜索框上面的条件筛选
//	$('.Search_default').find('li').each(function(){
//		$(this).click(function(){
//			localStorage.setItem('SearchType','#2');
//		})
//	})
//	//更多专项查询
//	$('.Company').each(function(){
//		$(this).click(function(){
//			localStorage.setItem('SearchType','#1');
//		})
//	})
//	$('.fund').each(function(){
//		$(this).click(function(){
//			localStorage.setItem('SearchType','#2');
//		})
//	})
})