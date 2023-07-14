package arrays_2d;

import java.util.Scanner;

public class sprialMat2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[][] = new int[n][m];
		// enter the array
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int minr = 0;
		int minc = 0;
		int maxr = arr.length - 1;
		int maxc = arr[0].length - 1;
		int tne = n * m;// total no of elements
		int count = 0;// to stop after the whole execution
		while (count < tne) {
			// left wall
			for (int i = minr, j = minc; i <= maxr && count < tne; i++) {
				System.out.println(arr[i][j]);
			}
			minc++;
			// bottom wall
			for (int i = maxr, j = minc; j <= maxc && count < tne; j++) {
				System.out.println(arr[i][j]);
			}
			maxr--;
			// right wall
			for (int i = maxr, j = maxc; i >= minr && count < tne; i--) {
				System.out.println(arr[i][j]);
			}
			maxc--;
			// top wall
			for (int i = minr, j = maxc; j >= minc && count < tne; j--) {
				System.out.println(arr[i][j]);
			}
			minr++;
		}
	}

}
