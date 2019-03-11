package com.cts.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.bean.Login;
import com.cts.product.dao.LoginDAO;
import com.cts.product.dao.LoginDAOImpl;
@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private LoginDAO loginDAO;
	
	public String getUserStatus(String Id) {
		// TODO Auto-generated method stub
		return loginDAO.getUserStatus(Id);
	}

	public String getUserType(String Id) {
		// TODO Auto-generated method stub
		return loginDAO.getUserType(Id);
	}

	public Login authenticate(String userName, String password) {
		// TODO Auto-generated method stub
		return loginDAO.authenticate(userName, password);
	}

}
// webinitialzier ds created.read all config classes.
//create respective beans
//on first request send page
