package loops2;

import java.util.Scanner;

public class readUnread {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter READ messages: ");
		int read=input.nextInt();//5
		
		System.out.println("Please enter UNREAD messages: ");
		int unread=input.nextInt();//5
		
		while(unread>0) {
			System.out.println("User reading a message...");
			System.out.println("Unread: "+ unread);
			System.out.println("Read: "+read);
			System.out.println("----------------------------------\n");
			unread--;
			read++;
		}
		System.out.println("The number of unread messages:"+unread);
	}

}
