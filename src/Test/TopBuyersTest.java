package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Class.User;
import Class.User.TopBuyers;

class TopBuyersTest {
	
	User user = new User("a", "a", "a");
	User topBuyer;

	//getTopBuyers Test
		@Test
		void testGetTopBuyers() {
			assertNotNull(User.TopBuyers.getTopBuyers());
		}
		
	//TopBuyer Getter and Setter Test
		@Test
		void testGetTopBuyer() {
			assertEquals(null, User.TopBuyers.getTopBuyer());
		}
		
		@Test
		void testSetTopBuyer() {
			User.TopBuyers.setTopBuyer(user);
			assertEquals(null, User.TopBuyers.getTopBuyer());
		}
}
