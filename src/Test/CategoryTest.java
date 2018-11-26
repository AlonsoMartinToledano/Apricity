package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import Class.Category;
import Class.Product;

class CategoryTest {
	
	//category Constructor Test
		@Test
		void testCategoryConstructor() {
			Product pr1 = new Product("Clothing", "Shirt", 9.99, 100);
		}
	
	//categoryName Getter and Setter Test
		@Test
		void testGetCategoryName() {
			Product pr1 = new Product("Clothing", "Shirt", 9.99, 100);
			
			assertEquals("Clothing", pr1.getCategoryName());
		}
		
		@Test
		void testSetCategoryName() {
			Product pr1 = new Product("Clothing", "Shirt", 9.99, 100);
			
			pr1.setCategoryName("newCategoryName");
			assertEquals("newCategoryName", pr1.getCategoryName());
		}
}