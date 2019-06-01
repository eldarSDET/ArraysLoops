package NestedIfStatement;

import java.util.Scanner;

public class ifElseStatement2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Allowed weight is <= than 150lb. Enter the weight:");
		
		int enteredWeight = scanner.nextInt();
		int weight = 150;
		
		if (enteredWeight <= weight) {
			System.out.println("Approved. Step forward, to the next line");
		} else {
			System.out.println("Sorry, this is too heavy.");
		}
		
		
	}
	

}
