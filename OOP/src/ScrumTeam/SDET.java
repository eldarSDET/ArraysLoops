package ScrumTeam;

public class SDET extends ScrumTeam {
	@Override
	public void work() {
		System.out.println("SDET is writing automation code");
	}
	static {
		System.out.println("Static block of SDET class");
	}
	{
		System.out.println("Instance block of Sdet class");
	}
	public SDET() {
		System.out.println("Constructor of SDET class");
	}

}
