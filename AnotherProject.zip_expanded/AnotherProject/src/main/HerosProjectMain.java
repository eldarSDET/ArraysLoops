package main;

import java.util.Arrays;

public class HerosProjectMain {
	

    /**
     * You will need to count occurrence of every letter in a given String
     * and return another String in a format <letter><numberOfOccurrences>
     * Ex:
     * String s = "Hello";
     * you should return H1e1l2o1 which means
     * 'H' has occurred 1 time, 'e' - 1 time, 'l' - 2 times, 'o' - 1 time
     *
     * @param name
     * @return
     */
	
    public static String letterOccurrence(String name) {
    	String letter="";
    	int count[]=new int[256];
		int len=name.length();
		
		for(int i=0;i<len;i++)
			count[name.charAt(i)]++;
		
		char ch[]=new char[name.length()];
		for(int i=0; i<len; i++) {
			ch[i]=name.charAt(i);
			int find=0;
			for(int j=0; j<=i; j++) {
				if(name.charAt(i)==ch[j])
					find++;
			
		}if (find==1)
			System.out.println("Number of occurence of "+
					name.charAt(i)+ " is:"+ count[name.charAt(i)]);
		}
		 return letter;
	}
    

       
    

    /**
     * Get and return a string of fibonacci numbers sequence
     * Fibonacci numbers sequence is a sum of previous two numbers for example:
     * Fibonacci of 5 is
     * 0, 1, 1, 2, 3
     *
     * Continue concatenating to resultString value
     * int i in parameter of the method is a length of fibonacci sequence
     */
    public static String fibonaci(int i) {
        String resultString = "0,1";

        return resultString;
    }

    /**
     * Generate and return String of ONLY unique characters, basically remove duplicates
     *
     * Ex:
     * String letters = "international";
     * you must return "interaol"
     * As you have mentioned no duplicate letters in a new string
     * 
     * @param str
     * @return
     */
    public static String getUnique(String str) {
        String uniqueLetters ="";
        char letters[]=str.toCharArray();
        String notUnique="";
        int index=0;
        for(int i=0; i<str.length();i++) {
        	for(int j=i+1; j<str.length();j++) {
        		if(letters[i]==letters[j])
        			break;
        		if(j==i)
        			letters[index++]=letters[i];
        		
        			
        	}
        
        	uniqueLetters+=letters;
        		
        	
        }

        return uniqueLetters;
    }

    /**
     * Calculate and return factorial of a given integer
     * 
     * @param num
     * @return
     */
    public static long factorial(int num) {
    
        long res = 1;
        for(int i=1;i<=num; i++) {
        	res*=i;
        }



        return res;
    }

}
