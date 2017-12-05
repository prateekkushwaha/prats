/* http://www.geeksforgeeks.org/rearrange-array-maximum-minimum-form/ */

package org.geeksforgeeks.arrayprograms;

public class SortArrayInMaxMinForm {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		sortArrayInMaxMin(array);

	}

	/* Rearrange an array in maximum minimum form */
	private static void sortArrayInMaxMin(int[] array) {

		int start = 0, end = array.length - 1;

		int[] newArray = new int[array.length];

		boolean flag = true;

		for (int i = 0; i < array.length; i++) {

			if (flag)
				newArray[i] = array[end--];
			else
				newArray[i] = array[start++];

			flag = !flag;
		}

		ArrayUtility.printArray(newArray);

	}

}
