package arrayprograms;

import java.util.HashMap;

public class SubArrayWithZeroSum {

	public static void main(String[] args) {

		int arr[] = { 4, 2, -3, 1, 6 };
		if (printZeroSumSubarray(arr))
			System.out.println("Found a subarray with 0 sum");
		else
			System.out.println("No Subarray with 0 sum");

	}

	private static Boolean printZeroSumSubarray(int arr[]) {

		HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			sum += arr[i];

			if (arr[i] == 0 || sum == 0 || hM.get(sum) != null)
				return true;

			hM.put(sum, i);
		}

		return false;
	}

}
