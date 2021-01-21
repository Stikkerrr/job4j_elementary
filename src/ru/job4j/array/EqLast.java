package ru.job4j.array;

public class EqLast {
	
	/**
	 * The method checks the equality of the last elements of the passed arrays
	 *
	 * @param left  first array
	 * @param right second array
	 * @return positive or negative test result
	 */
	public static boolean check(int[] left, int[] right) {
		return left[left.length - 1] == right[right.length - 1];
	}
}
