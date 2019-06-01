package ScrumTeam;

public class test {
	public static void main(String[] args) {
		SDET sdet=new SDET();
		System.out.println("================");
		SDET sdet2=new SDET();
		System.out.println("==========");
		Developer d=new Developer();
		d.work();
		System.out.println(d.calculateSalary(40));
		
	}

}
