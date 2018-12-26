package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import Class.Category;

class ProductTest {
	
	Category.Product pr1 = new Category.Product("Clothing", "Shirt", 9.99, 100);

	//product Constructor Test
		@Test
		void testProductConstructor() {
			Category.Product pr1 = new Category.Product("Clothing", "Shirt", 9.99, 100);
		}
	
	//productName Getter and Setter Test
		@Test
		void testGetProductName() {
			assertEquals("Shirt", pr1.getProductName());
		}
	
		@Test
		void testSetProductName() {
			pr1.setProductName("newProductName");
			assertEquals("newProductName", pr1.getProductName());
		}
	
	//productPrice Getter and Setter Test
		@Test
		void testGetProductPrice() {
			assertEquals(9.99, pr1.getProductPrice());
		}
		
		@Test
		void testSetProductPrice() {
			pr1.setProductPrice(10);
			assertEquals(10, pr1.getProductPrice());
		}
	
	//productStock Getter and Setter Test
		@Test
		void testGetProductStock() {
			assertEquals(100, pr1.getProductStock());
		}
		
		@Test
		void testSetProductStock() {
			pr1.setProductStock(150);
			assertEquals(150, pr1.getProductStock());
		}
}