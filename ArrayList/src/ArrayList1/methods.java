package ArrayList1;

import java.util.ArrayList;

public class methods {
	public static void main(String[] args) {
		
		ArrayList<String>stringList=new ArrayList<>();
		ArrayList<Integer>intList=new ArrayList<>();
		stringList.add("Java");
		stringList.add("Python");
		stringList.add("C#");
		stringList.add("JavaScript");
		intList.add(3);
		intList.add(56);
		intList.add(44);
		intList.add(22);
		
		for(int num: intList) {//Integer Wrapper Class//Integer ->int Unboxing
			if(num%2==0) {
				System.out.println(num);
			}
			
		}
		
		System.out.println(stringList);
		stringList.set(stringList.indexOf("Python"), "C++");//set->replaces old value to new value
		System.out.println(stringList);
		
		System.out.println(stringList.size());//returns number of elements in arrayList
		
		System.out.println(stringList.contains("Python"));//check if arrayList contains specific value
		stringList.clear();//removes all elements from ArrayList
		if(stringList.isEmpty()) {//isEmpty()->checks if arrayList is Empty and return boolean
			System.out.println("Empty");
		}else {
			System.out.println("Not empty");
		}
		
		
		
		
	}

}
