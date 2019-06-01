import java.util.Scanner;

public class middleCharacter {
	//David->v
	//Java->av
	//techtorial->length=10 10/2=5
	public static void main(String[] args) {
		System.out.println("Please enter a word: ");
		Scanner input=new Scanner(System.in);
		String word=input.next();
		int length=word.length();
		if(length%2==0) {
			int middleIndex=length/2;//Java->4/2->2(1,3)
			String result=word.substring(middleIndex-1,middleIndex+1);
			System.out.println(result);
		}else if(length%2==1) {
			int middleIndex=length/2; //2
			String result=word.substring(middleIndex,middleIndex+1);
			System.out.println(result);
		}
	}

}
