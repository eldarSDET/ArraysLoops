package MethodPractice;

public class HumanTest {
	public static void main(String[] args) {
		Human man=new Human();
		System.out.println(man.age);
		man.run();
		System.out.println(man.increaseSpeed());
		System.out.println(man.name);
		System.out.println(man.brain);
		System.out.println(man.eyes);
		System.out.println(man.studyTime);
		man.study();
		short sh=10;
		byte ln=20;
		System.out.println(man.dateOfBirth);
		
		man.walkSpeed(ln);
		
		
	}

}
