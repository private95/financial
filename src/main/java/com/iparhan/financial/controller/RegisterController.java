package com.iparhan.financial.controller;



import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.iparhan.financial.dao.UserMapper;
import com.iparhan.financial.service.MailService;
import com.iparhan.financial.until.FinancialResult;
import com.iparhan.financial.until.MD5Utils;
import com.iparhan.financial.until.Verification;
import com.iparhan.financial.vo.CommonResponseVO;


@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
@RestController
public class RegisterController {

	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private MailService mailService;
	
	private String codeCompa;

	/**
	 * 注册业务
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/registerDemo")
	public int register(@Param("username") String username, @Param("password") String password,
			@Param("email") String email,String code) {
		//System.out.println("理财百科注册前端发来的数据" + "用户名：" + username + "密码：" + password + "邮箱" + email);
		// 先去查询用户表如果有同样的数据 就不再去注册
		int iusername = userMapper.getName(username);
		int iemail = userMapper.getEmail(email);
		// 如果用户名未使用过，判断邮箱
		if (iusername > 0) {
			//System.out.println("此用户名已被使用");
			return 2;
			//判断邮箱是否已被使用
		} else if (iemail > 0) {
			//System.out.println("此邮箱已被使用");
			return 3;
			//都未被使用，注册成功
		} else if(!codeCompa.equals(code)){
			//System.out.println("验证码错误！");
			return 4;
		} else {
			//System.out.println("未被使用");
			userMapper.insertUser(username, MD5Utils.md5Password(password), email);
			return 1;
		}
	}
	
	
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/getRandomText")
	public CommonResponseVO getRandomText(String email) {
		//System.out.println("前端传递 ： "+email);
		CommonResponseVO responseVO = new CommonResponseVO();
		codeCompa = Verification.getStringRandom();
		System.out.println("生成的验证码 :"+codeCompa);
		mailService.sendSimpleMail(email, "理财百科邮箱验证码：", codeCompa);
		responseVO.success("验证码发送成功！");
		return responseVO;
	}
	
	
	
	/**
	 * 重置密码
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/updateUserPassword")
	public FinancialResult updateuserpassword(String username,String email,String information,String password) {
		String userEmail = userMapper.queryByUserName(username);
		if (userEmail!=null&&email.equals(userEmail)) {
			if (information!=null&&information.equals(codeCompa)) {
				int num = userMapper.updateUserPassword(MD5Utils.md5Password(password), username, userEmail);
				return FinancialResult.ok();
			}else{
				return FinancialResult.build(500, "验证码输入不正确");
			}
		}else {
			return FinancialResult.build(500, "输入邮箱不正确");
		}
	}
	
	/**
	 * 验证用户名和邮箱是否匹配
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/VerificationUsernameEmail")
	public FinancialResult VerificationUsernameEmail(String username,String email) {
		//System.out.println("前端传递 ： "+email);
		//System.out.println("前端传递用户名"+username);
		String userEmail = userMapper.queryByUserName(username);
		if (userEmail!=null&&userEmail.equals(email)) {
			return FinancialResult.ok();
		}else {
			return FinancialResult.build(500, "用户名和邮箱不匹配");
		}
	}
	
	
	}
	
	
	

