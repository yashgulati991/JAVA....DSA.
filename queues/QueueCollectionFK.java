package queues;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueCollectionFK {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();// ek to isse implement hoti hai aur ek array deque se
		Queue<Integer> q1 = new ArrayDeque<>();
		q.add(0);
		q.add(1);
		q.add(2);
		q1.add(0);
		q1.add(1);
		q1.add(2);
		while (!q1.isEmpty()) {
			System.out.println(q1.peek());
			q1.remove();
		}

	}

}
