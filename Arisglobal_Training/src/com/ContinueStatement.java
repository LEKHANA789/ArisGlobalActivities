package com;

public class ContinueStatement {

	public static void main(String[] args) {
		for(int i=0;i<=2;i++) 
		{ //i=0 0<=2,1<=2
			
			for(int j=i;j<=5;j++)//j=0 1<=5
			{
				if(j==4) {
					continue; //continue to next iteration
				}
				System.out.println(j); //j=0 j=1 j=2 j=3 j=5
			}
		}
	}
}
