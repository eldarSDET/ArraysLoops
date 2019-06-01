package loops2;

import java.util.Scanner;

public class largestNumber {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("How many numbers you want to input?");
		int number=input.nextInt();
		System.out.println("Please enter "+number+" positive number:");
		int largestNumber=-1;
		
		for(int i=0; i<number; i++) {
			int currentNumber=input.nextInt();
			if(currentNumber>largestNumber) {
				largestNumber=currentNumber;
			}
		}
		System.out.println("The largest number is: "+largestNumber);
				
		
	}

}
