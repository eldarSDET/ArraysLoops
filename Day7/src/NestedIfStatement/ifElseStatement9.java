package NestedIfStatement;

import java.util.Scanner;

public class ifElseStatement9 {
	public static void main(String[] args) {
		System.out.println("What is the capital of Netherlands?");
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.next();
		String answer = "Amsterdam";
		
		if (input.equalsIgnoreCase(answer)) {
			System.out.println("Correct");
		} else {
			System.out.println("Game over");
		}
		
		
		
	}

}
