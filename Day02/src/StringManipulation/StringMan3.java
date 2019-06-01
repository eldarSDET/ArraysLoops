package StringManipulation;

import java.util.Scanner;

public class StringMan3 {
	public static void main(String[] args ) {
		Scanner input=new Scanner(System.in);
		System.out.println("Hello. How are you?");
		String answer=input.next();
		
		System.out.println("how many letters your name consist?");
		int nameLength=input.nextInt();
		System.out.println("Ok. Let me check it. Can you please type your name?");
		String name=input.next();
		
		System.out.println(nameLength == name.length());
		
		
		
	}

}
