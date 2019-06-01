package RecapMethods;

public class testBook {
	public static void main(String[] args) {
		book b1=new book();
		System.out.println(b1.getBookInfo());
		System.out.println(book.count);
		System.out.println("----------------------");
		
		book b2=new book("Jim");
		System.out.println(b2.getBookInfo());
		System.out.println(book.count);
		System.out.println("----------------------");
		
		book b3=new book("Tom", "Java OCA");
		System.out.println(b3.getBookInfo());
		System.out.println("----------------------");
		
		book b4=new book("John","Ramadan",500, 1000);
		System.out.println(b4.getBookInfo());
		System.out.println(book.count);
		
		
		
		
		
	}

}
