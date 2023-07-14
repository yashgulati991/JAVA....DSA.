package queues;

import java.util.Deque;
import java.util.LinkedList;

public class QueueUsingDeque {
	static class Queue {
		Deque<Integer> dq = new LinkedList<Integer>();

		// add
		public void add(int data) {
			dq.addLast(data);
		}

		// remove
		public int remove() {
			return dq.removeFirst();
		}

		// peek
		public int peek() {
			return dq.getFirst();
		}
	}

	public static void main(String[] args) {
		Queue q = new Queue();
		q.add(1);
		q.add(2);
		q.add(3);
		System.out.println(q.peek());
		q.remove();
		System.out.println(q.peek());

	}

}
