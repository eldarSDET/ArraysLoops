package switchStatement;

import java.util.Scanner;

public class homework {
	public static void main(String[] args) {
		
	
	
	/*	 Result should be HELLO WORLD trimmed and reversed.
		 * method MUST use trim()
		 * 
		 * @return
		 */
	String manyMethodsChained = new String(
			"My first Java program was simple. I typed and printed out hello world . ");
	String newString= manyMethodsChained.substring(57,69).trim();
	int length=newString.length();
	int index=length-1;
	String res="";
	
	for(int i=0; i<= index;   index--) {
		
		res=res+newString.charAt(index);
		}
	String n=res.substring(6,11).concat(" dlrow").toUpperCase();
			System.out.println(n);
}
		
	
}
		
			
		
		 
		 
		
			
	


