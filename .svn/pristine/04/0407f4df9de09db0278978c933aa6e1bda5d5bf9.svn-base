package com.iparhan.financial.controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iparhan.financial.dao.HistoricalMapper;
import com.iparhan.financial.entity.Historical;
import com.iparhan.financial.entity.User;
import com.iparhan.financial.until.Result;

@Controller
public class HistoricalController {

	@Autowired
	private HistoricalMapper historicalMapper;
	
	
	@RequestMapping("/selectHistorical")
	@ResponseBody
	public Result selectHistorical(HttpServletRequest request) {
		HttpSession session = request.getSession();
		if(session.getAttribute("user")==null) {
			List<Historical> list = historicalMapper.listHistrical();
			return Result.build(200, "历史记录",list);
		}else {
			User user = (User) session.getAttribute("user");
			Integer userId =Integer.parseInt(user.getId());
			List<Historical> list = historicalMapper.listHistricals(userId);
			return Result.build(200, "历史记录",list);
		}
	}
}
