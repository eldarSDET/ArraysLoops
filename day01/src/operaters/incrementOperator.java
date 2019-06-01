package operaters;

public class incrementOperator {
	public static void main(String[] args) {
		//postincrement
		
		int a=10;
	
		System.out.println(a++); //10
		
		System.out.println(a);    //10+1
		
		System.out.println("------------");
		//preincrement
		int b=5;
		
		System.out.println(++b);  //5+1
		System.out.println(b);    //5+1
		
		
		
		//postdecrement
		
		int c=3;
		System.out.println(c--); //3 next time decrement by 1
		System.out.println(c--); //3-1=2 next time decrement by 1
		System.out.println(c);   //2-1=1
		
		//predecrement
		
		System.out.println("------Predecrement-------");
		int d=55;
		                   //55-1=54
		System.out.println(--d);
		                 //54-1=53
		--d;
		                    //53-1=52
		System.out.println(--d);
	}

}
