package arrayprograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ArrayEveryElementRepeatedTwiceExceptOne {

	public static void main(String[] args) {

		int[] array = new int[] { 1, 1, 2, 2, 3, 3, 5 };

		findSingleElementInArray(array);
	}

	private static void findSingleElementInArray(int[] array) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int num : array) {

			if (map.containsKey(num))
				map.put(num, map.get(num) + 1);
			else
				map.put(num, 1);
		}

		Set<Integer> set = new HashSet<Integer>(map.keySet());

		Iterator<Integer> it = set.iterator();

		while (it.hasNext()) {

			int key = it.next();

			if (map.get(key) == 1) {
				System.out.println(key);
				return;
			}

		}
	}

}
