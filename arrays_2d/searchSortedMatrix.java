package arrays_2d;

import java.util.Scanner;

public class searchSortedMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dimensions of matrix ");
		int n = sc.nextInt();
		int matrix[][] = new int[n][n];
		System.out.println("Enter the matrix");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter key to search");
		int x = sc.nextInt();
		int i = 0;
		int j = matrix[0].length - 1;
		while (i < matrix.length && j > 0) {
			if (x == matrix[i][j]) {
				System.out.println("present at[" + i + "," + j + "]");
				return;
			} else if (x < matrix[i][j]) {
				j--;
			} else if (x > matrix[i][j]) {
				i++;
			}
		}
	}

}
