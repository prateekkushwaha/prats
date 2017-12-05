package org.geeksforgeeks.arrayprograms;

public class GeneratePossibleArraysFromAlternateTwoSortedArrays {

	public static void main(String[] args) {

		int A[] = { 10, 15, 25 };
		int B[] = { 5, 20, 30 };

		generatePossibleArraysFromAlternateTwoSortedArrays(A, B);
	}

	private static void generatePossibleArraysFromAlternateTwoSortedArrays(int[] arrayA, int[] arrayB) {

		int lenArrayA = arrayA.length;
		int lenArrayB = arrayB.length;

		int[] arrayC = new int[lenArrayA + lenArrayB];

		generateArray(arrayA, arrayB, arrayC, 0, 0, lenArrayA, lenArrayB, 0, true);
	}

	private static void generateArray(int[] arrayA, int[] arrayB, int[] arrayC, int startA, int startB, int endA,
			int endB, int lenC, boolean flag) {

		if (flag) {

			if (lenC != 0)
				ArrayUtility.printArray(arrayC, lenC + 1);

			for (int i = startA; i < endA; i++) {

				if (lenC == 0) {

					arrayC[lenC] = arrayA[i];
					generateArray(arrayA, arrayB, arrayC, i + 1, startB, endA, endB, lenC, !flag);
				}

				else if (arrayA[i] > arrayC[lenC]) {
					arrayC[lenC + 1] = arrayA[i];
					generateArray(arrayA, arrayB, arrayC, i + 1, startB, endA, endB, lenC + 1, !flag);
				}
			}
		} else {

			for (int j = startB; j < endB; j++) {

				if (arrayB[j] > arrayC[lenC]) {

					arrayC[lenC + 1] = arrayB[j];
					generateArray(arrayA, arrayB, arrayC, startA, j + 1, endA, endB, lenC + 1, !flag);
				}
			}
		}

	}

}
