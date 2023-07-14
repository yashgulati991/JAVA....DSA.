package basics;

import java.util.Scanner;

public class if_else_ques {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
//		int n = sc.nextInt();
//		if (n > 0) {
//			System.out.println("positive");
//		} else {
//			System.out.println("negative");
//		}
		// FinishthefollowingcodesothatitprintsYouhaveafeverifyourtemperatureis above
		// 100 and otherwise prints You don't have a fever
		double temp = 103.5;
		if (temp > 100) {
			System.out.println("Fever");
		} else {
			System.out.println("nOt a fever");
		}
		// WriteaJavaprogramtoinputweeknumber(1-7)andprintdayofweeknameusing switch case
		System.out.println("ENter the number for the week days between 1-7");
		int x = sc.nextInt();
		switch (x) {
		case 1: {
			System.out.println("Monday");
			break;
		}
		case 2: {
			System.out.println("Tuesday");
			break;
		}
		case 3: {
			System.out.println("wednsday");
			break;
		}
		case 4: {
			System.out.println("Thursday");
			break;
		}
		case 5: {
			System.out.println("friday");
			break;
		}
		case 6: {
			System.out.println("saturday");
			break;
		}
		case 7: {
			System.out.println("sunday");
			break;
		}
		}
	}

}
