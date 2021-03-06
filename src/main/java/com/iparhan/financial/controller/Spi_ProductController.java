package com.iparhan.financial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.iparhan.financial.dao.ProductMapper;
import com.iparhan.financial.entity.Product;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)   //使用于前端的跨域
public class Spi_ProductController {
	
	@Autowired
	private ProductMapper ProductMapper;
	
	/*
	 * 企业信息展现
	 */
	@CrossOrigin(origins = "*", maxAge = 3600)   //使用于前端的跨域
	@RequestMapping(value ="/topOneMonthProduct")
	public @ResponseBody  List<Product>companyTest(Product Product ){
		//System.out.println("参数接受"+ Product);
		//1.先查询数据库
		List<Product> Products =  ProductMapper.selectProductByOneMonth(Product);
		//System.out.println("企业信息展现"+Products);
		//2.查询一个月以来的数据
		
		return Products;
	}
	
	/*
	 * 根据三月以来的数据查询全部数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600)   //使用于前端的跨域
	@RequestMapping(value="/topThreeMonthProduct")
	public  List<Product> topThreeMonth(Product Product){
		//1.先查询数据
		List<Product> Products = ProductMapper.selectProductByThreeMonth(Product);
		return Products;
		
	}
	
	/*
	 * 根据半年的数据来查询全部的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600)   //使用于前端的跨域
	@RequestMapping(value ="/topHalfYearProduct")
	public List<Product> topHalfYear(Product Product){
		//1.查询数据库
		List<Product> Products = ProductMapper.selectProductBytopHalfYear(Product);
		return Products;
	}
	
	/*
	 * 根据一年以来的数据查询全部的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600)   //使用于前端的跨域
	@RequestMapping(value ="/topOneProduct")
	public List<Product> topOne(Product Product){
		//1.先查询数据库
		List<Product> Products = ProductMapper.selectProductBytopOne(Product);
		return Products;
	}
	
	/*
	 * 两年以来的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600)   //使用于前端的跨域
	@RequestMapping(value ="/topTwoProduct")
	public List<Product> topTwo(Product Product){
		//1.先查询数据
		List<Product> Products =  ProductMapper.selectProductBytopTwo(Product);
		return Products;
	}
	
	/*
	 * 三年以来的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600)   //使用于前端的跨域
	@RequestMapping(value ="/topThreeProduct")
	public List<Product> topThree(Product Product){
		//1.查询数据
		List<Product> Products = ProductMapper.selectProductBytopThree(Product);
		return Products;
	}
	
	/*
	 * 五年以来的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600)   //使用于前端的跨域
	@RequestMapping(value ="/topFiveProduct")
	public List<Product> topFive(Product Product){
		//1.先查询数据库
		List<Product> Products = ProductMapper.selectProductBytopFive(Product);
		return Products;
	}
	
	/*
	 * 成立以来的数据
	 
	@CrossOrigin(origins = "*", maxAge = 3600)   //使用于前端的跨域
	@RequestMapping(value ="/topDateProduct")
	public List<Product> topDate(Product Product){
		//1.先查询数据
		List<Product> Products = ProductMapper.selectProductBytopDate(Product);
		return Products;
	}*/
	
	/*
	 * 2018的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600)   //使用于前端的跨域
	@RequestMapping(value ="/top2018Product")
	public List<Product> top2018(Product Product){
		//1.先查询数据
		List<Product> Products = ProductMapper.selectProductBytop2018(Product);
		return Products;
	}
	
	/*
	 * 2017的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600)   //使用于前端的跨域
	@RequestMapping(value ="/top2017Product")
	public List<Product> top2017(Product Product){
		//1.先查询数据
		List<Product> Products = ProductMapper.selectProductBytop2017(Product);
		return Products;
	}
	
	/*
	 * 2016的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600)   //使用于前端的跨域
	@RequestMapping(value ="/top2016Product")
	public List<Product> top2016(Product Product){
		//1.先查询数据
		List<Product> Products = ProductMapper.selectProductBytop2016(Product);
		return Products;
	}
	
	
	/*
	 * 2015的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600)   //使用于前端的跨域
	@RequestMapping(value ="/top2015Product")
	public List<Product> top2015(Product Product){
		//1.先查询数据
		List<Product> Products = ProductMapper.selectProductBytop2015(Product);
		return Products;
	}
	
	/*
	 * 2014的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600)   //使用于前端的跨域
	@RequestMapping(value ="/top2014Product")
	public List<Product> top2014(Product Product){
		//1.先查询数据
		List<Product> Products = ProductMapper.selectProductBytop2014(Product);
		return Products;
	}
	
	/*
	 * 2013的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600)   //使用于前端的跨域
	@RequestMapping(value ="/top2013Product")
	public List<Product> top2013(Product Product){
		//1.先查询数据
		List<Product> Products = ProductMapper.selectProductBytop2013(Product);
		return Products;
	}
	
	/*
	 * 2012的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600)   //使用于前端的跨域
	@RequestMapping(value ="/top2012Product")
	public List<Product> top2012(Product Product){
		//1.先查询数据
		List<Product> companies = ProductMapper.selectProductBytop2012(Product);
		return companies;
	}
	
	/*
	 * 2011的数据
	 */
	@CrossOrigin(origins = "*", maxAge = 3600)   //使用于前端的跨域
	@RequestMapping(value ="/top2011Product")
	public List<Product> top2011(Product Product){
		//1.先查询数据
		List<Product> Products = ProductMapper.selectProductBytop2011(Product);
		return Products;
	}
	

}
