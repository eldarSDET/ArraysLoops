package ExceptionsExample;

public class ExceptionWrapping {
	public static void main(String[] args) {
		int num=4; 
		try {
			System.out.println(num/0);
		}catch(ArithmeticException ex) {
			System.out.println("Sorry, go back to study 3rd grade math");
			
		}
	}

}
