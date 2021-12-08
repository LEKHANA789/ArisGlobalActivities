package com;

/*public class Account {

	int acc_no;
	String name;
	float amount;
	//method to initialise object
	void insert(int a, String n, float amt)//832345,"Leku",1000
	{
		acc_no=a;//acnt1.acc_no=832345
		name=n;
		amount=amt;
	}
	//deposit method
	void deposit(float amt)//40000
	{
		amount=amount+amt;
		System.out.println(amt+ "deposited");
	}
	//withdraw method
	void withdraw(float amt)//150000 
	{
		if(amount<amt) {
			System.out.println("insufficient balance");
		}
		else
		{
			amount=amount-amt;//41000-150000
			System.out.println(amt+ "withdrawn");
		}
		
	}
	//method to check the balance of the account
	void checkBalance()
	{
		System.out.println("balance is: "+amount);
	}
	//method to display
	void display()
	{
		System.out.println(acc_no+ name+ amount);
	}
}*/
interface Anonymous{
	public int getValue();
	
}
public class Account{
	private int data=15;
	public static void main(String[] args) {
		Anonymous inner=new Anonymous();{
			int data=5;
			int getValue() {
				return data;
			}
			public int getData() {
				return data;
			}
		};
		Account acc=new Account();System.out.println(inner.getValue()+inner.getData()+outer.data);
	}
}
