package loops1;

import java.util.Random;
import java.util.Scanner;

public class guessNumber {
     public static void main(String[] args) {
		
    	 Random random=new Random();
    	 int hiddenNumber=random.nextInt(10);
    	
    	 Scanner input=new Scanner(System.in);
    	 int myNumber;
    	 int attempts=0;
    	 do {
    		 
    		 System.out.println("Guess a hidden number:");
    		 myNumber=input.nextInt();
    		 if(myNumber==hiddenNumber) {
    			 System.out.println("Congratulations! You found a number.");
    		 }else if(myNumber>hiddenNumber) {
    			 System.out.println("Your number is MORE than hidden number");
    			 attempts++;
    		 }else if(myNumber<hiddenNumber) {
    			 System.out.println("Your number is LESS than hidden number");
    			 attempts++;
    		 }
    		 System.out.println("Attempt number:"+attempts);
    		 if(attempts==3) {
    			 System.out.println("You lost! Try again.");
    			 System.out.println("The hidden number was:" +hiddenNumber);
    			 break;
    		 }
    	 }while(myNumber!=hiddenNumber);
    	 
    	 
	}
}
