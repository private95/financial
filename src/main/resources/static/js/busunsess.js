 var url = location.search; //获取url中"?"符后的字串 
		var theRequest = new Object();
	    var cid = null;
		if ( url.indexOf( "?" ) != -1 ) {
		  var str = url.substr( 1 ); 
		  var strs = str.split( "&" );
		  for ( var i = 0; i < strs.length; i++ ) {
		    theRequest[ strs[ i ].split( "=" )[ 0 ] ] = ( strs[ i ].split( "=" )[ 1 ] );
		  }
		  console.log( theRequest.companyId );
		  cid = theRequest.companyId;
		}
		
		$.ajax({
			type:"POST",
			url:"showCompanyInfo?cid="+cid,
			success:function(data){
				//console.log(data.data)
				GetData(data.data)
    		}
		});
		
		$.ajax({
			type:"POST",
			url:"selectHistorical",
			success:function(data){
				//console.log(data.data)
				var ls=data.data;
				var myDate = new Date();//当前时间
				for(var k = 0;k<ls.length;k++){
					var a = ls[k].hist_time; //后台时间
					//var currentDateLong = new Date(currentdate.replace(new RegExp("-","gm"),"/")).getTime()
					var timestamp = Date.parse(new Date(a));
					//console.log(myDate.getTime());
					//console.log(timestamp);
					
					//console.log(myDate.getTime()-timestamp);
					 var aaa= datetimeFormat(myDate.getTime()-timestamp);
					var str = 
							'<li>'+
                   		 		'<p><a style="color: #000" href="business_details?companyId='+ls[k].company_Id+'">'+ls[k].company_name+'</a></p>'+
                    			'<span>前'+aaa+'秒浏览了</span>'+
                			'</li>'
                			$('.lljl').append(str)
				}
			}
		});
		
	   /** 时间格式化工具 
		 */ 
		function datetimeFormat(longTypeDate){  
		 var dateTypeDate = "";  
		 var date = new Date();  
		 date.setTime(longTypeDate);  
		 //dateTypeDate += date.getFullYear(); //年  
		// dateTypeDate += "年" + getMonth(date); //月  
		// dateTypeDate += "月" + getDay(date); //日  
		// dateTypeDate += "日" + getHours(date); //时
		 dateTypeDate += "" + getMinutes(date);  //分 
		 dateTypeDate += "分" + getSeconds(date);  //秒
		 return dateTypeDate; 
		}  
		/* 
		 * 时间格式化工具 
		 * 把Long类型的1527672756454日期还原yyyy-MM-dd格式日期 
		 */ 
		function dateFormat(longTypeDate){  
		 var dateTypeDate = "";  
		 var date = new Date();  
		 date.setTime(longTypeDate);  
		 dateTypeDate += date.getFullYear(); //年  
		 dateTypeDate += "-" + getMonth(date); //月  
		 dateTypeDate += "-" + getDay(date); //日  
		 return dateTypeDate; 
		}  
		//返回 01-12 的月份值  
		function getMonth(date){  
		 var month = "";  
		 month = date.getMonth() + 1; //getMonth()得到的月份是0-11  
		 if(month<10){  
		  month = "0" + month;  
		 }  
		 return month;  
		}  
		//返回01-30的日期  
		function getDay(date){  
		 var day = "";  
		 day = date.getDate();  
		 if(day<10){  
		  day = "0" + day;  
		 }  
		 return day;  
		} 
		//小时 
		function getHours(date){ 
		 var hours = ""; 
		 hours = date.getHours(); 
		 if(hours<10){  
		  hours = "0" + hours;  
		 }  
		 return hours;  
		} 
		//分 
		function getMinutes(date){ 
		 var minute = ""; 
		 minute = date.getMinutes(); 
		 if(minute<10){  
		  minute = "0" + minute;  
		 }  
		 return minute;  
		} 
		//秒 
		function getSeconds(date){ 
		 var second = ""; 
		 second = date.getSeconds(); 
		 if(second<10){  
		  second = "0" + second;  
		 }  
		 return second;  
		}
		
		
		
		 function GetData(arr){	          
			var comptyId=null;
         	for(var i=0;i<arr.length;i++){
         		comptyId =arr[i].company_id;
         		$('#main').find($('.compty')[i]).html(arr[i].name);
         		$('#main').find($('.ljsy')[i]).html(arr[i].cumulativeincome+"%");
         		$('#main').find($('.dbcp')[i]).html(arr[i].production);
         		$('#main').find($('.clsj')[i]).html(arr[i].establishTime);
         		$('#main').find($('.szdq')[i]).html(arr[i].address);
         		$('#main').find($('.jnsy')[i]).html(arr[i].annualincome+"%");
         		$('#main').find($('.qxjj')[i]).html(arr[i].product_count+"个");
         		$('#main').find($('.bah')[i]).html(arr[i].recordCode);
         		$('#main').find($('.hxrw')[i]).html(arr[i].personName);
         		$('#main').find($('.gsjs')[i]).html(arr[i].idea_company);
         		 $('span').each(function(index){
					if($(this).text()=='0'||$(this).text()=='null'||$(this).text()=='0%'||$(this).text()=='0个'||$(this).text()=='null%'){
						$(this).text('--')
					}
				}) 
         	}
			$.ajax({
				url:"getComptyIdShow?comptyId="+comptyId,
				success:function(data){
					console.log(data.data);
					var a =data.data;
					var c = 1;
					for(var j = 0;j<a.length;j++){
						var str='<tr>'+
			                        '<td>'+ c++ +'</td>'+
			                        '<td><a href="/details?id='+a[j].id+'" style="color: #000;">'+a[j].fund_shortName+'</a></td>'+
			                        '<td>'+a[j].nav+'%'+'</td>'+
			                        '<td>'+a[j].topOneMonth+'%'+'</td>'+
			                        '<td>'+a[j].annualized+'%'+'</td>'+
			                        /* '<td><a href="#">了解操作</a></td>'+ */
                        	'</tr>'
                        	$('#qixiajj').append(str)
                        	 $('td').each(function(index){
								if($(this).text()=='0'||$(this).text()=='null'||$(this).text()=='0%'||$(this).text()==''||$(this).text()=='null%'){
									$(this).text('--')
								}
							}) 
					}
				}
			});
         }