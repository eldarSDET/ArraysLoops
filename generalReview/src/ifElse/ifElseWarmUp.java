package ifElse;

public class ifElseWarmUp {
	public static void main(String[] args) {
		
		boolean study =true;
		if(study==true) {
			System.out.println("You can get the offer from the big companies");
			System.out.println("your fortune will be better than today"); //will be printed
			
		}
		
		int age =18;
		if(age>=18)
			System.out.println("you can get your driver licence");
		
		
		int count=10;
		
		if(8>7) //true
			count++;
		count++;
		System.out.println();
		
		int personAge=18;
		boolean examPass=false;
		boolean personTakeTheExam=true;
		if(personAge==18 & examPass==true) {
			System.out.println("the person can take the driver licence");
		}else if(personAge==18 & personTakeTheExam==true & examPass==false) {
			System.out.println("the person shoud take the exam again");
		}
		
		
		boolean toefl90=false;
		boolean toefl80=true;
		
		
	
		boolean hasVisa=true;
		boolean passSecurity=true;
		int creditScore=70;
		if(hasVisa==true) {
			System.out.println("the person is able to fly");
			if(passSecurity==true) {
				System.out.println("the person is able to enter the USA");
				if(creditScore>=70) {
					System.out.println("the person can take the credit to buy the house");
					
				}else {
					System.out.println("the person is not able to take the credit");
				
				}
				
			}
		}
			
		
		
		System.out.println(10>5?"Hello World":"Hello JAVA");
		System.out.println(10>5?"Hello World":"Hello JAVA");
			
			int count11=15;
			count11=count11>10?40:7;
			
			System.out.println(count11);
	}

}
