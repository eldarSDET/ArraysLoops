/** You are a university enrollment specialist. Your job is to assign new students with a unique ID numbers.
	 *  Max ID number is 100.
	 *  50 students with unique, random ID:
	 *  Add name
	 *  Add last name
	 **/
import java.util.Random;
public class Db {
	student[]students;
	int[]ids;
	Random r= new Random();
	int size;
	public Db(int N) {
		this.students=new student[N];
		this.ids=new int [N];
		this.size=N;
	}
	public void addStudent() {
		int random id=r.nextInt(this.size);
		if(this ids)
	}

}
