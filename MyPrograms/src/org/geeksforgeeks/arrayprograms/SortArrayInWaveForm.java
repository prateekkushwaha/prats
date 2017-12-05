/* http://www.geeksforgeeks.org/sort-array-wave-form-2/ */

package org.geeksforgeeks.arrayprograms;

import java.util.Arrays;

public class SortArrayInWaveForm {

	public static void main(String[] args) {

		int[] array = { 10, 5, 6, 3, 2, 20, 100, 80 };

		sortArrayInWaveForm(array);
	}

	/* Sort an array in wave form */
	private static void sortArrayInWaveForm(int[] array) {

		int size = array.length;

		Arrays.sort(array);

		for (int i = 0; i < size; i = i + 2) {

			ArrayUtility.swapArray(array, i, i + 1);
		}

		ArrayUtility.printArray(array);

	}

}
