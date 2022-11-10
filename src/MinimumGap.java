import java.util.ArrayList;
import java.util.Collections;

public class MinimumGap {
	public static void main(String[] args) {
		int[] array = { 1, 5, 2, 4, 3, 6, 8, 1 };
		int gap = findGap(array);
		System.out.println(gap);
	}

	public static int findGap(int[] array) {
		int distance = 0;
		int minDistance = 0;
		ArrayList<Integer> distanceArr = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					distance = j - i;
					distanceArr.add(distance);
				}
			}
		}
		minDistance = Collections.min(distanceArr);

		return minDistance;

	}
}
