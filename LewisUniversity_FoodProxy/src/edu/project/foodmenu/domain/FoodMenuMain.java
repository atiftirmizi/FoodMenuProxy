package edu.project.foodmenu.domain;

import edu.project.foodmenu.Logo;
import edu.project.foodmenu.properties.MenuImage;
import edu.project.foodmenu.properties.MenuLogo;
import edu.project.foodmenu.proxy.MenuProxy;

public class FoodMenuMain {

	public FoodMenuMain(String typeOfMenu) {
		Logo menuLogo = new MenuLogo(typeOfMenu);
		MenuProxy proxy = new MenuProxy(new MenuImage(), typeOfMenu);
		proxy.getLogoHeight();
		proxy.getLogoWidth();
		proxy.logoString();
		proxy.drawLogo();
	}

	public static void main(String[] args) {
		//The Type of Menu and its' corresponding values can change based on the constructor:
		FoodMenuMain callMain = new FoodMenuMain("Fast-Food");
	}

}
