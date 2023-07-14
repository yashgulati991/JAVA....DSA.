package linkedlist;

public class linkedList {
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

//Adding in first or at head 
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

	// Adding in Last or at tail
	public void addLast(int data) {
		Node newNode = new Node(data);
		size++;
		if (head == null) {
			head = tail = newNode;
			return;
		}
		tail.next = newNode;
		tail = newNode;
	}

	public void print() {
		if (head == null) {
			System.out.println("List is Empty");
		}
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();

	}

// adding in between 
	public void addBetween(int index, int data) {
		if (index == 0) {
			addFirst(data);
			return;
		}
		Node newNode = new Node(data);
		size++;
		Node temp = head;
		int i = 0;
		while (i < index - 1) {
			temp = temp.next;
			i++;
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}

	public int removeFirst() {
		if (size == 0) {// agar size empty hai to
			System.out.println("Empty");
			return Integer.MIN_VALUE;
		} else if (size == 1) {// agar sirf 1 element hai to
			int val = head.data;
			head = tail = null;
			size = 0;
			return val;
		}
		int val = head.data;
		head = head.next;
		size--;
		return val;

	}

	public int removeLast() {
		if (size == 0) {
			System.out.println("Empty");
			return Integer.MIN_VALUE;
		} else if (size == 1) {
			int val = head.data;
			head = tail = null;
			size = 0;
			return val;
		}
		Node prev = head;
		for (int i = 0; i < size - 2; i++) {
			prev = prev.next;
		}
		int val = prev.next.data;
		prev.next = null;
		tail = prev;
		size--;
		return val;

	}

	public void removeBetween(int index) {
		if (size == 0) {
			System.out.println("Empty");
		}
		if (size == 1) {
			removeFirst();
		}

		Node temp = head;
		int i = 0;
		while (i < index - 1) {
			temp = temp.next;
			i++;
		}
		temp.next = temp.next.next;
		size--;

	}

// Iterative way to search a key in a linked list 
	public int iterativeSearch(int key) {
		Node temp = head;
		int i = 0;
		while (temp != null) {
			if (temp.data == key) {
				return i;
			}
			temp = temp.next;
			i++;
		}
		return -1;
	}

//////////////////////////////////////////////////////////
// Recursive way to search a key in a linked list
	// helper function isliye banaya taaki recursive call ho sake
	public int helper(Node head, int key) {
		if (head == null) {
			return -1;
		}
		if (head.data == key) {
			return 0;
		}

		int index = helper(head.next, key);
		if (index == -1) {
			return -1;
		}
		return index + 1;
	}

	public int recursiveSeach(int key) {
		return helper(head, key);
	}

///////////////////////////////////////////////////////
//	Reverse a linked list

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

	/*
	 * /////////////////////////////////////////////////////////////////// check if
	 * linked list is palindrome isme sabse pehle middle node find out karnegey aur
	 * yeah ek as question bhi hai to find middle of Linkedlist
	 */
	public Node middleNode(Node head) {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public boolean isPalindrome() {
		if (head == null || head.next == null) {
			return true;
		}
		// step 1 to find mid
		Node midNode = middleNode(head);
		// step 2 Reverese 2nd half
		Node prev = null;
		Node curr = midNode;
		Node next;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		Node right = prev;
		Node left = head;
		// step3 To find if left and right are equal
		while (right != null) {
			if (left.data != right.data) {
				return false;
			}
			left = left.next;
			right = right.next;
		}
		return true;
	}

	public static void main(String[] args) {
		linkedList a = new linkedList();
		a.addFirst(1);
		a.addFirst(2);
		a.addFirst(3);
		a.addFirst(2);
		a.addFirst(1);
//		a.addBetween(1, 7);
		a.print();
//		System.out.println(a.size);
//		a.removeFirst();
//		a.print();
//		a.removeBetween(1);		
//		System.out.println("Found at index" + a.iterativeSearch(3));
		a.reverse();
		a.print();
		System.out.println(a.isPalindrome());

	}

}
