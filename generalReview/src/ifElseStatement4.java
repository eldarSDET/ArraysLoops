import java.util.Scanner;

public class ifElseStatement4 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter num: ");
		int num=input.nextInt();
		
		if(num%2==0) {
			System.out.println("Even number");
		}else if (num%2==1) {
			System.out.println("Odd number");
		}
	}

}
