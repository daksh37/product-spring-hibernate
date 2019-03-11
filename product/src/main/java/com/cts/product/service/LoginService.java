package com.cts.product.service;


import com.cts.product.bean.Login;
public interface LoginService {
	public String getUserStatus(String Id);
	public String getUserType(String Id);
	public Login authenticate(String userName,String password);

}




