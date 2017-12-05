/* http://www.geeksforgeeks.org/find-maximum-value-of-sum-iarri-with-only-rotations-on-given-array-allowed/ */

package org.geeksforgeeks.arrayprograms;

public class MaxSumOfFunctionInArray {

	public static void main(String[] args) {

		int arr[] = new int[] { 10, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		/* Rj - Rj-1 = arrSum - n * arr[n-j] */
		findMaxSumOfFunctionInArray(arr);
	}

	/*
	 * Find maximum value of Sum( i*arr[i]) with only rotations on given array
	 * allowed
	 */
	private static void findMaxSumOfFunctionInArray(int[] array) {

		int sumArray = ArrayUtility.sumArray(array);
		int currVal = 0, maxVal;

		for (int i = 0; i < array.length; i++) {
			currVal = currVal + i * array[i];
		}

		maxVal = currVal;
		for (int i = 1; i < array.length; i++) {

			currVal = currVal + sumArray - array.length * array[array.length - i];

			if (currVal > maxVal)
				maxVal = currVal;
		}

		System.out.println("Max Sum Is = " + maxVal);
	}

}
