package com.iparhan.financial.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iparhan.financial.dao.BrowseHistoryMapper;
import com.iparhan.financial.entity.Company;
import com.iparhan.financial.until.EmptyUtils;

/*
 * 浏览历史
 * */
@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
@RestController
public class BrowseHistoryController {
	@Autowired
	private BrowseHistoryMapper browseHistoryMapper;
	
	public void init() throws ServletException {
      
    }
	
	// 根据id获取公司名称
	 
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/getProductions")
	public Company getProduction(HttpServletRequest request, String id) {
		// 查询数据库
		Company companyTwos = browseHistoryMapper.getCompanyById(id);
		return companyTwos;
	}

	// 查询最近浏览过的商品
	private List<Company> queryCompany(HttpServletRequest request) throws Exception {
		HttpSession session = request.getSession();
		List<Company> recentCompany = (List<Company>) session.getAttribute("recentCompany");
		if (EmptyUtils.isEmpty(recentCompany)) {
			recentCompany = new ArrayList<Company>();
		}
		return recentCompany;
	}

	// 通过session添加最近浏览商品
	private void addCompany(HttpServletRequest request, Company company) throws Exception {
		HttpSession session = request.getSession();
		List<Company> recentCompany = queryCompany(request);
		// 判断是否满了
		if (recentCompany.size() > 0 && recentCompany.size() == 8) {
			recentCompany.remove(0);
		}
		recentCompany.add(recentCompany.size(), company);
		session.setAttribute("recentCompany", recentCompany);
	}
}
