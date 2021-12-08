package com;

public class ConstructorStudent {
//another way of copy constructor
	int id;
	String name;
	ConstructorStudent(int i,String n){
		id=i;
		name=n;
	}
	ConstructorStudent()
	{
		
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
ConstructorStudent c1=new ConstructorStudent(111,"karan");
		ConstructorStudent c2=new ConstructorStudent();	//c1=1000
		c1.display();
		c2.display();
		
	}
}
