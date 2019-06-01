package NestedIfStatement;

import java.util.Scanner;

public class nestedIfStatement5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Is learning Java fun?");
		String answerYes = "yes";
		String yourAnswer = scanner.next();
		
		if (yourAnswer.contentEquals(answerYes)) {
		System.out.println("Good! Way to go!");{
			System.out.println("where do you study?");
			String answer = "Techtorial";
			String input = scanner.next();
			if (input.equalsIgnoreCase(answer)) {
				System.out.println("You are in good hands!");
			}else {
				System.out.println("You'll be fine! Good luck!");
			}
				
		}
		} else {
			System.out.println("May be give it a try");
		}
		
		
		
			
	}

}
