package com.nebrija.tpra;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class CategoryTest {

	//categoryName Getter and Setter Test
		@Test
		void testGetCategoryName() {
			Product pr1 = new Product("Clothing", "Shirt", 9.99, 100);
			
			assertEquals("Clothing", pr1.getCategoryName());
		}
		
		@Test
		void testSetCategoryName() {
			Product pr2 = new Product("Video", "Camera", 350, 50);
			
			pr2.setCategoryName("newCategoryName");
			assertEquals("newCategoryName", pr2.getCategoryName());
		}
}
