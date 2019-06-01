package switchStatement;

import java.util.Scanner;

public class switchMyPractice {
	public static void main(String[] args) {
		System.out.println("Available music is Classical, Pop, Country.\n please choose");
		Scanner scanner=new Scanner(System.in);
		String music=scanner.next();
		switch(music) {
		   case "classical": System.out.println("you chose"+music);
		break;
		   case "pop": System.out.println(" ");
		}
	}
}
