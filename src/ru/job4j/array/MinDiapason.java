package ru.job4j.array;

public class MinDiapason {
	
	/**
	 * Finding the minimum value in the range of the resulting array
	 *
	 * @param start search index
	 * @param finish search index
	 * @return the minimum value in the array
	 */
	public static int findMin(int[] array, int start, int finish) {
		int min = array[start];
		for (int i = start + 1; i <= finish; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
}
