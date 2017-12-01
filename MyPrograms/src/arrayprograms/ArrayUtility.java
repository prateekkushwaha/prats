package arrayprograms;

public class ArrayUtility {

	protected static void printArray(int[] arr) {

		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	protected static void swapInArray(int[] arr, int left, int right) {

		int temp = arr[right];
		arr[right] = arr[left];
		arr[left] = temp;
	}

}
