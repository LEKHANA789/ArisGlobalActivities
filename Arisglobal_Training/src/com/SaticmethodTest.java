package com;

public class SaticmethodTest {

	public static void main(String[] args) {
		System.out.println("college name before"+Staticmethod.college);
		Staticmethod.change();//calling cahnge method
		//creating objects
		Staticmethod s1=new Staticmethod(111,"karan");
		Staticmethod s2=new Staticmethod(111,"karan");
		Staticmethod s3=new Staticmethod(111,"karan");
		//calling display method
		s1.display();
		System.out.println(s1.rollno+" "+s1.name+" "+s1.college);
		s2.display();
		s3.display();
	}
}
