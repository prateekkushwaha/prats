package arrayprograms;

public class ReverseArrayInPlace {

	public static void main(String[] args) {

		int[] array = new int[] { 1, 2, 3, 4, 5, 6};

		reverseArray(array);
	}

	private static void reverseArray(int[] array) {

		for (int i = 0; i < array.length / 2; i++) {

			int temp = array[i];

			array[i] = array[array.length - i - 1];

			array[array.length - i - 1] = temp;
		}
		printArray(array);
	}

	private static void printArray(int[] array) {

		for (int num : array) {
			System.out.print(num + " ");
		}
	}

}
