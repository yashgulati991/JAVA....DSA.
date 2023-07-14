package basics;

import java.util.Scanner;

public class first_basics {
//In a program, input 3 numbers : A, B and C. You have to output the average of
	// these 3 numbers
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 34;
		int b = 34;
		int c = 67;
		float average = (a + b + c) / 2;
		System.out.println(average);
		// In a program, input the side of a square. You have to output the area of the
		// square.
		int side = 3;
		double area_of_square = side * side;
		System.out.println(area_of_square);
		/*
		 * Enter cost of 3 items from the user (using float data type) - a pencil, a pen
		 * and an eraser. You have to output the total cost of the items back to the
		 * user as their bill. (Add on : You can also try adding 18% gst tax to the
		 * items in the bill as an advanced problem)
		 */ System.out.println("Enter the cost of eraser");
		int eraser = sc.nextInt();
		System.out.println("Enter the cost of pencil");
		int pencil = sc.nextInt();
		System.out.println("Enter the cost of pen");
		int pen = sc.nextInt();
		float total_amt = (float) ((eraser + pencil + pen) + 0.18);
		System.out.println(total_amt);
		int $ = 24;// its not giving an error why? as that $ is the operator but still it is not
					// giving an error
		int x = 2, y = 5;
		int exp1 = (x * y / x);
		double exp2 = (x * (y / x));
		System.out.println(exp1);
		System.out.println(exp2);
	}

}
