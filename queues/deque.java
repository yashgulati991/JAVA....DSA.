package queues;

import java.util.Deque;
import java.util.LinkedList;

public class deque {
// it is doubly ended queue
	public static void main(String[] args) {
		Deque<Integer> dq = new LinkedList<>();
//		operations addfirst,addlast,removefirst,removelast,getfirst,getlast
		dq.addFirst(1);
		dq.addLast(2);
		System.out.println(dq.getFirst());
	}

}
