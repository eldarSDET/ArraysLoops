package loops2;

public class evenAndOddNumbers {
	public static void main(String[] args) {
		//in line one print all even numbers from 0-100
		//in line two print all odd numbers from 0-100
		int num=0;
		while(num<=100) {
			if(num%2==0) {
				System.out.print(num+" ");
			}num++;
			
		}
		System.out.println();
		num=0;
		while(num<=100) {
			if(num%2==1) {
				System.out.print(num+" ");
			}num++;
		
		
}
		
	}
	

}
