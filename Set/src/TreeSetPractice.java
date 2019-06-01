import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetPractice {
	public static void main(String[] args) {
		Set treeset=new TreeSet();
		treeset.add("A");
		treeset.add("C");
		treeset.add("K");
		treeset.add("D");
		System.out.println(treeset);
		
		TreeSet number=new TreeSet();
		number.add(30);
		number.add(50);
		number.add(10);
		number.add(222);
		System.out.println(number);
		System.out.println(number.pollFirst());//take the first element and removes the first
		//for hashset we dont have that method 
		System.out.println(number.pollLast());//take the last element and removes the last element
		System.out.println(number);
		System.out.println(number.descendingSet());
		
		Iterator i=number.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		/**create one phone class
		 * create 3 arg constructor(Name,Model,Price);
		 * create 5 different object using thid constructor(3 of them
		 * create one LinkedHashSet
		 * store all the objects to the linkedHashSet
		 * using foreach loop print out all the phone names and models
		 * which price is less than 1000
		 * 
		 */
		
		
		
	}

}
