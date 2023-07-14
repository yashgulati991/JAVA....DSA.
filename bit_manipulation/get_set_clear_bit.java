package bit_manipulation;

import java.util.Scanner;

public class get_set_clear_bit {

	public static int getIthBit(int n, int i) {
		int bitMask = 1 << i;
		if ((n & bitMask) == 0) {
			return 0;
		} else {
			return 1;
		}
	}

	public static int setIthbit(int n, int i) {
		int bitmask = 1 << i;
		return n | bitmask;
	}

	public static int clearIthbit(int n, int i) {

		int BitMask = ~(1 << i);
		return n & BitMask;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(getIthBit(10, 2));
		System.out.println(setIthbit(10, 2));
		System.out.println(clearIthbit(10, 1));
	}

}
