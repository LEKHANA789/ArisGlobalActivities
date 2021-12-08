package com;

public class Ifloop {
public static void main(String[] args) {
	int x=10;
	int y=12;
	if(x+y< 20)//true
	{
		System.out.println("x+y is lesser than 20");
	}
	if(x+y>20)//true
	{
		System.out.println("x+y is greater than 20");
	}
	if((x+y)==20)//22==20
	{
		System.out.println("x+y is equal to 20");
	}
	if((x+y)==22)//true
	{
		System.out.println("x+y is equal to 22");
	}
	if((x+y)!=20)//22!=20
	{
		System.out.println("x+y is not equal to 20");
	}
	if(x+y>=20)//true
	{
		System.out.println("x+y is greater than or equal to 20");
	}
	if(x+y>=22)//true
	{
		System.out.println("x+y is greater than or equal to 22");
	}

}
}
