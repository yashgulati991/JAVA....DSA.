package greedyAlgos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

//This is very popular and most important problem of all companies 
public class ActivitySelection {
	public static void main(String[] args) {
		int start[] = { 1, 3, 0, 5, 8, 5 };
		int end[] = { 2, 4, 6, 7, 9, 9 };
		int maxActivity = 0;

		// agar start end sorted na hue to
		int activities[][] = new int[start.length][3];// 3 isliye kuki pehla store karega index, fir start , fir end
		for (int i = 0; i < start.length; i++) {
			activities[i][0] = i;
			activities[i][1] = start[i];
			activities[i][2] = end[i];
		} // lambda function
		Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

		ArrayList<Integer> ans = new ArrayList<Integer>();
		// 1st activity
		maxActivity = 1;
		ans.add(activities[0][0]);
		int lastEnd = activities[0][2];
		for (int i = 0; i < end.length; i++) {
			if (activities[i][1] > lastEnd) {
				maxActivity++;// jonsi activity badi hai usse daal diya
				ans.add(activities[i][0]);// usko answer me add kardiya
				lastEnd = activities[i][2];// uska end last end me store kara diya
			}
		}
		System.out.println("Max activities" + maxActivity);
		for (int i = 0; i < ans.size(); i++) {
			System.out.print(ans.get(i) + "A ");
		}

	}
}
