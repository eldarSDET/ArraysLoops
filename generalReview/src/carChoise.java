import java.util.Scanner;

public class carChoise {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please make a car choise: ");
		System.out.println("1)American\n2)German\n3)Japanese");
		String carChoice=input.next();
		if(carChoice.equalsIgnoreCase("American")) {
			System.out.println("you selected American car");
			System.out.println("What is your budget?");
			int budget=input.nextInt();
			if(budget>=3000) {
				System.out.println("You have enough budget");
			}else {
				System.out.println("You don't have enough budget");
			}
		}else if(carChoice.equalsIgnoreCase("German")) {
			System.out.println("you selected German car");
		}else if(carChoice.equalsIgnoreCase("Japanese")) {
			System.out.println(("you selected Japanese car"));
		}else {
			System.out.println("We don't have that type of car.");
		}
	}

}
