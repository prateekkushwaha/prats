package arrayprograms;

import java.util.Arrays;

public class ArrayIntersection {

	public static void main(String[] args) {

		int[] array1 = new int[] { 21, 34, 41, 22, 35 };
		int[] array2 = new int[] { 61, 34, 45, 21, 11 };

		findArrayInterSection(array1, array2);
	}

	private static void findArrayInterSection(int[] array1, int[] array2) {

		Arrays.sort(array1);
		Arrays.sort(array2);

		int i = 0;
		int j = 0;

		while (i < array1.length && j < array2.length) {

			if (array1[i] < array2[j])
				i++;
			else if (array1[i] > array2[j])
				j++;
			else {
				System.out.print(array1[i++] + " ");
				j++;
			}
		}

	}
}
