package loops1;

public class print10 {
	public static void main (String[] args) {
		int n=10;
		
		do {
			n--;                    //9,8,7-1,0
			System.out.print(n+" ");
		}while(n!=0); //9 true, 8 true,7 true 0 false
		
		do {
			n++;
			System.out.print(n+" ");//1-9,10
		}while(n!=10);//9,8,7->true, 10->false
	}

}
