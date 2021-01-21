package ru.job4j.array;

public class EndsWith {
	
	/**
	 * Method for checking the coincidence of the ends of arrays
	 *
	 * @param word first array
	 * @param post second array
	 * @return positive or negative test result
	 */
	public static boolean endsWith(char[] word, char[] post) {
		boolean result = true;
		for (int i = 0; i < post.length; i++) {
			if (word[word.length - 1 - i] != post[post.length - 1 - i]) {
				result = false;
				break;
			}
		}
		return result;
	}
}
