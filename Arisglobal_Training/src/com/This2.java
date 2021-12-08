package com;
//this-->current class method
class A1{
	void m1() {
		System.out.println("hello m");
	}
	void n() {
		System.out.println("hello n");
		//m1();//same as thi.m1()
		this.m1();//a1.m();
		//or we can use only m1();
	}
}
public class This2 {
	public static void main(String[] args) {
		A1 a=new A1();
		a.n();
		A1 a2=new A1();
		a2.n();
	}

	

}
