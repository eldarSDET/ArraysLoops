package switchStatement;

import java.util.Scanner;

public class switchStatementPractice2 {
	public static void main(String[] args) {
		System.out.println("Enter your month number:");
		Scanner input=new Scanner(System.in);
		int month=input.nextInt();
		if (month>=3 && month<5) {
			System.out.println("Season: Spring\nYour drink is Caramel Machiato");
		}else if(month>=6 && month<=8) {
			System.out.println("Season: Summer\nYour drink is Iced Tea");
		}else if(month>=9 && month<=11) {
			System.out.println("Season: Fall\nYour drink is Hot Chocolate");
		}else if(month==12 || month==1 || month==2) {
			System.out.println("Season: Winter\nYour drink is Hot coffee");
		}else {
			System.out.println("Your input is INVALID");
		}
		
		
		
	}

}
