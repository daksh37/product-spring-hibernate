package com.cts.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.product.bean.Login;
import com.cts.product.service.LoginService;

@Controller
public class LoginController {
	//default get method
	@RequestMapping("Login.html")
	public String getLoginPage(){
		return "Login";
	}
	@Autowired
	LoginService loginService;
	@RequestMapping(value="Login.html", method=RequestMethod.POST)
	public ModelAndView validateUser(@ModelAttribute Login login){
		ModelAndView modelAndView=new ModelAndView();
		if("admin".equals(login.getUserName()) && "admin".equals(login.getPassword())){
			modelAndView.setViewName("admin");
		}
		else{
			modelAndView.setViewName("Login");
		}
		return modelAndView;
		
	}
	
	
}
