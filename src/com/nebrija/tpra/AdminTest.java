package com.nebrija.tpra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdminTest {

	//admin Constructor Test
		@Test
		void testAdminConstructor() {
			Admin a = new Admin();
		}
	
	//adminPassword Getter and Setter Test
		@Test
		void testGetAdminPassword() {
			Admin a = new Admin();
			
			assertEquals("adminpass", a.getAdminPassword());
		}
		
		@Test
		void testSetAdminPassword() {
			Admin a = new Admin();
			
			a.setAdminPassword("newPassword");
			assertEquals("newPassword", a.getAdminPassword());
		}
}