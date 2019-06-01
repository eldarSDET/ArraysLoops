package StringManipulation;

public class StringMan1 {
	
	public static void main (String[] args) {
		
		String greetings="Hello world";
		System.out.println(greetings.toUpperCase());
		System.out.println(greetings.toLowerCase());
		System.out.println(greetings.length());
		System.out.println(greetings.charAt(0));
		System.out.println(greetings.charAt(10));
		System.out.println("."+greetings.charAt(5)+".");
		System.out.println(greetings.indexOf('H'));
		System.out.println("-----------------------");
		System.out.println(greetings.indexOf('l'));
		System.out.println(greetings.indexOf('l', 5));
		// Hello world
		// 012345678910
		
		
		
		
		
	}

}
