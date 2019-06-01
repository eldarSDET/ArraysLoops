package loops2;

import java.util.Scanner;

public class Alphabet {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("please enter a letter: ");
		String letter=input.next();
		int length=letter.length();
		char l=letter.charAt(0);
		//a-> afd
		if(length>1) {
			System.out.println("This is not a letter");
		}else if(l=='a'|| l=='e' || l=='o' || l=='i' || l=='u' ||l=='A'|| l=='E' || l=='O' || l=='I' || l=='U') {
			System.out.println("the letter is vowel");
		}else {
			System.out.println("the letter is consonant");
		}
	}

}
