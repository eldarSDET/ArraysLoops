import java.util.Scanner;

public class testScore {
	public static void main(String[]args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the score you got from test?");
		// 100
		int score=input.nextInt();
		if (score<=100 && score >=80) {
			System.out.println("Your grade is A");
		}else if(score<80 && score >=60){
			System.out.println("Your grade is B");
		}else if(score<60 && score>=40) {
			System.out.println("Your grade is C");
			
		}else if (score<40 && score>=0) {
			System.out.println("study again");
		}else {
			System.out.println("YOUR ENTRY IS INVALID");
		}
		
	}

}
