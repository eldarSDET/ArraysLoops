import java.util.Scanner;

public class nesteIfElse {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter three numbers: ");
		int num1=input.nextInt();
		int num2=input.nextInt();
		int num3=input.nextInt();
		
		if (num1>=num2) {
			
			if(num1>=num3) {
			//num1>=num2->true, num1>=num3->true
			  System.out.println("num 1 is biggest");			  
			}else {
				//num1>=num2->true, num1>=num3->false
				System.out.println("num3 is the biggest number");
			}
		}else {
			
			
			if(num2>=num3) {
				//num1>=num2->false, num2>=num3->true
				System.out.println("num2 is the biggest number");
			}else {
				//num1>=num3->false, num2>=num3->false
				System.out.println("num3 is the biggest number");
			}
		}
	}
}
