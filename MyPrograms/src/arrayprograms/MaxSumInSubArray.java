package arrayprograms;

public class MaxSumInSubArray {

	public static void main(String[] args) {

	}

	private static void getMaxSumInSubArray(int[] array) {

		int current_max = array[0];
		int max_so_far = array[0];

		for (int i = 1; i < array.length; i++) {

			current_max = Math.max(array[i], array[i] + current_max);
			max_so_far = Math.max(current_max, max_so_far);
		}
		System.out.println(max_so_far);

	}

}
