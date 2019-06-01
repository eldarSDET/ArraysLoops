package heapAndStack;

public class CompareStrings {
	public static void main(String[] args) {
		String srt=new String("Techtorial");
		String string="Techtorial";
		String ss=new String("Techtorial");
		srt=string;
		String s5="Techtorial";
		srt=s5;
		
		boolean isTrue=srt.equals(string);
		System.out.println(isTrue);
		
		isTrue=srt==s5;
		
		System.out.println(isTrue);
	}

}
