package loops2;

public class primeNumbers {
	public static void main(String[] args) {
		int num=0;
		while(num<=100) {
			//10
			if((num%2!=0&& num%3!=0 && num%5!=0 && num%7!=0)||(num==2) || num==3 ||num==7){
				System.out.println(num);
		}
			num++;
		}
	}

}
