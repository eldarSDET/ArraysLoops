package NestedIfStatement;

import java.util.Scanner;

public class ifElseStatement5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Print any word ends with 't', ");
		
		String answer = "t";
		String guess = scanner.next();
		
		if (guess.endsWith(answer)) {
			System.out.println("Correct!");
		}else {
			System.out.println("Wrong!");
		}

		
		
		
	}

}
