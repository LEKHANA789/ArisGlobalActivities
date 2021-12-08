package com;

class Vehicle{
	void run() {
 System.out.println("vehicle is running");
}
}
//creating a child class


public class Overriding extends Vehicle{
	void run() {
		System.out.println("Bike is running");
	}

	public static void main(String[] args) {
		//creating an instance of child class
		Overriding b=new Overriding();
		//calling an method with child class instance
		b.run();
	}
}
