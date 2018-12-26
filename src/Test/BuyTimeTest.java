package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.security.SecureRandom;

import org.junit.jupiter.api.Test;

import Class.Category.Product.BuyTime;

class BuyTimeTest {

	private static SecureRandom randomTime = new SecureRandom();
	private int sleepTime;
	BuyTime a = new BuyTime();
	
	//BuyTime Constructor Test
		@Test
		void testBuyTimeConstructor() {
			BuyTime a = new BuyTime();
		}
		
	//BuyTime Constructor Test
		@Test
		void testRandomTime() {
			assertTrue(sleepTime<5001);
			assertTrue(sleepTime>-1);
		}
		
	//run Test
		@Test
		void testRun() throws InterruptedException {
			Thread.sleep(sleepTime);
			
			assertNotNull(Thread.currentThread());
			assertFalse(Thread.interrupted());
			
			Thread.currentThread().interrupt();
			assertTrue(Thread.interrupted());
		}
}
