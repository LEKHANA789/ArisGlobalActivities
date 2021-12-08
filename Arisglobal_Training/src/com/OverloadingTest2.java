package com;

public class OverloadingTest2 {

	void sum(int a, long b) {
		
		System.out.println("a method invoked"+(a+b));
	}
	//now ambiguity so make it as commented
/*void sum(long a,int b) {
		
		System.out.println("b method invoked");
	}*/
public static void main(String[] args) {
	OverloadingTest2 obj=new OverloadingTest2();
	obj.sum(20,20);//now ambiguity
}

}
