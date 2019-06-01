package methodsRecap2;

public class recap {
	public static void main(String[] args) {
		String animal=new String ("Monkey");
		String animal2=new String ("Monkey");
		
		System.out.println(animal==animal2); //comparing the references
		System.out.println(animal.equals(animal2));//comparing values, and data types
		
		String fruits="apple";
		String fruits1="apples";
		System.out.println(fruits==fruits);
		System.out.println(fruits.equals(fruits1));
		
	}

}
