package CostructorIntroduction;

public class Person {
	
	
	
    public Person(int num) {
    	
    	System.out.println("in constructor with 1 parameter");
	}
	
	public Person() {
		
	}
	public Person(int age, double size) {
		this(age);
		System.out.println("in constructor with one int and double");
		
	}
	public Person(double size) {
		System.out.println("in constructor with one double");
	}
	
	public Person(String name, int num) {
		
	}
	public Person(String text, String text2, int num, String text3,String text4, int num2) {
		System.out.println("in constructor with many variables");
	}

}
