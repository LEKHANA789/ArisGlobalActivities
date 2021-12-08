package com;

public class This {
	public static void main(String[] args) {
		TestThis t1=new TestThis(111,"ankit",5000f);
		TestThis t2=new TestThis(222,"sumit",6000f);
		t1.display();
		t2.display();
	}

	
	}
 class TestThis{
		int rollno;
		String name;
		float fee;
		TestThis(int rollno, String name, float fee)//local variable
		{
			this.rollno=rollno;
			this.name=name;
			this.fee=fee;
		}
			void display() {
				System.out.println(this.rollno+" "+this.name+" "+this.fee);
			}
}
