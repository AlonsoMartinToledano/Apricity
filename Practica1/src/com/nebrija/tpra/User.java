package com.nebrija.tpra;

public class User {
	private String email = "adrian@gmail.com";
	private String userName = "Adrian";
	private String userPassword = "adrianpass";
	
	//email Getter and Setter
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	//userName Getter and Setter
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	//userPassword Getter and Setter
	
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String password) {
		this.userPassword = password;
	}
}
