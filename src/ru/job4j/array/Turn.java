package ru.job4j.array;

public class Turn {
	
	/**
	 * Method rearranges array elements in reverse order
	 *
	 * @param array in which the elements change
	 * @return reordered array
	 */
	public static int[] back(int[] array) {
		int temp;
		for (int i = 0, j = array.length - 1; i < array.length / 2; i++) {
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			j--;
		}
		return array;
	}
}
