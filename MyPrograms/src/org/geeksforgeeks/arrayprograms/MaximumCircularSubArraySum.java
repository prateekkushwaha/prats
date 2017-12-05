package org.geeksforgeeks.arrayprograms;

public class MaximumCircularSubArraySum {

	public static void main(String[] args) {

		int array[] = { -1, 40, -14, 7, 6, 5, -4, -1 };

		System.out.println(maximumCircularSubArraySum(array));

	}

	private static int maximumCircularSubArraySum(int[] array) {

		int max_kadane = kadane(array);

		int max_wrap = 0;

		for (int i = 0; i < array.length; i++) {

			max_wrap = max_wrap + array[i];

			array[i] = -array[i];
		}

		max_wrap = max_wrap + kadane(array);

		return Math.max(max_kadane, max_wrap);

	}

	private static int kadane(int[] array) {

		int n = array.length;
		int max_so_far = 0, max_ending_here = 0;

		for (int i = 0; i < n; i++) {

			max_ending_here = max_ending_here + array[i];
			if (max_ending_here < 0)
				max_ending_here = 0;

			if (max_so_far < max_ending_here)
				max_so_far = max_ending_here;
		}
		return max_so_far;
	}

}
