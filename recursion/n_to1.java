package recursion;

public class n_to1 {

	/*
	 * public static void printDec(int n) { if (n == 1) { System.out.println(n);
	 * return; } System.out.println(n + ""); printDec(n - 1); }
	 * 
	 * 
	 * // if in increasing order public static void printInc(int n) { if (n == 1) {
	 * System.out.println(n); return; } printInc(n - 1); System.out.println(n + "");
	 * }
	 */

	// Factorial of a number

	public static int FACt(int n) {
		if (n == 0) {
			return 1;
		}
		int fn = n * FACt(n - 1);
		return fn;
	}

	public static void main(String[] args) {
		int n = 30;
		System.out.println(FACt(5));

	}

}
