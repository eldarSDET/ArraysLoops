package loops;

public class ReplaceVowels {
	public static void main(String[] args) {
		/*Write a method that uses a while loop. This method would replace every vowel in the String with X. 
		Call your method from the main method.

		e.g., the String
		Java is Fun
		should become 
		JXvX Xs FXn*/
		String replace;
		int i=0;
		String sentence ="Java is Fun";
		while(i<sentence.length()){
			if((sentence.charAt(i)=='a')||(sentence.charAt(i)=='i')||(sentence.charAt(i)=='u')) {
				replace=sentence.replace(i, X);
			}
			
		}
	}

}
