package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Class.Admin;

class AdminTest {
	
	//admin Constructor Test
		@Test
		void testAdminConstructor() {
			Admin a = new Admin();
		}
	
	//adminPassword Getter and Setter Test
		@Test
		void testGetAdminPassword() {
			Admin a = new Admin();
			
			assertEquals("adminpassword", a.getAdminPassword());
		}
		
		@Test
		void testSetAdminPassword() {
			Admin a = new Admin();
			
			a.setAdminPassword("newPassword");
			assertEquals("newPassword", a.getAdminPassword());
		}
}