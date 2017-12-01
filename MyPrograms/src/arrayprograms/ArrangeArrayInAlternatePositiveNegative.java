package arrayprograms;

public class ArrangeArrayInAlternatePositiveNegative extends ArrayUtility {

	public static void main(String[] args) {

		int[] array = new int[] { -1, -2, -3, 4, 5, 1, 6, -3 };

		arrangeArrayInAlternatePositiveNegative(array);

	}

	private static void arrangeArrayInAlternatePositiveNegative(int[] arr) {

		// int left = 0;
		// int right = arr.length - 1;
		//
		// while (left < right) {
		//
		// while (arr[left] >= 0) {
		// left++;
		// }
		//
		// while (arr[right] < 0) {
		// right--;
		// }
		//
		// if (left < right) {
		// ArrayUtility.swapInArray(arr, left, right);
		// }
		//
		// ArrayUtility.printArray(arr);
		// System.out.println("left = " + left + " right = " + right);
		// }
		//
		// ArrayUtility.printArray(arr);

		int even = 0;
		int odd = 1;

		while (even < arr.length && odd < arr.length) {

			while (even < arr.length && arr[even] >= 0)
				even = even + 2;

			while (odd < arr.length && arr[odd] < 0)
				odd = odd + 2;

			if (even < arr.length && odd < arr.length)
				ArrayUtility.swapInArray(arr, even, odd);

			ArrayUtility.printArray(arr);
		}
		ArrayUtility.printArray(arr);
	}
}
