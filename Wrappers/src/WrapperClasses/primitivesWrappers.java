package WrapperClasses;

public class primitivesWrappers {
	public static void main(String[] args) {
		int num=55;
		Integer num2=new Integer(12);
		long num3=23344;
		Long num4=new Long(54333);
		
		int num5=num2;//Integer to int -> Unboxing
		int num6=num5;//int to Integer -> Autoxing
		
		String number="123";
		int number1=Integer.valueOf(number);//converting String to Integer
		int number2=Integer.parseInt(number);//converting String to int
		
		Double number3=Double.valueOf(number);
		double number4=Double.parseDouble(number);
		
		Double d1=new Double(2.5);
		Double d2=new Double(2.5);
		System.out.println(d1==d2);//comparing two references
		System.out.println(d1.equals(d2));
		
		
		
	}

}
