package queues;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queues {
	static class stack {
		static Queue<Integer> q1 = new LinkedList<>();
		static Queue<Integer> q2 = new LinkedList<>();

		public static boolean isEMPTY() {
			return q1.isEmpty() && q2.isEmpty();
		}

		public static void push(int data) {
			if (!q1.isEmpty()) {
				q1.add(data);
			} else {
				q2.add(data);
			}
		}

		public static int pop() {
			if (isEMPTY()) {
				System.out.println("Stack Empty");
				return -1;
			}
			int top = -1;
			if (!q1.isEmpty()) {// agar elements q1 me hai
				while (!q1.isEmpty()) {
					top = q1.remove();
					if (q1.isEmpty()) {
						break;
					}
					q2.add(top);
				}

			} else {// agar elements q2 me hai
				while (!q2.isEmpty()) {
					top = q2.remove();
					if (q2.isEmpty()) {
						break;
					}
				}

				q1.add(top);
			}
			return top;

		}

		public static int peek() {
			if (isEMPTY()) {
				System.out.println("Stack Empty");
				return -1;
			}
			int top = -1;
			if (!q1.isEmpty()) {// agar elements q1 me hai
				while (!q1.isEmpty()) {
					top = q1.remove();
					q2.add(top);
				}

			} else {// agar elements q2 me hai
				while (!q2.isEmpty()) {
					top = q2.remove();
					q1.add(top);

				}

			}
			return top;
		}
	}

	public static void main(String[] args) {
		stack s = new stack();
		s.push(1);
		s.push(2);
		s.push(3);
		while (!s.isEMPTY()) {
			System.out.println(s.peek());
			s.pop();
		}
	}

}
