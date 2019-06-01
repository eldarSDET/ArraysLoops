import java.util.Scanner;

public class ifElseStatement3 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number");
		int number = input.nextInt();
		if(number<10 && number>0) {
			System.out.println("This is one digit number.");
		}else if (number>=10 && number<100) {
			System.out.println("This is two digits number");
		}else if(number>=100 && number <1000) {
			System.out.println("This is three digits number");
		}else {
			System.out.println("This number is not between 0-999");
		}
	}

}
