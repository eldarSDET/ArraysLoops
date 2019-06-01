package examples88;

public class AddEvenNumbersMyPractice {
	public static void main(String[] args) {
		int as[]= {3,6,11,10};
		int count=0;
		int sum=0;
		for(int i=0; i<as.length; i++) {
			if (as[i]%2==1) {     
				sum+=as[i];
				count++;
				
			}
		
		
		}System.out.println(sum/count);
		
		
		
	}

}
