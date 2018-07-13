$(()=>{
    "use strict";
   init_city_select($("#citySelect"));
  $('#submit').click(function(){
	  // console.log($('#form1').serialize());
	  var array = $('#form1').serializeArray()
	  console.log(array);
	  if($('#enterprise').val()==''){
		  layer.open({
			  title: '提示信息',
			  content: "公司全称不能为空"
		  }); 
	  }else if($('#product_count').val()==''){
		  layer.open({
			  title: '提示信息',
			  content: "产品数目不能为空"
		  });
	  }else if($('#capitalMoney').val()==''){
		  layer.open({
			  title: '提示信息',
			  content: "注册资金不能为空"
		  });
	  }else if($('#citySelect').val()==''){
		  layer.open({
			  title: '提示信息',
			  content: "请选择所在地区"
		  });
	  }else if($('#company_id').val()==''){
		  layer.open({
			  title: '提示信息',
			  content: "请输入公司编码"
		  });
	  }else if($('#establishTime').val()==''){
		  layer.open({
			  title: '提示信息',
			  content: "请输入公司成立时间"
		  });
	  }else if($('#production').val()==''){
		  layer.open({
			  title: '提示信息',
			  content: "请输入代表作品"
		  });
	  }else if($('#recordCode').val()==''){
		  layer.open({
			  title: '提示信息',
			  content: "请输入备案编码"
		  });
	  }else if($('#fund_shortName').val()==''){
		  layer.open({
			  title: '提示信息',
			  content: "请输入产品名称"
		  });
	  }else if($('#price_date').val()==''){
		  layer.open({
			  title: '提示信息',
			  content: "请输入产品成立时间"
		  });
	  }else if($('#key_manager_name').val()==''){
		  layer.open({
			  title: '提示信息',
			  content: "请输入投资顾问"
		  });
	  }else if($('#ipt_rad').val()==''){
		  layer.open({
			  title: '提示信息',
			  content: "请选择投资策略"
		  });
	  }else if($('#nav').val()==''){
		  layer.open({
			  title: '提示信息',
			  content: "请输入最新净值"
		  });
	  }else if($('#cumulative_nav').val()==''){
		  layer.open({
			  title: '提示信息',
			  content: "请输入累计净值"
		  });
	  }else if($('#annualincome').val()==''){
		  layer.open({
			  title: '提示信息',
			  content: "请输入今年收益"
		  });
	  }else if($('#cumulativeincome').val()==''){
		  layer.open({
			  title: '提示信息',
			  content: "请输入累计收益"
		  });
	  }else if($('#annualized').val()==''){
		  layer.open({
			  title: '提示信息',
			  content: "请输入年化率"
		  });
	  }else if($('#sharpeatio').val()==''){
		  layer.open({
			  title: '提示信息',
			  content: "请输入夏普利率"
		  });
	  }
	  else{
		  $.ajax({
		        // 几个参数需要注意一下
				type: "POST",// 方法类型
				dataType: "json",// 预期服务器返回的数据类型
				url: "uploadInformation " ,// url
				data:array,
			   success: function (result) {
				   // console.log(result)
				   if(result==1){
					   layer.msg("发布成功");
					   setTimeout(function(){
						   location.href="release_information"
					   },1500)
					   
				   }else{
					   layer.msg("发布失败")
				   }
				  
			   },
			   error : function() {
				   layer.open({
						  title: '提示信息',
						  content: "服务器异常，发布失败"
					  });
			    }
		  })
	  }
	  
	 
  })


// 2.基金经理-追加
var $basic_btn=$("#basic_btn");
$basic_btn.click(function(){
    $("#basic_box").append( $("#basic_box").find($(".jijinmessage")[0]).clone());
});
// 3.投研团队-追加
var $ipt_research=$("#ipt_research");
$ipt_research.click(function(){
    $("#research").append($("#research").find($(".tuoyanTerm")[0]).clone());
});

// 4.历史分红-追加
var $ipt_bonus=$("#ipt_bonus");
$ipt_bonus.click(function(){
    $("#bonus").append($("#bonus").find($(".storyfen")[0]).clone());
});

// 5.历史拆分-追加
var $ipt_split=$("#ipt_split");
$ipt_split.click(function(){
    $("#split").append($("#split").find($(".storychai")[0]).clone());
});
// 7.历史净值-追加
var $ipt_worth=$("#ipt_worth");
$ipt_worth.click(function(){
    $("#worth").append($("#worth").find($(".storyjing")[0]).clone());
});
// 7.动态回撤--追加
var $ipt_retracement=$("#ipt_retracement");
$ipt_retracement.click(function(){
    $("#retracement").append($("#retracement").find($(".distroy")[0]).clone());
});

// 私募公司-收取与展示
$(".company").click(e=>{
    e.preventDefault();
    var $tar=$(e.target);
    if($tar.html()=="收起"){
        $tar.html("展示");
        $tar.addClass("a_btm");
        $(".company_jb").hide()

    }else{
        $(".company_jb").show();
        $tar.removeClass("a_btm");
        $tar.html("收起");
    }
});

// 旗下产品-收取与展示
$(".those").click(e=>{
    e.preventDefault();
    var $tar=$(e.target);
    if($tar.html()=="收起"){
        $tar.html("展示");
        $tar.addClass("a_btm");
        $(".btm_those").hide()

    }else{
        $(".btm_those").show();
        $tar.removeClass("a_btm");
        $tar.html("收起");
    }
});
});
$(function(){
    init_city_select($("#sel1"));
});
// 表单验证
// var s=$('body').find('input').length;
// $('body').find('input').focus(function(){
// $(this).removeClass('border-color');
// })
// $('body').find('input').each(function(){
// $(this).blur(function(e){
// var _var=$(this).val();
// //console.log(_var);
// if(_var==''){
// //alert()
// //$(this).attr('placeholder','不能为空')
// $(this).addClass('border-color')
// //$(this).css({" -webkit-transition":"border linear .2s,-webkit-box-shadow
// linear .5s;","border-color":"rgba(141,39,142,.75)"," -webkit-box-shadow":"0 0
// 18px rgba(111,1,32,3)"})
// }
// })
// })
// $('body').find('textarea').blur(function(e){
// var _var=e.target.value;
// //console.log(_var.length)
// //console.log(_var);
// if(_var==''){
// //$(this).attr('placeholder','不能为空')
// $(this).css('border-color','red')
// }else if(_var.length<10){
// $(this).val('')
// $(this).attr('placeholder','请输入不少于10个字符的内容')
// }
// })
// 删除克隆
	// 基金经理
$('#basic_btn2').click(function(){
	var  str1= 'basic_box';
	var str2='jijinmessage';
	DeleteClone(str1,str2)	
})
	// 投研团队
$('#ipt_research2').click(function(){
	var  str1= 'research';
	var str2='tuoyanTerm';
	DeleteClone(str1,str2)	
})
	// 历史分红
$('#ipt_bonus2').click(function(){
	var  str1= 'bonus';
	var str2='storyfen';
	DeleteClone(str1,str2)	
})
	// 历史拆分
$('#ipt_split2').click(function(){
	var  str1= 'split';
	var str2='storychai';
	DeleteClone(str1,str2)	
})
	// 历史净值
$('#ipt_worth2').click(function(){
	var  str1= 'worth';
	var str2='storyjing';
	DeleteClone(str1,str2)	
})
	// 动态回撤
$('#ipt_retracement2').click(function(){
	var  str1= 'retracement';
	var str2='distroy';
	DeleteClone(str1,str2)	
})

function DeleteClone(str1,str2){
	var length=$('#'+str1).find('.'+str2).length;
	if(length>1){
		$('#'+str1).find('.'+str2).eq(-1).remove();
	}else{
		return false;
	}
}