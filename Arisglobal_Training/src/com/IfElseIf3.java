package com;

public class IfElseIf3 {
public static void main(String[] args) {
	String address="Delhi, India";//address=string object
	if(address.endsWith("India")) //true
		{
		if(address.contains("Meerut")){
			System.out.println("your city is Meerut");
		}
		else if(address.contains("Noida")) {
			System.out.println("your city is Noida");
		}
		else {
			//"Delhi,India"-->[0]=delhi [1]=India
			System.out.println(address.split(",")[0] );//(,) is delimiter 
		//as soon as it finds delimiter it splits  and 
			//in space of delimiter we can split it by space,e or anything 
			//and index [0]=delhi and[1]=India
			System.out.println(address.split(" ")[1] );
	}
		}
	else
		System.out.println("you are not live in India");
}
}
	
	


