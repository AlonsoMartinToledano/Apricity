package Class;

public class Admin {
	private static String adminPassword = "password";
	
	//adminPassword Getter and Setter
	public String getAdminPassword() {
		return adminPassword;
	}

	public static void setAdminPassword(String adminPassword) {
		Admin.adminPassword = adminPassword;
	}
	
	//LoginAdmin
	public static boolean loginAdmin(String pass) {
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