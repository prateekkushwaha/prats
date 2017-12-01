/* http://www.geeksforgeeks.org/given-a-sorted-and-rotated-array-find-if-there-is-a-pair-with-a-given-sum/ */

package org.geeksforgeeks.arrayprograms;

public class PairWithGivenSumInSortedAndRotatesArray {

	public static void main(String[] args) {

		int[] array = { 11, 15, 6, 8, 9, 10 };

		boolean flag = searchForSumInArray(array, 16);

		if (flag)
			System.out.print("Array has two elements" + " with sum 16");
		else
			System.out.print("Array doesn't have two" + " elements with sum 16 ");

	}

	private static boolean searchForSumInArray(int[] array, int sum) {

		int size = array.length;
		int i;

		for (i = 0; i < size; i++) {
			if (array[i] > array[i + 1])
				break;
		}

		int j = (i + 1) % size;

		while (i != j) {

			if (array[i] + array[j] == sum)
				return true;

			else if (array[i] + array[j] < sum)
				j = (j + 1) % size;

			else
				i = (size + i - 1) % size;
		}
		return false;
	}

}
