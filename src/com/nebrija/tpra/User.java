package com.nebrija.tpra;

public class User {
	private String userEmail = "adrian@gmail.com";
	private String userName = "a";
	private String userPassword = "a";
	
	//userEmail Getter and Setter
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
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
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
}