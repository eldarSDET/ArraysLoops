import java.util.LinkedHashSet;

public class LinkedHashSetPractice {
	
	public static void main(String[] args) {
		//it contains only unique elements;
		//we can use same methods as HashSet has;
		//it is not sychronized;
		//it follows the insertion order
		
		LinkedHashSet linkedSet=new LinkedHashSet();
		linkedSet.add(10);
		linkedSet.add(20);
		linkedSet.add(50);
		linkedSet.add(30);
		System.out.println("LinkedSet "+linkedSet);
		
		
		
		
	}

}
