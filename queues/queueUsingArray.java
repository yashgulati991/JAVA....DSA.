package queues;

public class queueUsingArray {
	static class queue {
		static int arr[];
		static int size;
		static int rear;

		queue(int n) {// queue ban jayegi iss constructor se aur isme array ka size pass kardo
			arr = new int[n];
			size = n;
			rear = -1;// isme front isiliye nahi banaya as array ka front hame pta hai [0]
		}

		public static boolean isEmpty() {
			return rear == -1;

		}

		public static void add(int data) {
			if (rear == size - 1) {
				System.out.println("Queue is full");
				return;
			}
			rear++;
			arr[rear] = data;
		}

		public static int remove() {
			if (isEmpty()) {
				System.out.println("Empty queue");
				return -1;
			}
			int front = arr[0];
			for (int i = 0; i < rear; i++) {// sabko ek ek step aage badha do to first remove ho ggya
				arr[i] = arr[i + 1];
			}
			rear = rear - 1;
			return front;
		}

		public static int peek() {
			if (isEmpty()) {
				System.out.println("Empty queue");
				return -1;
			}
			return arr[0];
		}
	}

	public static void main(String[] args) {
		queue q = new queue(5);
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		while (!q.isEmpty()) {
			System.out.println(q.peek() + " ");
			q.remove();// varna infinite times print hoga
		}

	}

}
