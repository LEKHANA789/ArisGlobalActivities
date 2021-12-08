package com;

public class OverloadingTest {
//if int will made as comment the long gets executed
	/*void sum(int a, int b) {
		System.out.println("this is int executed");
		System.out.println(a+b);
	}*/
	void sum(long a, long b) {
		System.out.println("this is long int executed");
		System.out.println(a+b);
	}
	void sum(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		OverloadingTest obj=new OverloadingTest();
		obj.sum(20, 20);
		//now 2nd int literal will be  promoted to long 
		obj.sum(20,20,20);
		
	}

}
