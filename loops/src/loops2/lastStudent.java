package loops2;

import java.util.Scanner;

public class lastStudent {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name=input.next();
		System.out.println("Are you the last student? ");
		String answer = input.next();
		int count=1;
		String listOfNames=name;
		
		for( ; !answer.contentEquals("yes");count++) {
			System.out.println("Please enter your name: ");
			listOfNames=listOfNames+"\n"+input.next();
			System.out.println("Are you the last student? ");
			answer=input.next();
		}
		System.out.println("Total students number: "+count);
		System.out.println(listOfNames);
				
		
	}

}
