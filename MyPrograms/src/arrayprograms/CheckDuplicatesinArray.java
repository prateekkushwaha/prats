package arrayprograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckDuplicatesinArray {

	public static void main(String[] args) {

		int array[] = new int[] { 1, 2, 3, 4, 5, 1 };

		bruteForce(array);

		checkDuplicateUsingSet(array);

		checkDuplicateUsingAdd(array);
	}

	private static boolean checkDuplicateUsingAdd(int[] array) {

		Set<Integer> set = new HashSet<Integer>();

		for (int num : array) {

			if (!set.add(num))
				return true;
		}
		return false;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static boolean checkDuplicateUsingSet(int[] array) {

		List list = Arrays.asList(array);
		Set set = new HashSet(list);

		if (list.size() != set.size()) {
			return true;
		}
		return false;
	}

	private static boolean bruteForce(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {

			for (int j = i + 1; j < array.length; j++) {

				if (array[i] == array[j])
					return true;
			}
		}
		return false;
	}

}
