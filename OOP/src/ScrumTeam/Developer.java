package ScrumTeam;

public class Developer extends ScrumTeam {
	@Override
	public void work() {
		System.out.println("Developer is developing application");
	}
	
	public static int calculateSalary(int hours) {
		return hours*50;
	}

}
