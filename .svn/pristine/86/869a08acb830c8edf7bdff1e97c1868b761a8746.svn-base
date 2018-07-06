$(()=>{
    "use strict";
    var tag = location.search;
    console.log(tag)
    var tagId=tag.split('=')[1];
    console.log(tagId)
    var ziliao=$("#ziliao");// 资料
    var shocang=$("#shocang");// 收藏
    var fabu=$("#fabu");// 发布
    if(tagId==0){
    		$('#ziliao').addClass('active');
    		$('#shocang').removeClass("active");
    		$('#fabu').removeClass("active");
    		$('#datum').addClass("show");
    		$('#collection').removeClass("show");
    		$('#release').removeClass("show");
    }else if(tagId==1){
	    	$('#ziliao').removeClass('active');
			$('#shocang').addClass("active");
			$('#fabu').removeClass("active");
			$('#datum').removeClass("show");
			$('#collection').addClass("show");
			$('#release').removeClass("show");
    }else if(tagId==2){
	    	$('#ziliao').removeClass('active');
			$('#shocang').removeClass("active");
			$('#fabu').addClass("active");
			$('#datum').removeClass("show");
			$('#collection').removeClass("show");
			$('#release').addClass("show");
    }
   
    
$(".clear1:has([data-toggle=tab])")
    .on("click","[data-toggle=tab]",e=>{
    	// alert()
        e.preventDefault();
        var $tar=$(e.target);
        if(!$tar.parent().is(".active")) {
            $tar.parent().addClass("active")
                .siblings().removeClass("active");
            var id=$tar.attr("href");
            $(id).addClass("show")
                .siblings().removeClass("show");
        }
});
//

// 我的资料
$(".datum_nav>li").on("click","a",e=>{
    e.preventDefault();
    var $tar=$(e.target);
    if(!$tar.parent().hasClass(".slt")){
        $tar.parents().addClass("slt").siblings(".slt").removeClass("slt");
        $($tar.attr("href")).addClass("active").siblings(".active").removeClass("active");
    }
});
// 风险评测
    // ，初始化echarts实例
    $('.fx').click(()=>{
        var myChart = echarts.init(document.getElementById('evaChart'));
        var a = 330, b = 35, c = 35, d = 22, e = 10;
        // 指定图表的配置项和数据
        var option = {
            title: {
                x: 'center'
            },
            tooltip: {
                trigger: 'item',
                formatter: "{a} <br/>{b} : {c} ({d}%)"
            },
            legend: {
                orient: 'vertical',
                left: 'left',
                data: []
            },
            series: [
                {
                    name: '',
                    type: 'pie',
                    radius: ['50%', '70%'],
                    center: ['50%', '60%'],
                    data: [
                        {value: a, name: '进取型'},
                        {value: b, name: '成长型'},
                        {value: c, name: '稳健性'},
                        {value: d, name: '平衡性'},
                        {value: e, name: '保守型'}
                    ],
                    itemStyle: {
                        emphasis: {
                            shadowBlur: 8,
                            shadowOffsetX: 0,
                            shadowColor: 'rgba(0, 0, 0, 0.5)'
                        }
                    }
                }
            ]
        };

        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
    });


    
});

/**
 * 账户身份更新
 */
function account(){
    var $username=$("#usernamed").val();
    var $email=$("#emails").val();
    var $address=$("#addressed").val();
    // 验证不能为空
    var arry=[{"name":"username","data":$username},{"name":"email","data":$email},{"name":"address","data":$address}];
    for(var i=0;i<arry.length;i++){
    	if(arry[i].data==''){
    		Loing(arry[i].name);
    		 return
    	}
    }

    function  Loing(name){
    	var newAarry=[{"name":"username","data":"用户名不能为空"},{"name":"email","data":"邮箱不能为空"},{"name":"address","data":"通讯地址不能为空"}];
    	for(var j=0;j<newAarry.length;j++){
    		if(newAarry[j].name==name){
    			layer.open({
  				  title: '提示信息',
  				  content: newAarry[j].data
  			  	}); 
  			  return
    		}
    	}
    }
    // 邮箱验证
    var reg=/^[A-Za-z0-9\u4e00-\u9fa5]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+)+$/;
    if(reg.test($email)===false){
    	layer.open({
			  title: '提示信息',
			  content: '您输入的邮箱格式不正确'
		  	}); 
		  return
    }else{
    	$.ajax({
        	url: "/accountUpdate",
            type: "post",
            dataType: "json",
            data: {"username": $username, "email": $email,"address":$address},
            async: false,
            success: function (data) {
                // 注册成功
                if (data == 1) {
                    localStorage.setItem("login", "yes");
                    localStorage.setItem("username", $username)
                    rtn = true;
                    // location.href="/";
                } else {
                    $("#account_ms").html("您输入用户名已被注册，请重新输入.");
                    rtn = false;
                }
            },
            error: function (data) {
                $("#account_ms").html("链接服务器异常.");
                rtn = false;
            }
        });
    }

    

}

/**
 * 实名制身份添加
 */
function idCard(){
	var $realName=$("#realName").val();
	var $idType=$("#idType").val();
	var $idNumber=$("#idNumber").val();
	// 验证不为空
	var arry=[{"name":"TureName","data":$realName},{"name":"IdCardType","data":$idType},{"name":"IdCard","data":$idNumber}];
	for(var i=0;i<arry.length;i++){
	    if(arry[i].data==''){
	    	Loing(arry[i].name);
	    	 return
	    }
	}
    //
    function  Loing(name){
    	var newAarry=[{"name":"TureName","data":"用户名不能为空"},{"name":"IdCardType","data":"证件类型不能为空"},{"name":"IdCard","data":"证件号不能为空"}];
    	for(var j=0;j<newAarry.length;j++){
    		if(newAarry[j].name==name){
    			layer.open({
  				  title: '提示信息',
  				  content: newAarry[j].data
  			  	}); 
  			  return
    		}
    	}
    }
    // 验证身份证号
    var reg = /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/;
    if(reg.test($idNumber) === false){
    	layer.open({
			  title: '提示信息',
			  content: '您输入的身份证不合法'
		  	}); 
		  return
    }else{
    	 $.ajax({
    	    	url: "/idCard",
    	        type: "post",
    	        dataType: "json",
    	        data: {"realName": $realName, "idType": $idType,"idNumber":$idNumber},
    	        async: false,
    	        success: function (data) {   
    	        	alert(data);
    	            location.href="/";  
    	        },
    	        error: function (data) {
    	        	location.href="#";
    	        }
    	  });  
    }
   
}
// 账号绑定
function accountBind(){
	var BindIDcard=$("#BindIDcard").val();
	var BindPassword=$("#BindPassword").val();
	 // alert("sdsds");
	// 验证不能为空
	var arry=[{"name":"BindIDcard","data":BindIDcard},{"name":"BindPassword","data":BindPassword}];
	for(var i=0;i<arry.length;i++){
	    if(arry[i].data==''){
	    	Loing(arry[i].name);
	    	 return
	    }
	}
    //
    function  Loing(name){
    	var newAarry=[{"name":"BindIDcard","data":"证件号不能为空"},{"name":"BindPassword","data":"密码不能为空"}];
    	for(var j=0;j<newAarry.length;j++){
    		if(newAarry[j].name==name){
    			layer.open({
  				  title: '提示信息',
  				  content: newAarry[j].data
  			  	}); 
  			  return
    		}
    	}
    }
    // 验证身份证
    var reg = /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/;
    if(reg.test(BindIDcard) === false){
    	layer.open({
			  title: '提示信息',
			  content: '您输入的身份证不合法'
		 });
    	return
    }else if(BindPassword.length<6){
    	layer.open({
			  title: '提示信息',
			  content: '请输入最少6位数密码'
		});
    	return
    }else{
    	$.ajax({
        	url: "/idCard",
            type: "post",
            dataType: "json",
            data: {realName: $realName, idType: $idType,idNumber:$idNumber},
            async: false,
            success: function (data) {        
                location.href="/";  
            },
            error: function (data) {
            	location.href="#";
            }
        }); 
    }
    
}
// 修改密码
function ChangePwd(){
	
	var NowPwd=$("#NowPwd").val();
	var NewPwd=$("#NewPwd").val();
	var NewTrePwd=$("#NewTrePwd").val();
	 // alert("sdsds");
	// 验证不能为空
	var arry=[{"name":"NowPwd","data":NowPwd},{"name":"NewPwd","data":NewPwd},{"name":"NewTrePwd","data":NewTrePwd}];
	for(var i=0;i<arry.length;i++){
	    if(arry[i].data==''){
	    	Loing(arry[i].name);
	    	 return
	    }
	}
    //
    function  Loing(name){
    	var newAarry=[{"name":"NowPwd","data":"当前密码不能为空"},{"name":"NewPwd","data":"新密码不能为空"},{"name":"NewTrePwd","data":"确认密码不能为空"}];
    	for(var j=0;j<newAarry.length;j++){
    		if(newAarry[j].name==name){
    			layer.open({
  				  title: '提示信息',
  				  content: newAarry[j].data
  			  	}); 
  			  return
    		}
    	}
    }
    //
   
    if(NowPwd.length<6){
    	layer.open({
			  title: '提示信息',
			  content: '请输入最少6位数密'
		 });
    	return
    }else if(NewPwd.length<6){
    	layer.open({
			  title: '提示信息',
			  content: '请输入新的最少6位数密码'
		});
    	return
    }else if(NewPwd!==NewTrePwd){
    	layer.open({
			  title: '提示信息',
			  content: '重置密码两次输入的不一致'
		});
  	return
  }
    else{
    	
    	$.ajax({
        	url: "/modifypassword",
            type: "post",
            dataType: "json",
            data: {"NowPwd": NowPwd, "NewPwd": NewPwd},
            async: false,
            success: function (data) { 
            	alert("修改密码成功");
                location.href="/";  
            },
            error: function (data) {
            	alert("修改密码失败");
            	location.href="#";
            }
        }); 
    }

}






// 发布信信息
// 初始化模板
	var tpl=$('#tpl').html();
	// 预编译模板
	var template=Handlebars.compile(tpl);
	DefaultData('/companyTwosQuery')// 企业信息列表
	function DefaultData(url,data){
		var newurl=url;
		 // 获取数据
	    $.ajax({
	    	url:newurl,
	    	type:"get",
	    	dataType:"json",
	    	success:function(data){
	    		// alert()
	    		console.log(data)
	    		var res=split_arr(data,50);
				console.log(res)
				// 将数据插入到模板
				var d=template(res[0]);
				// console.log(d)
				$('.table2').html(d)
				// console.log(data.list.length)
				var length=data.length;
				var pages=Math.ceil(length/6)
				console.log(pages)
				$('#count').text(data.length)
				
				// 初始化分页
				$(".zxf_pagediv").createPage({
					pageNum: pages,// 总页码
					current: 1,// 当前页
					shownum: 6,// 每页显示个数
// activepage: "",//当前页选中样式
// activepaf: "",//下一页选中样式
					backfun: function(e) {
// console.log(e);//回调
						var index_page=template(res[e.current-1]);
						$('.table2').html(index_page)
						CheckType()
					}
				}); 
				// 0或者是null时显示--
				CheckType()
				if(pages==1){
					// alert()
					$('.zxfokbtn').hide()
				}
				// Delete
				$('.deletes').each(function(index){
					$(this).click(function(){
						// alert(index)
						var _this=$(this);
						var id=$(this).parent().parent().find('td').eq(0).text();
						$.ajax({
							url:'http://192.168.1.132/companyDelete',
							type:"post",
							data:{"id":id},
							dataType:"json",
							success:function(data){
								// console.log(data)
								if(data==1){
									layer.msg("删除成功")
									setTimeout(function(){
										_this.parent().parent().remove();
									},1500)
									
								}else{
									layer.msg("删除失败")
								}
							},
							error:function(err){
								// console.log(err)
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
 
	// //0或者是null时显示--
	function CheckType(){
		$('td').each(function(index){
			if($(this).text()=='0'||$(this).text()=='null'||$(this).text()=='0%'||$(this).text()==''){
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