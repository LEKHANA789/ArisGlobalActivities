package com;

public class Forloop {
public static void main(String[] args) {
	int sum=0;
	for(int j=1;j<=10;j++)//10 times
		{ //j=1; 4<=10
		sum=sum+j; //sum=0+1=1
		//sum=1+2=3
		//sum=3+3=6
		//sum=6+4=10
	}
	System.out.println("the sum of first 10 natural number is "+sum);

//sum of numbers between 11 to 20
for(int i=11;i<=20;i++) {
	sum=sum+i;
}
System.out.println(sum);
}
}
