package stack;

import java.util.ArrayList;

public class stackUsingArrayList {

	static class Stack {
		static ArrayList<Integer> list = new ArrayList<>();

		public static boolean isEmpty() {
			return list.size() == 0;
		}

		public static void push(int data) { // push at the top
			list.add(data);
		}

		public static int pop() {// removes the top most element
			if (isEmpty()) {
				return -1;
			}
			int top = list.get(list.size() - 1);
			list.remove(list.size() - 1);
			return top;
		}

		public static int peek() // gives u the top element
		{
			if (isEmpty()) {
				return -1;
			}
			return list.get(list.size() - 1);
		}

		public static void main(String[] args) {
			Stack x = new Stack();
			x.push(1);
			x.push(2);
			x.push(3);
			System.out.println(x.peek());
			x.pop();
			System.out.println(x.peek());
			System.out.println(x.isEmpty());

		}

	}
}
