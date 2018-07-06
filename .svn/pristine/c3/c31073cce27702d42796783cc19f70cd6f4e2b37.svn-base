$(document).ready(function(){
	//alert()
	//定义参数名
	var arg=["01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16"];
	$('.postData').click(function(){
		var arr=[];
		$('body').find('.ischecked').each(function(){			
			var _vaule=$(this).find('input[type=radio]:checked').attr('value');
			arr.push(_vaule)
			console.log(_vaule);
		})
		console.log(arr)
		var newarr=[];
		for(var i=0;i<arg.length;i++){
			var str=arg[i]+":"+arr[i]
			newarr.push(str);
		}
		console.log(newarr)
		$.ajax({
			url:"/evolutionData",
			data:newarr,
			type:"post",
			success:function(data){
				console.log(data)
			},
			error:function(err){
				console.log(err)
			}
		})
	})
	
})