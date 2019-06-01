package loops2;

public class printString {
	public static void main(String[] args) {
		String word="Java";
		int length=word.length();                                          //Java
		                 //0<4                                             //0123
		for(int index=0; index<length; index++) {
			   
			System.out.println(word.charAt(index));//J a v a 
		}
	}

}
