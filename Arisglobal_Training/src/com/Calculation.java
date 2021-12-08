package com;

public class Calculation {

	void fact(int n)//method //n=5
	{
		int fact=1;
		for(int i=1;i<=n;i++)//i=1 6<=5
			{
			fact=fact*i;
			//fact=1*1=1
			//fact=2*3=6
			//fact=6*4=24
			//fact=24*5=120
			
		}
		System.out.println("factorial is "+fact);//120
	}
public static void main(String[] args) {
	
new Calculation().fact(5);//calling method with anonymous object
//4001.fact(5)
new Calculation().fact(4);
	}
	
}
