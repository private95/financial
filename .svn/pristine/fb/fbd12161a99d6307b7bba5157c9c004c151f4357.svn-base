$(document).ready(function(){
	//表单验证
	Change('exampleInputName')
	Change('exampleInputLastName')
	CheckEmail('exampleInputEmail1')
	Change('exampleInputPassword1')
	Change('exampleConfirmPassword')

	Focus('exampleInputName')
	Focus('exampleInputLastName')
	Focus('exampleInputEmail1')
	Focus('exampleInputPassword1')
	Focus('exampleConfirmPassword')
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
	//邮箱验证
	function CheckEmail(email){		
		var reg =/^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/;
		$('#'+email).blur(function(){
			if($(this).val()==''||!reg.test($(this).val())){
				$(this).addClass('red_borders')
			}			
		})
	}
	//submit
	$('#register').click(function(){
		//alert()
		var username=$('#exampleInputName').val();
		var job=$('#exampleInputLastName').val();
		var email=$('#exampleInputEmail1').val();		
		var password=$('#exampleInputPassword1').val();
		var repassword=$('#exampleConfirmPassword').val();
		var data={
			"username":username,
			"job":job,
			"email":email,
			"password":password,
			"repassword":repassword
		}
		//验证不为空
		if(username!=='' && job!=='' && email!=='' && password!=='' && repassword!==''){
			$.ajax({
				url:"/adminRegister",
				type:"post",
				dataType:"json",
				data:data,
				success:function(data){
					console.log(data)
					if(data == 1){
						console.log(data)
						localStorage.setItem("login", "yes");
	                    localStorage.setItem("username", username)
	                    location.href="/adminIndex";
					}else{
						//ajax 缺少页面提示
						console.log("管理员注册失败")
						alert("不好意思就算是管理员也不能重复注册,您的账号已存在");
						location.href="#";
					}
					
				},
				error:function(err){
					console.log(err)
				}
			})
		}else{
			alert("请认真填写注册信息")
		}
		
	})
	
})