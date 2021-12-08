package com;

 class Address{
	String city,state,country;
	Address(String city,String state, String country){
		this.city=city;
		this.state=state;
		this.country=country;
		
	}
	
}
 

public class Aggregation {
	int id;
	String name;
	Address address;//Address
	Aggregation(int id, String name, Address address){
		//111,"varun",address1=1000
	this.id=id;
	this.name=name;
	this.address=address;
	}
	void display() {
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
		
	}

	public static void main(String args  []) {
		Address address1=new Address("gzb","UP","India");
		Address address2=new Address("gnb","UP","India");

	
	Aggregation a1=new Aggregation(111,"varun",address1);
	Aggregation a2=new Aggregation(112,"Lekhu",address2);
	a1.display();
	a2.display();
	}

}
