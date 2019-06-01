package NestedIfStatement;

import java.util.Scanner;

public class nestedIfElse2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Who invented the electric light bulb?");
		String answer = scanner.next();
		String rightAnswer = "Edison";
		
		if (answer.contentEquals(rightAnswer)) {
			System.out.println("Correct! Another question: where was he from?");
			String answer2 = scanner.next();
			String rightAnswer2 = "America";
			if(answer2.contentEquals(rightAnswer2)) {
				System.out.println("congratulations! You won!");
			}else {
				System.out.println("game over");
			}
		}else {
			System.out.println("Sorry! Wrong answer!");
		}
		
		
    	
		
	}
}	
