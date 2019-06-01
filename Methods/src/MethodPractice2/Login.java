package MethodPractice2;

public class Login {
	String username="Techtorial";
	String password="123456";
	
	public boolean login(String username, String password ) {
		if(username.equals("Techtorial")&&password.contentEquals("123456")) {
			return true;
		}
			return false;
		}
	public void withDraw() {
		
		if(login("Techtorial", "123456")) {
			System.out.println("the user can withdraw the money");
		}
	}
		
	

}
