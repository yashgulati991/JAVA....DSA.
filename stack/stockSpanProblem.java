package stack;

import java.util.Stack;

public class stockSpanProblem {
	public static void stockSpan(int stocks[], int span[]) {
		Stack<Integer> s = new Stack<>();
		span[0] = 1;// pehle vale ke liye span value 1 kardi hai
		s.push(0);
		for (int i = 1; i < stocks.length; i++) {
			int currPrice = stocks[i];
			while (!s.isEmpty() && currPrice > stocks[s.peek()]) {// tab tak elements nikalne hai stacks se jab tak uske
																	// barabar ya usse bada element stack me na dikhe
				s.pop();
			}
			if (!s.isEmpty()) {
				span[i] = i + 1;
			} else {
				int prevHigh = s.peek();// jab stack ka sabse bada element mil gya usse peek kara uski value nikali
				span[i] = i - prevHigh;
			}
			s.push(i);// index ko stack me push karne ke liye we use this

		}
	}

	public static void main(String[] args) {
		int stocks[] = { 100, 80, 70, 60, 85, 100 };
		int span[] = new int[stocks.length];
		stockSpan(stocks, span);
		for (int i = 0; i < span.length; i++) {
			System.out.println(span[i] + " ");
		}

	}

}
