package ProjectFirstDay;

import java.util.Scanner;

public class myPracticeFromProject {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Available music types are Classical, Pop and Country.\nPlease enter the music type.");
		
		String classical="Classical";
		String classicalMusic1="Four Seasons";
		String classicalMusic2="Fur Elise";
		String classicalMusic3="Finlandia";
		String classicalMusic4="Vosalise";
		String classicalMusic5="The Planets";
		
		String pop="Pop";
		String popMusic1="Bad Guy";
		String popMusic2="Talk";
		String popMusic3="Please Me";
		String popMusic4="7 Ring";
		String popMusic5="Without Me";
		
		String country="Country";
		String countryMusic1="Meant to be";
		String countryMusic2="Heaven";
		String countryMusic3="Simple";
		String countryMusic4="One Number Away";
		String countryMusic5="Get Along";
		String rock="Rock";
		String rap="Rap";
		
		String musicTypeInput=scanner.next();
		if(musicTypeInput.equalsIgnoreCase(classical)) {
			System.out.println("Available musics are: "+classicalMusic1+" ,"+classicalMusic2+" ,"+classicalMusic3+" ,"+
		classicalMusic4+" ,"+classicalMusic5+" \nwhich one do you want to listen?");
			scanner.nextLine();
			String clMusicInput=scanner.nextLine();
			if(clMusicInput.equalsIgnoreCase(classicalMusic1)|| clMusicInput.equalsIgnoreCase(classicalMusic2)
					|| clMusicInput.equalsIgnoreCase(classicalMusic3) ||  clMusicInput.equalsIgnoreCase(classicalMusic4) 
					|| clMusicInput.equalsIgnoreCase(classicalMusic5));
			System.out.println("Please enter $2 for music");
			int price=2;
			int priceInput=scanner.nextInt();
			if(priceInput==price) {
				System.out.println(clMusicInput+" is playing. Enjoy the music.");
			}if (priceInput>price) {
				System.out.println("Please take the change "+"$"+(priceInput-price)+" and enjoy the music");
			}if (priceInput<price) {
				System.out.println("You are "+(price-priceInput)+" short, please enter "+"$"+(price-priceInput));
				int shortInput=price-priceInput;
				int ShortInput=scanner.nextInt();
				if (shortInput+ShortInput==price) {
					System.out.println(clMusicInput+" is playng. Please enjoy the music");
				}
			}	
		}
		else if(musicTypeInput.equalsIgnoreCase(country)) {
			System.out.println("Available musics are: "+countryMusic1+" ,"+countryMusic2+" ,"+countryMusic3+" ,"+
		countryMusic4+" ,"+countryMusic5+" \nwhich one do you want to listen?");
			scanner.nextLine();
			String clMusicInput=scanner.nextLine();
			if(clMusicInput.equalsIgnoreCase(countryMusic1)|| clMusicInput.equalsIgnoreCase(countryMusic2)
					|| clMusicInput.equalsIgnoreCase(countryMusic3) ||  clMusicInput.equalsIgnoreCase(countryMusic4) 
					|| clMusicInput.equalsIgnoreCase(countryMusic5));
			System.out.println("Please enter $3 for music");
			int price1=3;
			int priceInput1=scanner.nextInt();
			if(priceInput1==price1) {
				System.out.println(clMusicInput+" is playing. Enjoy the music.");
			}if (priceInput1>price1) {
				System.out.println("Please take the change "+"$"+(priceInput1-price1)+" and enjoy the music");
			}if (priceInput1<price1) {
				System.out.println("You are "+(price1-priceInput1)+" short, please enter "+"$"+(price1-priceInput1));
				int shortInput1=price1-priceInput1;
				int ShortInput1=scanner.nextInt();
				if (shortInput1+ShortInput1==price1) {
					System.out.println(clMusicInput+" is playing. Please enjoy the music");
				}
			}
		}
	else if(musicTypeInput.equalsIgnoreCase(pop)) {
		System.out.println("Available musics are: "+popMusic1+" ,"+popMusic2+" ,"+popMusic3+" ,"+
				popMusic4+" ,"+popMusic5+" \nwhich one do you want to listen?");
		scanner.nextLine();
		String clMusicInput=scanner.nextLine();
		if(clMusicInput.equalsIgnoreCase(popMusic1)|| clMusicInput.equalsIgnoreCase(popMusic2)
				|| clMusicInput.equalsIgnoreCase(popMusic3) ||  clMusicInput.equalsIgnoreCase(popMusic4) 
				|| clMusicInput.equalsIgnoreCase(popMusic5));
		System.out.println("Please enter $4 for music");
		int price3=4;
		int priceInput3=scanner.nextInt();
		if(priceInput3==price3) {
			System.out.println(clMusicInput+" is playing. Enjoy the music.");
		}if (priceInput3>price3) {
			System.out.println("Please take the change "+"$"+(priceInput3-price3)+" and enjoy the music");
		}if (priceInput3<price3) {
			System.out.println("You are "+(price3-priceInput3)+" short, please enter "+"$"+(price3-priceInput3));
			int shortInput3=price3-priceInput3;
			int ShortInput3=scanner.nextInt();
			if (shortInput3+ShortInput3==price3) {
				System.out.println(clMusicInput+" is playing. Please enjoy the music");
			}
		}
		
	}else if (musicTypeInput.equalsIgnoreCase(rock)) {
		System.out.println(rock+" is not available. Choose another one.");
		
	}else if (musicTypeInput.equalsIgnoreCase(rap)) {
		System.out.println(rap+ " is not available. Choose another one.");
	}else {
		System.out.println("Type of music is not available.");
	}
				
				
				
	}
}
