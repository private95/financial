$(()=>{
    "use strict";
	$(".nav-main>li").on("click","a",e=>{
	    e.preventDefault();
	    var $tar=$(e.target);
	    if(!$tar.parent().hasClass(".in_click")){
	        $tar.parent().addClass("in_click").siblings(".in_click").removeClass("in_click");
	        $($tar.attr("href")).addClass("show").siblings(".show").removeClass("show");
	    }
	});
	// 条件筛选
	TabsChange('list-item','parent');
	TabsChange('list_item2','parent2');
	function TabsChange(str1,str2){
		var arr=["0"];
		$('.'+str1).each(function(index){
			$(this).click(function(){
				var unm='"'+index+'"'
				var u=arr.indexOf(unm,0);
				if(u==-1){
					arr.push(unm)
					var text=$(this).find('span').text()			
					$('.'+str2).append('<span class="bt_click" name="'+index+'">'+text+'<a class="delete-btn">x</a></span>')
					$('.delete-btn').each(function(item){
						$(this).click(function(){
							var result=[]
							var num2='"'+item+'"';
							// console.log(num2)
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
					// return false;
				}
				
				
			})
		})
	}
	// 条件筛选颜色变化
	function ChangeActive(str){
		$('.'+str).each(function(){
			$(this).click(function(){
				$('body').find($('.'+str)).not($(this)).removeClass('active')
				$(this).addClass('active');
			})
			$('body').find($('.'+str)[0]).trigger('click')
		})
	}
	ChangeActive('list-item');// 基金
	ChangeActive('list_item2');// 企业
	// 首页搜索框上面的条件筛选
	var windowURL= window.location.href;
	if(windowURL.indexOf('?')>-1){
		var _wUrl=windowURL.split('?');
		var SearchId=_wUrl[1].split('&')[0];// 查询id
		var ShowType=_wUrl[1].split('&')[1];// 显示基金或者企业
		if(ShowType=="type=1"){
			// 显示基金模块
			var tpl2=$('#tpl2').html();
			var template2=Handlebars.compile(tpl2);
			
			$('#main_part').removeClass('show');
			$('#main_box').addClass('show');
			$('.qiye').removeClass('in_click')
			$('.jijin').addClass('in_click')
			
			// 获取数据
			switch (SearchId) {
				case  'id=0':
					DefaultData2('/getProduction');
					break;
				case  'id=1':
					DefaultData2('/getProduction2');
					break;
				case  'id=2':
					DefaultData2('/getProduction3');
					break;
				case  'id=3':
					DefaultData2('/getProduction4');
					break;
				case  'id=4':
					DefaultData2('/getProduction5');
					break;
				case  'id=5':
					DefaultData2('/getProduction6');
					break;
				case  'id=11':
					DefaultData2('/getCompanyName');
					break;  
			}
			
		}else if(ShowType=="type=2"){
			// 显示企业模块
			// 企业信息
			var tpl=$('#tpl').html();
			// 预编译模板
			var template=Handlebars.compile(tpl);
			
			$('#main_box').removeClass('show');
			$('#main_part').addClass('show');
			$('.jijin').removeClass('in_click')
			$('.qiye').addClass('in_click')
			
			
		}
	}else{
		
	}
	
	// 企业和基金模块的显示
	// if()
	
	// 根据查询id获取数据的方法

	// 获取存储值，判断是按哪个条件搜索的
	var CompanyName = localStorage.getItem("SearchType");
	console.log(CompanyName);
	if(CompanyName==null){
		return
	}else{
		var nameType=CompanyName.split('#')[0];
		var IdType=CompanyName.split('#')[1];
		// console.log(nameType)
		
		// 判断是基金还是企业信息
		if(IdType==1){
			// 企业信息
			var tpl=$('#tpl').html();
			// 预编译模板
			var template=Handlebars.compile(tpl);
			
			$('#main_box').removeClass('show');
			$('#main_part').addClass('show');
			$('.jijin').removeClass('in_click')
			$('.qiye').addClass('in_click')
			var data={"name":nameType}
			DefaultData('companySearch',data)// 企业信息列表
			
		}else if(IdType==2){
			// 积金信息
			// 积金信息模板
			 // 初始化模板
			var tpl2=$('#tpl2').html();
			// 预编译模板
			var template2=Handlebars.compile(tpl2);
			var data={"fund_shortName":nameType}
			DefaultData2('fundSearch',data)
			
		}else if(IdType==3){
			// 积金信息
			// 积金信息模板
			 // 初始化模板
			var tpl2=$('#tpl2').html();
			// 预编译模板
			var template2=Handlebars.compile(tpl2);
			
			$('#main_part').removeClass('show');
			$('#main_box').addClass('show');
			$('.qiye').removeClass('in_click')
			$('.jijin').addClass('in_click')
			
			var data={"fund_shortName":nameType}
			DefaultData2('fundSearch',data)
			// 企业信息模板
						 
			// var tpl=$('#tpl').html(); //初始化模板
			// var template=Handlebars.compile(tpl); //预编译模板
			//			
			// $('#main_box').removeClass('show');
			// $('#main_part').addClass('show');
			// $('.jijin').removeClass('in_click')
			// $('.qiye').addClass('in_click')
			// var data={"name":nameType}
			// DefaultData('companySearch',data)//企业信息列表
		}
	}
	
	// 点击基金
	$('#jijin_part').click(function(){
		 // 初始化模板
		var tpl2=$('#tpl2').html();
		// 预编译模板
		var data={"name":nameType}
		var template2=Handlebars.compile(tpl2);
		DefaultData2('fundSearch',data)// 基金列表--不穿任何参数
	})
	// 点击企业
		$('#company_part').click(function(){
			 // 初始化企业模板
			var tpl=$('#tpl').html();
			// 预编译模板
			var data={"name":nameType}
			var template=Handlebars.compile(tpl);
			DefaultData('companySearch',data)// 企业信息列表--不穿任何参数
		})
	// 企业信息方法
	function DefaultData(url,data){
		var newurl="/"+url;
		 // 获取数据
	    $.ajax({
	    	url:newurl,
	    	type:"post",
	    	data:data,
	    	dataType:"json",
	    	beforeSend:function(){
        		// alert('show')
        		$('.loading').show()
        	},
        	complete:function(){
        		// alert('hide')
        		$('.loading').hide()
        	},
	    	success:function(data){
	    		if(data==''){
	    			// 如果data为空显示成404页面
	    			$('.Datalist').hide();
	    			$('.NotFoundData').show();
	    		}else{
	    			// alert()
		    		console.log(data)
		    		var res=split_arr(data,50);
					console.log(res)
					// 将数据插入到模板
					var d=template(res[0]);
					// console.log(d)
					$('#tbody2').html(d)
					// console.log(data.list.length)
					var length=data.length;
					var pages=Math.ceil(length/50)
					console.log(pages)
					
					
					// 初始化分页
					$('#main_part').find($(".zxf_pagediv")).createPage({
						pageNum: pages,// 总页码
						current: 1,// 当前页
						shownum: 10,// 每页显示个数
						backfun: function(e) {
							var index_page=template(res[e.current-1]);
							$('#tbody2').html(index_page)
							CheckType()
						}
					}); 
					
	    		}
	    		//
	    		CheckType()
	    		if(pages==1){
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
   
	function CheckType(){
		// 0或者是null时显示--
		$('td').each(function(index){
			if($(this).text()=='0'||$(this).text()=='null'||$(this).text()=='0%'){
				$(this).text('--')
			}
		})
	}
  // 分割数组的方法
	function split_arr(arr,len){
		var a_len=arr.length;
		var result=[];
		for(var i=0;i<a_len;i+=len){
			result.push(arr.slice(i,i+len))
		}
		return result;
	}

    // 基金信息方法
	function DefaultData2(url,data){
		var tpl2=$('#tpl2').html();
		var template2=Handlebars.compile(tpl2);
	    $.ajax({
	    	url:url,
	    	type:"post",
	    	data:data,
	    	dataType:"json",
	    	beforeSend:function(){
        		// alert('show')
        		$('.loading').show()
        	},
        	complete:function(){
        		// alert('hide')
        		$('.loading').hide()
        	},
	    	success:function(data){
	    		console.log(data)
	    		// 如果data为空显示404页面
	    		if(data==''){
	    			$('.jijinData').hide();
	    			$('.jinjin_NotFound').show();
	    		}else{
	    			var res=split_arr(data,50);
					console.log(res)
					// 将数据插入到模板
					var d=template2(res[0]);
					// console.log(d)
					$('#tbody1').html(d)
					// console.log(data.list.length)
					var length=data.length;
					var pages=Math.ceil(length/50)
					console.log(pages)
					
					
					// 初始化分页
					$(".zxf_pagediv").createPage({
						pageNum: pages,// 总页码
						current: 1,// 当前页
						shownum: 10,// 每页显示个数
						backfun: function(e) {
							var index_page=template2(res[e.current-1]);
							$('#tbody1').html(index_page);
							CheckType()
							
						}
					}); 
					// 0或者是null时显示--
					CheckType()
					if(pages==1){
						$('.zxfokbtn').hide()
					}
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
  
		// search
		$('#SearchButtton').click(function(){
			alert("1236456");
			var _vaule=$('#SearchInputs').val()
			 // 初始化企业模板
			var tpl=$('#tpl').html();
			// 预编译模板
			var data={"name":_vaule}
			var template=Handlebars.compile(tpl);
			DefaultData('companySearch',data)// 企业信息列表--不穿任何参数
			$('#SearchInputs').val('')
			// 向后台发送ajax拿到数据
			$.ajax({
			url:"/inputsearchdata",
			type:"post",
			dataType:"json",
			success:function(data){
				alert(data)
			},
			error:function(){
	        	layer.open({
	        		  title: '提示信息',
	        		  content: '链接服务器出错了...'
	        	}); 
	        }
		})
		})
}



