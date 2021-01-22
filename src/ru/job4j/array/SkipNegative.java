package ru.job4j.array;

public class SkipNegative {
	
	/**
	 * The method replaces negative values ​​in an array with zero
	 *
	 * @return array with changed values
	 */
	public static int[][] skip(int[][] array) {
		for (int row = 0; row < array.length; row++) {
			for (int cell = 0; cell < array[row].length; cell++) {
				if (array[row][cell] < 0) {
					array[row][cell] = 0;
				}
			}
		}
		return array;
	}
}
