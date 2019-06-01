package ArrayList1;

import java.util.ArrayList;

public class ArrayListMethods {
	public static void main(String[] args) {
		ArrayList<String>phoneParts=new ArrayList<>();
		phoneParts.add("Charger");
		phoneParts.add("battery");
		phoneParts.add("Screen");
		phoneParts.add("Headphones");
		phoneParts.add("microphone");
		
		System.out.println(phoneParts);
		phoneParts.remove("Charger");
		System.out.println(phoneParts);
		phoneParts.remove(0);
		System.out.println(phoneParts);
		phoneParts.set(0, "camera");//set method is used to replace one element to another
		System.out.println(phoneParts);
		
		
		ArrayList<Integer>numbers=new ArrayList<>();
		numbers.add(12);
		numbers.add(56);
		numbers.add(2);
		numbers.add(5);
		
		System.out.println(numbers);
		
		
	}

}
