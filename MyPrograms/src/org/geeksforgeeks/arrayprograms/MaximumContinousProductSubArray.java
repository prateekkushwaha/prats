package org.geeksforgeeks.arrayprograms;

public class MaximumContinousProductSubArray {

	public static void main(String[] args) {

		int arr[] = { 1, -2, -3, 0, 7, -8, -2 };

		System.out.println("Maximum Sub array product is " + maxSubarrayProduct(arr));

	}

	private static int maxSubarrayProduct(int[] arr) {

		int size = arr.length;

		int max_so_far = 1;
		int max_current = 1;
		int min_current = 1;

		for (int i = 0; i < size; i++) {

			if (arr[i] > 0) {

				max_current = max_current * arr[i];
				min_current = Math.min(min_current * arr[i], 1);
			}

			else if (arr[i] < 0) {

				int temp = max_current;
				min_current = Math.max(max_current * arr[i], 1);
				max_current = temp * arr[i];
			}

			else {
				max_current = 1;
				min_current = 1;
			}

			if (max_current > max_so_far)
				max_so_far = max_current;
		}

		return max_so_far;
	}

}
