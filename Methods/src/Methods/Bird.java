package Methods;

public class Bird {
	
		int age=5;
		String color="red";
		String name="Kesh";
		boolean noise=true;
		int height=1;
		int legs=2;
		String kind="parrot";
		String gender="male";
		String dateOfBirth="03/05/2016";
		boolean sound=true;
		int wing=2;
		int tail=1;		
		boolean fly=true;
		
		//create method called fly and print out "Kesha is flying"
		
		
		//public,private,default
		public void fly() {
			System.out.println("Kesha is flying");
		}
		//int,long,char,boolean all other primitives and it can all object
		public int flightDistance() {
			return 1000;
			
		}
		public void flight() {
			System.out.println("1000");
		}
	
		
		public static void main(String[] args) {
			
			Bird bird=new Bird();//creating the object
			System.out.println(bird.name);
			System.out.println(bird.age);
			System.out.println(bird.legs);
			System.out.println(bird.noise);
			
			String birdName=bird.name;
			
			System.out.println(bird.fly);//bird.fly is not a method.
			//It is attributes of the class which we defined: boolean fly=true; That's why it will print"true"
			
			bird.fly();// I am only calling the method fly which I have created. This method will print 
			//Kesha is flying
			
			bird.flight();
			bird.flightDistance();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
	

}
