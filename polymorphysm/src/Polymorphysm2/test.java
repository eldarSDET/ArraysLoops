package Polymorphysm2;

public class test {
	public static void main(String[] args) {
		human h=new baby();
		h.sleep();
		h.eat();
		((boy)h).bike();
		
		human h2=new boy();
		((boy)h2).bike();
		
		men m=new boy();
		((boy)m).bike();
		((men)m).feed();
		((human)m).eat();
		
		human w=new women();
		((women)w).sleep();
		w.eat();
	}

}
