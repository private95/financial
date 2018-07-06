/**
 * 后台管理用户列表显示
 * 
 */
function loginSubmit(){
	alert("渲染数据到后台管理页面");
	$.ajax({
        url:"/userList",
        type:"post",
        success: function(data) {
        	
        }
	
})
}
