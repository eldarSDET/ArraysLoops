package loops2;

public class practice {

	public static void main(String[] args) {
		String word="table";
		int wordLength=word.length();
		
		for(int i=0; i<wordLength; i++) {
			if(word.charAt(i)!='t'){
				System.out.println(word.charAt(i));
					
			}
		}

	}

}
