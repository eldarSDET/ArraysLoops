package loops;

public class Polindrome {
	public static void main(String[] args) {
		/*Write a method that checks if a String is a Palindrome. Call your method from the main method.

		e.g., the String
		ABCBA
		is a Palindrome, where as
		Java
		is not a Palidrome. 
		Solution */
		
		String name="asiyat";
		String res="";
		for(int i=name.length()-1; i>=0;i--) {
			res+=name.charAt(i);
		}if(res==name) {
			System.out.println(res+" is a polindrom");
		}
		else {
			System.out.println("it's not");
		}
	}

}
