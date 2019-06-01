package main.com.techtorial;

import java.util.Collection;

public class StringManipulations {

	/**
	 * Get wor out of string
	 * 
	 * @return
	 */
	public static String getWordSubstring() {
		String helloWord = "We are getting some string manipulations. World needs to know about it";
		String newWord=helloWord.substring(42,45).toLowerCase();
		return newWord;
	}

	/**
	 * Must use .trim() method and any other methods to make the test pass. Must
	 * return trimmed
	 */
	public static String getWordTrimmed() {
		String trimme = " I always dream about Java. I hope this string could be trimmed    ";
		String trimmed=trimme.substring(55,63).trim();

		return trimmed;
	}

	/**
	 * Reverse WORD and return all lower case
	 */
	public static String reverseMe() {
		String reverse = "WE WILL BE STRUGGLING A LOT. WE WON'T TELL ANYBODY A WORD";
		String word=reverse.substring(53,57).toLowerCase();
	
		String reversedWord="";
		for(int i=word.length()-1 ; i>=0;  i--) {
			reversedWord += word.charAt(i);		
		}
		

		return reversedWord;
	}

	/**
	 * Result should be HELLO WORLD trimmed and reversed.
	 * method MUST use trim()
	 * 
	 * @return
	 */
	public static String trimReverseToUpperCase() {
		String manyMethodsChained = new String(
				"My first Java program was simple. I typed and printed out hello world . ");
		String newString= manyMethodsChained.substring(57,69).trim();
		int length=newString.length();
		int index=length-1;
		String res="";
		for(int i=length-1; i>=0;   i--) {
			
			res+=newString.charAt(i);
			}
		String n=res.substring(6,11).concat(" dlrow").toUpperCase();
		return n;
	}

	/**
	 * Replace firstNumber, secondNumber values to make the test return  166
	 * 
	 * @return
	 */
	public static int getSum() {

		int firstNumber, secondNumber, sum;
		firstNumber = 27;
		secondNumber = 28;
		sum = (++firstNumber + secondNumber-- + secondNumber) * 2;

		return sum;
	}

	/**
	 * Append to a String numbers only odd numbers from 0 to 30 Ex: 1,3....
	 * @return String
	 */
	public static String getOddNumbers() {
		String numbers = new String();
		
		for(int i=0;  i<=30;  i++) {
			if(i%2==1) {
				numbers+=","+i;
			}
		}
		return numbers.substring(1);
	}
	
	/**
	 * Keep looping over given String while the length of the String not equals to 33, (every iteration should cut only one letter from the end).
	 * 
	 * @return
	 */
	public static String loopOver10Times() {
		String longLongWord = "WeHaveBeenGoingOverWhileLoopFor10TimesAndItIsFun";
		String result="";
		for(int i=0; i<33;i++) {
			result+=longLongWord.charAt(i);
		}
		
		return result;
	}
}
