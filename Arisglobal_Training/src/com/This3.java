package com;
//Constructor chaining
//this-->It is used to reuse the constructor
class A2{
	A2(){
		System.out.println("hello a");
	}
	A2(int x){
		this();//calls the default constructor
		System.out.println(x);
	}
	A2(int x,int y){
		this(20);//calls the default constructor
		System.out.println(x+" "+y);
	}
}
public class This3 {

	public static void main(String[] args) {
		//A2 a=new A2(10);
		//A2 b=new A2(20);
		A2 c=new A2(30,40);
	}

}
