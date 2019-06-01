package NestedIfStatement;

import java.util.Scanner;

public class nestedIfElseStatement4 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many continents are there?");
		int num = scanner.nextInt();
		int rightNum = 7;
		
		if (num == rightNum) {
			System.out.println("Correct! Name the biggest!");{
				String name = "Asia";
				String input = scanner.next();
				if (input.equalsIgnoreCase(name)) {
					System.out.println("Congratulations! you won $25000");
				}else { 
					System.out.println("Sorry. Asia was the right answer. you won $15000");
				}
			}
		}else { 
			System.out.println("Wrong. Answer another question. Who discovered America?");{
				String name2 = "Columbus";
				String input2 = scanner.next();{
					if (input2.equalsIgnoreCase(name2)) {
						System.out.println("Correct! You won $10000");
					}else {
						System.out.println("Sorry. Today is not your day");
					}
				} 
				
			}
		}
	}

}
