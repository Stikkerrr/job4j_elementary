package ru.job4j.array;

public class Min {
	
	/**
	 * Finding the minimum value in an array
	 *
	 * @return the minimum value in the array
	 */
	public static int findMin(int[] array) {
		int min = array[0];
		for (int i : array) {
			if (i < min) {
				min = i;
			}
		}
		return min;
	}
}
