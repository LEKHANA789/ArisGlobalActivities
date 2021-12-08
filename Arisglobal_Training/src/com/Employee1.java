package com;

 class Programmers //parent class
{

	float salary=40000;
}
	class Employee1 extends Programmers //subclass
	{
		int bonus=10000;
	
		public static void main(String[] args) {
			Employee1 p1=new Employee1();
			Employee1 p2=new Employee1();
			System.out.println("programmer salary is: "+p1.salary);
			System.out.println("programmer bonus is: "+p1.bonus);
			System.out.println("programmer salary is: "+p2.salary);
			System.out.println("programmer bonus is: "+p2.bonus);
		}
	}


