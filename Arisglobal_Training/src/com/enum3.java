package com;


public class enum3 {

	public enum Seasons{Summer, Rainy,winter,Spring}
	public static void main(String[] args) {
		Seasons[] season =Seasons.values();
		for(Seasons sea :season) //for each
			switch(sea) {
			case Summer:
				System.out.println("summer");
				break;
			case Rainy:
				System.out.println("rainy");
				break;
			case winter:
				System.out.println("winter");
				break;
			case Spring:
				System.out.println("spring");
				break;
			}
			}
}
