package com;

class A //parent
{
	void msg() {
		System.out.println("hello");
	}
}
class B//parent
{
	void msg() {
		System.out.println("welcome");
	}
}
public class InheritanceTest4 extends A{
	//suppose it were
	public static void main(String[] args) {
		InheritanceTest4 obj=new InheritanceTest4();
		obj.msg();//now which msg() method would be invoked?
	}

	

}
