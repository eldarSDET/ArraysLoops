package NestedIfStatement;

import java.util.Scanner;

public class ifElseStatement4 {
	public static void main(String[] args) {
		String reverse = "WE WILL BE STRUGGLING A LOT. WE WON'T TELL ANYBODY A WORD";
		String word=reverse.substring(53).toLowerCase();
		int length=word.length();
		int index=length-1;
		String reversedWord="";
		for(int i=0; i<=index;  index--) {
			reversedWord=reversedWord+(word.charAt(index));		
		}
		

		System.out.println(reversedWord);
		}

}
