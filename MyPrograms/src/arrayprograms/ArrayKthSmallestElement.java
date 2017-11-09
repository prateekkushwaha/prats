package arrayprograms;

public class ArrayKthSmallestElement {

	public static void main(String[] args) {

		int[] array = new int[] { 23, 89, 57, 12, 34, 90 };

		int k = 2;

		findKthSmallestElement(array, k);
	}

	private static void findKthSmallestElement(int[] array, int k) {

		for (int i = 0; i < k; i++) {

			int smallest = array[i];
			int index = i;

			for (int j = i + 1; j < array.length - i - 1; j++) {

				if (array[j] < smallest) {
					smallest = array[j];
					index = j;
				}
			}

			if (index != i) {

				int temp = array[index];
				array[index] = array[i];
				array[i] = temp;
			}
			printArray(array);
		}
		System.out.println("Kth smallest element in array = " + array[k - 1]);
	}

	private static void printArray(int[] array) {

		for (int num : array) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

}
