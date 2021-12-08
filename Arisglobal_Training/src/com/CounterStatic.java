package com;
//Count how many objects are created
public class CounterStatic {
//test class to show the values of object
	static int count=0;
	//will get memory each time when the instance is created
	CounterStatic()
	{
		count++;//count=1, count=2, count=3
		System.out.println(count);//count1,count2,count3
	}
	public static void main(String[] args) {
		
		//ceating objects
		CounterStatic c1=new CounterStatic();//c1.count=0//memory location
		CounterStatic c2=new CounterStatic();//c2.count=0
		
		CounterStatic c3=new CounterStatic();
	}
}
