package MethodPractice2;

public class BankAccount {
	int balance=1000;
	String clientName="David";
	String clientLastName="Musk";
	
	public int increaseBalance(int balance) {
		 balance=1200;
		 return balance;
	}
	
	
	/*public int increaseBalance(int balance) {
		balance+=balance;
		return balance;
		
	}
	public void decreaseBalance(int number) {
		number-=200;
		System.out.println("Method takes the copy of parameter.Number inside the method "+number);
	}
	
	//public void changeName(String name) {
	//	name="Bank account";
	//	System.out.println(name);
//	}
	//public void changeLastName(BankAccount cm) {
	//	cm.clientsLastName=*/

}
