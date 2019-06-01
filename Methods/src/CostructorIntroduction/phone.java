package CostructorIntroduction;

public class phone {
	private String password;
	private int price;
	private String brand;
	
	public void setPassword(String password) {//getters and setters
		this.password=password;
	}
	
	public String getPassword() {
		return this.password;
		
	}
	
	
	
	
	
	public phone() {
		this("aaaa",12);
		System.out.println("no args constructor body");
	}
		public phone(String kind) {
			this();
	}
		
		public phone(String brand, int price) {
			
			
		}
	

}
