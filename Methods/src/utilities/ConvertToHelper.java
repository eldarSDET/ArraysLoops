package utilities;

public class ConvertToHelper {
	public static void main(String[] args) {
		
	
	int i=29;
	int b=123;
	int c=989;
	int d=333;
	int e=90909;
	int f=5511;
	int g=7898;
	//String j="This is my text";
	
	 
	ConvertToHelper convertToHelperClass=new ConvertToHelper();
	convertToHelperClass.getSum(i,b,"jj");
	
	
	convertToHelperClass.getAverage(i, b,"tyhn");
	
	
	convertToHelperClass.divide(f,g,"GHH");
	
	
	
	convertToHelperClass.multiply(f,g,"jjj");
	}
	
    public void getSum (int num1, int num2,String text) {
    	System.out.println(num1+num2+text);
		
	}
    public void getAverage(int num1, int num2,String text) {
    	System.out.println((num1+num2)/2);
    }
    public void divide (int num1, int num2,String text) {
    	System.out.println(num1/num2);
    }
    public void multiply (int num1, int num2,String text) {
    	System.out.println(num1*num2);
    }

}
