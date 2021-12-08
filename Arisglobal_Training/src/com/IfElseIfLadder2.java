package com;

public class IfElseIfLadder2 {

	public static void main(String[] args) {
		String city="Delhi";//string predefined class
		if(city=="Meerut") //Delhi=Meerut it compares with ascii values
		{
			System.out.println("city is Meerut");
		}
		else if(city=="Noida") {
			System.out.println("city is Noida");
		}
		else if(city=="Agra") {
			System.out.println("city is Agra");
		}
		else if(city=="delhi") {
			System.out.println("city is delhi");
		}
		else  {
			System.out.println("city is Delhi");
		}
	}

}
