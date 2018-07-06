alert("-------------");
function btnSubmit(){
	alert("里面也进去了");
	$.ajax({
		  type: 'POST',
		  url: "/uploadInformation",
		  data: $("#form1").serialize(),
		  success: function(data) {
          	console.log(data)
          	alert(data);             
          },
		  
		});
}