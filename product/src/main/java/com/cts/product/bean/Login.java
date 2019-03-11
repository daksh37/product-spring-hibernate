package com.cts.product.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="LoginTable")
public class Login {
	@Id
	private String userName;
	private String password;
	@Override
	public String toString() {
		return "Login [userName=" + userName + ", password=" + password + "]";
	}
	
	public Login() {
		// TODO Auto-generated constructor stub
	}
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
