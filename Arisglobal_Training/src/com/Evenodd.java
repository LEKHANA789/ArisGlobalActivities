package com;

public class Evenodd {

	public static void main(String[] args) {
		int num=12;
		//check if the number is divisible by 2 or not
		if(num%2==0)
		{
			System.out.println("even number");
		}
		else
			System.out.println("odd number");
	
	int n=13;
	if(n%5==0) {
		System.out.println(n+" is a multipe of 5");
	}
	else
		System.out.println(n+"is not a multiple of 5");
	
	//using ternary opeartor
	String output=(n%2==0)?"even number":"odd number";
	System.out.println(output);
		
	}

}
