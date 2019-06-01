package Map;
//=========1=================
	//create one method called move
	//it will take one parameter as direction string and 
	//return the direction  value of cat
	//name of cat is moving to the "Direction"
	//==========2===================
	//create another method called healthControl
	//the method will check if cat age is more than 2 and less than 4
	//the cat should go to the vet
	//if the cat age more 4 the cat should take drug name is "Amoxcil"
	//=============3====================
	//create getters and setters for private fields/
    //==============4===============
    //create one method called isOlder
    //it will return the true if cat age is  more than 60 months
    //it will return false if cat age is less than 60 months 
	

public class Cat {
	private int age;
	private String name;
	private String kind;
	public Cat(String name, String kind, int age) {
		this.name=name;
		this.kind=kind;
		this.age=age;
	}
		public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
		public  void move (String direction) {
			System.out.println(name+"is moving to the "+direction);
		}
		public void healthControl (){
			
			if(age>=2 && age<4) {
				System.out.println("Cat should go to the vet");
			}
			else if(age>4) {
				System.out.println("cat should take amiscil");
			}else {
				System.out.println("cat's health is good");
			}
		}
		
		public boolean isOlder() {
			if(age*12>60) {
				return true;
			}else if(age*12<=60) {
				return false;
			}
			return false;
		}
	
		
		
		
		
		
		

		
		
		
		
		

}
