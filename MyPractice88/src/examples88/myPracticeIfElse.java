package examples88;

import java.util.Scanner;

public class myPracticeIfElse {
	public static void main(String[] args) {
		//Write code that takes the username and password from user on console 
		//check if both username and password are matching, if matching 
		//print "Welcome, username"
		//if username is correct but password is incorrect print "password  incorrect"
		//if username is incorrect but password is correct print "username incorrect"
		//else print invalid credential
		//!-negative !str.equals(str2);
		
		
		String userName= "test";
		String password= "test123";
		Scanner scanner=new Scanner(System.in);
		System.out.println("print user name");
		String userNameInput =scanner.next();
		System.out.println("print password");
		String passwordInput =scanner.next();
		
		if (userNameInput.equals(userName) && (passwordInput.equals(password))) {	
			System.out.println("Welcome "+ userNameInput);
			}
		else if (userNameInput.contentEquals(userName) &&(!passwordInput.equals(password))) {
			System.out.println("passwod is incorrect");
		}
		else if (!userNameInput.equals(userName) & (passwordInput.equals(password))) {
			System.out.println("username incorrect");
			
		}else {
			System.out.println("invalid credentials");
			
		}
		
		
		
			
				
	}

}
