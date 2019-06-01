import java.util.Scanner;

public class ternaryOperator {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter two numbers");
		
		int firstNum=input.nextInt();
		int secondNum=input.nextInt();
		              //true             ?   this is executed      : this is skipped    
                       //false           ?   this is skipped       : this is executed
		String result=firstNum>secondNum ? "First number is bigger": "Second number is bigger";
		System.out.println(result);
		
	}

}
