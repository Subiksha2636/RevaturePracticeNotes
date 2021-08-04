//4.	Create a class Account with the attributes accountNo – int, accountType – String, 
//accountBalance – int and methods setAccountDetails() which set the values to these 
//attributes, withdraw() which subtracts 1000 from the available balance, deposit() 
//which adds 1000 to the available balance and dispAccountDetails() which displays 
//, accountType,accountBalance. Create a class Main1 which contains main() method to test 
//the functionality of Account class.

package com.subis.revature;

public class Account {
	int accountno;
	String accountType;
	int  accountBalance;
	int  remainingBalane;
	int Deposite;
	
	void Display(){
		System.out.println(" accountno  accountType   accounctBalance  remainingAmount  Deposit");
		
	}
	void setAccountDetails(int accountno,String accounttype,int accountBalance){
		this.accountno=accountno;
		this.accountType=accounttype;
		this.accountBalance=accountBalance;
		
		
	}
	void withdraw(){
		remainingBalane=accountBalance-1000;
		System.out.println("remaining balance  "+remainingBalane);
	}
	void deposit(){
		Deposite= remainingBalane+2000;
		System.out.println("deposit "+Deposite);
	}
	void Display1(){
		System.out.println( accountno + "\t"  +  accountType  + "\t" + accountBalance  + "\t" +remainingBalane + "\t" + Deposite);
	}

	public static void main(String[] args) {
		Account a =new Account();
		a.setAccountDetails(1,"Subi",10000);
		a.Display();
		a.withdraw();
		a.deposit();
		a.Display1();
		
		Account a1 = new Account();
		

	}

}
