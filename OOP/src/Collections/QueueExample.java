package Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<String>queue=new PriorityQueue<>();
		queue.add("Chase Bank");
		queue.add("Bank of America");
		queue.add("City Bank");
		queue.add("Amex");
		
		System.out.println(queue);
		System.out.println(queue.peek());//peek method picks the very first one
	}

}
