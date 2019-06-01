package NestedIfStatement;

import java.util.Scanner;

public class ifElseStatement3 {
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What's the biggest country in the world?");
		String nameOfTheCountry = scanner.next();
		String rightAnswer = "Russia";
		
		if (nameOfTheCountry.contentEquals(rightAnswer)) {
			System.out.println("You've got the right answer!");
		} else {
			System.out.println("Game over.");
		}
		
		
		
	}
	

}
