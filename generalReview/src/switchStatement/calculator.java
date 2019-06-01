package switchStatement;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		System.out.println("Please enter number: ");
		Scanner input=new Scanner(System.in);
		int num1=input.nextInt();
		System.out.println("PLease enter the second number: ");
		int num2=input.nextInt();
		
		System.out.println("Please enter your operator");
		String operator=input.next();
		
		if (operator.equalsIgnoreCase("plus")) {
			int result=num1+num2;
			System.out.println(result);
		}else if(operator.equalsIgnoreCase("minus")) {
			int result=num1-num2;
			System.out.println(result);
		}else if(operator.equalsIgnoreCase("multiply")) {
			int result=num1*num2;
			System.out.println(result);
		}else if(operator.equalsIgnoreCase("division")) {
			double result=num1/num2;
			System.out.println(result);
		}else {
			System.out.println("You entered invalid operator.");
		}
		
	}

}
