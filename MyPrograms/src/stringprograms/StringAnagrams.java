package stringprograms;

import java.util.Arrays;

public class StringAnagrams {

	public static void main(String[] args) {

		String s1 = "School Master";
		String s2 = "The Classroom";

		isAnagram1(s1, s2);
	}

	private static void isAnagram1(String s1, String s2) {

		String copyOfs1 = s1.replaceAll("\\s", "");
		String copyOfs2 = s2.replaceAll("\\s", "");

		boolean flag = true;

		if (copyOfs1.length() != copyOfs2.length()) {

			flag = false;
		} else {

			char[] s1Array = copyOfs1.toLowerCase().toCharArray();
			char[] s2Array = copyOfs2.toLowerCase().toCharArray();

			Arrays.sort(s1Array);
			Arrays.sort(s2Array);

			flag = Arrays.equals(s1Array, s2Array);

			if (flag) {
				System.out.println(s1 + " and " + s2 + " are anagrams");
			} else {
				System.out.println(s1 + " and " + s2 + " are not anagrams");
			}
		}
	}
}
