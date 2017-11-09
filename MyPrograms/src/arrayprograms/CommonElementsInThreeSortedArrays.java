package arrayprograms;

import java.util.Arrays;

public class CommonElementsInThreeSortedArrays {

	public static void main(String[] args) {

		int[] array1 = new int[] { 1, 56, 24, 78, 29, 89 };
		int[] array2 = new int[] { 67, 78, 1, 45, 93 };
		int[] array3 = new int[] { 22, 90, 78, 31, 1, 63 };

		findCommonElementsInThreeArrays(array1, array2, array3);
	}

	private static void findCommonElementsInThreeArrays(int[] array1, int[] array2, int[] array3) {

		Arrays.sort(array1);
		Arrays.sort(array2);
		Arrays.sort(array3);
		
		int i = 0, j = 0, k = 0;
		
		while (i < array1.length && j < array2.length && k < array3.length) {
			
			if (array1[i] < array2[j] && array1[i] < array3[k])
				i++;
			else if (array2[j] < array1[i] && array2[j] < array3[k])
				j++;
			else if (array3[k] < array1[i] && array3[k] < array2[j])
				k++;
			else {
				System.out.println(array1[i] + " ");
				i++;j++;k++;
			}
		}

	}

}
