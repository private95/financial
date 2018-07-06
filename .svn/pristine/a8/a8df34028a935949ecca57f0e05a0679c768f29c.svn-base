$(document).ready(function(){
//初始化模板
	var tpl=$('#tpl').html();
	//预编译模板
	var template=Handlebars.compile(tpl);
	DefaultData('userList')//企业信息列表
	function DefaultData(url,data){
		var newurl="http://192.168.1.132/"+url;
		 //获取数据
	    $.ajax({
	    	url:newurl,
	    	type:"get",
	    	data:data,
	    	dataType:"json",
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
				
				
				//初始化分页
				$(".zxf_pagediv").createPage({
					pageNum: pages,//总页码
					current: 1,//当前页
					shownum: 10,//每页显示个数
					backfun: function(e) {
//						console.log(e);//回调
						var index_page=template(res[e.current-1]);
						$('tbody').html(index_page)
					}
				}); 
				//0或者是null时显示--
    			$('td').each(function(index){
    				if($(this).text()=='0'||$(this).text()=='null'||$(this).text()==''){
    					$(this).text('--')
    				}
    			})
				//delete user
    			$('#box').find('button').each(function(){
    				$(this).click(function(){
    					var _this=$(this)
    					var user=$(this).parent().parent().find('td').eq(1).text();
    					//console.log(user)
    					$.ajax({
    						url:'http://192.168.1.132/deleteUserList',
    						data:{"username":user},
    						dataType:"json",
    						type:"post",
    						success:function(data){
    							console.log(data)
    							if(data==1){
    								_this.parent().parent().remove();
    								layer.open({
        								  title: '提示信息',
        								  content: '删除成功'
      								});
    							}else{
    								layer.open({
      								  title: '提示信息',
      								  content: '删除失败，稍后请重试'
    								});
    							}
    						},
    						error:function(){
    							layer.open({
    								  title: '提示信息',
    								  content: '抱歉,数据没有找到..'
    				    		});
    						}
    					})
    				})
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
	
})