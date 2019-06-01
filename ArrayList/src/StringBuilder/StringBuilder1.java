package StringBuilder;

public class StringBuilder1 {
	public static void main(String[] args) {
		StringBuilder fruit=new StringBuilder();
		fruit.append("apple");
		fruit.append("orange");
		System.out.println(fruit);
		fruit.reverse();
		
		StringBuilder email=new StringBuilder();
		email.append("Dear John");
		email.append("\n Writing regarding my vacation.");
		//email.append("\nI am planning vacation between5/25 and 5/30");
		//email.append("can you please approve my vacation");
		email.append("\n\nRegards");
		email.append("\nMichael");
		System.out.println(email.hashCode());
		
		String word="Java"+" "+"Programming"+" "+"language";
		System.out.println("Java".hashCode());
		System.out.println("Programming".hashCode());
		System.out.println(" ".hashCode());
		System.out.println("language".hashCode());
		System.out.println(word.hashCode());
		
		
		
		String fruit2=new String();
		fruit2=fruit2.concat("banana");
		System.out.println(fruit2);
		
		
		StringBuilder word3=new StringBuilder();
		word3.append("apple");
		word3.reverse();
		System.out.println(word3);
		
		if(word3.toString().equals(word3.reverse().toString())) {
			System.out.println("It is Polindrome!");
			
		}else {
			System.out.println("It is not Polindrome!");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

	
	

}
