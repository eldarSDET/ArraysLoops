package StringManipulation;

import java.util.Scanner;

public class StringMan4 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name = input.next();
		
		System.out.println("Your name characters: ");
		
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(1));
		System.out.println(name.charAt(2));
		System.out.println(name.charAt(3));
		
		
		
	}

}
