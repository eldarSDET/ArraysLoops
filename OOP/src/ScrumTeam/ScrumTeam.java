package ScrumTeam;

public class ScrumTeam {
	private String ID;
	private String position;
	private int salary;
	public static final String COMPANY;
	
	static {
		COMPANY="Google";
		System.out.println("Scrum team static block");
	}
	{
		System.out.println("Scrum team instance block");
	}
	public ScrumTeam(){
		System.out.println("Scrum team constructor");
	}
	public void work() {
		System.out.println("Scrum team is working in 5th sprint");
	}
	public static int calculateSalary(int hours) {
		return 0;
		
	}

}
