package switchStatement;

import java.util.Scanner;

public class switchStatementPractice {
	public static void main(String[] args) {
		System.out.println("Please enter your ice cream selection");
		System.out.println("1) Strawberry\n2) Cranberry\n3) Chocolaten\n4)Pistacho");
		Scanner scanner=new Scanner(System.in);
		
		
		String selection=scanner.next();
		selection=selection.toLowerCase();
		
		switch (selection) {
		case "strawberry": System.out.println("you selected "+selection);
		break;
		case "cranberry": System.out.println("you selected "+selection);
		break;
		case "chocolate": System.out.println("you selected "+selection);
		break;
		case "pistacho": System.out.println("you selected "+selection);
		break;
		default:
			System.out.println("Your entry is INVALID");
				
		}
		
	}

}
