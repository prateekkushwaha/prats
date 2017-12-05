package org.geeksforgeeks.arrayprograms;

public class ArrayUtility {

	public static void printArray(int[] array) {

		for (int obj : array)
			System.out.print(obj + " ");
		System.out.println();
	}

	public static void printArray(int[] array, int index) {

		for (int i = 0; i < index; i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}

	public static int sumArray(int[] array) {

		int sum = 0;

		for (int obj : array)
			sum = sum + obj;
		return sum;
	}

	public static void swapArray(int[] array, int swapFromIndex, int swapToIndex) {

		int temp = array[swapToIndex];

		array[swapToIndex] = array[swapFromIndex];

		array[swapFromIndex] = temp;
	}
}
