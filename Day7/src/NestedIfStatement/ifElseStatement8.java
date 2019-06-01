package NestedIfStatement;

import java.util.Scanner;

public class ifElseStatement8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number more than 1000");
		int input = scanner.nextInt();
		int num = 1000;
		
		if(input >= 1000) {
			System.out.println("correct");
			
		}else {
			System.out.println("entered number is less than 1000");
		}
	}

}
