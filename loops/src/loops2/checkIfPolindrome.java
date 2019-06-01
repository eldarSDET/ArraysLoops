package loops2;

import java.util.Scanner;

public class checkIfPolindrome {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter polindrom word: ");
		String word=input.next();
		String reversed="";
		//word=java->reversed=avaj->if(java==avaj) 4 3
		//word=level->reversed=level->if(level==level)
		
		int lastIndex=word.length()-1;
		
		for(int i=0; i<=lastIndex; lastIndex--) {
			//java ->reversed=avaj
			reversed=reversed + word.charAt(lastIndex);
			
		}
		System.out.println(reversed);
		
		if(word.equalsIgnoreCase(reversed)) {
			System.out.println("This word is polindromee!");
		}else {
			System.out.println("This word is NOT polindrome!");
		}
		
		
	}

}
