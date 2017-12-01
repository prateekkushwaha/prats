/* http://www.geeksforgeeks.org/array-rotation/ */
/* http://www.geeksforgeeks.org/program-for-array-rotation-continued-reversal-algorithm/ */

package org.geeksforgeeks.arrayprograms;

public class ArrayRotation {

	public static void main(String[] args) {

		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };

		/* Program for Array Rotation - Method 1 (Use Temporary Array) */
		useTempArray(array, 2);

		/* Program for Array Rotation - Method 2 (Left Rotate One By One) */
		rotateOneByOne(array, 3);

		/* Program for Array Rotation - Method 3 (Juggling Algorithm) */
		jugglingAlgorithm(array, 4);

		/* Program for Array Rotation - Method 4 (Reversal Algorithm) */
		reversalAlgorithm(array, 3);
	}

	/* Method 1 (use Temporary Array) */
	private static void useTempArray(int[] array, int k) {

		int[] tempArray = new int[k];

		for (int i = 0; i < k; i++) {

			tempArray[i] = array[i];
		}

		for (int i = k; i < array.length; i++) {

			array[i - k] = array[i];
		}

		System.arraycopy(tempArray, 0, array, array.length - k, k);

		ArrayUtility.printArray(array);
	}

	/* Method 2 (Left Rotate One By One) */
	private static void rotateOneByOne(int[] array, int k) {

		for (int i = 0; i < k; i++) {

			int temp = array[0];

			for (int j = 1; j < array.length; j++) {

				array[j - 1] = array[j];
			}
			array[array.length - 1] = temp;

			ArrayUtility.printArray(array);
		}
	}

	/* Method 3 (Juggling Algorithm) */
	private static void jugglingAlgorithm(int array[], int k) {

		int size = array.length;
		for (int i = 0; i < gcd(size, k); i++) {

			int temp = array[i];

			int j = i, x = 0;

			while (true) {

				x = j + k;
				if (x >= size)
					break;

				array[j] = array[x];
				j = x;
			}
			array[j] = temp;

			ArrayUtility.printArray(array);
		}
	}

	private static int gcd(int a, int b) {

		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}

	/* Method 4 (Reversal Algorithm) */
	private static void reversalAlgorithm(int[] array, int k) {

		int size = array.length;

		revereseArray(array, 0, k - 1);
		ArrayUtility.printArray(array);

		revereseArray(array, k, size - 1);
		ArrayUtility.printArray(array);

		revereseArray(array, 0, size - 1);
		ArrayUtility.printArray(array);
	}

	public static void revereseArray(int arr[], int start, int end) {

		int temp;
		while (start < end) {

			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}
	}
}
