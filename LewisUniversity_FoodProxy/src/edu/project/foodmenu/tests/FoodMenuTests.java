package edu.project.foodmenu.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.project.foodmenu.Logo;
import edu.project.foodmenu.domain.FoodMenuMain;
import edu.project.foodmenu.properties.MenuImage;
import edu.project.foodmenu.properties.MenuLogo;
import edu.project.foodmenu.proxy.MenuProxy;

class FoodMenuTests {
	static FoodMenuMain callMain;
	static String typeOfMenu = null;
	Logo menuLogo;
	MenuProxy proxy;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		typeOfMenu = "Italian";
		callMain = new FoodMenuMain(typeOfMenu);
	}	

	@BeforeEach
	void setUp() throws Exception {
		menuLogo = new MenuLogo(typeOfMenu);
		proxy = new MenuProxy(new MenuImage(), typeOfMenu);
	}

	//Testing the height of menu:
	@Test
	void testHeight() {
		assertEquals(20,proxy.getLogoHeight());
	}
	//Testing the width of menu:
	@Test
	void testWidth() {
		assertEquals(5,proxy.getLogoWidth());
	}
	//Testing the Type of menu:
	@Test
	void testStr() {
		assertEquals("Italian Restaurant",proxy.logoString());
	}
	
	//Testing the Type of Menu by changing the menu logo constructor at runtime: 
	@Test
	void testStrModified() {
		typeOfMenu = "Fast-Food";
		menuLogo = new MenuLogo(typeOfMenu);
		proxy = new MenuProxy(new MenuImage(), typeOfMenu);
		assertEquals("Fast-Food Restaurant",proxy.logoString());
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		callMain = null;
	}

}
