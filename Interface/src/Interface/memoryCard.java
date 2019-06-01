package Interface;

public interface memoryCard {
	int MEMORY = 10; // by default its public static final
	int SIZE = 8;

	public static void staticMethod() {
		System.out.println("Interface static method.");

	}
	void download();//public abstract by default
	               //in interface all the methods are PUBLIC abstract by default
	Number getFiles();//public abstract Number by default
	String getName(); //public abstract String by default these are methods not variables
	default void regularMethod() {     //regular public default void method 
		
	}
		
	

}
