package com.nebrija.tpra;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

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
		
	//categoryList Test
		@Test
		void testProductList() {
			List <Product> productList = new ArrayList<Product>();
			Product pr1 = new Product("Clothing", "Shirt", 9.99, 100);
			Product pr2 = new Product("Video", "Camera", 350, 50);
			Product pr3 = new Product("Videogames", "Mario Kart", 34.95, 25);
			productList.add(pr1);
			productList.add(pr2);
			productList.add(pr3);
			
			assertEquals(3, productList.size());
			assertEquals("Camera", productList.get(1).getProductName());
			assertTrue(productList.contains(pr1));
			assertFalse(productList.isEmpty());
		}
}
