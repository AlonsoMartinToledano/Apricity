package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import Class.Category;

class CategoryTest {

	//category Constructor Test
		@Test
		void testCategoryConstructor() {
			Category cat1 = new Category("Clothing");
		}
	
	//categoryName Getter and Setter Test
		@Test
		void testGetCategoryName() {
			Category cat1 = new Category("Clothing");
			
			assertEquals("Clothing", cat1.getCategoryName());
		}
		
		@Test
		void testSetCategoryName() {
			Category cat1 = new Category("Clothing");
			
			cat1.setCategoryName("newCategoryName");
			assertEquals("newCategoryName", cat1.getCategoryName());
		}
	
	//categoryList Test
		@Test
		void testCategoryList() {
			List <Category> categoryList = new ArrayList<Category>();
			Category cat1 = new Category("Clothing");
			Category cat2 = new Category("Video");
			Category cat3 = new Category("Videogames");
			categoryList.add(cat1);
			categoryList.add(cat2);
			categoryList.add(cat3);
			
			assertEquals(3, categoryList.size());
			assertEquals("Video", categoryList.get(1).getCategoryName());
			assertTrue(categoryList.contains(cat1));
			assertFalse(categoryList.isEmpty());
		}
}
