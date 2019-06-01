package NestedIfStatement;

import java.util.Scanner;

public class nestedIfElseStatement3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How old are you?");
		int num = scanner.nextInt();
		if (num >= 21) {
			System.out.println("You can enter the lounge."); {
				if (num >= 40) {
					System.out.println("You can enter to VIP room"); {
						if (num >=60) {
							System.out.println("You can skip the line");
						} 
						else {
							System.out.println("You need to go to the line");
						}
						
						
					}
				}else {
					System.out.println("Vip room is only for those whose age"+ num+ ">=60");
				}
				
			}
		}else {
			System.out.println("Sorry, you are too young");
		}
		
		
		
	}

}
