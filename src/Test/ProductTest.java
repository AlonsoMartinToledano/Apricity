package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import Class.Product;

class ProductTest {

	//product Constructor Test
		@Test
		void testProductConstructor() {
			Product pr1 = new Product("Clothing", "Shirt", 9.99, 100);
		}
	
	//productName Getter and Setter Test
		@Test
		void testGetProductName() {
			Product pr1 = new Product("Clothing", "Shirt", 9.99, 100);
			
			assertEquals("Shirt", pr1.getProductName());
		}
	
		@Test
		void testSetProductName() {
			Product pr1 = new Product("Clothing", "Shirt", 9.99, 100);
			
			pr1.setProductName("newProductName");
			assertEquals("newProductName", pr1.getProductName());
		}
	
	//productPrice Getter and Setter Test
		@Test
		void testGetProductPrice() {
			Product pr1 = new Product("Clothing", "Shirt", 9.99, 100);
			
			assertEquals(9.99, pr1.getProductPrice());
		}
		
		@Test
		void testSetProductPrice() {
			Product pr1 = new Product("Clothing", "Shirt", 9.99, 100);
			
			pr1.setProductPrice(10);
			assertEquals(10, pr1.getProductPrice());
		}
	
	//productStock Getter and Setter Test
		@Test
		void testGetProductStock() {
			Product pr1 = new Product("Clothing", "Shirt", 9.99, 100);
			
			assertEquals(100, pr1.getProductStock());
		}
		
		@Test
		void testSetProductStock() {
			Product pr1 = new Product("Clothing", "Shirt", 9.99, 100);
			
			pr1.setProductStock(150);
			assertEquals(150, pr1.getProductStock());
		}
}