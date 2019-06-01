package loops2;

public class javaREverse {
	public static void main(String[] args) {
		String word="Java";
		int length=word.length();
		int lastIndex=length-1;
		                 
		for(int n=0; n<=lastIndex; lastIndex--) {
			   
         System.out.println(word.charAt(lastIndex));
         
		}
	}
 
}
