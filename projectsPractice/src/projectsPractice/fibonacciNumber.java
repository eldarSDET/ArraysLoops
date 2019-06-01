package projectsPractice;

public class fibonacciNumber {
	public static void main(String[] args) {
		
	
	int j=0;
	int k=0;
	System.out.println("Fibonacci Series of 6: ");
	for (int i=0; i<3;i++) { //0  0 0; 
		System.out.println(""+(j=j+k)+"");//0    1
		if(k==0)
			++k; //1      
		System.out.println(""+(k=k+j)+"");//1=1+0    2=1+1
	}
	}

}
