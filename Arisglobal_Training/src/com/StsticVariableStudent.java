package com;

public class StsticVariableStudent {

	int rollno;
	String name;// instance variable
	static  String college="BIET";//static variable
	//constructor
	StsticVariableStudent(int r, String n){
		rollno=r;
       name=n;
	}
	//method to display the values
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}

}
