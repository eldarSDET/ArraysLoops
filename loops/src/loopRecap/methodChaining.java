package loopRecap;

public class methodChaining {
	public static void main(String[] args) {

		/**
		 * Keep looping over given String while the length of 
		 * the String not equals to 33, (every iteration should cut only one letter from the end).
		 * 
		 * @return
		 */
		//public static String loopOver10Times() {
	  String word = "WeHaveBeenGoingOverWhileLoopFor10TimesAndItIsFun";
	  int length=word.length();
	  
	  
	  String res="";
	  
	  for(int i=length-1; i>33; i--) {
		  res+=word.charAt(i);
		  
	  }System.out.println(res);
		
		
	}
	
	
	

}
