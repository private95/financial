$(document).ready(function(){
    //初始化模板
	var tpl=$('#tpl').html();
	//预编译模板
	var template=Handlebars.compile(tpl);
	DefaultData('/companyTwosQuery')//企业信息列表
	function DefaultData(url,data){
		var newurl=url;
		 //获取数据
	    $.ajax({
	    	url:newurl,
	    	type:"get",
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
				$('#count').text(data.length)
				
				//初始化分页
				$(".zxf_pagediv").createPage({
					pageNum: pages,//总页码
					current: 1,//当前页
					shownum: 10,//每页显示个数
//					activepage: "",//当前页选中样式
//					activepaf: "",//下一页选中样式
					backfun: function(e) {
//						console.log(e);//回调
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
				//Delete
				$('.deletes').each(function(index){
					$(this).click(function(){
						//alert(index)
						var id=$(this).parent().parent().find('td').eq(0).text();
						$.ajax({
							url:'/companyDelete',
							type:"post",
							data:{"id":id},
							dataType:"json",
							success:function(data){
								//console.log(data)
								if(data==1){
									layer.msg("删除成功")
								}else{
									layer.msg("删除失败")
								}
							},
							error:function(err){
								//console.log(err)
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
   
	////0或者是null时显示--
	function CheckType(){
		$('td').each(function(index){
			if($(this).text()=='0'||$(this).text()=='null'||$(this).text()=='0%'||$(this).text()==''){
				$(this).text('--')
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

