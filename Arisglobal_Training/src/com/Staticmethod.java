package com;

public class Staticmethod {

	int rollno;
	String name;
	static String college="ITS";
	//Static method to change the value of static variable
	static void change() {
		college="BIET";
	}
	//constructor to initialize the variable
	Staticmethod(int r, String n)
	{
	rollno=r;
	name=n;
	}
	//method to display values
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}

}
