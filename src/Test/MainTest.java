package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {
	
	//variables Test
		@Test
		void testVariables() {
			String userName = "a";
			String userPassword = "a";
			String userPassword2 = "a";
			String userEmail = "a";
			int option = 0;
			boolean equals = false;
			
			assertEquals("a", userName);
			assertEquals("a", userPassword);
			assertEquals("a", userPassword2);
			assertEquals("a", userEmail);
			assertEquals(0, option);
			assertFalse(equals);
		}
}
