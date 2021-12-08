package com;


//Single level inheritance
class Animal{
	void eat() {
		System.out.println("eating...");
	}
}
	class Dog extends Animal{
		void bark() {
			System.out.println("barking...");
		}
	}

public class InheritanceTest1 {
	public static void main(String[] args) {
		Dog d=new Dog();//object derived class
		d.bark();//derived
		d.eat();//base class
	}

	
}
