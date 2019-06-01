package MethodPractice2;

public class SoccerPlayer {
	String name="Cristiano";
	String lastName="Ronaldo";
	int age=34;
	String team="Juventus";
	String national="Portugese";
	int legs=2;
	int eyes=2;
	String hairColor="Brown";
	double height=1.88;
	int weight=75;
	boolean injured=false;
	boolean penalty=true;
	int training=4;
	
	public boolean checkNationality(String nation) {
		if(nation.equals("Portuguese")) {
			return true;
		}else {
			return false;
		}
	}
	public void canPlay() {
		if(checkNationality("Portuguese")) {
			//to be able to call the metho
			System.out.println("Ronaldo can play for Portuguese");
		}
	}
	
	
	
	public void canPlay(int days) {
		if(days>=4) {
			System.out.println("Ronaldo can play");
		}else {
			System.out.println("Ronaldo can not play");
		}
	}
	public void canPlay(int days,boolean injured) {
		if(days>=4&&injured==false) {
			System.out.println("Ronaldo can play");
		}else {
			System.out.println("Ronaldo can not play");
		}
	}
	public void canPlay(int days,boolean injured,boolean penalty) {
		if(days>=4 &&  injured==false &&  penalty==false) {
			System.out.println("Ronaldo can play");
		}else {
			System.out.println("Ronaldo can not play");
		}
	}
public static void main(String[] args) {
	SoccerPlayer player=new SoccerPlayer();
	player.canPlay(5);
	player.canPlay(3);
	player.canPlay(4, true);
	player.canPlay(4, false);
	player.canPlay(4, false, false);
	player.canPlay(2, false, false);

	
	
}
	
	
	
	
	
	
	
	
	
	
	
}
