package loopRecap;

import java.util.Scanner;

public class splitWord {
	public static void main(String[] args) {
		String numbers=new String();
		/**
		 * Append to a String numbers only odd numbers from 0 to 30 Ex: 1,3....
		 * @return String
		 */
		
		for(int i=0;i<=30; i++) {
			if(i%2==1) {
			}numbers+=","+i;
			
		}	System.out.println(numbers.substring(1));
	}

}/*blic static String getOddNumbers() {
	String numbers = new String();
	
	for(int i=0;  i<=30;  i++) {
		if(i%2==1) {
			numbers+=","+i;
		}
	}
	return numbers.substring(1);*/
