
	 	function mb(data){
	 		console.log(data.data)
	 		if(data.data.length==0){
	 			layer.open({
					 title: '提示信息',
					 content: '没有查到您想要的内容，请重新输入！'
				 });
	 		}
	 		//初始化模板
			var tpl=$('#tpl').html();
			//预编译模板
			var template=Handlebars.compile(tpl);
	 		//console.log(data)
 		var res=split_arr(data.data,50);
			//console.log(res)
			//将数据插入到模板
			var d=template(res[0]);
			//console.log(d)
			$('tbody').html(d)
		 	var length=data.data.length;
			var pages=Math.ceil(length/50)
		    console.log(pages)
			$(data.data).each(function(index){
				$('tbody').find('tr').each(function(item){
					$(this).find('#type').html(data.data[item].topOneMonth+'%')
				})
			})
			
			//初始化分页
			$(".zxf_pagediv").createPage({
				pageNum: pages,//总页码
				current: 1,//当前页
				shownum: 20,//每页显示个数
				backfun: function(e) {
					console.log(e);//回调
					var index_page=template(res[e.current-1]);
					$('tbody').html(index_page)
					//0或者是null时显示--
					CheckType()
				}
			});
			
//			$('.changeType').each(function(index){
//				$(this).text(data[index][name]+"%")
//			})
			//0或者是null时显示--
			CheckType()
			if(pages==1){
				//alert()
				$('.zxfokbtn').hide()
			}
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
		 //0或者是null时显示--
	    function CheckType(){
	    	$('td').each(function(index){
	    		if($(this).text()=='0'||$(this).text()=='null'||$(this).text()=='0%'){
	    			$(this).text('--')
	    		}
	    	})
	    }