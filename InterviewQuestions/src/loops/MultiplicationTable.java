package loops;

public class MultiplicationTable {
	public static void main(String[] args) {
		/*Write a method that prints the multiplication table of the user provided number. Call your 
		 * method from the main method.

		e.g., If the user enters the value of
		9
		should become, the program prints 
						9
						18
						27
						36
						...
						...
						81
						90*/
		int num=9;
		for(int i=0; i<=10;i++) {
				System.out.println(num+"*"+i +"="+num*i);
				
			}
		
		
	}

}
