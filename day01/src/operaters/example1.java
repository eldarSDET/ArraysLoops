package operaters;

public class example1 {
	public static void main(String[] args) {
		
		int num1=78;
		int num2=8;
		     //78-(8-1) = 71
		int num3=num1- --num2;
		         //71   +71 ((71+1)-1) = 142
		int num4=num3++ + --num3;
		System.out.println(num4);
	}

}
