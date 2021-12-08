package com;

public class TestStudent {
int rollno;
String name;
	void insertrecord(int r, String n)//int r=222,string n="sharath"
	{
		//r,n--local variables
		rollno=r;
		name=n;
	}
	//s1.rollno=111 //s1.name="karan"
//s1.rollno=222 //s1.name="sharath"
void displayInformation() //s2.displayInformation()
{
	System.out.println(rollno+" "+name);
	//s1.rollno=111 //s1.name="karan"
	}//s1.rollno=222 //s1.name="sharath"
}
