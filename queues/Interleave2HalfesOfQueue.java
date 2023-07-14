package queues;

import java.util.LinkedList;
import java.util.Queue;

public class Interleave2HalfesOfQueue {// iska matlab ek ke baad ek like girls pony
	// eg 12345678910 converted to--> 16273849510 so aadhi queue starting queue me
	// judh gayi

	public static void interLeave(Queue<Integer> q) {
		Queue<Integer> firstHalf = new LinkedList<Integer>();
		int size = q.size();
		for (int i = 0; i < size / 2; i++) {
			firstHalf.add(q.remove()); // isse 1 to 5 element first queue me chale gaye
		}
		while (!firstHalf.isEmpty()) {
			q.add(firstHalf.remove());
			q.add(q.remove());
		}
	}

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.add(6);
		q.add(7);
		q.add(8);
		q.add(9);
		q.add(10);
		interLeave(q);
		while (!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}

	}

}
