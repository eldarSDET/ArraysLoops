package NestedIfStatement;

import java.util.Scanner;

public class ifElseStatement7 {
	public static void main(String[] args) {
		System.out.println("How much is 626/4");
		Scanner scanner = new Scanner(System.in);
		
		
		double yourAnswer = scanner.nextDouble();
		double correctAnswer = 156.5;
		if (yourAnswer == correctAnswer) {
			System.out.println("Right answer!");
		}else { 
			System.out.println("Game over!");
		}
		
		
	}

}
