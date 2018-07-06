package com.iparhan.financial.entity;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.iparhan.financial.entityTime.TopFive;
import com.iparhan.financial.entityTime.TopHalfYear;
import com.iparhan.financial.entityTime.TopOne;
import com.iparhan.financial.entityTime.TopOneMonth;
import com.iparhan.financial.entityTime.TopTen;
import com.iparhan.financial.entityTime.TopThree;
import com.iparhan.financial.entityTime.TopThreeMonth;
import com.iparhan.financial.entityTime.TopTime;
import com.iparhan.financial.entityTime.TopTwo;

/**
 * 全部实体类分装起来（除了用户信息）
 * @author iparhan
 *
 */

@Mapper
public class Detail {
	//基本信息
	private List<Company> companies;    //公司信息                                                        1
	private List<Bonus> bonus;          //历史分红                                                        2
	private List<DynamicRetra> dynamicRetras; //动态回撤                                      3
	private List<FundManager> fundManagers;   //FundManager       4
	private List<HistoricalNet> historicalNets; //历史净值                                5
	private List<Productions> productions;      //旗下产品                                6
	private List<ResearchTeam> researchTeams;   //投研团队                                7
	private List<Split> splits;                 //历史拆分                                8
	private List<StockInvestment> stockInvestments;//冲仓投股                       9
	private List<IDMessage> idMessages;            //身份资料                       10  
	
	//时间
	private List<TopTime> topYears;  //成立以来                                                                 1                                                    
	private List<TopTen> topTens;    //十年以来                                                                 2 
	private List<TopFive> topFives;  //近五年来                                                                 3
	private List<TopThree> topThrees; //近三年来                                                              4
	private List<TopTwo> topTwos;     //近两年来                                                              5
	private List<TopOne> topOnes;     //近一年来                                                              6
	private List<TopHalfYear> topHalfYears; //近半年来                                            7
	private List<TopThreeMonth> topThreeMonths; //近三个月来                            8
	private List<TopOneMonth> topOneMonths; //近一个月来                                        9
	
	
	public List<Company> getCompanies() {
		return companies;
	}
	public void setCompanies(List<Company> companies) {
		this.companies = companies;
	}
	public List<Bonus> getBonus() {
		return bonus;
	}
	public void setBonus(List<Bonus> bonus) {
		this.bonus = bonus;
	}
	public List<DynamicRetra> getDynamicRetras() {
		return dynamicRetras;
	}
	public void setDynamicRetras(List<DynamicRetra> dynamicRetras) {
		this.dynamicRetras = dynamicRetras;
	}
	public List<FundManager> getFundManagers() {
		return fundManagers;
	}
	public void setFundManagers(List<FundManager> fundManagers) {
		this.fundManagers = fundManagers;
	}
	public List<HistoricalNet> getHistoricalNets() {
		return historicalNets;
	}
	public void setHistoricalNets(List<HistoricalNet> historicalNets) {
		this.historicalNets = historicalNets;
	}
	public List<Productions> getProductions() {
		return productions;
	}
	public void setProductions(List<Productions> productions) {
		this.productions = productions;
	}
	public List<ResearchTeam> getResearchTeams() {
		return researchTeams;
	}
	public void setResearchTeams(List<ResearchTeam> researchTeams) {
		this.researchTeams = researchTeams;
	}
	public List<Split> getSplits() {
		return splits;
	}
	public void setSplits(List<Split> splits) {
		this.splits = splits;
	}
	public List<StockInvestment> getStockInvestments() {
		return stockInvestments;
	}
	public void setStockInvestments(List<StockInvestment> stockInvestments) {
		this.stockInvestments = stockInvestments;
	}
	public List<TopTime> getTopYears() {
		return topYears;
	}
	public void setTopYears(List<TopTime> topYears) {
		this.topYears = topYears;
	}
	public List<TopTen> getTopTens() {
		return topTens;
	}
	public void setTopTens(List<TopTen> topTens) {
		this.topTens = topTens;
	}
	public List<TopFive> getTopFives() {
		return topFives;
	}
	public void setTopFives(List<TopFive> topFives) {
		this.topFives = topFives;
	}
	public List<TopThree> getTopThrees() {
		return topThrees;
	}
	public void setTopThrees(List<TopThree> topThrees) {
		this.topThrees = topThrees;
	}
	public List<TopTwo> getTopTwos() {
		return topTwos;
	}
	public void setTopTwos(List<TopTwo> topTwos) {
		this.topTwos = topTwos;
	}
	public List<TopOne> getTopOnes() {
		return topOnes;
	}
	public void setTopOnes(List<TopOne> topOnes) {
		this.topOnes = topOnes;
	}
	public List<TopHalfYear> getTopHalfYears() {
		return topHalfYears;
	}
	public void setTopHalfYears(List<TopHalfYear> topHalfYears) {
		this.topHalfYears = topHalfYears;
	}
	public List<TopThreeMonth> getTopThreeMonths() {
		return topThreeMonths;
	}
	public void setTopThreeMonths(List<TopThreeMonth> topThreeMonths) {
		this.topThreeMonths = topThreeMonths;
	}
	public List<TopOneMonth> getTopOneMonths() {
		return topOneMonths;
	}
	public void setTopOneMonths(List<TopOneMonth> topOneMonths) {
		this.topOneMonths = topOneMonths;
	}
	public Detail(List<Company> companies, List<Bonus> bonus, List<DynamicRetra> dynamicRetras,
			List<FundManager> fundManagers, List<HistoricalNet> historicalNets, List<Productions> productions,
			List<ResearchTeam> researchTeams, List<Split> splits, List<StockInvestment> stockInvestments,
			List<TopTime> topYears, List<TopTen> topTens, List<TopFive> topFives, List<TopThree> topThrees,
			List<TopTwo> topTwos, List<TopOne> topOnes, List<TopHalfYear> topHalfYears,
			List<TopThreeMonth> topThreeMonths, List<TopOneMonth> topOneMonths) {
		super();
		this.companies = companies;
		this.bonus = bonus;
		this.dynamicRetras = dynamicRetras;
		this.fundManagers = fundManagers;
		this.historicalNets = historicalNets;
		this.productions = productions;
		this.researchTeams = researchTeams;
		this.splits = splits;
		this.stockInvestments = stockInvestments;
		this.topYears = topYears;
		this.topTens = topTens;
		this.topFives = topFives;
		this.topThrees = topThrees;
		this.topTwos = topTwos;
		this.topOnes = topOnes;
		this.topHalfYears = topHalfYears;
		this.topThreeMonths = topThreeMonths;
		this.topOneMonths = topOneMonths;
	}
	public Detail() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Detail [companies=" + companies + ", bonus=" + bonus + ", dynamicRetras=" + dynamicRetras
				+ ", fundManagers=" + fundManagers + ", historicalNets=" + historicalNets + ", productions="
				+ productions + ", researchTeams=" + researchTeams + ", splits=" + splits + ", stockInvestments="
				+ stockInvestments + ", topYears=" + topYears + ", topTens=" + topTens + ", topFives=" + topFives
				+ ", topThrees=" + topThrees + ", topTwos=" + topTwos + ", topOnes=" + topOnes + ", topHalfYears="
				+ topHalfYears + ", topThreeMonths=" + topThreeMonths + ", topOneMonths=" + topOneMonths + "]";
	}
	
	
	
	
}
