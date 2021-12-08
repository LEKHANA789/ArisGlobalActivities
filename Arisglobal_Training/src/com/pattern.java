package com;

public class pattern {
	public static void main(String[] args) {
		for(int i=0;i<=2;i++) 
		{ //i=0 0<=2,1<=2
			System.out.println("value of i="+i);
			for(int j=i;j<=5;j++)//j=0 1<=5
			{
				/*if(j==4) {
					continue; //continue to next iteration
				}*/
				System.out.print(j+" "); //j=0 j=1 j=2 j=3 j=5
			}
			System.out.println();
		}
	}

	

}
