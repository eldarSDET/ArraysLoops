package loops2;

public class sumOddNumbers {
	public static void main(String[] args) {
	    int sum=0;
		for(int n=0; n<=100; n++) {
			if(n%2==1) {
		    	sum=sum+n;
			}
			}System.out.println(sum);
	}

}
