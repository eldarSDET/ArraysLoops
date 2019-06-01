package loops2;

import java.util.Scanner;

public class printMultipleTimes {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name=input.next();//John
		 System.out.println("how many times you want to print your name");
		 int times=input.nextInt();//5
		 
		 String result="";
		 for(int n=0; n<times; n++) {
			 //""  = ""  +JohnJohn 1
			 //John=John+John ->JohnJohn 2
			 //result =JohnJohn+John->JohnJohnJohn 3
			 
			 result=result+name;// JohnJohn
		 }
		 System.out.println(result);
	}

}
