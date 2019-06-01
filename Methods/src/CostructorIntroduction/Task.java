package CostructorIntroduction;
public class Task {

	
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public char getLetter() {
		return letter;
	}

	public void setLetter(char letter) {
		this.letter = letter;
	}

	public boolean isTrue() {
		return isTrue;
	}

	public void setTrue(boolean isTrue) {
		this.isTrue = isTrue;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	private int number;
	private char letter;
	private boolean isTrue;
	private double avg;
	
	
	public Task() {
		this("Asiyat");
	}
	
	public Task (String n) {
		this.name=n;
		
	}
	public Task (String n, int num) {
		
	}
	public Task (int num) {
		this();
		
	}
	public Task(double d) {
		
		
	}
	public Task (boolean truth) {
		
	}

	

}
