/* http://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/ */

package org.geeksforgeeks.arrayprograms;

public class SearchInSortedAndRotatedArray {

	public static void main(String[] args) {

		int array[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };

		pivotedBinarySearch(array, 7);
	}

	/* Searching in sorted array using pivots */
	private static int pivotedBinarySearch(int[] array, int key) {

		int size = array.length;
		int pivot = findPivot(array, 0, size);

		/* if pivot is -1, then array is not rotated at all */
		if (pivot == -1)
			return binarySearch(array, 0, size, key);

		else if (array[pivot] == key)
			return pivot;

		else if (array[pivot] < key)
			return binarySearch(array, pivot + 1, size, key);

		else
			return binarySearch(array, 0, pivot - 1, key);

	}

	/* Static common binary search function */
	private static int binarySearch(int[] array, int low, int high, int key) {

		if (high < low)
			return -1;

		int mid = (low + high) / 2;

		if (array[mid] == key)
			return mid;

		else if (array[mid] > key)
			return binarySearch(array, low, mid - 1, key);

		else
			return binarySearch(array, mid + 1, high, key);
	}

	/* Finding pivot in array to divide array in two parts */
	private static int findPivot(int[] array, int low, int high) {

		int mid = (low + high) / 2;

		if (low > high)
			return -1;

		else if (low == high)
			return low;

		else if (mid < high && array[mid] > array[mid + 1])
			return mid;

		else if (low < mid && array[mid] < array[mid - 1])
			return (mid - 1);

		else if (array[low] >= array[mid])
			return findPivot(array, low, mid - 1);

		else
			return findPivot(array, mid + 1, high);
	}

}
