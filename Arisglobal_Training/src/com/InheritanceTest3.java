package com;

public class InheritanceTest3 {
public static void main(String[] args) {
	Cat c=new Cat();
	c.meow();
	c.eat();
	
	Dog2 d=new Dog2();//singlelevel
	d.bark();
	d.eat();
	
}
}

	class Animal2{
		void eat() {
			System.out.println("eating...");
		}
	}
		class Dog2 extends Animal2{
			void bark() {
				System.out.println("barking...");
			}
		}
		class Cat extends Animal1{
			void meow() {
				System.out.println("meowing...");
			}
		}
