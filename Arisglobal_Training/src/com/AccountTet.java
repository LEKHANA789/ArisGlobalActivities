package com;

public class AccountTet {

	public static void main(String[] args) {
		Account ac1=new Account();
		ac1.insert(832345, "lekhu", 1000);
		ac1.display();
		ac1.checkBalance();
		ac1.deposit(40000);
		ac1.checkBalance();
		ac1.withdraw(15000);
	    ac1.checkBalance();
	}
	

}
