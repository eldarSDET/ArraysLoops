package loops1;

import java.util.Scanner;

public class doWhileExm {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int n=0;
		
		do {
			System.out.println("Enter number 1");
			n=input.nextInt();
		}while(n!=1);//n=5, true, n=6, true, n=1 false
	}

}
