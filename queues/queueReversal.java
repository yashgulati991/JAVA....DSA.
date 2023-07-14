package queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
// queue reversal through stack 

public class queueReversal {
	public static void reversed(Queue<Integer> q) {
		Stack<Integer> s = new Stack<Integer>();
		while (!q.isEmpty()) {// pehle q se remove kare stack me daaale
			s.push(q.remove());
		}
		while (!s.isEmpty()) {// reverse ho gaye to fir stack se firse queue me daale
			q.add(s.pop());
		}

	}

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();

		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		reversed(q);
		while (!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}

	}

}
