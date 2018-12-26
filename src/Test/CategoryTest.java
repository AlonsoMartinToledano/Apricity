package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import Class.Category;

class CategoryTest {
	
	Category.Product pr1 = new Category.Product("Clothing", "Shirt", 9.99, 100);
	
	//category Constructor Test
		@Test
		void testCategoryConstructor() {
			Category.Product pr1 = new Category.Product("Clothing", "Shirt", 9.99, 100);
		}
	
	//categoryName Getter and Setter Test
		@Test
		void testGetCategoryName() {
			assertEquals("Clothing", pr1.getCategoryName());
		}
		
		@Test
		void testSetCategoryName() {
			pr1.setCategoryName("newCategoryName");
			assertEquals("newCategoryName", pr1.getCategoryName());
		}
}