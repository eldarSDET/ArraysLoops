package MethodPractice;

public class Numbers {
	boolean canAttend=false;
	
	
public void checkAge(int age) {
		if(age>=18) {
			System.out.println("the person can attend the organization");
		}else if(age<18) {
			System.out.println("the person can not attend the organization");
		}
	}
	public void checkName(String name) {
		if(name.charAt(0)=='M') {
			System.out.println("accept the person for the class");
		}else {
			System.out.println("not accepted");
		}
		}
	
	
	
		public void canAttend(String name, int age) {
			if(name.startsWith("T")&&age>=18) {
				System.out.println("the person can attend the organization because name is starting with T"
						+ " and age is bigger 18");
			}else if(name.startsWith("T")&&age<18) {
				System.out.println("the person can not attend the organization. Name is starting with T but age is less than"
						+ " 18");
			}else if(!name.startsWith("T")&&age<18) {
				System.out.println("the person can not attend organization because name is not starting with T and age is"
						+ " less 18");
			}
		}			
		public void printNumber(int[]number) {
			for(int i=0; i<number.length;i++) {
				System.out.print(number[i]+",");
									
			}
	}
		
		public void checkString(String[]word) {
			for(int i=0;i<word.length;i++) {
				if(word[i].startsWith("P")) {
					System.out.println(word[i]);
				}
		}
			
		}
		public void increaseNumber(int num) {
			int addNumber=5;
			//num and addNumber are local variables
			//local variable we can not access outside of the method
			//local variable we should initialize
			//local variable will not take default value
			num+=addNumber;
			System.out.println(num);
		}
		
		
		public boolean canAttendBoolean(int age) {
			if(age>=18) {
				 canAttend = true;
			}else if (age<18) {
				canAttend=false;
			}
			return canAttend;
		}
			
			public void checkName2 (String name2) {
				if (name2.startsWith("m")) {
					System.out.println("You are accepted");
				
			}
	//}
     
      }

		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}
