`package examples88;

public class homeWorkSecondPart {
	public static void main(String[] args) {
		//String reverse = "WE WILL BE STRUGGLING A LOT. WE WON'T TELL ANYBODY A WORD";
		/*
		 * Append to a String numbers only odd numbers from 0 to 30 Ex: 1,3....
		 * @return String
		 */
			String numbers = new String();
			
			for(int i=0;  i<=30;  i++) {
				if(i%2==1) {
					numbers=""+1;
				}
			}
			
		System.out.println(numbers.substring(1));
			
		
		}
		
	

}
