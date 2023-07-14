package queues;

import java.util.Deque;
import java.util.LinkedList;

public class StackUsingDeque {
	static class Stack {
		Deque<Integer> dq = new LinkedList<>();

		// push
		public void push(int data) {
			dq.addLast(data);
		}

		// pop
		public int pop() {
			return dq.removeLast();

		}

		public int peek() {
			return dq.getLast();
		}

	}

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);

	}

}
