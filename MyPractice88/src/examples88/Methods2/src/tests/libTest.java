package examples88.Methods2.src.tests;

public class libTest {
	public static void main(String[] args) {
		Library.library(libInfo.name);
		Library.subject(libInfo.book);
		Library obj=new Library();
		String books="New books";
		obj.book(books);
		int n1=20;
		int n2=30;
		System.out.println(Library.printSum(n1,70));
		
		
	}

}
