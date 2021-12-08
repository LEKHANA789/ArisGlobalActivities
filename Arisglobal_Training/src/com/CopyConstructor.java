package com;

public class CopyConstructor {
int id;
String name;
//constructor to initialize integer and string
CopyConstructor(int i, String n)
{
id=i;
name=n;
}
//constructor to initialize another object
CopyConstructor(CopyConstructor c)
		{
	id=c.id;
	name=c.name;
	}
void display()
{
	System.out.println(id+" "+name);
}
public static void main(String[] args) {
	CopyConstructor c1=new CopyConstructor(111,"karan");
//c1.id=111,c1.name="karan
	CopyConstructor c2=new CopyConstructor(c1);	//c1=1000
	c1.display();
	c2.display();
	
}
	
}
