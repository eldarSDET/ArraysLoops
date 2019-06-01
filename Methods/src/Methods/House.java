package Methods;

public class House {
	int rooms=3;
	double bathrooms=1.5;
	boolean kitchen=true;
	boolean garage=false;
	String color="white";
	String name="Pirates";
	String kind="Condo";
	int doors=10;
	int windows=20;
	String address="497 Leslie Court";
	String zipcode="60016";
	String state="IL";
	String country="USA";
	int temperature=70;
	boolean light=false;
	
	
	public boolean openLight() {
		light=true;
		System.out.println(light);
		return light;
	}
	
	public boolean closeLight() {
		light=false;
		System.out.println(light);
		return light;
	}
	
	public int getTemperature() {
		System.out.println(temperature);
		return temperature;
	}
	
	public int increaseTemperature() {
		System.out.println(temperature+10);
		return temperature+10;
	}
	
	
	public int decreaseTemperature() {
		System.out.println(temperature-20);
		return temperature-20;
		
	}
	

	
	public static void main(String[] args) {
		House myHouse=new House();
		int houseTemperature=myHouse.getTemperature();
		myHouse.increaseTemperature();
		myHouse.decreaseTemperature();
		myHouse.openLight();
		myHouse.closeLight();
		
		House asiyatHouse=new House();
		System.out.println("Asiyat's house has"+asiyatHouse.doors);
		asiyatHouse.doors=15;
		System.out.println("Asiyat's house has"+asiyatHouse.windows);
		asiyatHouse.windows=16;
		asiyatHouse.address="5912 N Maplewood";
		asiyatHouse.zipcode="60659";
	}
	
	
	
	
	
	
	
	

}
