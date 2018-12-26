package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Class.User;

class UserTest {
	
	User user = new User("a", "a", "a");

	//user Constructor Test
		@Test
			void testUserConstructor() {
				User user = new User("a", "a", "a");
			}
	
	//userName Getter and Setter Test
		@Test
		void testGetUserName() {
			assertEquals("a", user.getUserName());
		}
		
		@Test
		void testSetUserName() {
			user.setUserName("newUserName");
			assertEquals("newUserName", user.getUserName());
		}
	
	//userPassword Getter and Setter Test
		@Test
		void testGetUserPassword() {
			assertEquals("a", user.getUserPassword());
		}
		
		@Test
		void testSetUserPassword() {
			user.setUserPassword("newPassword");
			assertEquals("newPassword", user.getUserPassword());
		}
		
	//userEmail Getter and Setter Test
		@Test
		void testGetUserEmail() {
			assertEquals("a", user.getUserEmail());
		}
		
		@Test
		void testSetUserEmail() {
			user.setUserEmail("newEmail@gmail.com");
			assertEquals("newEmail@gmail.com", user.getUserEmail());
		}
		
	//LoginNormalUser Test
		@Test
		void testLoginNormalUser() {
			String name = "newUserName";
			String pass = "newPassword";
			assertFalse(user.loginNormalUser(name, pass));
			
			name = "a";
			pass = "a";
			assertTrue(user.loginNormalUser(name, pass));
		}
}