package NestedIfStatement;

import java.util.Scanner;

public class nestedIfElse1 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What's the highest mountain peak of the US");
		
		String correctAnswer = "Denali";
		String input1 = scanner.next();
		
		if (input1.equalsIgnoreCase(correctAnswer)) {
			System.out.println("Correct!");
		}else {
			System.out.println("Three attempts left!");
			String input2 = scanner.next();
			
			if(input2.equalsIgnoreCase(correctAnswer)) {
				System.out.println("Correct!");
			}else {
				System.out.println("Wrong answer!Two attempts left ");
				String input3 = scanner.next();
				
				if(input3.equalsIgnoreCase(correctAnswer)) {
					System.out.println("Correct!");
				}else {
					System.out.println("Last attempt!");
					String input4 = scanner.next();
					
					if (input4.equalsIgnoreCase(correctAnswer)) {
						System.out.println("correct!");
					}else {
						System.out.println("Game over!");
					}
					
				}
				
				
			}
		}
		
	}

}
