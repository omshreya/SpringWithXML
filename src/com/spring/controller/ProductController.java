package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.dao.ProductDao;
import com.spring.pojo.Product;

@Controller
@RequestMapping(value= "/") 
public class ProductController 
{
	
	 @RequestMapping(value="/viewproduct",method=RequestMethod.GET)  
	 public ModelAndView viewproduct()
	 {  
		 List<Product> list=ProductDao.getProducts(); 
		 return new ModelAndView("viewproduct","list",list);  
	 }  
}
