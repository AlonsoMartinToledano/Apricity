package Class;

public class Admin {
	private String adminPassword = "adminpassword";
	
	//adminPassword Getter and Setter
	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	
	//LoginAdmin
	public boolean loginAdmin(String pass) {
		boolean login;
		
		if(pass.equals(adminPassword)) {
			login = true;
		}
		else {
			login = false;
		}
		return login;
	}
}