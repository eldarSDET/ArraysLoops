package ArrayList1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class converters {
	public static void main(String[] args) {
		String[]words= {"Hello", "Java", "Arraylist", "today"};
		List<String>wordList=Arrays.asList(words);//converting from array to List
		System.out.println(wordList);
		List<String>days=new ArrayList<>();
		days.add("monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");
		
		Object[]daysArray=days.toArray();//converting from Lit to
		
		
		List<Integer>numbers=Arrays.asList(2,5,8);
		
	}

}
