package com;

public class Student2 {

	public static void main(String[] args) {
		//creating object
		Student s1=new Student();//s1-reference variable holding an object of type student
		//s1=9bytesof memory
		//1001-1009
		//s1=1001 s1.id=1001 to 1004 s1.name=1005 to 1009
		Student s2=new Student();
		//s2-reference variable holding an object of type student
				//s2=8bytesof memory
				//2001-2009
				//initializing objects
		
		s1.id=101;
		s1.name="lekhu";
		s2.id=201;
		s2.name="sharu";
		//printing data
		System.out.println(s1.id+" "+s1.name);
		System.out.println(s2.id+" "+s2.name);
		
	}
}
