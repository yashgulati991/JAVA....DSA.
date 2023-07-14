package bit_manipulation;

public class check_odd_even {

	public static void oddOrEven(int n) {
		int bitMask = 1;

		if ((n & bitMask) == 0) {
			System.out.println("Even");
		} else
			System.out.println("odd");
	}

	public static void main(String[] args) {
		oddOrEven(3);
		oddOrEven(5);
		oddOrEven(122);
	}

}
