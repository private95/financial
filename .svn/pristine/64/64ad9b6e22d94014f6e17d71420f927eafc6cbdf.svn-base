$(document).ready(function(){
	//首页获取数据
	//alert()
	//表单验证
	//submit
	Change('exampleInputEmail1')
	Change('exampleInputPassword1')

	Focus('exampleInputEmail1')
	Focus('exampleInputPassword1')
	function Change(str){
		//alert()
		$('#'+str).blur(function(){
			if($(this).val()==''){
				$(this).addClass('red_borders')
			}			
		})
	}
	function Focus(str){
		//alert()
		$('#'+str).focus(function(){			
				$(this).removeClass('red_borders')		
		})
	}
	//ajax数据交互
	$('#submit').click(function(){
		//alert()
		var username=$('#exampleInputEmail1').val();
		var password=$('#exampleInputPassword1').val();
		//验证不为空
		if(username!==''&&password!==''){
			$.ajax({
				url:"/adminLoginData",
				type:"post",
				dataType:"json",
				data:{"username":username,"password":password},
				success:function(data){
					if(data == 1){
						console.log(data)
						localStorage.setItem("login", "yes");
	                    localStorage.setItem("username", username)
	                    location.href="/adminUser";
					}else{
						//ajax 缺少页面提示
						console.log("管理员登录失败")
						alert("您还没有注册账号");
						location.href="#";
					}
				},
				error:function(err){
					console.log(err)
				}
			})
		}else{
			alert("请输入用户名和密码")
		}
		
	})
	
})