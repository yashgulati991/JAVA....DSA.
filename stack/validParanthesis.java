package stack;

import java.util.Stack;

public class validParanthesis {
	public static boolean isValid(String str) {
		Stack<Character> s = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') {
				s.push(ch);
			} else {
				if (s.isEmpty()) {
					return false;
				}
				// yeah isliye agar stack ke top par vahi same braket hoga to true return else
				// pop fir dosra check end me return false
				// eg ({"My name is abcd"})to start kisi se bhi ho sab stack me push hoga but
				// ending bracket ek ek karke check hoga
				if ((s.peek() == '(' && ch == ')') || (s.peek() == '{' && ch == '}')
						|| (s.peek() == '[' && ch == ']')) {
					s.pop();
				} else {
					return false;
				}

			}
		}
		if (s.isEmpty()) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {
		String str = "(){}[]";

	}

}
