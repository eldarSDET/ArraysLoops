package NestedIfStatement;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number");
		int numberThatYouEntered=scanner.nextInt();
		int numberToCompareWith=34;
		
		if(numberThatYouEntered == numberToCompareWith) {
			System.out.println("Congratulations from 1st "+ numberThatYouEntered+ "is a lucky number") ;
		}else {
			System.out.println("Sorry, you have more chances, try again");
			numberThatYouEntered = scanner.nextInt();
			
			if(numberThatYouEntered == numberToCompareWith) {
				System.out.println("congratulations from 2nd"+ numberThatYouEntered+"is correct");
			}else {
				System.out.println("Sorry try again!!!");
				numberThatYouEntered = scanner.nextInt();
				
				if(numberThatYouEntered == numberToCompareWith) {
					System.out.println("congratulations from3 ,you got it");	
				}else {
					System.out.println("try again");
					
					numberThatYouEntered = scanner.nextInt();
					
					if(numberThatYouEntered == numberToCompareWith) {
						System.out.println("Congratulations from4th");
					}else {System.out.println("try again");
					      numberThatYouEntered = scanner.nextInt();
					      if(numberThatYouEntered == numberToCompareWith) {
					    	  System.out.println("congrats from 5th");  
					      }else {
					    	  System.out.println("Sorry, no more chances");
					    	  
					      }
					
					
					
					}
					
					
				}
			}
			
			
			
		}
		
		
		
	}
	

}
