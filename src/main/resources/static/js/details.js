$(document).ready(function(){
	/*alert(GetQueryString("id"))*/
	
    function GetQueryString(name)
    {
         var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
         var r = window.location.search.substr(1).match(reg);
         if(r!=null)return  unescape(r[2]); return null;
    }
    
	
   // alert()
    //产品要素和业绩分析切换
	$('.detail_analysis').hide();
   $('.list_nav3').find('li').each(function(index){
    	//alert(index)
    	$(this).click(function(){
    		$(this).addClass("indexed");
    		$('.list_nav3').find('li').not($(this)).removeClass('indexed');    		
    	})
    })
    $('.product_res').click(function(){
    	$('#analysis').hide();
    	$('#chanpin').show();
    })
    $('.fenxi').click(function(){
    	//alert()
    	$('#chanpin').hide();
    	$('#analysis').show();
    })
    //企业信息
    $('.tou_ll').css('display','none');
    $('.tou_ss').css('display','none');
    $('.company_2').click(function(){
    	//alert()
    	$('.jijing_li').hide();
    	$('.tou_ll').css('display','none');
    	$('.tou_ss').css('display','none');
    	$('.company_int').show();
    })
     $('.jing_2').click(function(){
    	//alert()
    	$('.jijing_li').show();
    	$('.tou_ll').css('display','none');
    	$('.tou_ss').css('display','none');
    	$('.company_int').hide();
    })
     $('.tou_2').click(function(){
    	//alert()
    	$('.jijing_li').hide();
    	$('.tou_ll').css('display','block');
    	$('.tou_ss').css('display','none');
    	$('.company_int').hide();
    })
     $('.team_2').click(function(){
    	//alert()
    	$('.jijing_li').hide();
    	$('.tou_ll').css('display','none');
    	$('.tou_ss').css('display','block');
    	$('.company_int').hide();
    })

    //区间收益股票浮动图与表格切换
    $(".ck_active").on("mousemove","a",e=>{
        e.preventDefault();
        var $tar=$(e.target);
        if(!$tar.parent().hasClass(".active")){
            $tar.parent().addClass("active").siblings(".active").removeClass("active");
            $($tar.data("toggle")).show().siblings().hide()
        }
    });

    //产品要素和业绩分析导航切换
    $(".list_nav3:has([data-toggle=tab])")
        .on("click","[data-toggle=tab]",e=>{
            e.preventDefault();
            var $tar=$(e.target);
            if(!$tar.parent().is(".selected")) {
                $tar.parent().addClass("selected")
                    .siblings().removeClass("selected");
                var id=$tar.attr("href");
                $(id).show()
                    .siblings().hide();
            }
        });
    //进攻防守菜单切换
    $(".analysis_nav").on("mousemove","a",e=>{
        e.preventDefault();
        var $tar=$(e.target);
        if(!$tar.hasClass(".active")){
            $tar.addClass("active").siblings(".active").removeClass("active");
            $($tar.data("toggle")).show().siblings().hide()
        }
    });
    //
    
//   $('.lt_title').find('li').each(function(index){
//	   $(this).click(function(){
//		   alert(index)
//		 $('body').find($('.name1')[index]).css('display','blcok');
//		   $('body').find($('.name1')).not($(this)).css('display','none');
//	   })
//	   $('.lt_title').find($('li')[0]).trigger('click')
//   })
    $('#img').click(function(){
    	$('.name1').show();
    	$('.name2').hide()
    })
    $('#tabs').click(function(){
    	$('.name1').hide();
    	$('.name2').show()
    })
    //收藏
    $('.shoucang').click(function(){
    	$(this).toggleClass('show')
    })
});