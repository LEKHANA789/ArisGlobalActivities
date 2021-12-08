package com;

public class Student3 {

	int id;
	String name;
	
	public Student3(int id1,String name1) {
		// TODO Auto-generated constructor stub
		id=id1;
		name=name1;
	}
	//method to display the value of id and name
     void display()
     {
    	 System.out.println(id+" "+name);
     }
     public static void main(String[] args) {
		//creating objects
    	 Student3 s1=new Student3(101,"lekhana");
    	 Student3 s2=new Student3(102,"chethana");
    	 //displaying the vAalues of object
    	 s1.display();
    	 s2.display();
    	 
	}
     
}



