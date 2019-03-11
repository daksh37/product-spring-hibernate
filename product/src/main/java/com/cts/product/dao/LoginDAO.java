package com.cts.product.dao;


import com.cts.product.bean.Login;
public interface LoginDAO {
	public String getUserStatus(String Id);
	public String getUserType(String Id);
	public Login authenticate(String userName,String password);
}
