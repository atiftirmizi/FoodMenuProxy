package edu.project.foodmenu.proxy;

import edu.project.foodmenu.Logo;
import edu.project.foodmenu.properties.MenuImage;
import edu.project.foodmenu.properties.MenuLogo;

public class MenuProxy implements Logo{
	MenuLogo menuLogo;
	MenuImage menuImage;
	
	public MenuProxy(MenuImage menuImage, String typeOfMenu) {
		this.menuImage = menuImage;
		this.menuLogo = new MenuLogo(typeOfMenu);
	}

	@Override
	public int getLogoHeight() {
		if(menuLogo !=null) {
			return menuLogo.getLogoHeight();
		}
		return 0;
	}

	@Override
	public int getLogoWidth() {
		if(menuLogo !=null) {
			return menuLogo.getLogoWidth();
		}
		return 0;
	}

	@Override
	public String logoString() {
		if(menuLogo !=null) {
			return menuLogo.logoString();
		}
		return null;
	}

	@Override
	public void drawLogo() {
		if(menuLogo !=null) {
			menuLogo.drawLogo();
		}
		
	}

}
