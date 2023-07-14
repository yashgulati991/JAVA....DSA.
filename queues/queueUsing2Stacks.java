package queues;

import java.util.Stack;

public class queueUsing2Stacks {
	static class Queue {
		static Stack<Integer> s1 = new Stack<>();
		static Stack<Integer> s2 = new Stack<>();

		public static boolean isEMPTY() {
			return s1.isEmpty();
		}

		public static void add(int data) {
			// pehle s1 ka sarra data s2 me
			while (!s1.isEmpty()) {
				s2.push(s1.pop());
			}
//		   fir s1 hogya kahli ab usme push kardiya 
			s1.push(data);
//		   firse s2 se sarra data s1 me le aaya
			while (!s2.isEmpty()) {
				s1.push(s2.pop());
			}

		}

		public static int remove() {
			if (isEMPTY()) {
				System.out.println("Queue is empty");
				return -1;
			}
			return s1.pop();
		}

		public static int peek() {
			if (isEMPTY()) {
				System.out.println("Queue is empty");
				return -1;
			}
			return s1.peek();
		}

	}

	public static void main(String[] args) {
		Queue q = new Queue();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.remove();

		while (!q.isEMPTY()) {
			System.out.println(q.peek());
			q.remove();
		}

	}

}
