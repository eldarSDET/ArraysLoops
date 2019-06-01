package MethodPractice2;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount account=new BankAccount();
		/*System.out.println(account.balance);
		account.increaseBalance(200);
		System.out.println(account.balance);
		//java primitives are pass by value that's why will not change the original value it will take the copy of value once
		//we use in method
		
	int number=300;
	account.decreaseBalance(number);//java is pass by value for primitives. It will not affect the original
	System.out.println(number);
	int addValue=1000;
	System.out.println(account.increaseBalance(addValue));
	System.out.println(addValue);
	
	
	//String name="Techtorial";
	//account.changeName(name);
	//System.out.println(name);
	

	
	}
	
	//public void changeLastName(BankAccount cm) {
	//	cm.clientsLastName=
	*/
		
		//account.increaseBalance(200);
		//System.out.println(account.increaseBalance(200));
		System.out.println(account.balance);
		System.out.println(account.increaseBalance(200));
		System.out.println(account.balance);
		
	}
	
	
	
	
	
	
	
	
	
}
