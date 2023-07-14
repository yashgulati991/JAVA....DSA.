package arrays_2d;

import java.util.Scanner;

public class diagonalSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int n = sc.nextInt();
		int m = n;
		int matrix[][] = new int[n][m];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; i++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; i++) {
				if (i == j) {
					sum += matrix[i][j];
				}
				if (i + j == matrix.length - 1) {
					sum += matrix[i][j];
				}
			}
		}

	}
}
