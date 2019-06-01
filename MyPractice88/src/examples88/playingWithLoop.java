package examples88;
import java.util.Scanner;

public class playingWithLoop {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Scanner input = new Scanner(System.in);		

		System.out.println("What kind of music would you like to listen?");
		System.out.println("You have options as following:\n1)Classical\n2)Country\n3)Pop");
		String answer1 = "Classical";
		String answer2 = "Country";
		String answer3 = "Pop";
		String musicType = input.next();
		if (musicType.equalsIgnoreCase(answer1)) {
			System.out.println("Which music the user want to listen?");
			System.out.println("The list of musics as following:\n1)Four Season\n2)Fur Elise\n3)Finlandia\n4)Vocalize\n5)The Planet");
			String classic = "Four Season",classic1 = "Fur Elise",classic2 = "Finlandia",classic3 = "Vocalize",classic4 = "The Planet";
			input.nextLine();
			String classicMusic = input.nextLine();
			if (classicMusic.equalsIgnoreCase(classic)) {
				System.out.println("Please enter 2 dollars to listen this music");
				int money=input.nextInt();
				if(money==2) {
					System.out.println("Money accepted. You're listening to "+classic);
				}else if(money>2) {
					System.out.println("You input "+money+ " dollars. Please take your change "+(money-2)+ " dollars. You're listening to "+classic);
				}else {
					System.out.println("You have not enough money");
				}
			}else if(classicMusic.equalsIgnoreCase(classic1)) {
				System.out.println(" Please enter 2 dollars to listen this music");
				int money=input.nextInt();
				if(money==2) {
					System.out.println("Money accepted. You're listening to "+classic1);
				}else if(money>2) {
					System.out.println("You input "+money+ " dollars. Please take your change "+(money-2)+ " dollars. You're listening to "+classic1);
				}else {
					System.out.println("You have not enough money");
				}
			
			}else if(classicMusic.equalsIgnoreCase(classic2)) {
				System.out.println("Please enter 2 dollars to listen this music");
				int money=input.nextInt();
				if(money==2) {
					System.out.println("Money accepted. You're listening to "+classic2);
				}else if(money>2) {
					System.out.println("You input "+money+ " dollars. Please take your change "+(money-2)+ " dollars.You're listening to "+classic2);
				}else {
					System.out.println("You have not enough money");
				}
			}else if(classicMusic.equalsIgnoreCase(classic3)) {
				System.out.println("Please enter 2 dollars to listen this music");
				int money=input.nextInt();
				if(money==2) {
					System.out.println("Money accepted. You're listening to "+classic3);
				}else if(money>2) {
					System.out.println("You input "+money+ " dollars. Please take your change "+(money-2)+ " dollars. You're listening to "+classic3);
				}else {
					System.out.println("You have not enough money");
				}
			}else if(classicMusic.equalsIgnoreCase(classic4)) {
				System.out.println("Please enter 2 dollars to listen this music");
				int money=input.nextInt();
				if(money==2) {
					System.out.println("Money accepted. You're listening to "+classic4);
				}else if(money>2) {
					System.out.println("You input "+money+" dollars. Please take your change "+(money-2)+" dollars. You're listening to "+classic4);
				}else {
					System.out.println("You have not enough money");
				}
				
			}else {
				System.out.println(classicMusic+" is not available");
				}
	  } else if (musicType.equalsIgnoreCase(answer3)) {
					
				System.out.println("Which music would you like to listen from Pop?");
				System.out.println("The list of musics as following:\n1)Bad Guy\n2)Talk\n3)Please Me\n4)7 King\n5)Without me");
				String pop1 = "Bad Guy", pop2 = "Talk", pop3 = "Please Me", pop4 = "7 King", pop5 = "Without Me";
				input.nextLine();
				String popMusic=input.nextLine();
				if (popMusic.equalsIgnoreCase(pop1)) {					
				 System.out.println("Please enter 4 dollars to listen");
				       int money=input.nextInt();
				         if(money==4) {
					    System.out.println("Money accepted succesfully. You're listening "+pop1);
				        }else if(money>4) {
					    System.out.println("You input "+money+" dollars. Please take your change "+(money-4)+" dollars. You're listening "+pop1);
				        }else {
					         System.out.println("You have not enough money");					 
				           }
				}else if(popMusic.equalsIgnoreCase(pop2)) {
				 System.out.println("Please enter 4 dollars to listen");
				      int money=input.nextInt();
				       if(money==4) {
					    System.out.println("Money accepted succesfully. You're listening "+pop3);
				         }else if(money>4) {
					     System.out.println("You input "+money+" dollars. Please take your change "+(money-4)+" dollars. You're listening "+pop3);
				        }else {
					   System.out.println("You have not enough money");	
				        }
				
			    }else if(popMusic.equalsIgnoreCase(pop3)) {
					System.out.println("Please enter 4 dollars to listen");
					int money=input.nextInt();
					  if(money==4) {
						 System.out.println("Money accepted succesfully. You're listening "+pop3);
					 }else if(money>4) {
						 System.out.println("You input "+money+" dollars. Please take your change "+(money-4)+" dollars. You're listening "+pop3);
					 }else {
						 System.out.println("You have not enough money");	
					 }
					  
				}else if(popMusic.equalsIgnoreCase(pop4)) {
					System.out.println("Please enter 4 dollars to listen");
					int money=input.nextInt();
					 if(money==4) {
						 System.out.println("Money accepted succesfully. You're listening "+pop4);
					 }else if(money>4) {
						 System.out.println("You input "+money+" dollars. Please take your change "+(money-4)+" dollars. You're listening "+pop4);
					 }else {
						 System.out.println("You have not enough money");	
					 }
				}else if(popMusic.equalsIgnoreCase(pop5)) {
					System.out.println("Please enter 4 dollars to listen");
					int money=input.nextInt();
					 if(money==4) {
						 System.out.println("Money accepted succesfully. You're listening "+pop5);
					 }else if(money>4) {
						 System.out.println("You input "+money+" dollars. Please take your change "+(money-4)+" dollars. You're listening "+pop5);
					 }else {
						 System.out.println("You have not enough money");	
					 }
	              
	             }else { 
	            	 System.out.println(popMusic+" is not available");
	            	 }
	    
	  } else if (answer2.equalsIgnoreCase(musicType)) {
				System.out.println("Which music would you like to listen from Country? Please enter the title of the music");
				System.out.println("The list of Country musics as following:\n1)Meant To Be\n2)Heaven\n3)Simple\n4)One Number Away\n5)Get Along");
				String country1 = "Meant To Be", country2 = "Heaven", country3 = "Simple", country4 = "One Number Away",
						country5 = "Get Along";
				input.nextLine();
				String countryMusic = input.nextLine();
				if (countryMusic.equalsIgnoreCase(country1)) {					
				System.out.println("You will be charged for 3 dollars");
				int money=input.nextInt();
				    if(money==3) {
					System.out.println("Money acceptrd succesfully. You're listening to "+country1+".");
				    }else if(money>3) {
					System.out.println("You input "+money+"dollars. Please take your change "+(money-3)+"dollars. You're listening to "+country1+"." );
				     }else {
				    	System.out.println("You have not enough money");  
				     }
				}else if(countryMusic.equalsIgnoreCase(country2)){
					System.out.println("You will be charged for 3 dollars");
					int money=input.nextInt();
				    if(money==3) {
					System.out.println("Money acceptrd succesfully. You're listening to "+country2+".");
				    }else if(money>3) {
					System.out.println("You input "+money+"dollars. Please take your change "+(money-3)+"dollars. You're listening to "+country2+"." );
				     }else {
				    	System.out.println("You have not enough money");  
				     }
				}else if(countryMusic.equalsIgnoreCase(country3)) {
					System.out.println("You will be charged for 3 dollars");
					int money=input.nextInt();
				    if(money==3) {
					System.out.println("Money acceptrd succesfully. You're listening to "+country3+".");
				    }else if(money>3) {
					System.out.println("You input "+money+"dollars. Please take your change "+(money-3)+"dollars. You're listening to "+country3+"." );
				     }else {
				    	System.out.println("You have not enough money");  
				     }
					
				}else if(countryMusic.equalsIgnoreCase(country4)) {
					System.out.println("You will be charged for 3 dollars");
					int money=input.nextInt();
				    if(money==3) {
					System.out.println("Money acceptrd succesfully. You're listening to "+country4+".");
				    }else if(money>3) {
					System.out.println("You input "+money+"dollars. Please take your change "+(money-3)+"dollars. You're listening to "+country4+"." );
				     }else {
				    	System.out.println("You have not enough money");  
				     }
				}else if(countryMusic.equalsIgnoreCase(country5)) {
					System.out.println("You will be charged for 3 dollars");
					int money=input.nextInt();
				    if(money==3) {
					System.out.println("Money acceptrd succesfully. You're listening to "+country5+".");
				    }else if(money>3) {
					System.out.println("You input "+money+"dollars. Please take your change "+(money-3)+"dollars. You're listening to "+country5+"." );
				     }else {
				    	System.out.println("You have not enough money");  
				     }
					
				}else { 
				System.out.println(countryMusic+ "is not available");
				}

	 } else {
			System.out.println("TYPEOF MUSIC is not available");
	 }
		
		

			
			
		
			
			
		
		
		
		
		
		
		
		
		
	}
		
	
	
			 
		
		
}
