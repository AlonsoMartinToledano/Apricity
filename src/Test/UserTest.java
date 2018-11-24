package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Class.User;

class UserTest {

	//user Constructor Test
	@Test
		void testUserConstructor() {
			User u = new User();
		}
	
	//userEmail Getter and Setter Test
		@Test
		void testGetUserEmail() {
			User u = new User();
			
			assertEquals("adrian@gmail.com", u.getUserEmail());
		}
		
		@Test
		void testSetUserEmail() {
			User u = new User();
			
			u.setUserEmail("newEmail@gmail.com");
			assertEquals("newEmail@gmail.com", u.getUserEmail());
		}
	
	//userName Getter and Setter Test
		@Test
		void testGetUserName() {
			User u = new User();
			
			assertEquals("Adrian", u.getUserName());
		}
		
		@Test
		void testSetUserName() {
			User u = new User();
			
			u.setUserName("newUserName");
			assertEquals("newUserName", u.getUserName());
		}
	
	//userPassword Getter and Setter Test
		@Test
		void testGetUserPassword() {
			User u = new User();
			
			assertEquals("adrianpass", u.getUserPassword());
		}
		
		@Test
		void testSetUserPassword() {
			User u = new User();
			
			u.setUserPassword("newPassword");
			assertEquals("newPassword", u.getUserPassword());
		}
}
