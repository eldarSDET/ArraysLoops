import java.util.Scanner;

public class ifElseStatement2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Hi. Please enter your age. ");
		int age=input.nextInt();
		
		if (age>=18) {
			System.out.println("you are eligible to vote!");
		}else if(age<0) {
			System.out.println("your input is INVALID");
		}else {
			System.out.println("you are not eligible");
			
		}
	}

}
