package edu.project.foodmenu.properties;

import edu.project.foodmenu.Logo;

public class MenuLogo implements Logo{
	String logoType;
	
	public MenuLogo(String type) {
		if(type == null) {
			this.logoType= "unknown";
		}else if(type.equalsIgnoreCase("Fast-Food") || type.equalsIgnoreCase("FastFood")) {
			this.logoType = "Fast-Food";
		}else if(type.equalsIgnoreCase("Italian")) {
			this.logoType = "Italian";
		}else {
			this.logoType = "Not accepted";
		}
	}

	@Override
	public int getLogoHeight() {
		int height = 20;
		System.out.println(height);
		return height;
	}

	@Override
	public int getLogoWidth() {
		int width = 5;
		System.out.println(width);
		return width;
		
	}

	@Override
	public String logoString() {
		String output = " Restaurant";
		System.out.println(logoType + output);
		return logoType + output;
	}

	@Override
	public void drawLogo() {
		System.out.println("Drawing the menu logo:");
		for(int i =0; i < 10; i++) {
			System.out.println("|");
		}
		for(int i =0; i < 10; i++) {
			System.out.print("-");
		}
		
	}

}
