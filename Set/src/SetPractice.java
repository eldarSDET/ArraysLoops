import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class SetPractice {
	String name="Iterator";
	public static void main(String[] args) {
		
		//Set <String>set1=new HashSet<String>();
	//	HashSet hashset=new HashSet();
		Set set=new HashSet();
		set.add("Techtorial");
		set.add("Kushal");
		set.add("Priyanka");
		set.add("Gopal");
		set.add("Techtorial");
		//Set doesn't allow dublicate.
		//Set is not ordered.
		System.out.println(set);
		
		Set set2 =new HashSet();
		set2.add("Parvaty");
		set2.add("Kushal");//add method is checking the values are present in set or not. If the value is not present in Set
		//then it will add the value.
		set2.addAll(set);
		System.out.println("Set2 values "+set2);
		
		Iterator i=set2.iterator();
		while(i.hasNext()) {
			if(i.next().equals("Kushal")) {
				System.out.println("Kushal is present in our set ");
			}
			
		}
		
		
	}
	
	public  String getName() {
		return this.name;
	}
	

}















