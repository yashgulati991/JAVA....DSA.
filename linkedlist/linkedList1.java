package linkedlist;

public class linkedList1 {
	public static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static Node head;
	public static Node tail;
	public static int size;

	public void addFirst(int data) {
		Node newNode = new Node(data);
		size++;
		if (head == null) {
			head = tail = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	public void printLL() {
		if (head == null) {
			System.out.println("Empty list");
		}
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public void reverse() {
		Node prev = null;
		Node curr = tail = head;
		Node next;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}

	public static boolean detectCycle() {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {

				return true;
			}

		}
		return false;
	}

	public static void removeCycle() {
		// detect cycle
		Node slow = head;
		Node fast = head;
		boolean cycle = false;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next;
			if (slow == fast) {
				cycle = true;
				break;
			}
			if (cycle == false) {
				return;
			}
		}
		// find meeting point
		slow = head;
		Node prev = null;// last node
		while (slow != fast) {
			prev = fast;
			slow = slow.next;
			fast = fast.next;
		}
		// remove cycle
		prev.next = null;
	}

	public static void main(String[] args) {

		head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = head;
		System.out.println(detectCycle());

	}

}
