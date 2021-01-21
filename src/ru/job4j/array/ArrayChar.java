package ru.job4j.array;

public class ArrayChar {
	
	/**
	 * Checks 2 arrays for complete coincidence of values
	 *
	 * @param word first array
	 * @param pref second array
	 * @return positive or negative comparison result
	 */
	public static boolean startsWith(char[] word, char[] pref) {
		boolean result = true;
		for (int i = 0; i < pref.length; i++) {
			if (word[i] != pref[i]) {
				result = false;
				break;
			}
		}
		return result;
	}
}
