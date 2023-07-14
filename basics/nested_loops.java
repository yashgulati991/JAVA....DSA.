package basics;

import java.util.Scanner;

public class nested_loops {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of lines ");
		int n = sc.nextInt();
//		int m = n;

//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= (n - i + 1); j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("" + j);
//			}
//			System.out.println();
//		}
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(ch);
//				ch++;
//			}
//			System.out.println();
//		}
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= m; j++) {
//				if (i == 1 || j == 1 || i == n || j == m)
//					System.out.print("*");
//				else
//					System.out.print(" ");
//
//			}
//			System.out.println();
//		}
		// SOLID RHOMBUS pattern
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= n; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}