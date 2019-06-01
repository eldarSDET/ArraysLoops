package MethodPractice2;

public class Bank {
	int balance=1000;
	String clientName="David";
	String clientLastName="Musk";
	
	public int increaseBal(int invest) {
		balance+=invest;
		return balance;
	}
	

	
	
	
	
	
public static void main(String[] args) {
	Bank myBank=new Bank();
	//myBank.increaseBal(300);
	System.out.println(myBank.increaseBal(300));
}
}



