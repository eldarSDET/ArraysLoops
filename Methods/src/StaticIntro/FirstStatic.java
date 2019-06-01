package StaticIntro;

public class FirstStatic {
	public static String name;
	public String lastName;
		
	
	
	public void printFirstLastName() {
		System.out.println(name);
		System.out.println(lastName);
		staticPrintFirstLastName();
		
	}
	
	public static void staticPrintFirstLastName() {
		System.out.println(name);
		//System.out.println(lastName);
		FirstStatic fs=new FirstStatic();
		fs.staticPrintFirstLastName() ;
		System.out.println(fs.lastName);
	}

}
