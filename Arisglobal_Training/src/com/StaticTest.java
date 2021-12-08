package com;

public class StaticTest {

	public static void main(String[] args) {
		System.out.println(StsticVariableStudent.college);
		StsticVariableStudent s1=new StsticVariableStudent(111,"karan");
		StsticVariableStudent s2=new StsticVariableStudent(222, "aryan");
		//we can change the college of all objects by the single line of code 
		//StsticVariableStudent.college="BIET";
		s1.display();
		s2.display();
	}
}
