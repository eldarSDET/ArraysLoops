import java.util.Scanner;

public class accountBalance {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your balance: ");
		int balance=input.nextInt();//100
		
		while(balance>0) {
			
			System.out.println("Please enter your transaction: ");
			int transaction=input.nextInt(); //20
			balance=balance-transaction;
			if(transaction>balance) {
				System.out.println("Hey, you trying to be sneaky!");
				continue;//continue -skipping the rest of the code
			}
			balance=balance-transaction;
			System.out.println("your current balance is:"+ balance);
		}
		System.out.println("You are out of balance");
	}

}
