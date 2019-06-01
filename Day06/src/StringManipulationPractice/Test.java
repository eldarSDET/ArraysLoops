package StringManipulationPractice;

public class Test {
	public static void main(String[] args) {
		
		String nub1="Dynosaur";
		String nub2="Hello";
		String nub3="Name";
		String nub4="Last";
		String nub5="Challenge";
		String nub6="Robot";
		
		String nub7="World";
		String nub8="Consumption";
		String nub9="Zookeeper";
		
		String myName = (""+nub4.charAt(1)).toUpperCase()+nub4.charAt(2)+nub8.charAt(8)+nub1.charAt(1)+
		nub5.charAt(2)+nub4.charAt(3);
		
		String firstLetterOfMyLastName = (""+nub3.charAt(1)).toUpperCase();
		
		String school = (""+nub4.charAt(3)).toUpperCase()+nub2.charAt(1)+(""+nub5.substring(0,2)).toLowerCase()+
			nub4.charAt(3)+nub2.charAt(4)+nub1.charAt(7)+nub8.charAt(8)+nub5.substring(2,4);
			
		String date = nub1.indexOf('D')+nub2.indexOf('o')+"."+nub3.indexOf('N')+nub5.indexOf('a')+"."+nub6.indexOf('b')+
			nub7.indexOf('W')+nub9.indexOf('o')+(nub8.indexOf('o',3));
			
		
		String myFriend = (""+nub1.charAt(0)+nub2.charAt(1)+(""+nub3.charAt(0)).toLowerCase());
		
		
		//Summary:
		System.out.println("Hello work,\nI'm "+(myName+" "+ firstLetterOfMyLastName+"\n")
				+ "I sit with "+ myFriend +"\n" + "Learning is FUN.\n Date:\t\t Sign:\n"+date+"\t "+myName);
		
		 
		
		
	}

}
