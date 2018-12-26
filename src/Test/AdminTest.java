package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Class.Admin;
import Class.User;

class AdminTest {
	
	Admin a = new Admin();
	
	//admin Constructor Test
		@Test
		void testAdminConstructor() {
			Admin a = new Admin();
		}
	
	//adminPassword Getter and Setter Test
		@Test
		void testGetAdminPassword() {
			assertEquals("newPassword", a.getAdminPassword());
		}
		
		@Test
		void testSetAdminPassword() {
			a.setAdminPassword("newPassword");
			assertEquals("newPassword", a.getAdminPassword());
		}
	
	//LoginAdmin Test
		@Test
		void testLoginAdmin() {
			String pass = "adminpassword";
			assertFalse(a.loginAdmin(pass));
			
			pass = "newPassword";
			assertTrue(a.loginAdmin(pass));
		}
}