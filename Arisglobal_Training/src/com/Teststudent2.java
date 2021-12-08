package com;

public class Teststudent2 {

	public static void main(String[] args) {
		TestStudent s1=new TestStudent();
		TestStudent s2=new TestStudent();
		s1.insertrecord(111,"karan");
		s1.displayInformation();
		s2.insertrecord(222,"sharath");
		s2.displayInformation();
	}
}
