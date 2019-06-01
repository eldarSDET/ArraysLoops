package ArrayList1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {
	/**Static method
	 * @param1 ArrayList
	 * @return ArrayList
	 * name of the method switchPairs
	 * For Example:
	 * ["one","two","abc","def",5,8]->["two","one","def","abc",8,5]
	 * 
	 */
	public static ArrayList switchPairs(List list) {
		ArrayList newList=new ArrayList();
		for(int a=0, b=1; b<list.size(); a+=2,b+=2 ) {
			newList.add(list.get(b));
			newList.add(list.get(a));
		}	
		if(list.size()%2==1) {
			newList.add(list.get(list.size()-1));
		}
		return newList;
	}
	
	public static void main (String[] args) {
		List list1=Arrays.asList("a","b","c", "d",1,5,9);
		System.out.println(switchPairs(list1));
	}
	
	
	
	
	
	

}
