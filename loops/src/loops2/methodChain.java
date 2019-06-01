package loops2;

public class methodChain {
	public static void main(String[] args) {
		String word=" java programming";
		System.out.println(word);
		System.out.println(word.trim());
		       //  java programming,  java programming,    ava ,         ava,3
		int length=word.               trim().         substring(1,5).trim().length();
		System.out.println(length);
	}

}
