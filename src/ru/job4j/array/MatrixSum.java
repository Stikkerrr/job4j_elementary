package ru.job4j.array;

public class MatrixSum {
	
	/**
	 * Sum of all elements of a two-dimensional array
	 *
	 * @return sum of elements
	 */
	public static int sum(int[][] array) {
		int rsl = 0;
		for (int[] ints : array) {
			for (int anInt : ints) {
				rsl += anInt;
			}
		}
		return rsl;
	}
}
