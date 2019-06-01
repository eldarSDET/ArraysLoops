package loops2;

import java.util.Scanner;

public class homeWorkStars {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String name;
		String answer;
		int count=0;
		String list=" ";
		do {
			System.out.println("Enter your name");
			name=input.next();
			list=list+"\n"+name;
			System.out.println("Are you the last student?");
			answer=input.next();
			count++;
			
			if(answer.equals("yes")) {
				System.out.println("Total students: "+count);
				System.out.println("List of students: "+list);
			}
				
		}while(!answer.contentEquals("yes"));
	}
}
