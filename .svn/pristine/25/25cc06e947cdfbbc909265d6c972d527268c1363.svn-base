$(()=>{
		var url = location.search; //获取url中"?"符后的字串 ('?modFlag=business&role=1')
		var theRequest = new Object();
		var cnum = null;
		if ( url.indexOf( "?" ) != -1 ) {
		  var str = url.substr( 1 ); //substr()方法返回从参数值开始到结束的字符串；
		  //console.log(str);
		  var strs = str.split( "&" );
		  for ( var i = 0; i < strs.length; i++ ) {
		    theRequest[ strs[ i ].split( "=" )[ 0 ] ] = ( strs[ i ].split( "=" )[ 1 ] );
		  }
		 // console.log( theRequest.SearchKey ); //此时的theRequest就是我们需要的参数；
		  cnum=theRequest.SearchKey ;
		}
		 
		
		$.ajax({
			type:"POST",
			url:"inputsearchdata?searchnum="+cnum,//这个就是cnum
			success:function(data){
				GetData(data.data);
				var newDataKye=getQueryString(cnum)
    		}
		});
  	 	
		function getQueryString(name) { 
			var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i"); 
			var r = window.location.search.substr(1).match(reg); 
			if (r != null) return decodeURI(r[2]); return null; 
		}
	
    	function searchInput(){
    		$.ajax({
    			type:"POST",
    			url:"inputsearchdata?searchnum="+$("#Search").val(),
    			success:function(data){
    				GetData(data.data)
	    		}
    		});
    	}
         function GetData(arr){	 
        	 var str="";
        	 $('#tbody1').html('');
         	for(var i=0;i<arr.length;i++){
         		var str='<tr>'+
	                	'<td class="name"><a style="color:#000" href="business_details?companyId='+arr[i].id+'">'+arr[i].name+'</a></td>'+
						'<td class="fund_shortName">'+arr[i].fund_shortName+'</td>'+
						'<td class="fundCompany">'+arr[i].fundCompany+'</td>'+
						'<td class="nav" style="color:red">'+arr[i].nav+'%'+'</td>'+
						'<td class="cumulative_nav" style="color:red">'+arr[i].cumulative_nav+'%'+'</td>'+
						'<td class="topOneMonth" style="color:red">'+arr[i].topOneMonth+'%'+'</td>'+
						'<td class="annualized" style="color:red">'+arr[i].annualincome+'%'+'</td>'+
						'<td class="oneyearrating">'+arr[i].riskgrade+'</td>'+
						'<td><a href="business_details?companyId='+arr[i].id+'">了解详情</a></td>'+
					'</tr>'
         		$('#tbody1').append(str)
         		CheckType()
         	}
         } 
     	 //0或者是null时显示--
			function CheckType(){
				$('td').each(function(index){
					if($(this).text()=='0'||$(this).text()=='null'||$(this).text()=='0%'||$(this).text()==''||$(this).text()=='null%'){
						$(this).text('--')
					}
				})
			}
			
})