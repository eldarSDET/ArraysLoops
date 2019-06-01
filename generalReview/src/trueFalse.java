
public class trueFalse {
	public static void main(String[] args) {
		
		int count=5;
		boolean table=6<10 | count++<10;//true
		
		System.out.println(count);//count is 6
		
		boolean table1=6<10 || count++<10;
		System.out.println(count); // count is still 6
		
		
		boolean table2=10<6 & count++>4;
		System.out.println(count); //count is 7
		
		boolean table27=10<6 && count++>4; //false
		System.out.println(count); //count is 7
		System.out.println(table27);
		
		System.out.println("=========================================");
		
		boolean blm=10<6 | 3>1 && count++>4 | count++>10; //false
		// 10<6 | 3>1  = false | true ; ---> true
		// true && count ++>4 ====
		
		
		
		
		 
		

	}

}
