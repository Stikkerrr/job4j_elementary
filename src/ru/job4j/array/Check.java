package ru.job4j.array;

public class Check {
	
	/**
	 * The method checks the coincidence of values ​​in each cell of the array.
	 *
	 * @param data checked array
	 * @return positive or negative test result
	 */
	public static boolean mono(boolean[] data) {
		boolean result = true;
		boolean temp   = data[0];
		for (boolean val : data) {
			if (temp != val) {
				result = false;
				break;
			}
		}
		return result;
	}
}
