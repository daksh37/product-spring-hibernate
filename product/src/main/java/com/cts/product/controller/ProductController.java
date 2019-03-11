package com.cts.product.controller;
import com.cts.product.bean.Login;
import com.cts.product.bean.Product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

	@RequestMapping("addProduct.html")
	public String addProductPage(){
		return "addProduct";
	}
	
	@RequestMapping("deleteProduct.html")
	public String deleteProductPage(){
		return "deleteProduct";
	}
	
}
