package com;

public class Student1 {
	int id;
	String name;
	Student1 s1=new Student1();
	public Student1() {
		// TODO Auto-generated constructor stub
		id=101;
		name="Rohith";
	}
	//method to display the value of id and name
     void display()
     {
    	 System.out.println(id+" "+name);
     }
     public static void main(String[] args) {
		//creating objects
    	 Student1 s1=new Student1();
    	 Student1 s2=new Student1();
    	 //displaying the vAalues of object
    	 s1.display();
    	 s2.display();
    	 
	}
     
}
