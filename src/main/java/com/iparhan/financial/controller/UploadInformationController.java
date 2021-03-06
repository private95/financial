package com.iparhan.financial.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iparhan.financial.dao.BonusMapper;
import com.iparhan.financial.dao.CompanyTwoMapper;
import com.iparhan.financial.dao.DynamicRetraMapper;
import com.iparhan.financial.dao.FundManagerMapper;
import com.iparhan.financial.dao.HistoricalNetMapper;
import com.iparhan.financial.dao.ProductionsMapper;
import com.iparhan.financial.dao.ResearchTeamMapper;
import com.iparhan.financial.dao.SplitMapper;
import com.iparhan.financial.dao.TopFiveMapper;
import com.iparhan.financial.dao.TopHalfYearMapper;
import com.iparhan.financial.dao.TopOneMapper;
import com.iparhan.financial.dao.TopOneMonthMapper;
import com.iparhan.financial.dao.TopTenMapper;
import com.iparhan.financial.dao.TopThreeMapper;
import com.iparhan.financial.dao.TopThreeMonthMapper;
import com.iparhan.financial.dao.TopTimeMapper;
import com.iparhan.financial.dao.TopTwoMapper;
import com.iparhan.financial.entity.Bonus;
import com.iparhan.financial.entity.CompanyTwo;
import com.iparhan.financial.entity.DynamicRetra;
import com.iparhan.financial.entity.FundManager;
import com.iparhan.financial.entity.HistoricalNet;
import com.iparhan.financial.entity.Productions;
import com.iparhan.financial.entity.ResearchTeam;
import com.iparhan.financial.entity.Split;
import com.iparhan.financial.entityTime.TopTen;
import com.iparhan.financial.entityTime.TopTime;



/**
 * <免费发布信息>页面的数据交互业务
 * 
 * @author iparhan
 */
@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
@RestController
public class UploadInformationController {

	@Autowired
	private CompanyTwoMapper companyMapper;

	@Autowired
	private FundManagerMapper fundManagerMapper;

	@Autowired
	private ResearchTeamMapper researchTeamMapper;

	@Autowired
	private ProductionsMapper productionsMapper;

	@Autowired
	private BonusMapper bonusMapper;

	@Autowired
	private SplitMapper splitMapper;

	@Autowired
	private HistoricalNetMapper historicalNetMapper;

	@Autowired
	private DynamicRetraMapper dynamicRetraMapper;

	@Autowired
	private TopTimeMapper topTimeMapper;

	@Autowired
	private TopTenMapper topTenMapper;

	@Autowired
	private TopFiveMapper topFiveMapper;

	@Autowired
	private TopThreeMapper topThreeMapper;

	@Autowired
	private TopTwoMapper topTwoMapper;

	@Autowired
	private TopOneMapper topOneMapper;

	@Autowired
	private TopHalfYearMapper topHalfYearMapper;

	@Autowired
	private TopThreeMonthMapper topThreeMonthMapper;

	@Autowired
	private TopOneMonthMapper topOneMonthMapper;

	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/uploadInformation", method = RequestMethod.POST)
	public int uploadInformation(CompanyTwo company, FundManager fundManagers, ResearchTeam researchTeam,
			Productions productions, Bonus bonus, Split split, HistoricalNet historicalNet, DynamicRetra dynamicRetra,
			TopTime topTime, TopTen topTen,HttpServletRequest request) {

		//System.out.println("发布信息的数据交互" + company);
		String name = company.getName();
		String product_count = company.getProduct_count();
		String personName = company.getPersonName();
		String capitalMoney = company.getCapitalMoney();
		String address = company.getAddress();
		String city = company.getAddress();
		String company_id = company.getCompany_id();
		String recordCode = company.getRecordCode();
		String register_number = company.getRecordCode();
		String establishTime = company.getEstablishTime();
		String production = company.getProduction();
		String idea_company = company.getIdea_company();
		String corestrategy = company.getCorestrategy();
		
		String nav = company.getNav();
		String cumulative_nav = company.getCumulative_nav();
		String annualincome = company.getAnnualincome();
		String cumulativeincome = company.getCumulativeincome();
		String key_manager_name = company.getKey_manager_name();
		
		String topOneMonth = company.getTopOneMonth();
		String top2018 = company.getTop2018();
		String topThreeMonth = company.getTopThreeMonth();
		String top2017 = company.getTop2017();
		
		String topHalfYear = company.getTopHalfYear();
		String top2016 = company.getTop2016();
		String topOne = company.getTopOne();
		String top2015 = company.getTop2015();
		
		String topTwo = company.getTopTwo();
		String top2014 = company.getTop2014();
		String topThree = company.getTopThree();
		String top2013 = company.getTop2013();
		
		String topFive = company.getTopFive();
		String top2012 = company.getTop2012();
		String topDate = company.getTopDate();
		String top2011 = company.getTop2011();
		
		
		
		String fund_shortName = company.getFund_shortName();
		
		
		String tuser_id = (String)request.getSession().getAttribute("account");
		
		
		//System.out.println("企业信息_存储前输出一下====" + name + product_count + personName + capitalMoney + address + company_id + corestrategy
				//+ establishTime + production + idea_company+" :: "+ tuser_id);

		/**
		 * 表单存进数据库
		 */
		/*
		 * 企业信息
		 */
		companyMapper.insertCompany(name, personName, capitalMoney, address, company_id, establishTime,recordCode,product_count,
				production, idea_company,corestrategy,nav,cumulative_nav,annualincome,cumulativeincome,key_manager_name,register_number,city,
				topOneMonth,top2018,topThreeMonth,top2017,topHalfYear,top2016,topOne,top2015,topTwo,top2014,topThree,top2013,topFive,top2012,topDate,top2011,
				fund_shortName,
				Integer.parseInt(tuser_id));
		//System.out.println("企业信息存储到数据库============================DB");

		
		
		
		 String price_date = company.getPrice_date();
		 String annualized = company.getAnnualized();
		 String sharpeatio = company.getSharpeatio();
		 String fundCompany = company.getFundCompany();
		
		//添加产品信息
		 companyMapper.privatestock(
				fund_shortName,fundCompany,nav,cumulative_nav,
				topOneMonth,top2018,topThreeMonth,top2017,topHalfYear,top2016,topOne,top2015,topTwo,top2014,topThree,top2013,topFive,top2012,top2011,
				price_date,company_id,annualized,sharpeatio,
				  Integer.parseInt(tuser_id));
		/*
		 * 基金经理
		 */
//		String fundManager = fundManagers.getFundManagerName();
//		String idea_fundManagerName = fundManagers.getIdea_fundManagerName();
//		//System.out.println("基金经理基本信息===" + fundManager + idea_fundManagerName);
//		fundManagerMapper.insertFundManager(fundManager, idea_fundManagerName);

		/*
		 * 投研团队
		 */
//		String name_ResearchTeam = researchTeam.getName_ResearchTeam();
//		String idea_ResearchTeam = researchTeam.getIdea_ResearchTeam();
//		//System.out.println("投研团队===" + name_ResearchTeam + idea_ResearchTeam);
//		researchTeamMapper.insertResearchTeam(name_ResearchTeam, idea_ResearchTeam);
		
		 //产品基本信息
		 
//		 productionsMapper.insertProductions(productions);
		 
		 
		 //历史分红
		 
//		 bonusMapper.insertBonus(bonus);
		 
		 
		// 历史拆分
		 
//		 splitMapper.insertSplit(split);
		 
		 
		 //历史净值
		 
//		 historicalNetMapper.insertHistoricalNet(historicalNet);
		 
		 
		 //动态回撤
		 
//		 dynamicRetraMapper.insertDynamicRetra(dynamicRetra);
		 
		 
		 //成立以来
		 
//		 topTimeMapper.insertTopTime(topTime);
		 
		 
		 //十年以来
		 
//		 topTenMapper.insertTopTen(topTen);
		 
		 
		 //五年以来
		 
		 
//		 topFiveMapper.insertTopFive(topFive);
//		 
		 
		 //3年以来
		 
//		 topThreeMapper.insertTopThree(topThree);
//		 
		 
		 //2年以来
		 
//		 topTwoMapper.insertTopTwo(topTwo);
		 
		 
		 //一年以来
		 
//		 topOneMapper.insertTopOne(topOne);
		 
		 
		 //半年以来
		 
//		 topHalfYearMapper.insertTopHalfYear(topHalfYear);
		 
		 
		 //三个月以来
		 
//		 topThreeMonthMapper.insertTopThreeMonth(topThreeMonth);
		 
		 
		 //一个月以来
		 
//		 topOneMonthMapper.insertTopOneMont(topOneMonth);
		 
		 return 1;
	}
	
	/*
	 * 查询productions表，产品详情表
	 */
	@CrossOrigin(origins = "*", maxAge = 3600) // 使用于前端的跨域
	@RequestMapping(value = "/selectProductionDetail", method = RequestMethod.POST)
	public List<Productions> selectProductionDetail(@Param("fundCompany") String fundCompany) {
		List<Productions> productions = productionsMapper.selectProdctionsDetail(fundCompany);
		return productions;
	}
}
