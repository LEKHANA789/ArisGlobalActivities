package com;

class Adder{
	static int add(int a, int b) {
		return a+b;
		
		}
		static double add(double a, double b) {
			return a+b;
		}
		static double add(double a, double b,double c) {
			return a+b+c;
		}
}
public class MethodOverloading2 {

	public static void main(String[] args) {
		System.out.println(Adder.add(2,5));
		System.out.println(Adder.add(10.5,10.5));
		System.out.println(Adder.add(10.5,10.5,2.5));
	}
	
}
