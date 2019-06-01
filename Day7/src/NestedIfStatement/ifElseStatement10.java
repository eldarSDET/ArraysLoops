package NestedIfStatement;

import java.util.Scanner;

public class ifElseStatement10 {
	public static void main(String[] args ) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Type a word ends with 'k'! ");
		
		String input = scanner.next();
		String wordEndsWithK= "k";
		
		if (input.endsWith(wordEndsWithK)) {
			System.out.println("Correct");
			
		}else {
			System.out.println("Wrong answer!");
		}
		
	}

}
