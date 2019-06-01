package StringManipulation;

import java.util.Scanner;

public class StringMan2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name = input.next();
		
		System.out.println("Your name length is: "+name.length());
		System.out.println("Your name with capital letters: "+name.toUpperCase());
		System.out.println("What index of letter you want to find?");
		String letter = input.next();
		System.out.println("The index is: "+name.indexOf(letter));
		
		
		
		
		

		
		
	}

}
