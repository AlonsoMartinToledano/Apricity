package Class;

import java.util.ArrayList;
import java.util.List;

public class User {
	private static List <User> userList = new ArrayList <User>();
	
	private String userName;
	private String userPassword;
	private String userEmail;
	
	//User Constructor				
	public User(String userName, String userPassword, String userEmail){
		this.userName = userName;
		this.userPassword = userPassword;
		this.userEmail = userEmail;
		
		userList.add(this);
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
	
	//userEmail Getter and Setter
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	//Be Top Buyer
	public void beTopBuyer() {
		TopBuyers tB = TopBuyers.getTopBuyers();
		if(tB.getTopBuyer() != null && tB.getTopBuyer() != this) {
			System.out.println("Transfering the Top Buyer Title");
		}
		tB.setTopBuyer(this);
	}
	
	public boolean checkTopBuyer() {
		return (TopBuyers.getTopBuyers().getTopBuyer() == this);
	}
	
	//Login NormalUser
	public boolean loginNormalUser(String name, String pass) {
		boolean login;
		
		if(name.equals(userName) && pass.equals(userPassword)) {
			login = true;
		}
		else {
			login = false;
		}
		return login;
	}
}