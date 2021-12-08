package com;

public class OperatorExample {
	//unary operator

	public static void main(String[] args) {
		int x=10;
		System.out.println("value of x= "+x);
		System.out.println(++x);
		System.out.println(x++);
		System.out.println("value of x= "+x);
		System.out.println(--x);
		System.out.println(x--);
		System.out.println("value of x= "+x);
	
	/*System.out.println("value of x= "+x);
	System.out.println(x++);
	System.out.println(++x);
	System.out.println("value of x= "+x);
	System.out.println(x--);
	System.out.println(--x);
	System.out.println("value of x= "+x);*/
	
	int a=10;
	int b=10;
	System.out.println(a++ + ++a);
	//a=10, a++=11, ++a=12, 10+12=22
	System.out.println("value of a= "+a);
	System.out.println(b++ + b++);
	//b=10, b++=11, 10+11=21
	System.out.println("value of b= "+b);
	//Arithmetic Operators
	int p=10,q=5;
	System.out.println(p+q);//15
	System.out.println(p-q);//5
	System.out.println(p*q);//50
	System.out.println(p/q);//2
	System.out.println(p%q);//0
	System.out.println("Expression "+(10*10/5+3-1*4/2));
	
	//LOGICAL OPERATORS
	int y=10,z=5,r=20;
	
	System.out.println(y<z&&y<r);//false && true=false, logical AND
	//10<5(false)&&10<2
	//if the 1st condition is false then it'll not check next condition,
	//(compiler will not evaluate) and the result is false
	
	System.out.println(y>z&&y<r);//true&& true=true
	//here the 1st condition is true so it'll go to check next condition
	//and result is true
	
	System.out.println(y>z&&y>r);//true &&false=false
	
	System.out.println(y<z&y<r);//BITWISE AND
	//false &true=false
	//irrespective of 1st condition is true or false it'll check next condition

	//LOGICAL OR
	System.out.println(y>z||y<r);//true||true=true
	//10>5||y<c true||not evaluated=true
	//if 1st condition is true then it'll not check next condition
	//and the result is true
	System.out.println(y<z||y<r);//true ||true=true
	//10<5||10<20 false ||true=true
	System.out.println(y<z||y>r);//false||false=false
	//10<5||10>20 false||false=false
	System.out.println(y>z|y<r);
	
	System.out.println(y>z||y++<r);//true||true=true
	//10>5||y++<c
	System.out.println(y);//11 bcz 2nd condition is checked
	//TERNARY OPERATOR
	int a1=2,b1=5;
	int min=(a1<b1)?a1:b1;//2<5
	System.out.println("minimum value= "+min);
	int min1=(a1>b1)?b1:a1;//2<5
	System.out.println("minimum value= "+min1);
	int max=(a1<b1)?b1:a1;
	System.out.println("maximum value= "+max);
	int max1=(a1>b1)?a1:b1;
	System.out.println("maximum value= "+max1);
	//ASSIGNMENT OPERATOR
	int a2=10,b2=20;//assignment
	System.out.println("value of a2 is "+a2);
	System.out.println("value of b2 is "+b2);
	a2+=4;//a=a+4 (a=10+4)
	b2-=4;//b=b-4 (b=20-4)
	System.out.println("value of a2 is "+ +a2);
	System.out.println("value of b2 is "+ +b2);
	a2*=2;
	System.out.println("value of a2 is "+a2);
	a2/=2;
	System.out.println("value of a2 is "+a2);
	a2%=2;
	System.out.println("value of a2 is "+a2);
	}
}
