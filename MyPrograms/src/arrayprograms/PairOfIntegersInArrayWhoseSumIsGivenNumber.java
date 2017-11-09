package arrayprograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PairOfIntegersInArrayWhoseSumIsGivenNumber {

	public static void main(String[] args) {

		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int sum = 15;

		bruteForce(array, sum);

		hashSet(array, sum);

		sort(array, sum);
	}

	// Method contains O(n^2) time complexity
	private static void bruteForce(int[] array, int sum) {

		for (int i = 0; i < array.length; i++) {

			int num1 = array[i];

			for (int j = i + 1; j < array.length; j++) {

				int num2 = array[j];

				if (num1 + num2 == sum) {

					System.out.println("(" + array[i] + "," + array[j] + ")");
				}
			}
		}
	}

	// Method contains O(n) time complexity
	private static void hashSet(int[] array, int sum) {

		Set<Integer> set = new HashSet<Integer>(array.length);

		for (int number : array) {

			int target = sum - number;

			if (!set.contains(target)) {

				set.add(number);

			} else {

				System.out.println("(" + number + "," + target + ")");
			}
		}
	}

	// Method contains O(n) time complexity
	private static void sort(int[] array, int sum) {

		Arrays.sort(array);

		int left = 0;
		int right = array.length - 1;

		while (left < right) {

			int value = array[left] + array[right];

			if (value == sum) {

				System.out.println("(" + array[left] + "," + array[right] + ")");
				left = left + 1;
				right = right - 1;

			} else if (value < sum) {

				left = left + 1;

			} else if (value > sum) {

				right = right - 1;
			}

		}
	}
}
