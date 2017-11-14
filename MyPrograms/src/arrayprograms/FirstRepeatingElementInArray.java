package arrayprograms;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingElementInArray {
	
	public static void main(String[] args) {
		
		int[] array = new int[] {1, 2, 3, 4, 5, 1, 2, 3};
		
		findFirstRepeatingElementInArray(array);
	}

	private static void findFirstRepeatingElementInArray(int[] array) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		for (int num : array) {
			
			if (!set.add(num)) {
				
				System.out.println(num);
//				break;
			}
		}
		
	}

}
