package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Class.User;

class UserTest {

	//user Constructor Test
		@Test
			void testUserConstructor() {
				User user = new User("a", "a", "a");
			}
	
	//userName Getter and Setter Test
		@Test
		void testGetUserName() {
			User user = new User("a", "a", "a");
			
			assertEquals("a", user.getUserName());
		}
		
		@Test
		void testSetUserName() {
			User user = new User("a", "a", "a");
			
			user.setUserName("newUserName");
			assertEquals("newUserName", user.getUserName());
		}
	
	//userPassword Getter and Setter Test
		@Test
		void testGetUserPassword() {
			User user = new User("a", "a", "a");
			
			assertEquals("a", user.getUserPassword());
		}
		
		@Test
		void testSetUserPassword() {
			User user = new User("a", "a", "a");
			
			user.setUserPassword("newPassword");
			assertEquals("newPassword", user.getUserPassword());
		}
		
	//userEmail Getter and Setter Test
		@Test
		void testGetUserEmail() {
			User user = new User("a", "a", "a");
			
			assertEquals("a", user.getUserEmail());
		}
		
		@Test
		void testSetUserEmail() {
			User user = new User("a", "a", "a");
			
			user.setUserEmail("newEmail@gmail.com");
			assertEquals("newEmail@gmail.com", user.getUserEmail());
		}
}