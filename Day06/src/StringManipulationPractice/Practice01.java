package StringManipulationPractice;

public class Practice01 {
	public static void main (String[] args) {
	String name = "Techtorial";

	System.out.println(name.substring(2,5));
	System.out.println(name.substring(name.indexOf('e')));
	System.out.println(name.indexOf('e'));
	System.out.println(name.trim().toUpperCase().substring(3));
	
	String name1 = "MyName is John Smith";
	System.out.println(name1.toUpperCase().substring(10,14));//method chaining
	System.out.println(name1.toUpperCase());
	System.out.println(name1.substring(0));
	
	
	
	
	
	
}
	
	

}
