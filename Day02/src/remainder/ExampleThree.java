package remainder;

public class ExampleThree {
	public static void main(String[] args) {
		
		int num1 = 12;
		int num2 = 5;
		           //12/5=2       
		           //5+5+2
		int num3 = num1 % num2;  //2
		
		System.out.println(num3);
		 
		int n1 = 25;
		int n2 = 2;
		//n1 -> the number that we divide
		//n2 -> the number that we divide with
		
		int n3 = n1 % n2;  // 25 -> 24 +25-24=1, 24 is the last number is divisible by 2
		System.out.println("n3: "+n3);
		
		int n4 = 21;
		int n5 = 3;
		int n6 = n4 % n5; //21/3=7 no remainder
		
		System.out.println("n6: "+n6);
		
		
		
		
		
	}
	

}
