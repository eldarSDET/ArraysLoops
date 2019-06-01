package loops1;

public class whileWithIf {
	public static void main(String[] args) {
		int num=0; // while num<=10 keep looping
		while(num<=10) { //if num remainder by 2 equals to 0 (which means even number)
			if(num%2==0) {
				System.out.println(num);
			}
			num++; //we increment num every time we looping while
		}
		
		
		
		
	}

}
