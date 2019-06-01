package MethodPractice;

public class Human {
	int eyes=2;
	int legs=2; 
	String name="David";
	String nation="USA";
	String dateOfBirth="01/01/2000";
	int age=19;
	boolean noise=true;
	boolean brain=true;
	String hairColor="brown";
	int runSpeed=10;
	int studyTime=4;
	
	//instance variables are within the class outside the method
    //instance variables will take default values, int,long ebc it is 0. for boolean is false for string is null
	
	public void run() {
		System.out.println("David is running");
		
	}
	
	
	
	
	
	
	
	
	
	public int increaseSpeed() {
		System.out.println("David is running and speed is increased with 5");
		return runSpeed+5;
	}
	public void study() {
		System.out.println("David is stydying");
	}
	public int increaseStudy() {
		System.out.println("David is studying and study time increased with 2");
		return studyTime+6;
		
	}
	public long walkSpeed(int speed) {
		return speed;
	}
	
	
	
}
