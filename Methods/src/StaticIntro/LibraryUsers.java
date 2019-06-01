package StaticIntro;

public class LibraryUsers {
	
	public static void main(String[] args) {
		Library libUser1 = new Library("Techtorial");
		                     //i<1000000
		                     //i<9999999
		long startTime=System.currentTimeMillis();
		for(int i=Library.numOfBooks;i>=0; i--) {
		if (libUser1.checkOutBook()) {
			System.out.println("Successfully checked a book out of a library");
		}else  { 
		
			System.out.println("Sorry no books available in the library");
		}
		}
		long endTime=System.currentTimeMillis();
		long executionTime=endTime-startTime;
		System.out.println(executionTime);
		System.out.println("Available books in our library: "+Library.numOfBooks);
	}

}
